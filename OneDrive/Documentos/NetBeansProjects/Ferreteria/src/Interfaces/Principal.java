package Interfaces;

import Conexiones.ExportarExcel;
import Conexiones.Compras;
import Conexiones.ComprasDao;
import Conexiones.Inventario;
import Conexiones.InventarioDao;
import Conexiones.Proveedor;
import Conexiones.ProveedorDao;
import Conexiones.Ventas;
import Conexiones.VentasDao;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JTable;

public class Principal extends javax.swing.JFrame {
    
    //INSTANCIAR OBJETOS DE LAS CLASES
    Proveedor pr = new Proveedor();
    ProveedorDao prdao = new ProveedorDao();
    Compras com = new Compras();
    ComprasDao comdao = new ComprasDao();
    Inventario inv = new Inventario();
    InventarioDao invDao = new InventarioDao();
    Ventas vn = new Ventas();
    VentasDao vnDao = new VentasDao();
  
    
    //INSTANCIA DE TABLA USADA
    DefaultTableModel modelo;
    
    
    
   
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    //METODO PARA LIMPIAR TABLA
    public void LimpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    
    //METODO PARA LIMPIAR LOS RECUADROS DE TEXTO 
    public void LimpiarRecuadros(){
        TxtIdInventario.setText("");
        TxtCodigoInventario.setText("");
        TxtProductoInventario.setText("");
        TxtPrecioInventario.setText("");
        TxtPrecioInventario.setText("");
        TxtProveedorInventario.setText("");    
        TxtStockInventario.setText("");
    }
    
    public void LimpiarVentas(){
        TxtIdVentas.setText("");
        TxtCodigoVentas.setText("");
        TxtProductoVentas.setText("");
        TxtCantidadVentas.setText("");    
        TxtMontoVentas1.setText("");
        TxtFechaVentas.setText("");
        
    }
    
    public void LimpiarProveedores(){
        TxtIdProveedor.setText("");
        TxtNombreProveedor.setText("");
        TxtCorreoProveedor.setText("");    
        TxtWhatsappProveedor.setText("");
    }
    
