package Conexiones;

public class Ventas {
    
    private int ID;
    private String CODIGO;
    private String PRODUCTO;
    private int CANTIDAD;
    private String MONTO;
    private String FECHA;

    public Ventas() {
        
    }

    public Ventas(int ID, String CODIGO, String PRODUCTO, int CANTIDAD, String MONTO, String FECHA) {
        this.ID = ID;
        this.CODIGO = CODIGO;
        this.PRODUCTO = PRODUCTO;
        this.CANTIDAD = CANTIDAD;
        this.MONTO = MONTO;
        this.FECHA = FECHA;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getPRODUCTO() {
        return PRODUCTO;
    }

    public void setPRODUCTO(String PRODUCTO) {
        this.PRODUCTO = PRODUCTO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public String getMONTO() {
        return MONTO;
    }

    public void setMONTO(String MONTO) {
        this.MONTO = MONTO;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }
    
    
    
}