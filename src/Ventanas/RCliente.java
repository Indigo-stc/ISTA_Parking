package Ventanas;

import ConexionPG.PgConect;
import entidades.Cliente;
import Validaciones.Val;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class RCliente extends javax.swing.JFrame {

    PgConect conec = new PgConect();
    Connection conectar = conec.Conectar();

    String genero = null;

    public RCliente() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            tblModelo();
        } catch (SQLException ex) {
            Logger.getLogger(RCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public RCliente(String cedula) {
        initComponents();
        setLocationRelativeTo(null);
        txtCedula.setText(cedula);
        try {
            tblModelo();
        } catch (SQLException ex) {
            Logger.getLogger(RCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_GroupClientes = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        rbM = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();
        botonRegistrar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        lblvrfCedula = new javax.swing.JLabel();
        lblvrfNombre = new javax.swing.JLabel();
        lblvrfApellidos = new javax.swing.JLabel();
        lblvrfCelular = new javax.swing.JLabel();
        lblvrfCorreo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        fechaNa = new com.toedter.calendar.JDateChooser();
        lblFondoCli = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel2.setText("Cédula:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel3.setText("Nombres:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel4.setText("Apellidos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel5.setText("Fecha N:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel6.setText("Celular:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel7.setText("Correo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/find.png"))); // NOI18N
        jLabel8.setText("Busqueda");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 130, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jLabel10.setText("¡Registro Clientes!");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

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
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 180, -1));

        txtNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresFocusLost(evt);
            }
        });
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 180, -1));

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 180, -1));

        txtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFocusLost(evt);
            }
        });
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 190, -1));

        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 190, -1));

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 480, -1));

        rbM.setBackground(new java.awt.Color(204, 204, 204));
        b_GroupClientes.add(rbM);
        rbM.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        rbM.setText("M");
        rbM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMMouseClicked(evt);
            }
        });
        getContentPane().add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 60, -1));

        rbF.setBackground(new java.awt.Color(204, 204, 204));
        b_GroupClientes.add(rbF);
        rbF.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        rbF.setText("F");
        rbF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbFMouseClicked(evt);
            }
        });
        getContentPane().add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 60, -1));

        botonRegistrar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardar.png"))); // NOI18N
        botonRegistrar.setText("REGISTRAR");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 170, 40));

        botonEliminar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBorrar.png"))); // NOI18N
        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 170, 40));

        botonLimpiar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLimpiar.png"))); // NOI18N
        botonLimpiar.setText("CANCELAR");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 170, 40));

        botonSalir.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        botonSalir.setText("Menú");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));

        lblvrfCedula.setBackground(new java.awt.Color(255, 0, 0));
        lblvrfCedula.setForeground(new java.awt.Color(255, 0, 0));
        lblvrfCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblvrfCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(lblvrfCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 190, 10));

        lblvrfNombre.setBackground(new java.awt.Color(255, 0, 0));
        lblvrfNombre.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblvrfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 190, 10));

        lblvrfApellidos.setBackground(new java.awt.Color(255, 0, 0));
        lblvrfApellidos.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblvrfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 190, 10));

        lblvrfCelular.setBackground(new java.awt.Color(255, 0, 0));
        lblvrfCelular.setForeground(new java.awt.Color(255, 0, 0));
        lblvrfCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblvrfCelularKeyTyped(evt);
            }
        });
        getContentPane().add(lblvrfCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 190, 10));

        lblvrfCorreo.setBackground(new java.awt.Color(255, 0, 0));
        lblvrfCorreo.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblvrfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 190, 10));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel9.setText("Género:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cédula", "Nombres", "Apellidos", "Fecha N.", "Celular", "Correo", "Género"
            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        tablaClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaClientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 920, 190));
        getContentPane().add(fechaNa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 180, -1));

        lblFondoCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoR.png"))); // NOI18N
        getContentPane().add(lblFondoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        crearEmp();
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void rbMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMMouseClicked
        genero = rbM.getText();
    }//GEN-LAST:event_rbMMouseClicked

    private void rbFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbFMouseClicked
        genero = rbF.getText();
    }//GEN-LAST:event_rbFMouseClicked

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        try {
            String idCli = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0).toString();
            PgConect con = new PgConect();
            con.elimCli(idCli);
            tblModelo();
        } catch (SQLException ex) {
            Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void lblvrfCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblvrfCedulaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar) || Val.isNumber(txtCedula.getText())) {
            getToolkit();
            evt.consume();
            lblvrfCedula.setText("Deben ser 10 digitos");
        } else {
            lblvrfCedula.setText(null);
        }
    }//GEN-LAST:event_lblvrfCedulaKeyTyped

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        if (!Val.isNumber(txtCedula.getText())) {
            lblvrfCedula.setText("Deben ser 10 digitos");
        } else {
            lblvrfCedula.setText(null);
            PgConect con = new PgConect();
            try {
                ResultSet persona = con.personas(txtCedula.getText());
                if (persona.next()) {
                    txtNombres.setText(persona.getString("nombre"));
                    txtApellidos.setText(persona.getString("apellido"));
                    txtCorreo.setText(persona.getString("correo"));
                    txtCelular.setText(persona.getString("celular"));
                    String gen = persona.getString("genero");
                    Date fsql = persona.getDate("fechanac");
                    java.util.Date utilDate = new java.util.Date(fsql.getTime());
                    if (gen.equalsIgnoreCase("M")) {
                        b_GroupClientes.setSelected(rbM.getModel(), true);
                    }  else if (gen.equalsIgnoreCase("F")) {
                        b_GroupClientes.setSelected(rbF.getModel(), true);
                    }
                    fechaNa.setDate(utilDate);
                }
            } catch (SQLException ex) {
                Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtNombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusLost
        if (Val.hollow(txtNombres.getText())) {
            lblvrfCedula.setText("Campo Obligatorio");
        } else {
            lblvrfCedula.setText(null);
        }
    }//GEN-LAST:event_txtNombresFocusLost

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
        if (Val.hollow(txtApellidos.getText())) {
            lblvrfApellidos.setText("Campo Obligatorio");
        } else {
            lblvrfApellidos.setText(null);
        }
    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        if (Val.hollow(txtCelular.getText())) {
            lblvrfCelular.setText("Campo Obligatorio");
        } else {
            lblvrfCelular.setText(null);
        }
    }//GEN-LAST:event_txtCelularFocusLost

    private void lblvrfCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblvrfCelularKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar) || Val.isNumber(txtCelular.getText())) {
            getToolkit();
            evt.consume();
            lblvrfCelular.setText("Deben ser 10 digitos");
        } else {
            lblvrfCelular.setText(null);
        }
    }//GEN-LAST:event_lblvrfCelularKeyTyped

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if (!Val.email(txtCorreo.getText())) {
            lblvrfCorreo.setText("No es un correo");
        } else {
            lblvrfCorreo.setText(null);
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        Menu me = new Menu();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)
                || Val.isNumber(txtCedula.getText())
                || Val.digVfy(txtCedula.getText())) {
            getToolkit();
            evt.consume();
            lblvrfCedula.setText("No es una cédula");
        } else {
            lblvrfCedula.setText(null);
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)
                || Val.isNumber(txtCelular.getText())) {
            getToolkit();
            evt.consume();
        }
    }//GEN-LAST:event_txtCelularKeyTyped


    private void tablaClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaClientesKeyReleased
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String idcliente = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0).toString();
            String cedula = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 1).toString();
            String nombre = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 2).toString();
            String apellido = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 3).toString();
            Date fechanac = (Date) tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 4);
            String email = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 5).toString();
            String celular = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 6).toString();
            String genero = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 7).toString();
            
            if (!genero.equalsIgnoreCase("m") || !genero.equalsIgnoreCase("f") || 
                    !Val.isNumber(celular) ||
                    !Val.email(email) ||
                    nombre == null ||
                    apellido == null ||
                    email == null ||
                    celular == null) {
                JOptionPane.showMessageDialog(rootPane, """
                                                        1. Llenar todos los campos
                                                        2. Celular: Solo 10 digitos
                                                        3. Solo correos validos
                                                        4. Genero: M o F
                                                        """);
                try {
                    tblModelo();
                } catch (SQLException ex) {
                    Logger.getLogger(RCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
           } else {
                PgConect con = new PgConect();
                con.modificarPer(cedula, nombre, apellido, (java.sql.Date) fechanac, celular, email, genero);
            }
           
        }
    }//GEN-LAST:event_tablaClientesKeyReleased

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        try {
            buscar(txt_buscar.getText(), txt_buscar.getText());
        } catch (SQLException ex) {
            Logger.getLogger(RCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    public void limpiar() {
        txtCedula.setText(null);
        txtNombres.setText(null);
        txtApellidos.setText(null);
        txtCelular.setText(null);
        txtCorreo.setText(null);
        fechaNa.setDate(null);
        b_GroupClientes.setSelected(rbM.getModel(), false);
        b_GroupClientes.setSelected(rbF.getModel(), false);
    }

    public void crearEmp() {
        try {
            PgConect conect = new PgConect();
            if (conect.usuario(txtCedula.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Registro existente");
            } else if (!Val.isNumber(txtCedula.getText())
                    || Val.hollow(txtNombres.getText())
                    || Val.hollow(txtApellidos.getText())
                    || !Val.email(txtCorreo.getText())
                    || !(rbM.isSelected() || rbF.isSelected())
                    || !Val.isNumber(txtCelular.getText())
                    || !Val.edad(fechaNa.getDate())) {
                JOptionPane.showMessageDialog(null, "Datos incorrctos");
            } else {
                Cliente cli = new Cliente(txtCedula.getText(), txtNombres.getText(),
                        txtApellidos.getText(), (java.sql.Date) fechaNa.getDate(), txtCelular.getText(),
                        txtCorreo.getText(), genero);

                if (conect.pkPerson(cli.getCedula())) {
                    System.out.println("solo cliente");
                    conect.insCli(cli.getIdCli(), cli.getCedula());
                } else {
                    System.out.println("Cliente y Persona");
                    conect.insPer(cli.getCedula(), cli.getNombres(),
                        cli.getApellidos(), cli.getFechaNacimiento(), cli.getCelular(),
                        cli.getCorreo(), cli.getGenero());
                    conect.insCli(cli.getIdCli(), cli.getCedula());
                }
                
                String idcliente = cli.getIdCli();
                JOptionPane.showMessageDialog(rootPane, "Cliente exitosamente guardado");
                tblModelo();
                limpiar();
                int si = JOptionPane.showConfirmDialog(null, "¿Pasar al registro de vehiculos?",
                        "WARNING", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
                if (JOptionPane.OK_OPTION == si) {

                    RVehiculo rve = new RVehiculo(idcliente);
                    rve.setVisible(true);
                    this.setVisible(false);
                } else {

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tblModelo() throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        tablaClientes.setModel(modelo);
        PgConect con = new PgConect();
        ResultSet clientes = con.mostrarCli();
        ResultSetMetaData rsmd = clientes.getMetaData();
        int columns = rsmd.getColumnCount();

        modelo.addColumn("ID");
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("F.Nacimiento");
        modelo.addColumn("Correo");
        modelo.addColumn("Celular");
        modelo.addColumn("Genero");

        while (clientes.next()) {
            Object[] filas = new Object[columns];
            for (int i = 0; i < columns; i++) {
                filas[i] = clientes.getObject(i + 1);
            }
            modelo.addRow(filas);
        }
    }

    //BUSCAR DATOS
    public void buscar(String cedula, String nombre) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        PgConect conec = new PgConect();
        Connection conectar = conec.Conectar();
        modelo.addColumn("ID");
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("F.Nacimiento");
        modelo.addColumn("Correo");
        modelo.addColumn("Celular");
        modelo.addColumn("Genero");
        tablaClientes.setModel(modelo);
        String sql = "";
        if (cedula.equals("") && nombre.equals("")) {
            sql = "SELECT clientes.idcliente,personas.cedula,personas.nombre,personas.apellido,personas.fechanac,personas.celular,personas.correo,personas.genero"
                    + " FROM clientes,personas "
                    + " WHERE clientes.idpersona = personas.cedula ";
        } else {
            sql = "SELECT clientes.idcliente,personas.cedula,personas.nombre,personas.apellido,personas.fechanac,personas.celular,personas.correo,personas.genero"
                    + " FROM clientes,personas "
                    + " WHERE (clientes.idpersona = personas.cedula AND cedula  LIKE '%" + cedula + "%') OR  "
                    + " clientes.idpersona = personas.cedula AND nombre LIKE  '%" + nombre + "%';";
        }

        String Usuarios[] = new String[8];
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
                Usuarios[5] = resul.getString(6);
                Usuarios[6] = resul.getString(7);
                Usuarios[7] = resul.getString(8);
                modelo.addRow(Usuarios);

            }
            tablaClientes.setModel(modelo);
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
            java.util.logging.Logger.getLogger(RVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup b_GroupClientes;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonSalir;
    private com.toedter.calendar.JDateChooser fechaNa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondoCli;
    private javax.swing.JLabel lblvrfApellidos;
    private javax.swing.JLabel lblvrfCedula;
    private javax.swing.JLabel lblvrfCelular;
    private javax.swing.JLabel lblvrfCorreo;
    private javax.swing.JLabel lblvrfNombre;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
