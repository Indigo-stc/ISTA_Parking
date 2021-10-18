package Ventanas;

import ConexionPG.PgConect;
import entidades.Tipo;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
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
        cbxModel();
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
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();
        lblpuesto = new javax.swing.JLabel();
        lblpuestox2 = new javax.swing.JLabel();
        fondopuesto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡REGISTRO PUESTOS!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 60));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de Puesto:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        lbl_VTipo.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lbl_VTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 290, 10));

        btn_Reegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        btn_Reegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Reegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 20, 20));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 910, 210));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/find.png"))); // NOI18N
        jLabel4.setText("Busqueda");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

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
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 470, 30));

        btnRegistrar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 150, 40));

        btnCancelar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 150, 40));

        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 290, 30));

        lblpuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/beos_menu.png"))); // NOI18N
        jPanel1.add(lblpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, -1, -1));

        lblpuestox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/places.png"))); // NOI18N
        jPanel1.add(lblpuestox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 120));

        fondopuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoP.png"))); // NOI18N
        jPanel1.add(fondopuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ReegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReegresarActionPerformed
        this.dispose();
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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        PgConect conect = new PgConect();
        Tipo tipo = (Tipo) this.cmbTipo.getSelectedItem();
        try {
            conect.insPuesto(tipo.getIdtipo());
            JOptionPane.showMessageDialog(rootPane, "Puesto guardado");
            tblModelo();
            limpiar();  
        } catch (SQLException ex) {
            Logger.getLogger(RVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void limpiar() {
        cmbTipo.removeAllItems();
    }
    
    private void cbxModel() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            PgConect con = new PgConect();
            Tipo tp = new Tipo((short) 0, "Seleccionar");
            cmbTipo.setModel(model);
            ResultSet tipos = con.tipo();
            
            
            while(tipos.next()) {
                model.addElement(new Tipo(tipos.getShort("idtipo"), tipos.getString("denominacion")));
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(VPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btn_Reegresar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel fondopuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_VTipo;
    private javax.swing.JLabel lblpuesto;
    private javax.swing.JLabel lblpuestox2;
    private javax.swing.JTable tblPuesto;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
