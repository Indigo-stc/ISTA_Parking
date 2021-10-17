package Ventanas;

import ConexionPG.PgConect;
import Validaciones.Val;
import entidades.Puesto;
import entidades.Vehiculo;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VPuesto extends javax.swing.JFrame {
    
    DefaultTableModel dtm;
    
    public void buscar(String tipo) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        PgConect conec = new PgConect();
        Connection conectar = conec.Conectar();

        modelo.addColumn("ID Puesto");
        modelo.addColumn("Tipo");
        modelo.addColumn("Ocupado");
        
        tblPuesto.setModel(modelo);
        
        String sql = " ";
        if (tipo.equals(" ")) {
            sql = " SELECT * FROM puestos";
        } else {
            sql = " SELECT * FROM puestos "
                    + " WHERE tipo like '%"+ tipo +"%'";
        }
        
        String puesto[] = new String[3];
        Statement set;
        try {
            set = conectar.createStatement();
            ResultSet resul = set.executeQuery(sql);
            while (resul.next()) {
                puesto[0] = resul.getString(1);
                puesto[1] = resul.getString(2);
                puesto[2] = resul.getString(3);
                modelo.addRow(puesto);

            }
            tblPuesto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(RCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public VPuesto() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            //tblModelo();
            buscar(" ");
        } catch (SQLException ex) {
            Logger.getLogger(VPuesto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_VTipo = new javax.swing.JLabel();
        btn_Reegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPuesto = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡REGISTRO PUESTOS!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 60));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de Puesto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        lbl_VTipo.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lbl_VTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 245, 16));

        btn_Reegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        btn_Reegresar.setText("Salir");
        btn_Reegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Reegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 100, -1));

        tblPuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPuestoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblPuesto);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 910, 260));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/find.png"))); // NOI18N
        jLabel4.setText("Busqueda");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 350, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardar.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 150, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLimpiar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, 150, 50));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Auto-camioneta", "Moto", "Camion" }));
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 270, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoP.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ReegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReegresarActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ReegresarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void tblPuestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPuestoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String idpuesto = tblPuesto.getValueAt(tblPuesto.getSelectedRow(), 0).toString();
            String tipo =  tblPuesto.getValueAt(tblPuesto.getSelectedRow(), 1).toString();
            Boolean ocupado =  (Boolean) tblPuesto.getValueAt(tblPuesto.getSelectedRow(), 2);
            
            if ((ocupado != true || ocupado != false) && !cmbTipo.equals((Object) tipo)) {
                try {
                    PgConect con = new PgConect();
                    con.modiificarPue(idpuesto, tipo, ocupado );
                    tblModelo();
                } catch (SQLException ex) {
                    Logger.getLogger(VPuesto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, """
                                                        1. No campos vacios
                                                        2. Ocupado solo true o false
                                                        3. Tipo solo sugeridos""");
            }
        }
    }//GEN-LAST:event_tblPuestoKeyReleased

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        try {
            buscar(txtBuscar.getText());
        } catch (SQLException ex) {
            Logger.getLogger(VPuesto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        PgConect conect = new PgConect();
//        try {
//            if (Val.hollow(cmbTipo.getSelectedItem().toString())){
//                JOptionPane.showMessageDialog(null, "Seleccione un tipo");
//            } else {
//                Puesto pt = new Puesto(cmbTipo.getSelectedItem().toString());
//                ResultSet idtipo = conect.tipo(pt.getTipo());
//                if (idtipo.next()) {
//                    conect.insPuesto(idtipo.getInt("idtipo"), pt.isOcupado());
//                    JOptionPane.showMessageDialog(rootPane, "Puesto guardado");
//                    tblModelo();
//                    limpiar();
//                }
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(RVehiculo.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiar() {
        cmbTipo.setSelectedIndex(0);
        
    }

    public void tblModelo() throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        tblPuesto.setModel(modelo);
        PgConect con = new PgConect();
        ResultSet puesto = con.mostrarPue();
        ResultSetMetaData rsmd = puesto.getMetaData();
        int columns = rsmd.getColumnCount();

        modelo.addColumn("idpuesto");
        modelo.addColumn("tipo");
        modelo.addColumn("ocupado");

        while (puesto.next()) {
            Object[] filas = new Object[columns];
            for (int i = 0; i < columns; i++) {
                filas[i] = puesto.getObject(i + 1);
            }
            modelo.addRow(filas);
        }
    }

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
            java.util.logging.Logger.getLogger(VPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Reegresar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_VTipo;
    private javax.swing.JTable tblPuesto;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
