/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import ConexionPG.PgConect;
import Validaciones.Val;
import entidades.Puesto;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Maldonado
 */
public class DetalleReserva extends javax.swing.JFrame {

    String idcli;
    
    public DetalleReserva() {
        initComponents();
    }

     public DetalleReserva(String idcli) {
        initComponents();
        this.idcli=idcli;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPlacaR = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vrfPlaca = new javax.swing.JLabel();
        cmbIDPuestoR = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDReserva = new javax.swing.JTable();
        FondoDR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Placa:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Puesto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        txtPlacaR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlacaRFocusLost(evt);
            }
        });
        getContentPane().add(txtPlacaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("!DETALLE RESERVA!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));
        getContentPane().add(vrfPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 160, 20));

        getContentPane().add(cmbIDPuestoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 160, -1));

        jButton1.setText("REGISTRAR");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 240, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/find.png"))); // NOI18N
        jLabel4.setText("Busqueda");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 110, -1));

        tblDReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDReserva);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 760, 150));

        FondoDR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoDR.png"))); // NOI18N
        getContentPane().add(FondoDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlacaRFocusLost
        if (Val.placa(txtPlacaR.getText())) {
        } else {
            vrfPlaca.setText("No es una placa");
        }
    }//GEN-LAST:event_txtPlacaRFocusLost

//    private void cbxModel() {
//        DefaultComboBoxModel model = new DefaultComboBoxModel();
//        PgConect con = new PgConect();
//        Puesto puesto = new Puesto((short) 100, "Seleccionar");
//        model.addElement(puesto.);
//        cbRol.setModel(model);
//        ResultSet roles = con.cbxRoles();
//        try {
//            while(roles.next()) {
//                model.addElement(new Rol(roles.getShort(1), roles.getString(2)));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

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
            java.util.logging.Logger.getLogger(DetalleReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoDR;
    private javax.swing.JComboBox<String> cmbIDPuestoR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblDReserva;
    private javax.swing.JTextField txtPlacaR;
    private javax.swing.JLabel vrfPlaca;
    // End of variables declaration//GEN-END:variables
}
