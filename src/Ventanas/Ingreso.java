package Ventanas;

import ConexionPG.PgConect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ingreso extends javax.swing.JFrame {

    public Ingreso() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        lblContraseñaM = new javax.swing.JLabel();
        lblUsuarioM = new javax.swing.JLabel();
        txtUsuarioM = new javax.swing.JTextField();
        txtContraseñaM = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(105, 222, 162));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit_1.png"))); // NOI18N
        btnSalir.setText("Salir           ");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 180, 50));

        btnInicio.setBackground(new java.awt.Color(51, 51, 51));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_admin_gear.png"))); // NOI18N
        btnInicio.setText("Iniciar Sesión");
        btnInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 180, -1));

        lblContraseñaM.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblContraseñaM.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseñaM.setText("Contraseña:");
        getContentPane().add(lblContraseñaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        lblUsuarioM.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblUsuarioM.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarioM.setText("Usuario:");
        getContentPane().add(lblUsuarioM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        txtUsuarioM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtUsuarioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioMActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuarioM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 200, -1));

        txtContraseñaM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtContraseñaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 200, -1));

        lblTitulo.setFont(new java.awt.Font("Cascadia Code", 1, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("PARQUEADERO ISTA");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoI2.png"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioMActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        PgConect conect = new PgConect();
        try {
            ResultSet rolnombre = conect.login(txtUsuarioM.getText(), txtContraseñaM.getText());
            if (rolnombre.next()) {
                String rol = rolnombre.getString("idrol");
                Menu menu = new Menu(rol);
                menu.setVisible(true);
                this.setVisible(false); 
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrectos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContraseñaM;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuarioM;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTextField txtContraseñaM;
    private javax.swing.JTextField txtUsuarioM;
    // End of variables declaration//GEN-END:variables
}
