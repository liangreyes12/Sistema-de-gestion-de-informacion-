package Conexiones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VentasDao {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
     
    //METODO PARA REGISTAR VENTA
    public boolean RegistrarVentas(Ventas Vn){
        String sql = "INSERT INTO ventas(ID, CODIGO, PRODUCTO, CANTIDAD, MONTO, FECHA) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, Vn.getID());
            ps.setString(2, Vn.getCODIGO());
            ps.setString(3, Vn.getPRODUCTO());
            ps.setInt(4, Vn.getCANTIDAD());
            ps.setString(5, Vn.getMONTO());
            ps.setString(6, Vn.getFECHA());
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
   
    
    //METODO PARA LISTAR VENTA
    public List ListarVenta(){
    List<Ventas> ListarVenta = new ArrayList(); // Crea una lista temporal
    String sql = "SELECT * FROM ventas";

    try {
        con = cn.getConexion();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        while(rs.next()){
            Ventas vn = new Ventas();
            vn.setID(rs.getInt("ID"));
            vn.setCODIGO(rs.getString("CODIGO"));
            vn.setPRODUCTO(rs.getString("PRODUCTO"));
            vn.setCANTIDAD(rs.getInt("CANTIDAD"));
            vn.setMONTO(rs.getString("MONTO"));
            vn.setFECHA(rs.getString("FECHA"));
            ListarVenta.add(vn); // Agrega el objeto Ventas a la lista temporal
        }

    } catch (SQLException e) {
        System.out.println(e.toString());
    }

    return ListarVenta; // Retorna la lista temporal
}


    //METODO PARA ELIMINAR VENTA
    public boolean EliminarVenta(int id){
       
       String sql = "DELETE FROM ventas WHERE id = ?";
       
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

    
    //METODO PARA MODIFICAR VENTAS
    public boolean ModificarVentas(Ventas vn){
      
        try {
            String sql = "UPDATE ventas SET CODIGO = ?, PRODUCTO = ?, CANTIDAD = ?, MONTO = ?, FECHA = ? WHERE ID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, vn.getCODIGO());
            ps.setString(2, vn.getPRODUCTO());
            ps.setInt(3, vn.getCANTIDAD());
            ps.setString(4, vn.getMONTO());
            ps.setString(5, vn.getFECHA());
            ps.setInt(6, vn.getID());
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