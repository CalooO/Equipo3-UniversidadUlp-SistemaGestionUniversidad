package universidadulp.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadulp.Entidades.Alumno;
import universidadulp.Entidades.Inscripcion;
import universidadulp.Entidades.Materia;

/**
 *
 * @sergiokaz
 */
public class InscripcionData {

    private Connection con = null;
    private AlumnoData alumnoData=new AlumnoData();
    private MateriaData materiaData=new MateriaData();

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion inscrip) {
        String sql = "Insert into inscripcion (nota, idAlumno, idMateria) Values (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, inscrip.getNota());
            ps.setInt(2, inscrip.getAlumno().getIdAlumno());
            ps.setInt(3, inscrip.getMateria().getIdMateria());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscrip.setIdInscripcion(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Inscripcion guardada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
    }

    public List<Inscripcion> obtenerInscripciones() {
        String sql = "Select idInscripcion, nota, idAlumno, idMateria from inscripcion";
        ArrayList<Inscripcion> listaInscripciones = new ArrayList<>();
        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getInt("nota"));
                for (Alumno alumno : alumnoData.listarAlumnos()) {
                    if (rs.getInt("idAlumno") == alumno.getIdAlumno()) {
                        inscripcion.setAlumno(alumno);
                    }
                }
                for (Materia materia : materiaData.listarMaterias()) {
                    if (rs.getInt("idMateria") == materia.getIdMateria()) {
                        inscripcion.setMateria(materia);
                    }
                }

                listaInscripciones.add(inscripcion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones " + ex.getMessage());
        }
        return listaInscripciones;
    }

    public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        String sql = "Select idInscripcion, nota, idAlumno, idMateria from inscripcion where idAlumno=?";
        ArrayList<Inscripcion> listaInscripciones = new ArrayList<>();
        ArrayList<Alumno> listaAlumno= alumnoData.listarAlumnos();
        ArrayList<Materia> listaMateria=materiaData.listarMaterias();
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getDouble("nota"));
                for (Alumno alumno : listaAlumno) {
                    if (rs.getInt("idAlumno") == alumno.getIdAlumno()) {
                        inscripcion.setAlumno(alumno);
                        break;
                    }
                }
                for (Materia materia :listaMateria) {
                    if (rs.getInt("idMateria") == materia.getIdMateria()) {
                        inscripcion.setMateria(materia);
                        break;
                    }
                }

                listaInscripciones.add(inscripcion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones " + ex.getMessage());
        }
        return listaInscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        String sql = "SELECT i.idMateria, nombre, año FROM inscripcion i JOIN materia m "
                + "ON(i.idMateria=m.idMateria) WHERE i.idAlumno = ? and m.estado=1";
        ArrayList<Materia> listaMaterias = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
                listaMaterias.add(materia);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones " + ex.getMessage());
        }
        return listaMaterias;

    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
        String sql = "SELECT m.idMateria, m.nombre, m.año FROM materia m WHERE m.idMateria "
                + "NOT IN ( SELECT i.idMateria FROM inscripcion i WHERE i.idAlumno = ? )";
        ArrayList<Materia> listaMaterias = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
                listaMaterias.add(materia);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones " + ex.getMessage());
        }
        return listaMaterias;

    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "delete from inscripcion where idAlumno=? and idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada extiosamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones " + ex.getMessage());
        }

    }
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        String sql="update inscripcion set nota=? where idAlumno=? and idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
             int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Nota actualizada correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones " + ex.getMessage());
        }
    }
    
    public List<Alumno> obtenerAlumnosPorMateria (int idMateria){
        String sql="Select a.idAlumno, dni, apellido, nombre, fechaNac, estado from inscripcion i "
                + "join alumno a on(i.idAlumno=a.idAlumno) where idMateria=? and estado=1";
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
                Alumno alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                listaAlumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones " + ex.getMessage());
        }
        return listaAlumnos;
    }
}
