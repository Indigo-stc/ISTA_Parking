package Ventanas;

import ConexionPG.PgConect;
import Validaciones.Val;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CTicketIngreso extends javax.swing.JFrame {

    public CTicketIngreso() {
        initComponents();
        setLocationRelativeTo(null);
//        try {
//            tblModel();
//        } catch (SQLException ex) {
//            Logger.getLogger(CTicketIngreso.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
//    public void tblModel() throws SQLException {
//        DefaultTableModel modelo = new DefaultTableModel();
//        tblTicketI.setModel(modelo);
//        PgConect con = new PgConect();
//        ResultSet ticks = con.ticketsI();
//        ResultSetMetaData rsmd = ticks.getMetaData();
//        int columns = rsmd.getColumnCount(); 
//        
//        modelo.addColumn("ID Ticket");
//        modelo.addColumn("ID Cliente");
//        modelo.addColumn("ID Puesto");
//        modelo.addColumn("F. Ingreso");
//        
//        while(ticks.next()) {
//            Object[] filas = new Object[columns];
//            for (int i = 0; i < columns; i++) {
//                filas[i] = ticks.getObject(i+1);
//            }
//            modelo.addRow(filas);
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTicketI = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        fechaIngreso = new com.toedter.calendar.JDateChooser();
        cbNnmPue = new javax.swing.JComboBox<>();
        cbTipoPue = new javax.swing.JComboBox<>();
        txtPlaca = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTicketI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTicketI);

        panelFondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 850, 190));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Cedula");
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 20)); // NOI18N
        jLabel2.setText("Placa");
        panelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, 20));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 1, 20)); // NOI18N
        jLabel3.setText("Puesto");
        panelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 1, 20)); // NOI18N
        jLabel4.setText("F. Ingreso");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        panelFondo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 50, 50));

        btnGenerar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnGenerar.setText("Generar");
        panelFondo.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 110, 40));
        panelFondo.add(fechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 220, -1));

        cbNnmPue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numero" }));
        panelFondo.add(cbNnmPue, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 110, -1));

        cbTipoPue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Camioneta-Auto", "Camioneta", "Camion" }));
        panelFondo.add(cbTipoPue, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 220, -1));

        txtPlaca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlacaFocusLost(evt);
            }
        });
        panelFondo.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 220, 20));

        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        panelFondo.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 220, -1));

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jLabel5.setText("TICKET DE INGRESO ");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoT2.png"))); // NOI18N
        panelFondo.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        if (Val.digVfy(txtCedula.getText())) {
            PgConect con = new PgConect();
            ResultSet exisCli = con.pkCli(txtCedula.getText());
            try {
                if (!exisCli.next()) {
                    JOptionPane.showMessageDialog(rootPane, "Debe registrar al cliente");
                    RCliente cli = new RCliente(txtCedula.getText());
                    cli.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CTicketIngreso.class.getName()).log(Level.SEVERE, null, ex);
            }
 
        } else {
            //lblVfyCedula.setText("No es una cedula");
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtPlacaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlacaFocusLost
        if (Val.placa(txtPlaca.getText())) {
            try {
                PgConect con = new PgConect();
                ResultSet exisCli = con.pkCli(txtCedula.getText());
                exisCli.next();
                ResultSet crv = con.CrV(txtCedula.getText(), txtPlaca.getText());
                if (!crv.next()) {
                    RVehiculo ve = new RVehiculo(exisCli.getString("idcliente"), txtPlaca.getText());
                    ve.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CTicketIngreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            //lblVfyPlaca.setText("No es una placa");
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
            java.util.logging.Logger.getLogger(CTicketIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CTicketIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CTicketIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CTicketIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CTicketIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbNnmPue;
    private javax.swing.JComboBox<String> cbTipoPue;
    private com.toedter.calendar.JDateChooser fechaIngreso;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tblTicketI;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
