package Ventanas;

public class CTicketIngreso extends javax.swing.JFrame {

    public CTicketIngreso() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        fechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtIDticket = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtPuestoA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        panelFondo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 50, 50));

        btnGenerar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_add.png"))); // NOI18N
        btnGenerar.setText("Generar");
        panelFondo.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 130, 50));
        panelFondo.add(fechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 220, -1));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel4.setText("Fecha ingreso:");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel3.setText("Puesto Asignado:");
        panelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel2.setText("Placa:");
        panelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel1.setText("ID Ticket:");
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        txtIDticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDticketActionPerformed(evt);
            }
        });
        panelFondo.add(txtIDticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 220, -1));

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        panelFondo.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 220, -1));
        panelFondo.add(txtPuestoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 220, -1));

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jLabel5.setText("TICKET DE INGRESO ");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

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

    private void txtIDticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDticketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDticketActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

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
    private com.toedter.calendar.JDateChooser fechaIngreso;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtIDticket;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPuestoA;
    // End of variables declaration//GEN-END:variables
}
