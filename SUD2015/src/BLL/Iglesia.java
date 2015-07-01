package BLL;

import java.util.ArrayList;

public class Iglesia {
    private int idiglesia;
    private String nombreIglesia;

    public Iglesia() {
    }

    public Iglesia(int idiglesia, String nombreIglesia) {
        this.idiglesia = idiglesia;
        this.nombreIglesia = nombreIglesia;
    }

    public int getIdiglesia() {
        return idiglesia;
    }

    public void setIdiglesia(int idiglesia) {
        this.idiglesia = idiglesia;
    }

    public String getNombreIglesia() {
        return nombreIglesia;
    }

    public void setNombreIglesia(String nombreIglesia) {
        this.nombreIglesia = nombreIglesia;
    }
    
    @Override
    public String toString(){
        return nombreIglesia;
    }
    
    public int registroMaxIglesia(){
        return new DAL.IglesiaDAL().maxIglesia();
    }
    
    public int registrarNuevaIglesia(int id, String nombreIglesia){        
        return new DAL.IglesiaDAL().insertIglesia(new Iglesia(id,nombreIglesia));
    }
    
    public ArrayList<Iglesia> listadoIglesias(){
        return new DAL.IglesiaDAL().selectIglesias();
    }
    
    public int obtenerIdIglesia(String nombre){
        return new DAL.IglesiaDAL().obtenerIdIglesia(nombre);
    }
    
    public String obtenerNombreIglesia(int id){
        return new DAL.IglesiaDAL().obtenerNombreIglesia(id);
    }
}
