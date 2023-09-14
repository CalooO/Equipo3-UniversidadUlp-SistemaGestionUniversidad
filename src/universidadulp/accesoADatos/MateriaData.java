
package universidadulp.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadulp.Entidades.Materia;

public class MateriaData {
    
    private Connection con=null;

    public MateriaData() {
        
        con=Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        
        String sql = "insert into materia (nombre,año,estado) "
                + "values (?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,materia.getNombre());
            ps.setInt(2,materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                
                materia.setIdMateria(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null,"Materia agregada.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia "+ex.getMessage());
        }
    }
    
    public Materia buscarMateria(int id){
        
        Materia materia = null;
        
        String sql = "select idMateria,nombre,año,estado from materia "
                + "where idMateria = ?";
        
        PreparedStatement ps = null;
        
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));
            
            }/*else {
                
                JOptionPane.showMessageDialog(null, "No existe la materia");
                ps.close();
            }*/
            
        }catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia "+ex.getMessage());
            
        }
                
        return materia;
    }
    
    public Materia buscarNombre(String nombre){
        
        Materia materia = null;
        
        String sql = "select idMateria,nombre,año,estado from materia "
                + "where nombre=?";
        
        PreparedStatement ps = null;
        
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, nombre);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(nombre);
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));
            }/*else {
                
                //JOptionPane.showMessageDialog(null, "No existe la materia");
                ps.close();
            }*/
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia "+ex.getMessage());
        }
                
        return materia;
    }
    
    public void modificarMateria(Materia materia){
        
        String sql = "update materia set nombre=?,año=?,estado=? "
                + "where idMateria=?";
        
        PreparedStatement ps = null;
        
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());
            
            int exito = ps.executeUpdate();
            if(1 == exito){
                
                 JOptionPane.showMessageDialog(null,"Materia modificada.");
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia "+ex.getMessage());
        }
    }
    
    public void eliminarMateria(int id){
        
        try {
            String sql = "update materia set estado = 0 "
                + "where idMateria = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
        
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                
                JOptionPane.showMessageDialog(null, "Se elimino la materia");
            }
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia "+ex.getMessage());
        }
    }
    
    public ArrayList<Materia> listarMaterias(){
        
        ArrayList<Materia> materias = new ArrayList<>();
        
        try {
            String sql = "select * from materia where estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                Materia materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia "+ex.getMessage());
        }
        return materias;
    }
}
