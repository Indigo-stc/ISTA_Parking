package Ventanas;

import ConexionPG.PgConect;
import Validaciones.Val;
import entidades.Puesto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class VDetalles extends javax.swing.JFrame {

    String idalquiler;
    String cedula = "1724455223";
    
    public VDetalles() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public VDetalles(String idalquiler, String cedula) {
        initComponents();
        setLocationRelativeTo(null);
        this.idalquiler = idalquiler;
    }
    
    private void cbxModel(String placa) {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            PgConect con = new PgConect();
            cbPuesto.setModel(model);
            ResultSet places = con.cbxPuestos(placa);
            while(places.next()) {
                model.addElement(new Puesto(places.getShort(1), places.getShort(2), places.getBoolean(3)));
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(VReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblPlacaR = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblIDPuestoR = new javax.swing.JLabel();
        cbPuesto = new javax.swing.JComboBox<>();
        lblVfyPlaca = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPlacaR.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblPlacaR.setText("Placa");

        txtPlaca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlacaFocusLost(evt);
            }
        });

        lblIDPuestoR.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblIDPuestoR.setText("Puesto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(cbPuesto, 0, 160, Short.MAX_VALUE)
                                    .addComponent(lblVfyPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblIDPuestoR)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblPlacaR)))))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 86, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblPlacaR)))
                .addGap(18, 18, 18)
                .addComponent(lblVfyPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDPuestoR)
                    .addComponent(cbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlacaFocusLost
        if (cedula != null) {
            if (Val.placa(txtPlaca.getText())) {
                lblVfyPlaca.setText(null);
                try {
                    PgConect con = new PgConect();
                    ResultSet relacion = con.owner(cedula, txtPlaca.getText());
                    ResultSet idcliente = con.pkCedCli(cedula);
                    if (relacion.next()) {

                    } else {
                        if (con.pkVehiculo(txtPlaca.getText()).next()) {
                            if (idcliente.next()) {
                                con.insDuenio(idcliente.getString("idcliente"), txtPlaca.getText());
                            } 
                        } else {
                            if (idcliente.next()) {
                                JOptionPane.showMessageDialog(rootPane, "Debe registrar al vehiculo");
                                RVehiculo veh = new RVehiculo(idcliente.getString("idcliente"), 
                                txtPlaca.getText());
                                veh.setVisible(true);
                            }
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CTicketIngreso.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                lblVfyPlaca.setText("No es una placa");
            }
        }
    }//GEN-LAST:event_txtPlacaFocusLost

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
            java.util.logging.Logger.getLogger(VDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDetalles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbPuesto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblIDPuestoR;
    private javax.swing.JLabel lblPlacaR;
    private javax.swing.JLabel lblVfyPlaca;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
