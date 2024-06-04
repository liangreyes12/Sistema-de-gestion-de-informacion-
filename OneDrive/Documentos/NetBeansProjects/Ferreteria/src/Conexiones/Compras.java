package Conexiones;

public class Compras {
    private int ID;
    private String CODIGO;
    private String PRODUCTO;
    private int CANTIDAD;
    private String PRECIO;
    private String PROVEEDOR;

    public Compras() {
        
    }

    public Compras(int ID, String CODIGO, String PRODUCTO, int CANTIDAD, String PROVEEDOR) {
        this.ID = ID;
        this.CODIGO = CODIGO;
        this.PRODUCTO = PRODUCTO;
        this.CANTIDAD = CANTIDAD;
        this.PROVEEDOR = PROVEEDOR;
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

    public String getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(String PRECIO) {
        this.PRECIO = PRECIO;
    }

    public String getPROVEEDOR() {
        return PROVEEDOR;
    }

    public void setPROVEEDOR(String PROVEEDOR) {
        this.PROVEEDOR = PROVEEDOR;
    }
}