    public void LimpiarCompras(){
        TxtIdCompra.setText("");
        TxtCodigoCompra.setText("");
        TxtProductoCompra.setText("");
        TxtCantidadCompra.setText("");
        TxtPrecioCompra.setText("");
        TxtProveedorCompra.setText("");
    }
    
    
    //METODO PARA LISTAR PROVEEDORES
    public void ListarProveedores(){
        List<Proveedor> ListarPr = prdao.ListarProveedores();
        modelo = (DefaultTableModel) TablaProveedor.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < ListarPr.size(); i++) {
            ob[0] = ListarPr.get(i).getID();
            ob[1] = ListarPr.get(i).getNOMBRE();
            ob[2] = ListarPr.get(i).getCORREO();
            ob[3] = ListarPr.get(i).getWHASTAPP();
            modelo.addRow(ob);
        }
        TablaProveedor.setModel(modelo);
    }
    
    
    
    //METODO PARA LISTAR COMPRAS
    public void ListarCompras(){
        List<Compras> ListarCm = comdao.ListarCompras();
        modelo = (DefaultTableModel) TablaCompras.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarCm.size(); i++) {
            ob[0] = ListarCm.get(i).getID();
            ob[1] = ListarCm.get(i).getCODIGO();
            ob[2] = ListarCm.get(i).getPRODUCTO();
            ob[3] = ListarCm.get(i).getCANTIDAD();
            ob[4] = ListarCm.get(i).getPRECIO();
            ob[5] = ListarCm.get(i).getPROVEEDOR();
            modelo.addRow(ob);
        }
        TablaCompras.setModel(modelo);
    }
    
    
    //METODO PARA LISTAR PRODUCTOS DEL INVENTARIO
    public void ListarInventario(){
        List<Inventario> ListarIn = invDao.ListarInventario();
        modelo = (DefaultTableModel) TablaInventario.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarIn.size(); i++) {
            ob[0] = ListarIn.get(i).getID();
            ob[1] = ListarIn.get(i).getCODIGO();
            ob[2] = ListarIn.get(i).getPRODUCTO();
            ob[3] = ListarIn.get(i).getPRECIO();
            ob[4] = ListarIn.get(i).getPROVEEDOR();
            ob[5] = ListarIn.get(i).getSTOCK();
            modelo.addRow(ob);
        }
        TablaInventario.setModel(modelo);
    }
    
    
    //METODO PARA LISTAR VENTAS
    public void ListarVentas(){
        List<Ventas> Listarvn = vnDao.ListarVenta();
        modelo = (DefaultTableModel) TablaVentas.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < Listarvn.size(); i++) {
            ob[0] = Listarvn.get(i).getID();
            ob[1] = Listarvn.get(i).getCODIGO();
            ob[2] = Listarvn.get(i).getPRODUCTO();
            ob[3] = Listarvn.get(i).getCANTIDAD();
            ob[4] = Listarvn.get(i).getMONTO();
            ob[5] = Listarvn.get(i).getFECHA();
            modelo.addRow(ob);
        }
        TablaVentas.setModel(modelo);
    }
    
    //METODO PARA LIMPIAR LA TABLA 
    public static void truncateTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        PnlAmarillo = new javax.swing.JPanel();
        LblLogo = new javax.swing.JLabel();
        BtnInventario = new javax.swing.JButton();
        BtnVentas = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        BtnCompras = new javax.swing.JButton();
        BtnProveedor = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PnlNegro = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        TxtIdInventario = new javax.swing.JTextField();
        TxtCodigoInventario = new javax.swing.JTextField();
        TxtProductoInventario = new javax.swing.JTextField();
        TxtPrecioInventario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtProveedorInventario = new javax.swing.JTextField();
        TxtStockInventario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInventario = new javax.swing.JTable();
        BtnGuardarInventario = new javax.swing.JButton();
        BtnExcelinventario = new javax.swing.JButton();
        BtnModificaInventario = new javax.swing.JButton();
        BtnEliminarInventario = new javax.swing.JButton();
        BtnListarInventario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxtIdVentas = new javax.swing.JTextField();
        TxtCodigoVentas = new javax.swing.JTextField();
        TxtProductoVentas = new javax.swing.JTextField();
        TxtCantidadVentas = new javax.swing.JTextField();
        TxtFechaVentas = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        BtnListarVentas = new javax.swing.JButton();
        BtnGuardarVentas = new javax.swing.JButton();
        BtnModificaVentas = new javax.swing.JButton();
        BtnEliminarVenta = new javax.swing.JButton();
        BtnExcelVenta = new javax.swing.JButton();
        TxtMontoVentas1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtIdProveedor = new javax.swing.JTextField();
        TxtNombreProveedor = new javax.swing.JTextField();
        TxtCorreoProveedor = new javax.swing.JTextField();
        TxtWhatsappProveedor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProveedor = new javax.swing.JTable();
        BtnGuardarProveedor = new javax.swing.JButton();
        BtnListarProveedores = new javax.swing.JButton();
        BtnModificaInventario2 = new javax.swing.JButton();
        BtnEliminarProveedor = new javax.swing.JButton();
        BtnExcelProovedor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        TxtIdCompra = new javax.swing.JTextField();
        TxtCodigoCompra = new javax.swing.JTextField();
        TxtProductoCompra = new javax.swing.JTextField();
        TxtCantidadCompra = new javax.swing.JTextField();
        TxtPrecioCompra = new javax.swing.JTextField();
        BtnGuardarCompra = new javax.swing.JButton();
        TxtProveedorCompra = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaCompras = new javax.swing.JTable();
        BtnListarCompras = new javax.swing.JButton();
        BtnModificarCompras = new javax.swing.JButton();
        BtnEliminarCompras = new javax.swing.JButton();
        BtnExcelCompras = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlAmarillo.setBackground(new java.awt.Color(254, 215, 52));

        LblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LOGO_NEGRO4.png"))); // NOI18N

        BtnInventario.setBackground(new java.awt.Color(0, 0, 0));
        BtnInventario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnInventario.setForeground(new java.awt.Color(255, 255, 255));
        BtnInventario.setText("INVENTARIO");
        BtnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInventarioActionPerformed(evt);
            }
        });

        BtnVentas.setBackground(new java.awt.Color(0, 0, 0));
        BtnVentas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnVentas.setForeground(new java.awt.Color(255, 255, 255));
        BtnVentas.setText("VENTAS");
        BtnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVentasActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(0, 0, 0));
        BtnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("SALIR");
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        BtnCompras.setBackground(new java.awt.Color(0, 0, 0));
        BtnCompras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCompras.setForeground(new java.awt.Color(255, 255, 255));
        BtnCompras.setText("COMPRAS");
        BtnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprasActionPerformed(evt);
            }
        });

        BtnProveedor.setBackground(new java.awt.Color(0, 0, 0));
        BtnProveedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnProveedor.setForeground(new java.awt.Color(255, 255, 255));
        BtnProveedor.setText("PROVEEDORES");
        BtnProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProveedorActionPerformed(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("INFORMACION FISCAL (RIF)");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel8.setText("(J504184195)");

        javax.swing.GroupLayout PnlAmarilloLayout = new javax.swing.GroupLayout(PnlAmarillo);
        PnlAmarillo.setLayout(PnlAmarilloLayout);
        PnlAmarilloLayout.setHorizontalGroup(
            PnlAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAmarilloLayout.createSequentialGroup()
                .addGroup(PnlAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlAmarilloLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(PnlAmarilloLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlAmarilloLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PnlAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator4)
                    .addComponent(BtnInventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlAmarilloLayout.createSequentialGroup()
                        .addGroup(PnlAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(BtnProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(BtnCompras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
            .addGroup(PnlAmarilloLayout.createSequentialGroup()
                .addGroup(PnlAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlAmarilloLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel8))
                    .addGroup(PnlAmarilloLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlAmarilloLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PnlAmarilloLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnCompras, BtnProveedor, BtnVentas});

        PnlAmarilloLayout.setVerticalGroup(
            PnlAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAmarilloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(44, 44, 44)
                .addComponent(BtnInventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        PnlAmarilloLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnCompras, BtnInventario, BtnProveedor, BtnSalir, BtnVentas});

        getContentPane().add(PnlAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 610));

        PnlNegro.setBackground(new java.awt.Color(34, 34, 34));

        jTabbedPane1.setBackground(new java.awt.Color(34, 34, 34));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TxtIdInventario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtIdInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), java.awt.Color.white));
        TxtIdInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdInventarioActionPerformed(evt);
            }
        });

        TxtCodigoInventario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtCodigoInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), java.awt.Color.white));

        TxtProductoInventario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtProductoInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), java.awt.Color.white));

        TxtPrecioInventario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtPrecioInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), java.awt.Color.white));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CODIGO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRODUCTO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRECIO");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("STOCK");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PROVEEDOR");

        TxtProveedorInventario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtProveedorInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), java.awt.Color.white));
        TxtProveedorInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProveedorInventarioActionPerformed(evt);
            }
        });

        TxtStockInventario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtStockInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), java.awt.Color.white));
        TxtStockInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtStockInventarioActionPerformed(evt);
            }
        });

        TablaInventario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TablaInventario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "PRODUCTO", "PRECIO", "PROVEEDOR", "STOCK"
            }
        ));
        TablaInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaInventario);
        if (TablaInventario.getColumnModel().getColumnCount() > 0) {
            TablaInventario.getColumnModel().getColumn(0).setPreferredWidth(15);
            TablaInventario.getColumnModel().getColumn(1).setPreferredWidth(20);
            TablaInventario.getColumnModel().getColumn(2).setPreferredWidth(90);
            TablaInventario.getColumnModel().getColumn(3).setPreferredWidth(18);
            TablaInventario.getColumnModel().getColumn(4).setPreferredWidth(115);
            TablaInventario.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        BtnGuardarInventario.setBackground(new java.awt.Color(0, 0, 0));
        BtnGuardarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/guardar-datos.png"))); // NOI18N
        BtnGuardarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarInventarioActionPerformed(evt);
            }
        });

        BtnExcelinventario.setBackground(new java.awt.Color(0, 0, 0));
        BtnExcelinventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/sobresalir.png"))); // NOI18N
        BtnExcelinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcelinventarioActionPerformed(evt);
            }
        });

        BtnModificaInventario.setBackground(new java.awt.Color(0, 0, 0));
        BtnModificaInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/intercambiar.png"))); // NOI18N
        BtnModificaInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificaInventarioActionPerformed(evt);
            }
        });

        BtnEliminarInventario.setBackground(new java.awt.Color(0, 0, 0));
        BtnEliminarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/boton-x (1).png"))); // NOI18N
        BtnEliminarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarInventarioActionPerformed(evt);
            }
        });

        BtnListarInventario.setBackground(new java.awt.Color(0, 0, 0));
        BtnListarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LISTAR.png"))); // NOI18N
        BtnListarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtStockInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnListarInventario)
                        .addGap(38, 38, 38)
                        .addComponent(BtnGuardarInventario)
                        .addGap(33, 33, 33)
                        .addComponent(BtnModificaInventario)
                        .addGap(33, 33, 33)
                        .addComponent(BtnEliminarInventario)
                        .addGap(36, 36, 36)
                        .addComponent(BtnExcelinventario)
                        .addGap(135, 135, 135))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(TxtProveedorInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(TxtPrecioInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TxtProductoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(TxtCodigoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(TxtIdInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(92, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIdInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCodigoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtProductoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPrecioInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtProveedorInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnModificaInventario)
                            .addComponent(BtnEliminarInventario)
                            .addComponent(BtnExcelinventario)
                            .addComponent(BtnGuardarInventario)
                            .addComponent(BtnListarInventario)))
                    .addComponent(TxtStockInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INVENTARIO", jPanel1);

        jPanel2.setBackground(new java.awt.Color(34, 34, 34));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CODIGO");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PRODUCTO");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CANTIDAD");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("MONTO");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("FECHA");

        TxtIdVentas.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtIdVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.white));
        TxtIdVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdVentasActionPerformed(evt);
            }
        });

        TxtCodigoVentas.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtCodigoVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.white));

        TxtProductoVentas.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtProductoVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.white));

        TxtCantidadVentas.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtCantidadVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.white));

        TxtFechaVentas.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtFechaVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.white));
        TxtFechaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFechaVentasActionPerformed(evt);
            }
        });

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "PRODUCTO", "CANTIDAD", "MONTO", "FECHA"
            }
        ));
        TablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaVentasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaVentas);

        BtnListarVentas.setBackground(new java.awt.Color(0, 0, 0));
        BtnListarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LISTAR.png"))); // NOI18N
        BtnListarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarVentasActionPerformed(evt);
            }
        });

        BtnGuardarVentas.setBackground(new java.awt.Color(0, 0, 0));
        BtnGuardarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/guardar-datos.png"))); // NOI18N
        BtnGuardarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarVentasActionPerformed(evt);
            }
        });

        BtnModificaVentas.setBackground(new java.awt.Color(0, 0, 0));
        BtnModificaVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/intercambiar.png"))); // NOI18N
        BtnModificaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificaVentasActionPerformed(evt);
            }
        });

        BtnEliminarVenta.setBackground(new java.awt.Color(0, 0, 0));
        BtnEliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/boton-x (1).png"))); // NOI18N
        BtnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarVentaActionPerformed(evt);
            }
        });

        BtnExcelVenta.setBackground(new java.awt.Color(0, 0, 0));
        BtnExcelVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/sobresalir.png"))); // NOI18N
        BtnExcelVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcelVentaActionPerformed(evt);
            }
        });

        TxtMontoVentas1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtMontoVentas1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.white));
        TxtMontoVentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMontoVentas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtFechaVentas)
                    .addComponent(TxtCantidadVentas)
                    .addComponent(TxtCodigoVentas)
                    .addComponent(TxtProductoVentas)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(TxtIdVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TxtMontoVentas1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(BtnListarVentas)
                        .addGap(38, 38, 38)
                        .addComponent(BtnGuardarVentas)
                        .addGap(35, 35, 35)
                        .addComponent(BtnModificaVentas)
                        .addGap(35, 35, 35)
                        .addComponent(BtnEliminarVenta)
                        .addGap(37, 37, 37)
                        .addComponent(BtnExcelVenta))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnModificaVentas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnEliminarVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnExcelVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnGuardarVentas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnListarVentas, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIdVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCodigoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtProductoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCantidadVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtMontoVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtFechaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VENTAS", jPanel2);

        jPanel6.setBackground(new java.awt.Color(34, 34, 34));
        jPanel6.setPreferredSize(new java.awt.Dimension(745, 540));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NOMBRE");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CORREO");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("WHATSAPP");

        TxtIdProveedor.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtIdProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), java.awt.Color.white));
        TxtIdProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtIdProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdProveedorActionPerformed(evt);
            }
        });

        TxtNombreProveedor.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtNombreProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), java.awt.Color.white));

        TxtCorreoProveedor.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtCorreoProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), java.awt.Color.white));

        TxtWhatsappProveedor.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtWhatsappProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), java.awt.Color.white));

        TablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "CORREO", "WHASTAPP"
            }
        ));
        TablaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProveedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaProveedor);
        if (TablaProveedor.getColumnModel().getColumnCount() > 0) {
            TablaProveedor.getColumnModel().getColumn(0).setPreferredWidth(20);
            TablaProveedor.getColumnModel().getColumn(1).setPreferredWidth(50);
            TablaProveedor.getColumnModel().getColumn(2).setPreferredWidth(50);
            TablaProveedor.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        BtnGuardarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        BtnGuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/guardar-datos.png"))); // NOI18N
        BtnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarProveedorActionPerformed(evt);
            }
        });

        BtnListarProveedores.setBackground(new java.awt.Color(0, 0, 0));
        BtnListarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LISTAR.png"))); // NOI18N
        BtnListarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarProveedoresActionPerformed(evt);
            }
        });

        BtnModificaInventario2.setBackground(new java.awt.Color(0, 0, 0));
        BtnModificaInventario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/intercambiar.png"))); // NOI18N
        BtnModificaInventario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificaInventario2ActionPerformed(evt);
            }
        });

        BtnEliminarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        BtnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/boton-x (1).png"))); // NOI18N
        BtnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarProveedorActionPerformed(evt);
            }
        });

        BtnExcelProovedor.setBackground(new java.awt.Color(0, 0, 0));
        BtnExcelProovedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/sobresalir.png"))); // NOI18N
        BtnExcelProovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcelProovedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtWhatsappProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(TxtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(28, 28, 28)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(BtnListarProveedores)
                        .addGap(57, 57, 57)
                        .addComponent(BtnGuardarProveedor)
                        .addGap(48, 48, 48)
                        .addComponent(BtnModificaInventario2)
                        .addGap(56, 56, 56)
                        .addComponent(BtnEliminarProveedor)
                        .addGap(45, 45, 45)
                        .addComponent(BtnExcelProovedor))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(TxtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(8, 8, 8)
                        .addComponent(TxtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtCorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(TxtWhatsappProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BtnListarProveedores))
                    .addComponent(BtnGuardarProveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnModificaInventario2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnEliminarProveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnExcelProovedor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PROVEEDORES", jPanel6);

        jPanel3.setBackground(new java.awt.Color(34, 34, 34));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ID");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CODIGO");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("PRODUCTO");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("CANTIDAD");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("PRECIO");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("PROVEEDOR");

        TxtIdCompra.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtIdCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.white));

        TxtCodigoCompra.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtCodigoCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.white));

        TxtProductoCompra.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtProductoCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.white));

        TxtCantidadCompra.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtCantidadCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.white));

        TxtPrecioCompra.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtPrecioCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.white));

        BtnGuardarCompra.setBackground(new java.awt.Color(0, 0, 0));
        BtnGuardarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/guardar-datos.png"))); // NOI18N
        BtnGuardarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarCompraActionPerformed(evt);
            }
        });

        TxtProveedorCompra.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TxtProveedorCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.white));

        TablaCompras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "PRODUCTO", "CANTIDAD", "PRECIO", "PROVEEDOR"
            }
        ));
        TablaCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaComprasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaCompras);

        BtnListarCompras.setBackground(new java.awt.Color(0, 0, 0));
        BtnListarCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LISTAR.png"))); // NOI18N
        BtnListarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarComprasActionPerformed(evt);
            }
        });

        BtnModificarCompras.setBackground(new java.awt.Color(0, 0, 0));
        BtnModificarCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/intercambiar.png"))); // NOI18N
        BtnModificarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarComprasActionPerformed(evt);
            }
        });

        BtnEliminarCompras.setBackground(new java.awt.Color(0, 0, 0));
        BtnEliminarCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/boton-x (1).png"))); // NOI18N
        BtnEliminarCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarComprasMouseClicked(evt);
            }
        });
        BtnEliminarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarComprasActionPerformed(evt);
            }
        });

        BtnExcelCompras.setBackground(new java.awt.Color(0, 0, 0));
        BtnExcelCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/sobresalir.png"))); // NOI18N
        BtnExcelCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcelComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TxtProveedorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(BtnListarCompras)
                        .addGap(44, 44, 44)
                        .addComponent(BtnGuardarCompra)
                        .addGap(49, 49, 49)
                        .addComponent(BtnModificarCompras)
                        .addGap(47, 47, 47)
                        .addComponent(BtnEliminarCompras)
                        .addGap(43, 43, 43)
                        .addComponent(BtnExcelCompras)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel20)
                                        .addComponent(TxtCantidadCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(TxtIdCompra)
                                        .addComponent(TxtCodigoCompra)
                                        .addComponent(TxtPrecioCompra))
                                    .addComponent(TxtProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnListarCompras)
                            .addComponent(BtnGuardarCompra)
                            .addComponent(BtnModificarCompras)
                            .addComponent(BtnEliminarCompras)
                            .addComponent(BtnExcelCompras))
                        .addGap(240, 240, 240))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCodigoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addGap(8, 8, 8)
                        .addComponent(TxtCantidadCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtProveedorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TxtCantidadCompra, TxtCodigoCompra, TxtIdCompra, TxtPrecioCompra, TxtProductoCompra, TxtProveedorCompra});

        jTabbedPane1.addTab("COMPRAS", jPanel3);

        javax.swing.GroupLayout PnlNegroLayout = new javax.swing.GroupLayout(PnlNegro);
        PnlNegro.setLayout(PnlNegroLayout);
        PnlNegroLayout.setHorizontalGroup(
            PnlNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PnlNegroLayout.setVerticalGroup(
            PnlNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNegroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PnlNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 850, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        
         // Muestra un cuadro de diálogo de confirmación con opciones "Sí" y "No"
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la ventana actual?", "Confirmación", JOptionPane.YES_NO_OPTION);

        // Verifica la respuesta del usuario
        if (respuesta == JOptionPane.YES_OPTION) {
            // Si el usuario elige "Sí", cierra la ventana actual
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprasActionPerformed
      
       jTabbedPane1.setSelectedComponent(jPanel3);
        
    }//GEN-LAST:event_BtnComprasActionPerformed

    private void BtnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProveedorActionPerformed
        //LISTAR PROVEEDOR EN LA TABLA DE LA VENTANA PRINCIPAL
        jTabbedPane1.setSelectedComponent(jPanel6);
    }//GEN-LAST:event_BtnProveedorActionPerformed

    private void BtnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInventarioActionPerformed

        jTabbedPane1.setSelectedComponent(jPanel1);
        
    }//GEN-LAST:event_BtnInventarioActionPerformed

    private void BtnGuardarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarCompraActionPerformed
        //COMPRAS
        if(!"".equals(TxtIdCompra.getText()) && !"".equals(TxtCodigoCompra.getText()) && !"".equals(TxtProductoCompra.getText()) && !"".equals(TxtCantidadCompra.getText()) && !"".equals(TxtPrecioCompra.getText()) && !"".equals(TxtProveedorCompra.getText())){
            com.setID(Integer.parseInt(TxtIdCompra.getText()));
            com.setCODIGO(TxtCodigoCompra.getText());
            com.setPRODUCTO(TxtProductoCompra.getText());
            com.setCANTIDAD(Integer.parseInt(TxtCantidadCompra.getText()));
            com.setPRECIO(TxtPrecioCompra.getText());
            com.setPROVEEDOR(TxtProveedorCompra.getText());
            comdao.RegistrarCompra(com);
            LimpiarCompras();
            
        }else{
            JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS");
        }
    }//GEN-LAST:event_BtnGuardarCompraActionPerformed

    private void BtnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarProveedorActionPerformed
        //PROVEEDOR
        if(!"".equals(TxtIdProveedor.getText()) || !"".equals(TxtNombreProveedor.getText()) || !"".equals(TxtCorreoProveedor.getText()) || !"".equals(TxtWhatsappProveedor.getText())){
            pr.setID(Integer.parseInt(TxtIdProveedor.getText()));
            pr.setNOMBRE(TxtNombreProveedor.getText());
            pr.setCORREO(TxtCorreoProveedor.getText());
            pr.setWHASTAPP(TxtWhatsappProveedor.getText());
            prdao.RegistrarProveedor(pr);
            LimpiarProveedores();
        }else{
            JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS");
        }
    }//GEN-LAST:event_BtnGuardarProveedorActionPerformed

    private void TxtIdProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdProveedorActionPerformed

    private void BtnEliminarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarInventarioActionPerformed

        if (!"".equals(TxtIdInventario.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO DE ELIMINAR");
            if(pregunta == 0){
                int id = Integer.parseInt(TxtIdInventario.getText());
                invDao.EliminarInventario(id);
                LimpiarTabla();
                ListarInventario();
                LimpiarRecuadros();
            }

        }

    }//GEN-LAST:event_BtnEliminarInventarioActionPerformed

    private void BtnGuardarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarInventarioActionPerformed
        //INVENTARIO
        if(!"".equals(TxtIdInventario.getText()) || !"".equals(TxtCodigoInventario.getText()) || !"".equals(TxtProductoInventario.getText()) || !"".equals(TxtPrecioInventario.getText()) || !"".equals(TxtProveedorInventario.getText()) || !"".equals(TxtStockInventario.getText())){
            inv.setID(Integer.parseInt(TxtIdInventario.getText()));
            inv.setCODIGO(TxtCodigoInventario.getText());
            inv.setPRODUCTO(TxtProductoInventario.getText());
            inv.setPRECIO(TxtPrecioInventario.getText());
            inv.setPROVEEDOR(TxtProveedorInventario.getText());
            inv.setSTOCK(TxtStockInventario.getText());
            invDao.RegistrarInventario(inv);
            LimpiarRecuadros();
        }else{
            JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS");
        }

    }//GEN-LAST:event_BtnGuardarInventarioActionPerformed

    private void TablaInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInventarioMouseClicked

        int fila = TablaInventario.rowAtPoint(evt.getPoint());
        TxtIdInventario.setText(TablaInventario.getValueAt(fila, 0).toString());
        TxtCodigoInventario.setText(TablaInventario.getValueAt(fila, 1).toString());
        TxtProductoInventario.setText(TablaInventario.getValueAt(fila, 2).toString());
        TxtPrecioInventario.setText(TablaInventario.getValueAt(fila, 3).toString());
        TxtProveedorInventario.setText(TablaInventario.getValueAt(fila, 4).toString());
        TxtStockInventario.setText(TablaInventario.getValueAt(fila, 5).toString());

    }//GEN-LAST:event_TablaInventarioMouseClicked

    private void TxtStockInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtStockInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtStockInventarioActionPerformed

    private void TxtProveedorInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProveedorInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProveedorInventarioActionPerformed

    private void BtnListarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarInventarioActionPerformed
       //LISTAR LA TABLA CON TODA LA INFORMACION
       
       truncateTable(TablaInventario);
       ListarInventario();
    }//GEN-LAST:event_BtnListarInventarioActionPerformed

    private void BtnModificaInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificaInventarioActionPerformed
       //MODIFICAR INVENTARIO
       if("".equals(TxtIdInventario.getText())){
            JOptionPane.showMessageDialog(null, "ESCOGE UNA FILA");
       }else{
           if(!"".equals(TxtIdInventario.getText()) &&  !"".equals(TxtCodigoInventario.getText()) && !"".equals(TxtProductoInventario.getText()) && !"".equals(TxtPrecioInventario.getText()) && !"".equals(TxtProveedorInventario.getText()) && !"".equals(TxtStockInventario.getText())){
                inv.setID(Integer.parseInt(TxtIdInventario.getText()));
                inv.setCODIGO(TxtCodigoInventario.getText());
                inv.setPRODUCTO(TxtProductoInventario.getText());
                inv.setPRECIO(TxtPrecioInventario.getText());
                inv.setPROVEEDOR(TxtProveedorInventario.getText());
                inv.setSTOCK(TxtStockInventario.getText());
                invDao.ModificarInventario(inv);
                LimpiarTabla();
                LimpiarRecuadros();
                ListarInventario();
            }else{
                 JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS");
            }
       }
    }//GEN-LAST:event_BtnModificaInventarioActionPerformed

    private void BtnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVentasActionPerformed
        
        jTabbedPane1.setSelectedComponent(jPanel2);
        
    }//GEN-LAST:event_BtnVentasActionPerformed

    private void TxtIdInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdInventarioActionPerformed

    private void BtnListarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarProveedoresActionPerformed
        //BOTON PARA LISTAR PROVEEDORES
        truncateTable(TablaProveedor);
        ListarProveedores();
    }//GEN-LAST:event_BtnListarProveedoresActionPerformed

    private void BtnModificaInventario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificaInventario2ActionPerformed
       //BOTON PARA MODIFICAR PROVEEDORES
       if("".equals(TxtIdProveedor.getText())){
            JOptionPane.showMessageDialog(null, "ESCOGE UNA FILA");
       }else{
           if(!"".equals(TxtIdProveedor.getText()) &&  !"".equals(TxtNombreProveedor.getText()) && !"".equals(TxtCorreoProveedor.getText()) && !"".equals(TxtWhatsappProveedor.getText())){
                pr.setID(Integer.parseInt(TxtIdProveedor.getText()));
                pr.setNOMBRE(TxtNombreProveedor.getText());
                pr.setCORREO(TxtCorreoProveedor.getText());
                pr.setWHASTAPP(TxtWhatsappProveedor.getText());
                prdao.ModificarProveedor(pr);
                LimpiarTabla();
                LimpiarProveedores();
                ListarProveedores();
            }else{
                 JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS");
            }
       }
        
        
    }//GEN-LAST:event_BtnModificaInventario2ActionPerformed

    private void BtnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarProveedorActionPerformed
        //BOTON PARA ELIMINAR PROVEEDOR
        if (!"".equals(TxtIdProveedor.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO DE ELIMINAR");
            if(pregunta == 0){
                int id = Integer.parseInt(TxtIdProveedor.getText());
                prdao.EliminarProveedor(id);
                LimpiarTabla();
                LimpiarProveedores();
                ListarProveedores();
            }
        }
        
        
        
    }//GEN-LAST:event_BtnEliminarProveedorActionPerformed

    private void BtnListarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarComprasActionPerformed
        //BOTON PARA LISTAR COMPRAS
        truncateTable(TablaCompras);
        ListarCompras();
    }//GEN-LAST:event_BtnListarComprasActionPerformed

    private void BtnModificarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarComprasActionPerformed
        //BOTON PARA MODIFICAR COMPRAS
        if("".equals(TxtIdCompra.getText())){
            JOptionPane.showMessageDialog(null, "ESCOGE UNA FILA");
       }else{
           if(!"".equals(TxtIdCompra.getText()) &&  !"".equals(TxtCodigoCompra.getText()) && !"".equals(TxtProductoCompra.getText()) && !"".equals(TxtCantidadCompra.getText()) && !"".equals(TxtPrecioCompra.getText()) && !"".equals(TxtProveedorCompra.getText())){
                com.setID(Integer.parseInt(TxtIdCompra.getText()));
                com.setCODIGO(TxtCodigoCompra.getText());
                com.setPRODUCTO(TxtProductoCompra.getText());
                com.setCANTIDAD(Integer.parseInt(TxtCantidadCompra.getText()));
                com.setPRECIO(TxtPrecioCompra.getText());
                com.setPROVEEDOR(TxtProveedorCompra.getText());
                comdao.ModificarCompras(com);
                LimpiarTabla();
                LimpiarCompras();
                ListarCompras();
            }else{
                 JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS");
            }
       }
    }//GEN-LAST:event_BtnModificarComprasActionPerformed

    private void BtnEliminarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarComprasActionPerformed
        //BOTON PARA BORRAR COMPRAS
         if (!"".equals(TxtIdCompra.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO DE ELIMINAR");
            if(pregunta == 0){
                int id = Integer.parseInt(TxtIdCompra.getText());
                comdao.EliminarCompras(id);
                LimpiarTabla();
                LimpiarCompras();
                ListarCompras();
            }
        }
    }//GEN-LAST:event_BtnEliminarComprasActionPerformed

    private void BtnExcelinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcelinventarioActionPerformed
       //EXPORTAR A EXCEL INVENTARIO
       ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(TablaInventario);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_BtnExcelinventarioActionPerformed

    private void BtnEliminarComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarComprasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEliminarComprasMouseClicked

    private void TablaComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaComprasMouseClicked
        int fila = TablaCompras.rowAtPoint(evt.getPoint());
        TxtIdCompra.setText(TablaCompras.getValueAt(fila, 0).toString());
        TxtCodigoCompra.setText(TablaCompras.getValueAt(fila, 1).toString());
        TxtProductoCompra.setText(TablaCompras.getValueAt(fila, 2).toString());
        TxtCantidadCompra.setText(TablaCompras.getValueAt(fila, 3).toString());
        TxtPrecioCompra.setText(TablaCompras.getValueAt(fila, 4).toString());
        TxtProveedorCompra.setText(TablaCompras.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_TablaComprasMouseClicked

    private void BtnExcelComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcelComprasActionPerformed
        //EXPORTAR A EXCEL COMPRAS
        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(TablaCompras);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
         
    }//GEN-LAST:event_BtnExcelComprasActionPerformed

    private void BtnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarVentaActionPerformed
        //Eliminar Venta
          if (!"".equals(TxtIdVentas.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO DE ELIMINAR");
            if(pregunta == 0){
                int id = Integer.parseInt(TxtIdVentas.getText());
                vnDao.EliminarVenta(id);
                truncateTable(TablaVentas);
                ListarVentas();
                LimpiarVentas();
            }

        }
    }//GEN-LAST:event_BtnEliminarVentaActionPerformed

    private void BtnModificaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificaVentasActionPerformed
       if("".equals(TxtIdVentas.getText())){
            JOptionPane.showMessageDialog(null, "ESCOGE UNA FILA");
       }else{
           if(!"".equals(TxtIdVentas.getText()) &&  !"".equals(TxtCodigoVentas.getText()) && !"".equals(TxtProductoVentas.getText()) && !"".equals(TxtCantidadVentas.getText()) && !"".equals(TxtMontoVentas1.getText()) && !"".equals(TxtFechaVentas.getText())){
                vn.setID(Integer.parseInt(TxtIdVentas.getText()));
                vn.setCODIGO(TxtCodigoVentas.getText());
                vn.setPRODUCTO(TxtProductoVentas.getText());
                vn.setCANTIDAD(Integer.parseInt(TxtCantidadVentas.getText()));
                vn.setMONTO(TxtMontoVentas1.getText());
                vn.setFECHA(TxtFechaVentas.getText());
                vnDao.ModificarVentas(vn);
                LimpiarTabla();
                LimpiarVentas();
                ListarVentas();
            }else{
                 JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS");
            }
       }
    }//GEN-LAST:event_BtnModificaVentasActionPerformed

    private void BtnGuardarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarVentasActionPerformed
        //REGISTRAR VENTA
         if(!"".equals(TxtIdVentas.getText()) || !"".equals(TxtCodigoVentas.getText()) || !"".equals(TxtProductoVentas.getText()) || !"".equals(TxtCantidadVentas.getText()) || !"".equals(TxtMontoVentas1.getText()) || !"".equals(TxtFechaVentas.getText())){
            vn.setID(Integer.parseInt(TxtIdVentas.getText()));
            vn.setCODIGO(TxtCodigoVentas.getText());
            vn.setPRODUCTO(TxtProductoVentas.getText());
            vn.setCANTIDAD(Integer.parseInt(TxtCantidadVentas.getText()));
            vn.setMONTO(TxtMontoVentas1.getText());
            vn.setFECHA(TxtFechaVentas.getText());
            vnDao.RegistrarVentas(vn);
            LimpiarVentas();
        }else{
            JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS");
        }
        
    }//GEN-LAST:event_BtnGuardarVentasActionPerformed

    private void BtnListarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarVentasActionPerformed
        // TODO add your handling code here:
        truncateTable(TablaVentas);
        ListarVentas();
    }//GEN-LAST:event_BtnListarVentasActionPerformed

    private void TablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaVentasMouseClicked
        int fila = TablaVentas.rowAtPoint(evt.getPoint());
        TxtIdVentas.setText(TablaVentas.getValueAt(fila, 0).toString());
        TxtCodigoVentas.setText(TablaVentas.getValueAt(fila, 1).toString());
        TxtProductoVentas.setText(TablaVentas.getValueAt(fila, 2).toString());
        TxtCantidadVentas.setText(TablaVentas.getValueAt(fila, 3).toString());
        TxtMontoVentas1.setText(TablaVentas.getValueAt(fila, 4).toString());
        TxtFechaVentas.setText(TablaVentas.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_TablaVentasMouseClicked

    private void TxtFechaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFechaVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFechaVentasActionPerformed

    private void TxtIdVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdVentasActionPerformed

    private void TxtMontoVentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMontoVentas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMontoVentas1ActionPerformed

    private void TablaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProveedorMouseClicked
       
        int fila = TablaProveedor.rowAtPoint(evt.getPoint());
        TxtIdProveedor.setText(TablaProveedor.getValueAt(fila, 0).toString());
        TxtNombreProveedor.setText(TablaProveedor.getValueAt(fila, 1).toString());
        TxtCorreoProveedor.setText(TablaProveedor.getValueAt(fila, 2).toString());
        TxtWhatsappProveedor.setText(TablaProveedor.getValueAt(fila, 3).toString());
        
    }//GEN-LAST:event_TablaProveedorMouseClicked

    private void BtnExcelProovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcelProovedorActionPerformed
       //EXPORTAR A EXCEL PROVEEDOR
       ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(TablaProveedor);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
           
    }//GEN-LAST:event_BtnExcelProovedorActionPerformed

    private void BtnExcelVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcelVentaActionPerformed
         ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(TablaVentas);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_BtnExcelVentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
        
  
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCompras;
    private javax.swing.JButton BtnEliminarCompras;
    private javax.swing.JButton BtnEliminarInventario;
    private javax.swing.JButton BtnEliminarProveedor;
    private javax.swing.JButton BtnEliminarVenta;
    private javax.swing.JButton BtnExcelCompras;
    private javax.swing.JButton BtnExcelProovedor;
    private javax.swing.JButton BtnExcelVenta;
    private javax.swing.JButton BtnExcelinventario;
    private javax.swing.JButton BtnGuardarCompra;
    private javax.swing.JButton BtnGuardarInventario;
    private javax.swing.JButton BtnGuardarProveedor;
    private javax.swing.JButton BtnGuardarVentas;
    private javax.swing.JButton BtnInventario;
    private javax.swing.JButton BtnListarCompras;
    private javax.swing.JButton BtnListarInventario;
    private javax.swing.JButton BtnListarProveedores;
    private javax.swing.JButton BtnListarVentas;
    private javax.swing.JButton BtnModificaInventario;
    private javax.swing.JButton BtnModificaInventario2;
    private javax.swing.JButton BtnModificaVentas;
    private javax.swing.JButton BtnModificarCompras;
    private javax.swing.JButton BtnProveedor;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnVentas;
    private javax.swing.JLabel LblLogo;
    private javax.swing.JPanel PnlAmarillo;
    private javax.swing.JPanel PnlNegro;
    private javax.swing.JTable TablaCompras;
    private javax.swing.JTable TablaInventario;
    private javax.swing.JTable TablaProveedor;
    private javax.swing.JTable TablaVentas;
    private javax.swing.JTextField TxtCantidadCompra;
    private javax.swing.JTextField TxtCantidadVentas;
    private javax.swing.JTextField TxtCodigoCompra;
    private javax.swing.JTextField TxtCodigoInventario;
    private javax.swing.JTextField TxtCodigoVentas;
    private javax.swing.JTextField TxtCorreoProveedor;
    private javax.swing.JTextField TxtFechaVentas;
    private javax.swing.JTextField TxtIdCompra;
    private javax.swing.JTextField TxtIdInventario;
    private javax.swing.JTextField TxtIdProveedor;
    private javax.swing.JTextField TxtIdVentas;
    private javax.swing.JTextField TxtMontoVentas1;
    private javax.swing.JTextField TxtNombreProveedor;
    private javax.swing.JTextField TxtPrecioCompra;
    private javax.swing.JTextField TxtPrecioInventario;
    private javax.swing.JTextField TxtProductoCompra;
    private javax.swing.JTextField TxtProductoInventario;
    private javax.swing.JTextField TxtProductoVentas;
    private javax.swing.JTextField TxtProveedorCompra;
    private javax.swing.JTextField TxtProveedorInventario;
    private javax.swing.JTextField TxtStockInventario;
    private javax.swing.JTextField TxtWhatsappProveedor;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
