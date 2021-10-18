package Ventanas;

import ConexionPG.PgConect;
import Validaciones.Val;
import entidades.Puesto;
import entidades.Ticket_Ingreso;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
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

public class CTicketIngreso extends javax.swing.JFrame {

    String idempleado;
    String cedula;

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
            while (places.next()) {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTicketI = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cbPuesto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblVfyPlaca = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblVfyCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lbliconxd = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelFondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 840, 150));

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("¡TICKET DE INGRESO! ");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/find.png"))); // NOI18N
        jLabel4.setText("Busqueda");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 130, -1));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        panelFondo.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 460, -1));

        cbPuesto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbPuestoFocusGained(evt);
            }
        });
        panelFondo.add(cbPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 240, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Puesto:");
        panelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 90, -1));

        txtPlaca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlacaFocusLost(evt);
            }
        });
        panelFondo.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 240, 30));
        panelFondo.add(lblVfyPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 240, 10));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Placa:");
        panelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, 20));
        panelFondo.add(lblVfyCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 220, 10));

        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        panelFondo.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 220, 30));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cédula:");
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        btnGenerar.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        panelFondo.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 160, 50));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panelFondo.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, 20));

        lbliconxd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gnome_panel_window_menu.png"))); // NOI18N
        panelFondo.add(lbliconxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 130));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOCOLOR8.png"))); // NOI18N
        panelFondo.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

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
                        int si = JOptionPane.showConfirmDialog(rootPane, "¿Generar PDF?", "CREANDO PDF...", JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE);
                        if (JOptionPane.OK_OPTION == si) {
                            crearPDF(ticket.getIdTicked());
                            limpiar();
                        } else {

                        }
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

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void limpiar() {
        txtCedula.setText(null);
        txtPlaca.setText(null);
        cbPuesto.removeAllItems();
    }

    public void crearPDF(String ticketing) {
        
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
            ResultSet prueba = con.buscarTicketsIngpdf(ticketing);
            String text = null;
            if (prueba.next()) {
                text = "                         -- TICKET ENTRADA --                       ID TICKET: " + prueba.getString("idticketing") + "                               CÉDULA: " + prueba.getString("idpersona") + "                                        "
                        + "       PLACA: " + prueba.getString("placa")
                        + "                                                    PUESTO: " + prueba.getString("idpuesto") + "                                                          F.INGRESO: " + prueba.getString("fechaing");
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

            doc.save("C:\\SEGUNDO CICLO\\POO\\PDF\\TICKETINGRESO.pdf");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbPuesto;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblVfyCedula;
    private javax.swing.JLabel lblVfyPlaca;
    private javax.swing.JLabel lbliconxd;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tblTicketI;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
