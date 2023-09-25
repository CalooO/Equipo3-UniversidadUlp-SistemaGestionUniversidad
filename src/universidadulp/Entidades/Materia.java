
package universidadulp.Entidades;


public class Materia {
    private int idMateria;
    private String nombre;
    private int anioMateria;
    private boolean activo;

    public Materia(int idMateria, String nombre, int anioMateria, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    public Materia() {
    }

    public Materia(String nombre, int anioMateria, boolean activo) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        String terminacion=null;
        if (anioMateria==1 || anioMateria==3){
            terminacion="ro";
        } else if (anioMateria==2 ){
            terminacion="do";
        } else if (anioMateria==4 || anioMateria==5 ||anioMateria==6){
            terminacion="to";
        }else if (anioMateria==7 || anioMateria==0){
            terminacion="mo";
        }else if (anioMateria==8){
            terminacion="vo";
        }else if (anioMateria==9){
            terminacion="no";
        }
        return nombre + " de " +  anioMateria+terminacion + " año, con id: "+ idMateria;
    }
    
    
            
}
