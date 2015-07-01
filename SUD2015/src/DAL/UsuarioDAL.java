package DAL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAL {
    
    private Conexion conn;
    
    public UsuarioDAL(){
        conn = new Conexion();
    }
    
    public int insertUser(BLL.Usuario u){
        try
        {
            String sql = "insert into usuario values(?,?,?,?,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            insert.setString(1,u.getUsuario());
            insert.setString(2, u.getContraseña());
            insert.setInt(3, u.getRut());
            insert.setString(4, u.getNombre());
            insert.setInt(5, u.getAño());
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    public BLL.Usuario buscarUser(String usuario){
        try
        {
            String sql = "select * from usuario where usuario = ?";
            PreparedStatement search = conn.crearSentencia(sql);
            search.setString(1, usuario);
            ResultSet User = search.executeQuery();
            if(User.next())
            {
                BLL.Usuario u = new BLL.Usuario();
                u.setUsuario(User.getString(1));
                u.setContraseña(User.getString(2));
                u.setRut(User.getInt(3));
                u.setNombre(User.getString(4));
                u.setAño(User.getInt(5));
                return u;
            }
            else
            {
                return null;
            }
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
//    PARA EL FONDO DE SUD
//    public int updateBilleteraUser(int billetera, String username){
//        try
//        {
//            String sql = "update cliente set billetera = billetera + ? where username = ?";
//            PreparedStatement update = conn.crearSentencia(sql);
//            update.setInt(1, billetera);
//            update.setString(2, username);
//            return update.executeUpdate();
//        }
//        catch(SQLException e)
//        {
//            return e.getErrorCode();
//        }
//    }
    
     public ArrayList <BLL.Usuario> ConsultarUser(){
        try
        {
            ArrayList<BLL.Usuario> Usuario = new ArrayList<>();
            String sql = "select * from usuario";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            { 
                BLL.Usuario u = new BLL.Usuario();
                u.setUsuario(listado.getString(1));
                u.setContraseña(listado.getString(2));
                u.setRut(listado.getInt(3));
                u.setNombre(listado.getString(4));
                u.setAño(listado.getInt(5));
                Usuario.add(u);
            }
            return Usuario;
        }
        catch(SQLException e)
        {
            return null;
        }
    } 
}