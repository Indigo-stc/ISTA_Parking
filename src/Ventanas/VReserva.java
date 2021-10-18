package Ventanas;

import ConexionPG.PgConect;
import Validaciones.Val;
import entidades.Reserva;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VReserva extends javax.swing.JFrame {

    String idempleado;

    public VReserva(String idempleado) {
        initComponents();
        setLocationRelativeTo(null);
        this.idempleado = idempleado;
        try {
            buscar("");
        } catch (SQLException ex) {
            Logger.getLogger(VReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public VReserva() {
        try {
            initComponents();
            setLocationRelativeTo(null);
            buscar("");
        } catch (SQLException ex) {
            Logger.getLogger(VReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscarA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReserva = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        fechaIngreso = new com.toedter.calendar.JDateChooser();
        fechaSalida = new com.toedter.calendar.JDateChooser();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblVfyCedula = new javax.swing.JLabel();
        vrffecha = new javax.swing.JLabel();
        xdxdxdxd = new javax.swing.JLabel();
        lblempleadoxd = new javax.swing.JLabel();
        txtFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡REGISTRAR ALQUILER!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cédula:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/find.png"))); // NOI18N
        jLabel6.setText("Busqueda");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 140, -1));

        txtBuscarA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarAKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 490, -1));

        tblReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblReserva);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 900, 170));

        jLabel8.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha Salida: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, 20));

        jLabel7.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha Ingreso:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, 20));

        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 320, -1));
        getContentPane().add(fechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 280, 30));
        getContentPane().add(fechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 280, 30));

        btnRegistrar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/right.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 620, 80, 70));

        btnLimpiar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        btnLimpiar.setText("CANCELAR");
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 170, 40));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 20, 20));

        lblVfyCedula.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVfyCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 320, 10));
        getContentPane().add(vrffecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 280, 10));

        xdxdxdxd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/kmenuedit.png"))); // NOI18N
        getContentPane().add(xdxdxdxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        lblempleadoxd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/beos_menu.png"))); // NOI18N
        getContentPane().add(lblempleadoxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        txtFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOSCOLOR12.jpg"))); // NOI18N
        getContentPane().add(txtFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        if (Val.digVfy(txtCedula.getText())) {
            PgConect con = new PgConect();
            ResultSet exisCli = con.pkCedCli(txtCedula.getText());
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
            lblVfyCedula.setText("No es una cedula");
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            if (Val.Fecha(fechaIngreso.getDate(), fechaSalida.getDate())) {
                vrffecha.setText(null);
                if (Val.digVfy(txtCedula.getText())) {
                    lblVfyCedula.setText(null);
                    PgConect con = new PgConect();
                    ResultSet exisCli = con.pkCedCli(txtCedula.getText());
                    if (exisCli.next()) {
                        Reserva res = new Reserva(exisCli.getString("idcliente"),
                                idempleado, fechaIngreso.getDate(), fechaSalida.getDate());
                        con.insRva(res.getIdAlquiler(), res.getIdcliente(),
                                idempleado, res.getFechaIngreso(), res.getFechaSalida());
                        buscar("");
                        VDetalles deta = new VDetalles(res.getIdAlquiler(), txtCedula.getText());
                        deta.setVisible(true);
                        this.dispose();
                    }
                } else {
                    lblVfyCedula.setText("Cedula incorrecta!!!");
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
                }
            }else{
                vrffecha.setText("Fechas incorrectas");
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtBuscarAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAKeyReleased
        try {
            buscar(txtBuscarA.getText());
        } catch (SQLException ex) {
            Logger.getLogger(VReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarAKeyReleased

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)
                || Val.isNumber(txtCedula.getText())) {
            getToolkit();
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    public void limpiar() {
        txtCedula.setText(null);
        fechaIngreso.setDate(null);
        fechaSalida.setDate(null);
    }

    private void buscar(String idpersona) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 3 || column == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        PgConect conec = new PgConect();
        Connection conectar = conec.Conectar();

        modelo.addColumn("ID Alquiler");
        modelo.addColumn("Cédula");
        modelo.addColumn("ID Empleado");
        modelo.addColumn("F.Ingreso");
        modelo.addColumn("F.Salida");

        tblReserva.setModel(modelo);
        String sql = " ";
        if (idpersona.trim().equals("")) {
            sql = "SELECT idalquiler, clientes.idpersona, empleados.idempleado, fechaing, fechasal "
                    + "FROM alquileres, clientes, empleados "
                    + "WHERE clientes.idcliente = alquileres.idcliente "
                    + "AND empleados.idempleado = alquileres.idempleado;";
        } else {
            sql = "SELECT idalquiler, clientes.idpersona, empleados.idempleado, fechaing, fechasal "
                    + "FROM alquileres, clientes, empleados "
                    + "WHERE clientes.idcliente = alquileres.idcliente "
                    + "AND empleados.idempleado = alquileres.idempleado AND idpersona like '%" + idpersona + "%';";;

        }
        String Usuarios[] = new String[5];
        Statement set;
        try {
            set = conectar.createStatement();
            ResultSet resul = set.executeQuery(sql);
            while (resul.next()) {
                Usuarios[0] = resul.getString(1);
                Usuarios[1] = resul.getString(2);
                Usuarios[2] = resul.getString(3);
                Usuarios[3] = resul.getString(4);
                Usuarios[4] = resul.getString(5);
                modelo.addRow(Usuarios);

            }
            tblReserva.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(RCliente.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(CTicketIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CTicketIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CTicketIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CTicketIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser fechaIngreso;
    private com.toedter.calendar.JDateChooser fechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVfyCedula;
    private javax.swing.JLabel lblempleadoxd;
    private javax.swing.JTable tblReserva;
    private javax.swing.JTextField txtBuscarA;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JLabel txtFondo;
    private javax.swing.JLabel vrffecha;
    private javax.swing.JLabel xdxdxdxd;
    // End of variables declaration//GEN-END:variables
}
