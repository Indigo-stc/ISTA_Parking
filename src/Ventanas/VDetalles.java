package Ventanas;

import ConexionPG.PgConect;
import Validaciones.Val;
import java.sql.Connection;
import java.sql.Statement;
import entidades.DetalleReserva;
import entidades.Puesto;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class VDetalles extends javax.swing.JFrame {

    String idalquiler;
    String cedula = "hola";
    String placa;

    public VDetalles() {
        try {
            initComponents();
            setLocationRelativeTo(null);
            buscar("");
        } catch (SQLException ex) {
            Logger.getLogger(VDetalles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public VDetalles(String idalquiler, String cedula) {
        try {
            initComponents();
            setLocationRelativeTo(null);
            this.idalquiler = idalquiler;
            this.cedula = cedula;
            buscar("");
        } catch (SQLException ex) {
            Logger.getLogger(VDetalles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cbxModel(String placa) {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            PgConect con = new PgConect();
            cbPuesto.setModel(model);
            ResultSet places = con.cbxPuestos(placa);
            while (places.next()) {
                model.addElement(new Puesto(places.getShort(1), places.getShort(2), places.getBoolean(3)));
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(VReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblPlacaR = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblIDPuestoR = new javax.swing.JLabel();
        cbPuesto = new javax.swing.JComboBox<>();
        lblVfyPlaca = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetReserva = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblBuscarDR = new javax.swing.JLabel();
        txtBuscarDR = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        xdxdxdxd = new javax.swing.JLabel();
        FondoDet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 165, -1, -1));

        lblPlacaR.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblPlacaR.setForeground(new java.awt.Color(0, 0, 0));
        lblPlacaR.setText("Placa");
        getContentPane().add(lblPlacaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        txtPlaca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlacaFocusLost(evt);
            }
        });
        getContentPane().add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 250, -1));

        lblIDPuestoR.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblIDPuestoR.setForeground(new java.awt.Color(0, 0, 0));
        lblIDPuestoR.setText("Puesto");
        getContentPane().add(lblIDPuestoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        cbPuesto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbPuestoFocusGained(evt);
            }
        });
        getContentPane().add(cbPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 250, -1));

        lblVfyPlaca.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVfyPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 250, 10));

        btnAgregar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        btnAgregar.setText("GENERAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 160, 50));

        btnGenerar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_add.png"))); // NOI18N
        btnGenerar.setText("AGREGAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 160, 50));

        tblDetReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDetReserva);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 810, 170));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("¡DETALLE RESERVA!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        lblBuscarDR.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblBuscarDR.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarDR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/find.png"))); // NOI18N
        lblBuscarDR.setText("Busqueda");
        getContentPane().add(lblBuscarDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 140, -1));

        txtBuscarDR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarDRKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscarDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 440, 30));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, 20));

        xdxdxdxd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/kmenuedit.png"))); // NOI18N
        getContentPane().add(xdxdxdxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        FondoDet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOCOLOR10.jpg"))); // NOI18N
        getContentPane().add(FondoDet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlacaFocusLost
        System.out.println(cedula);
        if (cedula != null) {
            if (Val.placa(txtPlaca.getText())) {
                lblVfyPlaca.setText(null);
                try {
                    PgConect con = new PgConect();
                    ResultSet relacion = con.owner(cedula, txtPlaca.getText());
                    ResultSet idcliente = con.pkCedCli(cedula);
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
        }
    }//GEN-LAST:event_txtPlacaFocusLost

    private void cbPuestoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbPuestoFocusGained
        cbxModel(txtPlaca.getText());
    }//GEN-LAST:event_cbPuestoFocusGained
    ArrayList<DetalleReserva> dt = new ArrayList();
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            PgConect conect = new PgConect();
            Puesto pt = (Puesto) cbPuesto.getSelectedItem();
            ResultSet tarifa = conect.IDTarifaDet(txtPlaca.getText());
            if (tarifa.next()) {
                DetalleReserva dr = new DetalleReserva(txtPlaca.getText(), pt.getIdpuesto(), tarifa.getShort("idtarifa"));
                dt.add(dr);
                int si = JOptionPane.showConfirmDialog(rootPane, "¿Generar PDF?", "CREANDO PDF...", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
                if (JOptionPane.OK_OPTION == si) {
                    crearPDF(dr.getIddetalle());
                    limpiar();
                } else {

                }
                limpiar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(VDetalles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if (dt.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingresar Detalle");
        } else {
            try {
                PgConect con = new PgConect();
                for (int i = 0; i < dt.size(); i++) {
                    con.insDetR(dt.get(i).getIddetalle(), idalquiler, dt.get(i).getPlaca(), dt.get(i).getPuesto(), dt.get(i).getIdtarifa());
                }
                buscar("");
            } catch (SQLException ex) {
                Logger.getLogger(VDetalles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void txtBuscarDRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDRKeyReleased
        try {
            buscar(txtBuscarDR.getText());
        } catch (SQLException ex) {
            Logger.getLogger(VDetalles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarDRKeyReleased

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void buscar(String placa) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2 || column == 3 || column == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        PgConect conec = new PgConect();
        Connection conectar = conec.Conectar();

        modelo.addColumn("ID Detalle");
        modelo.addColumn("ID Alquiler");
        modelo.addColumn("Placa");
        modelo.addColumn("ID Puesto");
        modelo.addColumn("ID Tarifa");

        tblDetReserva.setModel(modelo);
        String sql = " ";
        if (placa.trim().equals(" ")) {
            sql = "SELECT iddetalle, detallesalquiler.idalquiler, detallesalquiler.placa, detallesalquiler.idpuesto, idtarifa "
                    + "FROM alquileres, detallesalquiler, tarifas, vehiculos, puestos "
                    + "WHERE alquileres.idalquiler = detallesalquiler.idalquiler "
                    + "AND vehiculos.placa = detallesalquiler.placa AND puestos.idpuesto = detallesalquiler.idpuesto "
                    + "AND tarifas.idtarifa = detallesalquiler.costo;";
        } else {
            sql = "SELECT iddetalle, detallesalquiler.idalquiler, detallesalquiler.placa, detallesalquiler.idpuesto, idtarifa "
                    + "FROM alquileres, detallesalquiler, tarifas, vehiculos, puestos "
                    + "WHERE alquileres.idalquiler = detallesalquiler.idalquiler "
                    + "AND vehiculos.placa = detallesalquiler.placa AND puestos.idpuesto = detallesalquiler.idpuesto "
                    + "AND tarifas.idtarifa = detallesalquiler.costo AND detallesalquiler.placa LIKE '%" + placa + "%';";

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
            tblDetReserva.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(RCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void limpiar() {
        txtPlaca.setText(null);
        cbPuesto.removeAll();
    }

    public void crearPDF(String placa) {

        PDDocument doc = null;
        try {
            doc = new PDDocument();
            PDPage page = new PDPage();
            doc.addPage(page);
            PDPageContentStream contentStream = new PDPageContentStream(doc, page);

            PDFont pdfFont = PDType1Font.TIMES_ROMAN;
            float fontSize = 25;
            float leading = 1.5f * fontSize;

            PDRectangle mediabox = page.getMediaBox();
            float margin = 28;
            float width = mediabox.getWidth() - 2 * margin;
            float startX = mediabox.getLowerLeftX() + margin;
            float startY = mediabox.getUpperRightY() - margin;
            PgConect con = new PgConect();
            ResultSet prueba = con.buscarDetalle(txtPlaca.getText());
            String text = null;
            if (prueba.next()) {
                text = "                         -- DETALLE RESERVA --                       ID DETALLE: " + prueba.getString("iddetalle") + "                               ID ALQUILER: " + prueba.getString("idalquiler") + "                                        "
                        + "       PLACA: " + prueba.getString("placa")
                        + "                                                    ID PUESTO: " + prueba.getString("idpuesto") + "                                                          COSTO: " + prueba.getString("idtarifa");
            }
            List<String> lines = new ArrayList<String>();
            int lastSpace = -1;
            while (text.length() > 0) {
                int spaceIndex = text.indexOf(' ', lastSpace + 1);
                if (spaceIndex < 0) {
                    spaceIndex = text.length();
                }
                String subString = text.substring(0, spaceIndex);
                float size = fontSize * pdfFont.getStringWidth(subString) / 1000;
                System.out.printf("'%s' - %f of %f\n", subString, size, width);
                if (size > width) {
                    if (lastSpace < 0) {
                        lastSpace = spaceIndex;
                    }
                    subString = text.substring(0, lastSpace);
                    lines.add(subString);
                    text = text.substring(lastSpace).trim();
                    System.out.printf("'%s' is line\n", subString);
                    lastSpace = -1;
                } else if (spaceIndex == text.length()) {
                    lines.add(text);
                    System.out.printf("'%s' is line\n", text);
                    text = "";
                } else {
                    lastSpace = spaceIndex;
                }
            }

            contentStream.beginText();
            contentStream.setFont(pdfFont, fontSize);
            contentStream.newLineAtOffset(startX, startY);
            float currentY = startY;
            for (String line : lines) {
                currentY -= leading;

                if (currentY <= margin) {

                    contentStream.endText();
                    contentStream.close();
                    PDPage new_Page = new PDPage();
                    doc.addPage(new_Page);
                    contentStream = new PDPageContentStream(doc, new_Page);
                    contentStream.beginText();
                    contentStream.setFont(pdfFont, fontSize);
                    contentStream.newLineAtOffset(startX, startY);
                    currentY = startY;
                }
                contentStream.showText(line);
                contentStream.newLineAtOffset(0, -leading);
            }
            contentStream.endText();
            contentStream.close();

            doc.save("C:\\SEGUNDO CICLO\\POO\\PDF\\DETALLE.pdf");
        } catch (IOException ex) {
            Logger.getLogger(CTicketIngreso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CTicketIngreso.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (doc != null) {
                try {
                    doc.close();
                } catch (IOException ex) {
                    Logger.getLogger(CTicketIngreso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
            java.util.logging.Logger.getLogger(VDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDetalles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoDet;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarDR;
    private javax.swing.JLabel lblIDPuestoR;
    private javax.swing.JLabel lblPlacaR;
    private javax.swing.JLabel lblVfyPlaca;
    private javax.swing.JTable tblDetReserva;
    private javax.swing.JTextField txtBuscarDR;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JLabel xdxdxdxd;
    // End of variables declaration//GEN-END:variables
}
