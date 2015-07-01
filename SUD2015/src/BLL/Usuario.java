package BLL;
public class Usuario {
    private String usuario;
    private String contraseña;
    private int rut;
    private String nombre;
    private int año;

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, int rut, String nombre, int año) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rut = rut;
        this.nombre = nombre;
        this.año = año;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public int registrarUsuarioBLL(String usuario,String contraseña,int rut, String nombre,int año){
        Usuario u = new Usuario(usuario,contraseña,rut,nombre,año);
        return new DAL.UsuarioDAL().insertUser(u);
    }
    
    public Usuario buscarUser(String usuario){
        return new DAL.UsuarioDAL().buscarUser(usuario);
    }
    
}
