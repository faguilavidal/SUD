package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MovimientoDAL {
    
    private Conexion conn;
    
    public MovimientoDAL(){
        conn = new Conexion();
    }
    
    public int insertMovimiento(BLL.Movimiento m){
        try
        {
            String sql = "insert into movimientos values (?,?,?,?,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            insert.setInt(1, m.getCodigo());
            insert.setInt(2, m.getMonto());
            insert.setString(3, m.getMovimiento());
            insert.setString(4, m.getDetalle());
            insert.setInt(5, m.getAño());
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
    
    public ArrayList<BLL.Movimiento> selectMovimientos(){
        try
        {
            ArrayList<BLL.Movimiento> Movimientos = new ArrayList<>();
            String sql = "select * from movimientos order  by idmov";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            {
                Movimientos.add(new BLL.Movimiento(listado.getInt(1),listado.getInt(2),listado.getString(3),listado.getString(4),listado.getInt(5)));
            }
            return Movimientos;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public int maxMovimiento(){
        try
        {
            String sql = "select max(idmov) from movimientos";
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
//    
//    public int obtenerIdComuna(String nombreComuna){
//        try
//        {
//            String sql = "Select id from comuna where nombre = ?";
//            PreparedStatement obtener = conn.crearSentencia(sql);
//            obtener.setString(1, nombreComuna);
//            ResultSet valor = obtener.executeQuery();
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
//    
//    public String obtenerNombreComuna(int id){
//        try
//        {
//            String sql = "Select nombre from comuna where id = ?";
//            PreparedStatement obtener = conn.crearSentencia(sql);
//            obtener.setInt(1, id);
//            ResultSet valor = obtener.executeQuery();
//            if(valor.next())
//            {
//                return valor.getString(1);
//            }
//            else
//            {
//                return null;
//            }
//        }
//        catch(SQLException e)
//        {
//            return null;
//        }
//    }

}














