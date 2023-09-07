package universidadulp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadulp.accesoADatos.Conexion;

public class UniversidadUlp {

    public static void main(String[] args) {
        Conexion.getConexion();
    }

}
