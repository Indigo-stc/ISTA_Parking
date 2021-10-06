package Ventanas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu extends javax.swing.JFrame {

    String rol;
    
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public Menu(String nombre) {
        initComponents();
        setLocationRelativeTo(null);
        this.rol = nombre;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniCliente = new javax.swing.JMenuItem();
        mniEmpleado = new javax.swing.JMenuItem();
        mniReserva = new javax.swing.JMenuItem();
        mniPuesto = new javax.swing.JMenuItem();
        mniServicio = new javax.swing.JMenuItem();
        mniVehiculo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        jPanel1.setBackground(new java.awt.Color(54, 77, 103));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/auto.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 60)); // NOI18N
        jLabel1.setText("PARKING ISTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(45, 54, 73));

        jMenu1.setBackground(new java.awt.Color(45, 54, 73));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_list.png"))); // NOI18N
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
        jMenu1.add(mniReserva);

        mniPuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bullet_white_alt.png"))); // NOI18N
        mniPuesto.setText("Puesto");
        mniPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPuestoActionPerformed(evt);
            }
        });
        jMenu1.add(mniPuesto);

        mniServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bullet_white_alt.png"))); // NOI18N
        mniServicio.setText("Uso de Servicio");
        jMenu1.add(mniServicio);

        mniVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bullet_white_alt.png"))); // NOI18N
        mniVehiculo.setText("Vehículo");
        mniVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVehiculoActionPerformed(evt);
            }
        });
        jMenu1.add(mniVehiculo);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(45, 54, 73));
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        this.setVisible(false);
    }//GEN-LAST:event_mniEmpleadoActionPerformed

    private void mniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClienteActionPerformed
        try {
            RCliente rc = new RCliente();
            rc.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniClienteActionPerformed

    private void mniVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVehiculoActionPerformed
        RVehiculo ve= new RVehiculo();
        ve.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniVehiculoActionPerformed

    private void mniPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPuestoActionPerformed
        VPuesto vp = new VPuesto();
        vp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniPuestoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mniCliente;
    private javax.swing.JMenuItem mniEmpleado;
    private javax.swing.JMenuItem mniPuesto;
    private javax.swing.JMenuItem mniReserva;
    private javax.swing.JMenuItem mniServicio;
    private javax.swing.JMenuItem mniVehiculo;
    // End of variables declaration//GEN-END:variables
}
