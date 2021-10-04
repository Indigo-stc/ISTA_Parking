package Ventanas;

public class RVehiculo extends javax.swing.JFrame {

    public RVehiculo() {
        initComponents();
        RCliente cli = new RCliente();
        txt_IDCli.setText(cli.idCli);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
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
        btn_Show = new javax.swing.JButton();
        btn_Modify = new javax.swing.JButton();
        btn_Rid = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_Placa = new javax.swing.JLabel();
        lbl_Tipo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VEHÍCULO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));
        jPanel1.add(txt_Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 140, -1));
        jPanel1.add(txt_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 182, -1));

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modelo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        cb_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Vehiculo", "Moto", "Camioneta" }));
        jPanel1.add(cb_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 182, -1));

        txt_IDCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDCliActionPerformed(evt);
            }
        });
        jPanel1.add(txt_IDCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 140, -1));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cliente ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Placa:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        btnSalir.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        btnSalir.setText("Salir");
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 130, 40));

        btn_Insert.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        btn_Insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardar.png"))); // NOI18N
        btn_Insert.setText("Ingresar");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 140, 40));

        btn_Show.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        btn_Show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoMostrar.png"))); // NOI18N
        btn_Show.setText("Mostrar");
        btn_Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 150, 40));

        btn_Modify.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        btn_Modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditar.png"))); // NOI18N
        btn_Modify.setText("Modificar");
        jPanel1.add(btn_Modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 140, 40));

        btn_Rid.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        btn_Rid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBorrar.png"))); // NOI18N
        btn_Rid.setText("Eliminar");
        btn_Rid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RidActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Rid, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 150, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "ID Cliente", "Modelo", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 797, 120));
        jPanel1.add(lbl_Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 140, 10));
        jPanel1.add(lbl_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 180, 10));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 50, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/11.jpg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_InsertActionPerformed

    private void btn_ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ShowActionPerformed

    private void txt_IDCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDCliActionPerformed

    private void btn_RidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RidActionPerformed

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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_Modify;
    private javax.swing.JButton btn_Rid;
    private javax.swing.JButton btn_Show;
    private javax.swing.JComboBox<String> cb_Tipo;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lbl_Placa;
    private javax.swing.JLabel lbl_Tipo;
    private javax.swing.JTextField txt_IDCli;
    private javax.swing.JTextField txt_Model;
    private javax.swing.JTextField txt_Placa;
    // End of variables declaration//GEN-END:variables
}
