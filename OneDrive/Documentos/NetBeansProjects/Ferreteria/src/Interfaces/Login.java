
package Interfaces;

import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnOk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        TxtPass = new javax.swing.JPasswordField();
        PnlNegro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LblFondoAmarillo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(789, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnLogin.setBackground(new java.awt.Color(255, 255, 255));
        PnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/CANDADO_LOGO_1.png"))); // NOI18N

        BtnOk.setBackground(new java.awt.Color(255, 255, 255));
        BtnOk.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        BtnOk.setText("OK");
        BtnOk.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setText("USUARIO");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setText("CONTRASEÑA");

        TxtUsuario.setBackground(new java.awt.Color(64, 79, 89));
        TxtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TxtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        TxtPass.setBackground(new java.awt.Color(64, 79, 89));
        TxtPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TxtPass.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PnLoginLayout = new javax.swing.GroupLayout(PnLogin);
        PnLogin.setLayout(PnLoginLayout);
        PnLoginLayout.setHorizontalGroup(
            PnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnLoginLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(PnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnLoginLayout.createSequentialGroup()
                        .addComponent(BtnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnLoginLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(120, 120, 120))))
            .addGroup(PnLoginLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(TxtPass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnLoginLayout.setVerticalGroup(
            PnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(BtnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(PnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 450));

        PnlNegro.setBackground(new java.awt.Color(38, 38, 38));
        PnlNegro.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Carga_LOGO3.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Create By: Liang Reyes");

        javax.swing.GroupLayout PnlNegroLayout = new javax.swing.GroupLayout(PnlNegro);
        PnlNegro.setLayout(PnlNegroLayout);
        PnlNegroLayout.setHorizontalGroup(
            PnlNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNegroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        PnlNegroLayout.setVerticalGroup(
            PnlNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNegroLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        getContentPane().add(PnlNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 520));

        LblFondoAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fondo_Amarillo.png"))); // NOI18N
        getContentPane().add(LblFondoAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 270, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void BtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOkActionPerformed
        String user = TxtUsuario.getText();
        char[] pass = TxtPass.getPassword();
        String contraseñaIngresada = new String(pass);

        if (user.equals("ADMIN") && contraseñaIngresada.equals("123456KN")) {
            this.setVisible(false);
            Principal mains = new Principal();
            mains.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Por favor, inténtalo de nuevo.", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnOkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
        
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnOk;
    private javax.swing.JLabel LblFondoAmarillo;
    private javax.swing.JPanel PnLogin;
    private javax.swing.JPanel PnlNegro;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}