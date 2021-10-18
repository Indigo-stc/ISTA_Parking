package Ventanas;

public class Menu extends javax.swing.JFrame {

    String rol;
    String idempleado;
    
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public Menu(String nombre, String idempleado) {
        initComponents();
        setLocationRelativeTo(null);
        this.rol = nombre;
        this.idempleado= idempleado;
        switch (rol) {
            case "1" -> {
                                
            }
            case "2" -> {
                mniEmpleado.setVisible(false);
                mniPuesto.setVisible(false);
            }
            case "5" -> {
                mniCliente.setVisible(false);
                mniEmpleado.setVisible(false);
                mniPuesto.setVisible(false);
                mniReserva.setVisible(false);
                mniVehiculo.setVisible(false);
                
            } 
            default -> {System.out.println("no valeeeeee");
                System.out.println(rol);
            }
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniCliente = new javax.swing.JMenuItem();
        mniEmpleado = new javax.swing.JMenuItem();
        mniReserva = new javax.swing.JMenuItem();
        mniPuesto = new javax.swing.JMenuItem();
        mniVehiculo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SAAK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOCOLORMENU.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        jMenuBar1.setBackground(new java.awt.Color(45, 54, 73));
        jMenuBar1.setForeground(new java.awt.Color(0, 153, 204));

        jMenu1.setBackground(new java.awt.Color(45, 54, 73));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/taskbar_start_menu.png"))); // NOI18N
        jMenu1.setText("Menú");

        mniCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bullet_white_alt.png"))); // NOI18N
        mniCliente.setText("Cliente");
        mniCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniClienteMouseClicked(evt);
            }
        });
        mniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mniCliente);

        mniEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bullet_white_alt.png"))); // NOI18N
        mniEmpleado.setText("Empleado");
        mniEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(mniEmpleado);

        mniReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bullet_white_alt.png"))); // NOI18N
        mniReserva.setText("Reserva");
        mniReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniReservaActionPerformed(evt);
            }
        });
        jMenu1.add(mniReserva);

        mniPuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bullet_white_alt.png"))); // NOI18N
        mniPuesto.setText("Puesto");
        mniPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPuestoActionPerformed(evt);
            }
        });
        jMenu1.add(mniPuesto);

        mniVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bullet_white_alt.png"))); // NOI18N
        mniVehiculo.setText("Vehículo");
        mniVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVehiculoActionPerformed(evt);
            }
        });
        jMenu1.add(mniVehiculo);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bullet_white_alt.png"))); // NOI18N
        jMenuItem1.setText("Ticket Ingreso");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bullet_white_alt.png"))); // NOI18N
        jMenuItem2.setText("Ticket Salida");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(45, 54, 73));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit_1.png"))); // NOI18N
        jMenu2.setText("Salir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void mniClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniClienteMouseClicked
        
    }//GEN-LAST:event_mniClienteMouseClicked

    private void mniEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmpleadoActionPerformed
        REmpleado re = new REmpleado();
        re.setVisible(true);
       
    }//GEN-LAST:event_mniEmpleadoActionPerformed

    private void mniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClienteActionPerformed
        RCliente rc = new RCliente();
        rc.setVisible(true);
       
    }//GEN-LAST:event_mniClienteActionPerformed

    private void mniVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVehiculoActionPerformed
        RVehiculo ve= new RVehiculo();
        ve.setVisible(true);
       
    }//GEN-LAST:event_mniVehiculoActionPerformed

    private void mniPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPuestoActionPerformed
        VPuesto vp = new VPuesto();
        vp.setVisible(true);

    }//GEN-LAST:event_mniPuestoActionPerformed

    private void mniReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniReservaActionPerformed
        VReserva rsv = new VReserva(idempleado);
        rsv.setVisible(true);
 
    }//GEN-LAST:event_mniReservaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        CTicketIngreso t =new CTicketIngreso(idempleado);
        t.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TicketSalida tks = new TicketSalida();
        tks.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mniCliente;
    private javax.swing.JMenuItem mniEmpleado;
    private javax.swing.JMenuItem mniPuesto;
    private javax.swing.JMenuItem mniReserva;
    private javax.swing.JMenuItem mniVehiculo;
    // End of variables declaration//GEN-END:variables
}
