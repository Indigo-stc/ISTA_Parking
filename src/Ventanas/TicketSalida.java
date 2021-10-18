package Ventanas;

import ConexionPG.PgConect;
import entidades.Ticket_Salida;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class TicketSalida extends javax.swing.JFrame {

    public TicketSalida() {
        initComponents();
        setLocationRelativeTo(null);
        buscar("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtTicketIngreso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTisalida = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        xdxdxdxd = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("¡TICKET SALIDA!");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        txtTicketIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTicketIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTicketIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 360, -1));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ticket Ingreso:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        btnGenerar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 180, -1));

        tblTisalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTisalida);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 830, 160));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gnome_panel_window_menu.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, -1, -1));

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 440, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/find.png"))); // NOI18N
        jLabel3.setText("Busqueda");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 130, 30));

        xdxdxdxd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/kmenuedit.png"))); // NOI18N
        getContentPane().add(xdxdxdxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOCOLOR14.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTicketIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTicketIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketIngresoActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try {
            PgConect con = new PgConect();
            ResultSet idingreso = con.pkTicketIng(txtTicketIngreso.getText());

            if (idingreso.next()) {
                int si = JOptionPane.showConfirmDialog(null, "Confirmar accion",
                        "WARNING", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
                if (JOptionPane.OK_OPTION == si) {
                    ResultSet idTarifa = con.ticketIdTarifa(idingreso.getString("idticketing"));
                    if (idTarifa.next()) {
                        if (!con.tixts(idingreso.getString("idticketing"))) {
                            Date current = new Date();
                            Ticket_Salida tick = new Ticket_Salida(current, idingreso.getString("idticketing"),
                                    idTarifa.getShort("idtarifa"));
                            con.insTSal(tick.getId_tsalida(), tick.getId_tinicio(),
                                    tick.getIdTarifa(), tick.getFecha_salida());
                            con.desOcupaPue(idingreso.getShort("idpuesto"));
                            buscar("");
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "A un T. Salida le corresponde un solo T. Ingreso");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ticket no existente");
            }
            int si = JOptionPane.showConfirmDialog(rootPane, " ¿Generar PDF?", "CREANDO PDF...",JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            if(JOptionPane.OK_OPTION == si){
                crearPDF();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TicketSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        buscar(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void buscar(String cedula) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 2 || column == 3 || column == 4 || column == 5 || column == 6 || column == 7 || column == 8 || column == 9 || column == 10;
            }

        };
        PgConect conec = new PgConect();
        Connection conectar = conec.Conectar();
        modelo.addColumn("T Ingreso");
        modelo.addColumn("T Salida");
        modelo.addColumn("Costo por hora");

        tblTisalida.setModel(modelo);
        String sql = "";
        if (cedula.trim().equals("")) {
            sql = "SELECT ticketsing.idticketing,ticketssal.idticketsal,tarifas.costo_hora "
                    + " FROM ticketssal,ticketsing,tarifas "
                    + " WHERE ticketssal.idticketing = ticketsing.idticketing AND ticketssal.idtarifa = tarifas.idtarifa;";
        } else {
            sql = " SELECT ticketsing.idticketing,ticketssal.idticketsal,tarifas.costo_hora,clientes.idcliente"
                    + "  FROM ticketssal,ticketsing,tarifas,clientes"
                    + " WHERE ticketssal.idticketing = ticketsing.idticketing AND ticketssal.idtarifa = tarifas.idtarifa "
                    + "   AND clientes.idcliente = ticketsing.idcliente AND( idpersona LIKE '" + cedula + "%');";

        }

        String Usuarios[] = new String[3];
        Statement set;
        try {
            set = conectar.createStatement();
            ResultSet resul = set.executeQuery(sql);
            while (resul.next()) {
                Usuarios[0] = resul.getString(1);
                Usuarios[1] = resul.getString(2);
                Usuarios[2] = resul.getString(3);
                modelo.addRow(Usuarios);
            }
            tblTisalida.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(RCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearPDF() {
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
            ResultSet prueba = con.buscarTicketsSal(txtTicketIngreso.getText());
            String text = "";
            if (prueba.next()) {
                text = "TICKET SALIDA --> " + prueba.getString(1) + "                  "
                        + "TICKET INGRESO: " + prueba.getString(2) + "                         "
                        + "Cedula: " + prueba.getString(3) + "                                      "
                        + "Costo_Hora: " + prueba.getString(4) + "                                                            "
                        + "F. Ingreso: " + prueba.getString(5) + "                                                            "
                        + "F. Salida: " + prueba.getString(6) + "                                                             "
                        + "Tiempo: " + prueba.getString(7) + "min                                                             "
                        + "Precio final: " + prueba.getString(8) + "$";
//                text = String.format(" %s %s%n %s %s%n %s %s%n %s %s%n %s %s%n %s %s%n %s %f%n %s %f%n", 
//                        "TICKET SALIDA -->", prueba.getString(1),
//                        "ID ingreso:", prueba.getString(2), "Cedula:", prueba.getString(3),
//                        "Costo_Hora:", prueba.getString(4), "F. Ingreso:", prueba.getString(5),
//                        "F. Salida:", prueba.getString(6), "Tiempo:", prueba.getDouble(7),
//                        "Precio final:", prueba.getDouble(8));
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

            doc.save("C:\\Users\\ANDRES\\Documents\\Proyecto\\PDFS\\Salida.pdf");
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
                new TicketSalida().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTable tblTisalida;
    private javax.swing.JTextField txtTicketIngreso;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JLabel xdxdxdxd;
    // End of variables declaration//GEN-END:variables
}
