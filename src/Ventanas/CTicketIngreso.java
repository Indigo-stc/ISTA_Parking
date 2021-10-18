package Ventanas;

import ConexionPG.PgConect;
import Validaciones.Val;
import entidades.Puesto;
import entidades.Ticket_Ingreso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CTicketIngreso extends javax.swing.JFrame {

    String idempleado;
    
    public CTicketIngreso() {
        initComponents();
        setLocationRelativeTo(null);
        buscar("");
    }
    
    public CTicketIngreso(String idempleado) {
        initComponents();
        setLocationRelativeTo(null);
        this.idempleado = idempleado;
        buscar("");
    }
    
    private void buscar(String search) {
        try {
            
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return column == 1 || column == 2 || column == 3 || column == 4
                            || column == 5;
                }
            };
            
            modelo.addColumn("ID Ticket");
            modelo.addColumn("Cedula");
            modelo.addColumn("Placa");
            modelo.addColumn("Puesto");
            modelo.addColumn("F. Ingreso");
            
            tblTicketI.setModel(modelo);
            
            PgConect con = new PgConect();
            
            ResultSet buscar = con.buscarTicketsIng(search);
            ResultSetMetaData rsmd = buscar.getMetaData();
            int columns = rsmd.getColumnCount();
            
            while (buscar.next()) {
                Object[] filas = new Object[columns];
                for (int i = 0; i < columns; i++) {
                    filas[i] = buscar.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CTicketIngreso.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    private void cbxModel(String placa) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        PgConect con = new PgConect();
        cbPuesto.setModel(model);
        ResultSet places = con.cbxPuestos(placa);
        try {
            while(places.next()) {
                model.addElement(new Puesto(places.getShort(1), places.getShort(2), places.getBoolean(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        cbPuesto = new javax.swing.JComboBox<>();
        lblVfyCedula = new javax.swing.JLabel();
        lblVfyPlaca = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTicketI = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel2.setText("Placa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel3.setText("Puesto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtPlaca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlacaFocusLost(evt);
            }
        });
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 220, 20));

        btnGenerar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 110, 40));

        btnBuscar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 50, 50));

        jLabel1.setText("Cedula");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 250, -1));

        cbPuesto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbPuestoFocusGained(evt);
            }
        });
        jPanel1.add(cbPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 120, -1));
        jPanel1.add(lblVfyCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 210, 20));
        jPanel1.add(lblVfyPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 116, 240, 20));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, -1));

        jLabel4.setText("Buscar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        panelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 590, 280));

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TICKET DE INGRESO ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(156, 156, 156))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 600, 50));

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

        panelFondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 600, 140));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/10.jpg"))); // NOI18N
        panelFondo.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

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
            lblVfyCedula.setText(null);
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

    private void txtPlacaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlacaFocusLost
        if (Val.placa(txtPlaca.getText())) {
            lblVfyPlaca.setText(null);
            try {
                PgConect con = new PgConect();
                ResultSet relacion = con.owner(txtCedula.getText(), txtPlaca.getText());
                ResultSet idcliente = con.pkCedCli(txtCedula.getText());
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
    }//GEN-LAST:event_txtPlacaFocusLost

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        Date current = new Date();
        PgConect con = new PgConect();
        ResultSet exisCli = con.pkCedCli(txtCedula.getText());
        try {
            if (Val.digVfy(txtCedula.getText()) && Val.placa(txtPlaca.getText())) {
                if (exisCli.next()) {
                    ResultSet exisVeh = con.pkVehiculo(txtPlaca.getText());
                    if (exisVeh.next()) {
                        Puesto puesto = (Puesto) this.cbPuesto.getSelectedItem();
                        Ticket_Ingreso ticket = new Ticket_Ingreso(puesto.getIdpuesto(),
                                txtPlaca.getText(), current);
                        con.insTIng(ticket.getIdTicked(), idempleado, exisCli.getString("idcliente"), 
                                txtPlaca.getText(), ticket.getIdPuesto(), ticket.getF_Ingreso());
                        con.ocupaPue(puesto.getIdpuesto());
                        buscar("");
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Verifique la placa!!!");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Verifique la cedula!!!");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Cedula o placa incorrectas");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CTicketIngreso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void cbPuestoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbPuestoFocusGained
        if (Val.placa(txtPlaca.getText())) {
            cbxModel(txtPlaca.getText());
        }
    }//GEN-LAST:event_cbPuestoFocusGained

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        buscar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void limpiar() {
        txtCedula.setText(null);
        txtPlaca.setText(null);
        cbPuesto.removeAllItems();
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
    private javax.swing.JComboBox<String> cbPuesto;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblVfyCedula;
    private javax.swing.JLabel lblVfyPlaca;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tblTicketI;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
