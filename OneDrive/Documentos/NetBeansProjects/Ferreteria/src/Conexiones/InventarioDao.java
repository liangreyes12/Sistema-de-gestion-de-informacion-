package Conexiones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InventarioDao {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    //METODO PARA REGISTAR INVENTARIO
    public boolean RegistrarInventario(Inventario In){
        String sql = "INSERT INTO inventario(ID, CODIGO, PRODUCTO, PRECIO, PROVEEDOR, STOCK) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, In.getID());
            ps.setString(2, In.getCODIGO());
            ps.setString(3, In.getPRODUCTO());
            ps.setString(4, In.getPRECIO());
            ps.setString(5, In.getPROVEEDOR());
            ps.setString(6, In.getSTOCK());
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
    
    //METODO PARA LISTAR INVENTARIO
    //METODO PARA LISTAR INVENTARIO
public List ListarInventario(){
    
    List<Inventario> ListarIn = new ArrayList();
    String sql = "SELECT * FROM inventario";
    
    try (Connection con = cn.getConexion();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Inventario in = new Inventario();
            in.setID(rs.getInt("ID"));
            in.setCODIGO(rs.getString("CODIGO"));
            in.setPRODUCTO(rs.getString("PRODUCTO"));
            in.setPRECIO(rs.getString("PRECIO"));
            in.setPROVEEDOR(rs.getString("PROVEEDOR"));
            in.setSTOCK(rs.getString("STOCK"));
            ListarIn.add(in);
        }
    } catch (SQLException e) {
        System.out.println(e.toString());
    }

    return ListarIn;
}
    
    //METODO PARA ELIMINAR INVENTARIO
    public boolean EliminarInventario(int id){
    String sql = "DELETE FROM inventario WHERE id = ?";
    try {
        con = cn.getConexion(); // move the line here
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
    
    //METODO PARA MODIFICAR INVENTARIO
    public boolean ModificarInventario(Inventario inv){
        try {
            con = cn.getConexion(); // move the line here
            String sql = "UPDATE inventario SET CODIGO = ?, PRODUCTO = ?, PRECIO = ?, PROVEEDOR = ?, STOCK = ? WHERE ID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, inv.getCODIGO());
            ps.setString(2, inv.getPRODUCTO());
            ps.setString(3, inv.getPRECIO());
            ps.setString(4, inv.getPROVEEDOR());
            ps.setString(5, inv.getSTOCK());
            ps.setInt(6, inv.getID());
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