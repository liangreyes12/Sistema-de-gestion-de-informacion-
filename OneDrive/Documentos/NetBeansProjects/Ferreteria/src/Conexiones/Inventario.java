package Conexiones;

public class Inventario {
    
    private int ID;
    private String CODIGO;
    private String PRODUCTO;
    private String PRECIO;
    private String PROVEEDOR;
    private String STOCK;

    public Inventario() {
        
    }

    public Inventario(int ID, String CODIGO, String PRODUCTO, String PRECIO, String STOCK, String PROVEEDOR) {
        this.ID = ID;
        this.CODIGO = CODIGO;
        this.PRODUCTO = PRODUCTO;
        this.PRECIO = PRECIO;
        this.STOCK = STOCK;
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
    
    public String getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(String STOCK) {
        this.STOCK = STOCK;
    }

}