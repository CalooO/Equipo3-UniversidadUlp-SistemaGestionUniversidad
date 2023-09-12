

package universidadulp.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadulp.Entidades.Alumno;

/**
 *
 * @sergiokaz
 */
public class AlumnoData {
    private Connection con=null;

    public AlumnoData() {
        con=Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        String sql="Insert into alumno (dni, apellido, nombre, fechaNac, estado) "
                + "Values (?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                 JOptionPane.showMessageDialog(null,"Alumno agregado.");
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno "+ex.getMessage());
        }
        
    }
    
    public void modificarAlumno(Alumno alumno){
        String sql="Update alumno set dni=?, apellido=?, nombre=?, fechaNac=? "
                + "where idAlumno=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            
            int exito=ps.executeUpdate();
            if(1==exito){
                
                 JOptionPane.showMessageDialog(null,"Alumno modificado.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno "+ex.getMessage());
        }
        
    }
    
    public void elimarAlumno(int dni){
         String sql="Update alumno set estado=0 where dni=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exito=ps.executeUpdate();
            if(1==exito){
                
                 JOptionPane.showMessageDialog(null,"Alumno dado de baja.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno "+ex.getMessage());
        }
         
    }
    
    public Alumno buscarAlumnoPorId(int id){
        String sql="select dni, apellido, nombre, fechaNac from alumno where id=?";
        Alumno alumno=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                alumno=new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                
            }else{
                JOptionPane.showMessageDialog(null,"No existe ese alumno con ese id ");
         
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno "+ex.getMessage());
        }
        return alumno;
    }
    
     public Alumno buscarAlumnoPorDni(int dni){
        String sql="select idAlumno, dni, apellido, nombre, fechaNac from alumno where dni=?";
        Alumno alumno=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(dni);
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                
            }else{
                JOptionPane.showMessageDialog(null,"No existe ese alumno con ese id ");
         
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno "+ex.getMessage());
        }
        
        return alumno;
    }
     
      public ArrayList<Alumno> listarAlumnos (){
        String sql="select idAlumno, dni, apellido, nombre, fechaNac from alumno where estado=1";
        ArrayList<Alumno> listaAlumnos=new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
           while(rs.next()){
                Alumno alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(true);
                listaAlumnos.add(alumno);
           }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno "+ex.getMessage());
        }
        return listaAlumnos;
    }
}
