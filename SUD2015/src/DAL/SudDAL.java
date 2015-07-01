package DAL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SudDAL {
    
    private Conexion conn;
    
    public SudDAL(){
        conn = new Conexion();
    }
    
    public int updateFondoSud(int monto){
        try
        {
            String sql = "update sud set fondo = fondo + ?";
            PreparedStatement update = conn.crearSentencia(sql);
            update.setInt(1, monto);
            return update.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    
    public int obtenerFondoSud(){
        try
        {
            String sql = "Select fondo from sud where año = 2015";
            PreparedStatement obtener = conn.crearSentencia(sql);
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
        
}