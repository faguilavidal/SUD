package BLL;
public class Sud {
    private int año;
    private String nombre;
    private int fondo;

    public Sud() {
    }

    public Sud(int año, String nombre, int fondo) {
        this.año = año;
        this.nombre = nombre;
        this.fondo = fondo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFondo() {
        return fondo;
    }

    public void setFondo(int fondo) {
        this.fondo = fondo;
    }
    
    public int actualizarFondoSud(int monto){
        return new DAL.SudDAL().updateFondoSud(monto);
    }
    
    public int obtenerFondoSud(){
        return new DAL.SudDAL().obtenerFondoSud();
    }
    
}
