

package universidadulp.accesoADatos;

import java.sql.*;
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
        String sql="Insert into alumno (dni, apellido, nombre, fechaNacimiento, estado)"
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
        String sql="Update alumno set dni=?, apellido=?, nombre=?, fechaNacimiento=?"
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
    
    public void elimarAlumno(int id){
         String sql="Update alumno set estado=0 where idAlumno=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(1==exito){
                
                 JOptionPane.showMessageDialog(null,"Alumno dado de baja.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno "+ex.getMessage());
        }
         
    }
}
