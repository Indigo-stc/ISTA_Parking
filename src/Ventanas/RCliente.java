package Ventanas;

import Lógica.Cliente;
import Validaciones.Val;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RCliente extends javax.swing.JFrame {

    public static ArrayList<Cliente> listaClientes = new ArrayList();
    String genero = null;
    String idCli = null;

    public RCliente() {
        initComponents();
        setLocationRelativeTo(null);
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
        rbM = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();
        botonRegistrar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        MOSTRAR = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        lblvrfCedula = new javax.swing.JLabel();
        lblvrfNombre = new javax.swing.JLabel();
        lblvrfApellidos = new javax.swing.JLabel();
        lblvrfCelular = new javax.swing.JLabel();
        lblvrfCorreo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        fechaNa = new com.toedter.calendar.JDateChooser();
        lblFondoCli = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cédula:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombres:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha N:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Celular:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Género:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CLIENTES");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

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
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 150, -1));

        txtNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresFocusLost(evt);
            }
        });
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 150, -1));

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 150, -1));

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
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 150, -1));

        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 150, -1));

        b_GroupClientes.add(rbM);
        rbM.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        rbM.setForeground(new java.awt.Color(255, 255, 255));
        rbM.setText("M");
        rbM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMMouseClicked(evt);
            }
        });
        getContentPane().add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 60, -1));

        b_GroupClientes.add(rbF);
        rbF.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        rbF.setForeground(new java.awt.Color(255, 255, 255));
        rbF.setText("F");
        rbF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbFMouseClicked(evt);
            }
        });
        getContentPane().add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 60, -1));

        botonRegistrar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardar.png"))); // NOI18N
        botonRegistrar.setText("REGISTRAR");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 140, 40));

        botonEliminar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBorrar.png"))); // NOI18N
        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 140, 40));

        botonModificar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditar.png"))); // NOI18N
        botonModificar.setText("MODIFICAR");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 150, 40));

        MOSTRAR.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        MOSTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoMostrar.png"))); // NOI18N
        MOSTRAR.setText("MOSTRAR");
        getContentPane().add(MOSTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 150, 40));

        botonLimpiar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLimpiar.png"))); // NOI18N
        botonLimpiar.setText("LIMPIAR");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 160, 40));

        botonBuscar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 160, 40));

        botonSalir.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, -1));

        lblvrfCedula.setBackground(new java.awt.Color(255, 0, 0));
        lblvrfCedula.setForeground(new java.awt.Color(255, 0, 0));
        lblvrfCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblvrfCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(lblvrfCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 150, 10));

        lblvrfNombre.setBackground(new java.awt.Color(255, 0, 0));
        lblvrfNombre.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblvrfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 150, 10));

        lblvrfApellidos.setBackground(new java.awt.Color(255, 0, 0));
        lblvrfApellidos.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblvrfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, 10));

        lblvrfCelular.setBackground(new java.awt.Color(255, 0, 0));
        lblvrfCelular.setForeground(new java.awt.Color(255, 0, 0));
        lblvrfCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblvrfCelularKeyTyped(evt);
            }
        });
        getContentPane().add(lblvrfCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 150, 10));

        lblvrfCorreo.setBackground(new java.awt.Color(255, 0, 0));
        lblvrfCorreo.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblvrfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 150, 10));

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
        jScrollPane1.setViewportView(tablaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 800, 150));
        getContentPane().add(fechaNa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 190, -1));

        lblFondoCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoClientes.jpg"))); // NOI18N
        getContentPane().add(lblFondoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        if (txtCedula.getText() == null || txtNombres.getText() == null
                || txtApellidos.getText() == null || txtCelular.getText() == null
                || txtCorreo.getText() == null || " ".equals(this.fechaNa.getDate())) {
            JOptionPane.showMessageDialog(null, "Falta campos por llenar");
        } else if (Val.digVfy(txtCedula.getText())) {
            JOptionPane.showMessageDialog(null, "Cédula incorrecta");
        } else if (Val.isNumber(txtCelular.getText())) {
            JOptionPane.showMessageDialog(null, "Celular incorrecto");
        } else {
            Cliente registroCliente = new Cliente(txtCedula.getText(),
                    txtNombres.getText(), txtApellidos.getText(), (Date) fechaNa.getDate(),
                    txtCelular.getText(),
                    txtCorreo.getText(), genero);
            listaClientes.add(registroCliente);
            
            

            /* for DB
            ArrayList<Cliente> temp = Base.sGCedCli(
                    Base.park, 
                    txt_cedula.getText());
            
            for (int i = 0; i < temp.size(); i++) {
                clients.add(temp.get(i));
            }
            actualizarDatos();
            limpiarTxt();
             */
        }
        actualizarDatos();
        limpiar();
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void rbMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMMouseClicked
        genero = rbM.getText();
    }//GEN-LAST:event_rbMMouseClicked

    private void rbFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbFMouseClicked
        genero = rbF.getText();
    }//GEN-LAST:event_rbFMouseClicked

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        int indexSlct = tablaClientes.getSelectedRow();
        mostrarDatos(indexSlct);
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        modificar();
    }//GEN-LAST:event_botonModificarActionPerformed

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
        System.exit(0);
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
                || Val.isNumber(txtCedula.getText())) {
            getToolkit();
            evt.consume();
            lblvrfCedula.setText("Deben ser 10 digitos");
        } else {
            lblvrfCedula.setText(null);
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        /* 
        limpiarTbl();
        clients.clear();
        
        
        if (!(txt_ID.getText().length() == 0)) {
            ArrayList<Cliente> temp = Base.sGIDCli(
                    Base.parkl, txt_ID.getText());
            bsqactuaL(temp);
        } else if (!(txt_cedula.getText().length() == 0)) {
            ArrayList<Cliente> temp = Base.sGCedCli(
                    Base.parkl, txt_cedula.getText());
            bsqactuaL(temp);
        } else if (!(txt_Nombre.getText().length() == 0)) {
            ArrayList<Cliente> temp = Base.sGNomCli(
                    Base.park, txt_Nombre.getText());
            bsqactuaL(temp);
        } else if (!(txt_Apellido1.getText().length() == 0)) {
            ArrayList<Cliente> temp = Base.sGApeCli(
                    Base.park, txt_Apellido1.getText());
            bsqactuaL(temp);
        } else if (!(genero.length() == 0)) {
            ArrayList<Cliente> temp = Base.sGGenCli(
                    Base.parkl, genero);
            bsqactuaL(temp);
        } else if (!(txt_Apellido1.getText().length() == 0 &&
                genero.length() == 0)) {
            ArrayList<Cliente> temp = Base.sGApeGenCli(
                    Base.park, txt_Apellido1.getText(), genero);
            bsqactuaL(temp);
        }
         */
    }//GEN-LAST:event_botonBuscarActionPerformed

    public void mostrarDatos(int seleccionado) {

        txtCedula.setText(listaClientes.get(seleccionado).getCedula());
        txtCedula.setEditable(false);
        txtNombres.setText(listaClientes.get(seleccionado).getNombres());
        txtApellidos.setText(listaClientes.get(seleccionado).getApellidos());
        fechaNa.setDate(listaClientes.get(seleccionado).getFechaNacimiento());
        txtCelular.setText(listaClientes.get(seleccionado).getCelular());
        txtCorreo.setText(listaClientes.get(seleccionado).getCorreo());

        if (listaClientes.get(seleccionado).getGenero().compareTo("M") == 0) {
            rbM.setSelected(true);
            rbF.setSelected(false);
        } else {
            if (listaClientes.get(seleccionado).getGenero().compareTo("F") == 0) {
                rbF.setSelected(true);
                rbM.setSelected(false);
            }
        }
    }

    public void limpiarTbl() {
        String matriz[][] = new String[listaClientes.size()][9];

        for (int i = 0; i < listaClientes.size(); i++) {
            matriz[i][0] = null;
            matriz[i][1] = null;
            matriz[i][2] = null;
            matriz[i][3] = null;
            matriz[i][4] = null;
            matriz[i][5] = null;
            matriz[i][6] = null;
            matriz[i][7] = null;
        }

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Cédula", "Nombres", "Apellidos", "Fecha N.", "Celular", "Correo", "Género"
                }
        ));
    }

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

    public void actualizarDatos() {
        String matriz[][] = new String[listaClientes.size()][9];

        for (int i = 0; i < listaClientes.size(); i++) {
            matriz[i][0] = listaClientes.get(i).getIdCli();
            matriz[i][1] = listaClientes.get(i).getCedula();
            matriz[i][2] = listaClientes.get(i).getNombres();
            matriz[i][3] = listaClientes.get(i).getApellidos();
            matriz[i][4] = listaClientes.get(i).getFechaNacimiento().toString();
            matriz[i][5] = listaClientes.get(i).getCelular();
            matriz[i][6] = listaClientes.get(i).getCorreo();
            matriz[i][7] = listaClientes.get(i).getGenero();
        }

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Cédula", "Nombres", "Apellidos", "Fecha N.", "Celular", "Correo", "Género"
                }
        ));
    }

    private void Eliminar() {
        DefaultTableModel mdl = (DefaultTableModel) tablaClientes.getModel();
        int seleccion = tablaClientes.getSelectedRow();
        if (seleccion < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para eliminar");
        } else {
            int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar esta fila");
            if (JOptionPane.OK_OPTION == confirmar) {
                mdl.removeRow(seleccion);
                JOptionPane.showMessageDialog(null, "Registro completamente eliminado");
                limpiar();
            }

        }

        /*
        int index = tbl_Cliente.getSelectedRow();
        String isNumber = clients.get(index).getCedula();
        Base.eliminarCliente(Base.park, isNumber);
        limpiarTbl();
        clients.clear();
        ArrayList<Cliente> temp = Base.sGCedCli(
                    Base.park, isNumber);
        for (int i = 0; i < temp.size(); i++) {
            clients.add(temp.get(i));
        }
        actualizarClients();
         */
    }

    public void modificar() {

        int indexSlct = tablaClientes.getSelectedRow();
        if (indexSlct != -1) {

            listaClientes.get(indexSlct).setCedula(txtCedula.getText());
            listaClientes.get(indexSlct).setNombres(txtNombres.getText());
            listaClientes.get(indexSlct).setApellidos(txtApellidos.getText());
            listaClientes.get(indexSlct).setFechaNacimiento((Date) fechaNa.getDate());
            listaClientes.get(indexSlct).setCelular(txtCelular.getText());
            listaClientes.get(indexSlct).setCorreo(txtCorreo.getText());
            limpiar();
            actualizarDatos();

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
    private javax.swing.JButton MOSTRAR;
    private javax.swing.ButtonGroup b_GroupClientes;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
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
    // End of variables declaration//GEN-END:variables
}
