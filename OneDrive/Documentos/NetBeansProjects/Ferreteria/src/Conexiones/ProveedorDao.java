package Conexiones;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDao {
     
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    //METODO PARA REGISTRAR PROVEEDOR EN LA BASE DE DATOS
    public boolean RegistrarProveedor(Proveedor pr){
        
        String sql = "INSERT INTO proveedor(ID, NOMBRE, CORREO, WHASTAPP) VALUES (?, ?, ?, ?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pr.getID());
            ps.setString(2, pr.getNOMBRE());
            ps.setString(3, pr.getCORREO());
            ps.setString(4, pr.getWHASTAPP());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    
    
    //METODO PARA LISTAR PROVEEDOR DE LA BASE DE DATOS EN LA TABLA 
    public List ListarProveedores(){
        
       List<Proveedor> Listapr = new ArrayList();
       String sql = "SELECT * FROM proveedor";
       
        try {
            
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Proveedor pr = new Proveedor();
                pr.setID(rs.getInt("ID"));
                pr.setNOMBRE(rs.getString("NOMBRE"));
                pr.setCORREO(rs.getString("CORREO"));
                pr.setWHASTAPP(rs.getString("WHASTAPP"));
                Listapr.add(pr);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            
        }
        
        return Listapr;
    }
    
    
    
    //METODO PARA BORRAR PROVEEDOR DE LA BASE DE DATOS
    public boolean EliminarProveedor(int id){
       
       String sql = "DELETE FROM proveedor WHERE id = ?";
       
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    
    
    //METODO PARA MODIFICAR PROVEEDOR
    public boolean ModificarProveedor(Proveedor pr){
      
        try {
            String sql = "UPDATE proveedor SET NOMBRE = ?, CORREO = ?, WHASTAPP = ? WHERE ID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getNOMBRE());
            ps.setString(2, pr.getCORREO());
            ps.setString(3, pr.getWHASTAPP());
            ps.setInt(4, pr.getID());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }                                                                                                                       
    }
    
    
}