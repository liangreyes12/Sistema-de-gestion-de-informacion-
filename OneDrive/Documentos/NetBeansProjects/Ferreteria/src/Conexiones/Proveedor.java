package Conexiones;

public class Proveedor {
    
    private int ID;
    private String NOMBRE;
    private String CORREO;
    private String WHASTAPP;

    public Proveedor() {
        
    }

    public Proveedor(int ID, String NOMBRE, String CORREO, String WHASTAPP) {
        this.ID = ID;
        this.NOMBRE = NOMBRE;
        this.CORREO = CORREO;
        this.WHASTAPP = WHASTAPP;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }

    public String getWHASTAPP() {
        return WHASTAPP;
    }

    public void setWHASTAPP(String WHASTAPP) {
        this.WHASTAPP = WHASTAPP;
    }
}