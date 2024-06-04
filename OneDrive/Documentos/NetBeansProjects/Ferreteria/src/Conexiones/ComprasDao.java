package Conexiones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComprasDao {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    //METODO PARA REGISTRAR COMPRAS EN LA BASE DE DATOS 
    public boolean RegistrarCompra(Compras cm){
        String sql = "INSERT INTO compras(ID, CODIGO, PRODUCTO, CANTIDAD, PRECIO, PROVEEDOR) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cm.getID());
            ps.setString(2, cm.getCODIGO());
            ps.setString(3, cm.getPRODUCTO());
            ps.setInt(4, cm.getCANTIDAD());
            ps.setString(5, cm.getPRECIO());
            ps.setString(6, cm.getPROVEEDOR());
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
    
    //METEDO PARA LISTAR COMPRAS EN LA TABLA 
    public List ListarCompras(){
        
       List<Compras> Listacm = new ArrayList();
       String sql = "SELECT * FROM compras";
       
        try {
            
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Compras cm = new Compras();
                cm.setID(rs.getInt("ID"));
                cm.setCODIGO(rs.getString("CODIGO"));
                cm.setPRODUCTO(rs.getString("PRODUCTO"));
                cm.setCANTIDAD(rs.getInt("CANTIDAD"));
                cm.setPRECIO(rs.getString("PRECIO"));
                cm.setPROVEEDOR(rs.getString("PROVEEDOR"));
                Listacm.add(cm);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            
        }
        
        return Listacm;
    }
    
    //METODO PARA ELIMINAR COMPRAS
    public boolean EliminarCompras(int id){
       
       String sql = "DELETE FROM compras WHERE id = ?";
       
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
    
    //METODO PARA MODIFICAR COMPRAS EN LA TABLA
    public boolean ModificarCompras(Compras com){
      
        try {
            String sql = "UPDATE compras SET CODIGO = ?, PRODUCTO = ?, PRECIO = ?, CANTIDAD = ?,  PROVEEDOR = ? WHERE ID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, com.getCODIGO());
            ps.setString(2, com.getPRODUCTO());
            ps.setString(3, com.getPRECIO());
            ps.setInt(4, com.getCANTIDAD());
            ps.setString(5, com.getPROVEEDOR());
            ps.setInt(6, com.getID());
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