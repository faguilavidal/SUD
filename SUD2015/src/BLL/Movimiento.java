package BLL;

import java.util.ArrayList;

public class Movimiento {
    private int codigo;
    private int monto;
    private String movimiento;
    private String detalle;
    private int año;

    public Movimiento() {
    }

    public Movimiento(int codigo, int monto, String movimiento, String detalle, int año) {
        this.codigo = codigo;
        this.monto = monto;
        this.movimiento = movimiento;
        this.detalle = detalle;
        this.año = año;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public int registroMaxMovimiento(){
        return new DAL.MovimientoDAL().maxMovimiento();
    }
    
    public int registrarNuevaMovimiento(int idmov,int monto,String movimiento,String detalle,int año){        
        return new DAL.MovimientoDAL().insertMovimiento(new Movimiento(idmov,monto,movimiento,detalle,año));
    }
    
    public ArrayList<Movimiento> listadoMovimientos(){
        return new DAL.MovimientoDAL().selectMovimientos();
    }
    
}
