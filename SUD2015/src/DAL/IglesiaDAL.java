package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IglesiaDAL {
    
    private Conexion conn;
    
    public IglesiaDAL(){
        conn = new Conexion();
    }
    
    public int insertIglesia(BLL.Iglesia i){
        try
        {
            String sql = "insert into iglesia values (?,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            insert.setInt(1, i.getIdiglesia());
            insert.setString(2, i.getNombreIglesia());
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
//    public int deleteComuna(int id){
//        try
//        {
//            String sql = "delete from comuna where id = ?";
//            PreparedStatement delete = conn.crearSentencia(sql);
//            delete.setInt(1, id);
//            return delete.executeUpdate();
//        }
//        catch(SQLException e)
//        {
//            return e.getErrorCode();
//        }
//    }
//    
//    public int updateComuna(BLL.Comuna c){
//        try
//        {
//            String sql = "update comuna set nombre = ? where id = ?";
//            PreparedStatement update = conn.crearSentencia(sql);
//            update.setString(1, c.getNombre());
//            update.setInt(2, c.getId());
//            return update.executeUpdate();
//        }
//        catch(SQLException e)
//        {
//            return e.getErrorCode();
//        }
//    }
    
    public ArrayList<BLL.Iglesia> selectIglesias(){
        try
        {
            ArrayList<BLL.Iglesia> Iglesias = new ArrayList<>();
            String sql = "select * from iglesia order  by nombreiglesia";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            {
                Iglesias.add(new BLL.Iglesia(listado.getInt(1), listado.getString(2)));
            }
            return Iglesias;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public int maxIglesia(){
        try
        {
            String sql = "select max(idiglesia) from iglesia";
            PreparedStatement count = conn.crearSentencia(sql);
            ResultSet valor = count.executeQuery();
            if(valor.next())
            {
                return valor.getInt(1);
            }
            else
            {
                return -1;
            }
        }
        catch(SQLException e)
        {
            return -1;
        }
    }
//
//    public int countComunas(){
//        try
//        {
//            String sql = "select count(id) from comuna";
//            PreparedStatement count = conn.crearSentencia(sql);
//            ResultSet valor = count.executeQuery();
//            if(valor.next())
//            {
//                return valor.getInt(1);
//            }
//            else
//            {
//                return -1;
//            }
//        }
//        catch(SQLException e)
//        {
//            return -1;
//        }
//    }
    
    public int obtenerIdIglesia(String nombre){
        try
        {
            String sql = "Select idiglesia from iglesia where nombreiglesia = ?";
            PreparedStatement obtener = conn.crearSentencia(sql);
            obtener.setString(1, nombre);
            ResultSet valor = obtener.executeQuery();
            if(valor.next())
            {
                return valor.getInt(1);
            }
            else
            {
                return -1;
            }
        }
        catch(SQLException e)
        {
            return -1;
        }
    }
    
    public String obtenerNombreIglesia(int id){
        try
        {
            String sql = "Select nombreiglesia from iglesia where idiglesia = ?";
            PreparedStatement obtener = conn.crearSentencia(sql);
            obtener.setInt(1, id);
            ResultSet valor = obtener.executeQuery();
            if(valor.next())
            {
                return valor.getString(1);
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

}














