package Ventanas;

import ConexionPG.PgConect;
import entidades.Vehiculo;
import Validaciones.Val;
import entidades.Tipo;
import java.sql.Connection;
import java.awt.event.KeyEvent;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RVehiculo extends javax.swing.JFrame {

    DefaultTableModel vhi;

    public RVehiculo(String idcliente) {
        initComponents();
        txt_IDCli.setText(idcliente);
        txt_IDCli.setEnabled(false);
        setLocationRelativeTo(null);
        cbxModel();
        try {
            buscar(" ");
        } catch (SQLException ex) {
            Logger.getLogger(RVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public RVehiculo(String idcli, String placa) {
        initComponents();
        txt_IDCli.setText(idcli);
        txt_Placa.setText(placa);
        txt_IDCli.setEnabled(false);
        setLocationRelativeTo(null);
        cbxModel();
        try {
            buscar(" ");
        } catch (SQLException ex) {
            Logger.getLogger(RVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public RVehiculo() {
        initComponents();
        setLocationRelativeTo(null);
        cbxModel();
        try {
            buscar(" ");
        } catch (SQLException ex) {
            Logger.getLogger(RVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        lblFondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_Placa = new javax.swing.JTextField();
        txt_Model = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_Tipo = new javax.swing.JComboBox<>();
        txt_IDCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btn_Insert = new javax.swing.JButton();
        vrfPlaca = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_vehiculo = new javax.swing.JTable();
        lblBusqueda = new javax.swing.JLabel();
        txtBuscarV = new javax.swing.JTextField();
        lbliconocar = new javax.swing.JLabel();
        lblcerrar = new javax.swing.JButton();
        lblvexd = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        btnLimpiar.setText("Cancelar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 170, 40));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("¡REGISTRO VEHÍCULO!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        txt_Placa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_PlacaFocusLost(evt);
            }
        });
        jPanel1.add(txt_Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 270, -1));
        jPanel1.add(txt_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 300, -1));

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Modelo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, -1, -1));

        cb_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Auto-Camioneta", "Camion", "Moto" }));
        jPanel1.add(cb_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 300, -1));
        jPanel1.add(txt_IDCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 270, -1));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID Cliente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Placa");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        btnSalir.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/taskbar_start_menu.png"))); // NOI18N
        btnSalir.setText("Menú");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 50));

        btn_Insert.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        btn_Insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardar.png"))); // NOI18N
        btn_Insert.setText("Ingresar");
        btn_Insert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 180, 40));

        vrfPlaca.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(vrfPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 270, 10));

        tbl_vehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "ID Cliente", "Modelo", "Tipo"
            }
        ));
        tbl_vehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_vehiculoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_vehiculo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 920, 200));

        lblBusqueda.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        lblBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        lblBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/find.png"))); // NOI18N
        lblBusqueda.setText("Busqueda");
        jPanel1.add(lblBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 120, -1));

        txtBuscarV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarVKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 450, -1));

        lbliconocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/parking.png"))); // NOI18N
        jPanel1.add(lbliconocar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        lblcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        lblcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblcerrarActionPerformed(evt);
            }
        });
        jPanel1.add(lblcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 20, 20));

        lblvexd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/beos_menu.png"))); // NOI18N
        jPanel1.add(lblvexd, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOCOLOR5.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_RidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RidActionPerformed
        Eliminar();
    }//GEN-LAST:event_btn_RidActionPerformed

    private void tbl_vehiculoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_vehiculoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String placa = tbl_vehiculo.getValueAt(tbl_vehiculo.getSelectedRow(), 0).toString();
            String idcliente = tbl_vehiculo.getValueAt(tbl_vehiculo.getSelectedRow(), 1).toString();
            String modelo = tbl_vehiculo.getValueAt(tbl_vehiculo.getSelectedRow(), 2).toString();
            String tipo = tbl_vehiculo.getValueAt(tbl_vehiculo.getSelectedRow(), 3).toString();

            PgConect con = new PgConect();
            con.modificarVeh(placa, modelo, Integer.parseInt(tipo));
        }
    }//GEN-LAST:event_tbl_vehiculoKeyReleased

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed

        PgConect conect = new PgConect();

        try {
            if (conect.pkVehiculo(txt_Placa.getText()).next()) {
                JOptionPane.showMessageDialog(rootPane, "Registro existente");
            } else if (Val.hollow(txt_Placa.getText()) || Val.hollow(txt_Model.getText())
                    || cb_Tipo.getSelectedIndex() == 4) {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            } else {
                Tipo tipo = (Tipo) this.cb_Tipo.getSelectedItem();
                Vehiculo vh = new Vehiculo(txt_Placa.getText(), txt_Model.getText(),
                        tipo.getIdtipo());
                
                conect.insVehi(vh.getPlaca(), vh.getModelo(), vh.getTipo());
                conect.insDuenio(txt_IDCli.getText(), vh.getPlaca());
                JOptionPane.showMessageDialog(rootPane, "Vehículo guardado");
                tblModelo();
                limpiar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(RVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_InsertActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Menu me = new Menu();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txt_PlacaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PlacaFocusLost
        if (!Val.placa(txt_Placa.getText())) {
            vrfPlaca.setText("Placa incorrecta");
        } else {
            vrfPlaca.setText(null);
        }
    }//GEN-LAST:event_txt_PlacaFocusLost

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarVKeyReleased
        try {
            buscar(txtBuscarV.getText());
        } catch (SQLException ex) {
            Logger.getLogger(RVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarVKeyReleased

    private void lblcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblcerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_lblcerrarActionPerformed

    public void tblModelo() throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        tbl_vehiculo.setModel(modelo);
        PgConect con = new PgConect();
        ResultSet vehiculo = con.mostrarVeh();
        ResultSetMetaData rsmd = vehiculo.getMetaData();
        int columns = rsmd.getColumnCount();

        modelo.addColumn("Placa");
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Modelo");
        modelo.addColumn("ID Tipo");

        while (vehiculo.next()) {
            Object[] filas = new Object[columns];
            for (int i = 0; i < columns; i++) {
                filas[i] = vehiculo.getObject(i + 1);
            }
            modelo.addRow(filas);
        }
    }
    
     private void cbxModel() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            PgConect con = new PgConect();
            Tipo tp = new Tipo((short) 4, "Seleccionar");
            cb_Tipo.setModel(model);
            ResultSet tipos = con.tipo();
            
            
            while(tipos.next()) {
                model.addElement(new Tipo(tipos.getShort("idtipo"), tipos.getString("denominacion")));
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(RVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    private void Eliminar() {
        DefaultTableModel vhi = (DefaultTableModel) tbl_vehiculo.getModel();
        int seleccion = tbl_vehiculo.getSelectedRow();
        if (seleccion < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para eliminar");
        } else {
            int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar esta fila");
            if (JOptionPane.OK_OPTION == confirmar) {
                vhi.removeRow(seleccion);
                JOptionPane.showMessageDialog(null, "Registro completamente eliminado");
                limpiar();
            }
        }
    }

    public void limpiar() {
        txt_Placa.setText(null);
        txt_Model.setText(null);
        txt_IDCli.setText(null);
        cb_Tipo.setSelectedItem(null);
    }

    public void buscar(String placa) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        PgConect conec = new PgConect();
        Connection conectar = conec.Conectar();

        modelo.addColumn("Placa");
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Modelo");
        modelo.addColumn("ID Tipo");

        tbl_vehiculo.setModel(modelo);
        String sql = " ";
        if (placa.equals(" ")) {
            sql = "SELECT vehiculos.placa, propietarios.idcliente, modelo, idtipo "
                    + "FROM vehiculos, propietarios, clientes "
                    + "WHERE vehiculos.placa = propietarios.placa AND vehiculos.activo = TRUE AND "
                    + "clientes.idcliente = propietarios.idcliente;";
        } else {
            sql = "SELECT vehiculos.placa, propietarios.idcliente, modelo, idtipo "
                    + "FROM vehiculos, propietarios, clientes "
                    + "WHERE vehiculos.placa = propietarios.placa AND vehiculos.activo = TRUE AND "
                    + "clientes.idcliente = propietarios.idcliente AND vehiculos.placa like '%" + placa + "%';";

        }
        String Usuarios[] = new String[11];
        Statement set;
        try {
            set = conectar.createStatement();
            ResultSet resul = set.executeQuery(sql);
            while (resul.next()) {
                Usuarios[0] = resul.getString(1);
                Usuarios[1] = resul.getString(2);
                Usuarios[2] = resul.getString(3);
                Usuarios[3] = resul.getString(4);
                modelo.addRow(Usuarios);

            }
            tbl_vehiculo.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(RCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(RVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JComboBox<String> cb_Tipo;
    private javax.swing.JLabel fondo;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JButton lblcerrar;
    private javax.swing.JLabel lbliconocar;
    private javax.swing.JLabel lblvexd;
    private javax.swing.JTable tbl_vehiculo;
    private javax.swing.JTextField txtBuscarV;
    private javax.swing.JTextField txt_IDCli;
    private javax.swing.JTextField txt_Model;
    private javax.swing.JTextField txt_Placa;
    private javax.swing.JLabel vrfPlaca;
    // End of variables declaration//GEN-END:variables
}
