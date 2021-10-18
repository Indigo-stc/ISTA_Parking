package Ventanas;

import ConexionPG.PgConect;
import entidades.Empleado;
import Validaciones.Val;
import java.sql.Statement;
import java.sql.Connection;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Date;

public class REmpleado extends javax.swing.JFrame {

    String genero = null;
    DefaultTableModel dtm;

    public REmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            buscar(" ", " ");
        } catch (SQLException ex) {
            Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            tblModelo();
        } catch (SQLException ex) {
            Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void tblModelo() throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        tblEmpleados.setModel(modelo);
        PgConect con = new PgConect();
        ResultSet empleados = con.mostrarEmp();
        ResultSetMetaData rsmd = empleados.getMetaData();
        int columns = rsmd.getColumnCount(); 
        
        modelo.addColumn("ID Empleado");
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Rol");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("F.Nacimiento");
        modelo.addColumn("Correo");
        modelo.addColumn("Celular");
        modelo.addColumn("Genero");
        
        while(empleados.next()) {
            Object[] filas = new Object[columns];
            for (int i = 0; i < columns; i++) {
                filas[i] = empleados.getObject(i+1);
            }
            modelo.addRow(filas);
        }
    }
    
    private void cbxModel() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_GroupEmpleados = new javax.swing.ButtonGroup();
        lblApellidosEmp = new javax.swing.JLabel();
        lblEmpleados = new javax.swing.JLabel();
        lblCedulaEmp = new javax.swing.JLabel();
        lblNombresEmp = new javax.swing.JLabel();
        lblCelularmp1 = new javax.swing.JLabel();
        lblCorreomp3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        botonRegistrar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        lblVfyCedula = new javax.swing.JLabel();
        lblVfyNombres = new javax.swing.JLabel();
        lblVfyApellido = new javax.swing.JLabel();
        lblVfyCorreo = new javax.swing.JLabel();
        lblVfyCelular = new javax.swing.JLabel();
        lblVfyUsu = new javax.swing.JLabel();
        lblVfyContra = new javax.swing.JLabel();
        lblVfyFecha = new javax.swing.JLabel();
        lblVfyRol = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        rbM = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();
        fecha = new com.toedter.calendar.JDateChooser();
        cbRol = new javax.swing.JComboBox<>();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        lblGeneromp = new javax.swing.JLabel();
        lblFechaNEmp4 = new javax.swing.JLabel();
        lblCargoEmp3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblempleadoxd = new javax.swing.JLabel();
        lbcerrar = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblApellidosEmp.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblApellidosEmp.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidosEmp.setText("Apellidos:");
        getContentPane().add(lblApellidosEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        lblEmpleados.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        lblEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleados.setText("¡REGISTRO EMPLEADOS!");
        getContentPane().add(lblEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 30));

        lblCedulaEmp.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblCedulaEmp.setForeground(new java.awt.Color(255, 255, 255));
        lblCedulaEmp.setText("Cédula:");
        getContentPane().add(lblCedulaEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        lblNombresEmp.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblNombresEmp.setForeground(new java.awt.Color(255, 255, 255));
        lblNombresEmp.setText("Nombres:");
        getContentPane().add(lblNombresEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        lblCelularmp1.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblCelularmp1.setForeground(new java.awt.Color(255, 255, 255));
        lblCelularmp1.setText("Celular:");
        getContentPane().add(lblCelularmp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        lblCorreomp3.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblCorreomp3.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreomp3.setText("Correo:");
        getContentPane().add(lblCorreomp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

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
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 170, -1));

        txtNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresFocusLost(evt);
            }
        });
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 170, -1));

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 170, -1));

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
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 170, -1));

        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, -1));

        tblEmpleados.setFont(new java.awt.Font("Cascadia Code", 1, 10)); // NOI18N
        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "idEmp", "cedula", "nombre", "apellido", "rol", "fechanac", "usuario", "contraseña", "correo", "celular", "genero"
            }
        ));
        tblEmpleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblEmpleadosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);
        if (tblEmpleados.getColumnModel().getColumnCount() > 0) {
            tblEmpleados.getColumnModel().getColumn(0).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(0).setHeaderValue("idEmp");
            tblEmpleados.getColumnModel().getColumn(1).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(1).setHeaderValue("cedula");
            tblEmpleados.getColumnModel().getColumn(2).setHeaderValue("nombre");
            tblEmpleados.getColumnModel().getColumn(3).setHeaderValue("apellido");
            tblEmpleados.getColumnModel().getColumn(4).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(4).setHeaderValue("rol");
            tblEmpleados.getColumnModel().getColumn(5).setHeaderValue("fechanac");
            tblEmpleados.getColumnModel().getColumn(6).setHeaderValue("usuario");
            tblEmpleados.getColumnModel().getColumn(7).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(7).setHeaderValue("contraseña");
            tblEmpleados.getColumnModel().getColumn(8).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(8).setHeaderValue("correo");
            tblEmpleados.getColumnModel().getColumn(9).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(9).setHeaderValue("celular");
            tblEmpleados.getColumnModel().getColumn(10).setHeaderValue("genero");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 940, 170));

        botonRegistrar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        botonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardar.png"))); // NOI18N
        botonRegistrar.setText("REGISTRAR");
        botonRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 180, 40));

        botonEliminar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBorrar.png"))); // NOI18N
        botonEliminar.setText("ELIMINAR");
        botonEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 170, 40));

        botonLimpiar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        botonLimpiar.setText("CANCELAR");
        botonLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 170, 40));

        lblVfyCedula.setBackground(new java.awt.Color(255, 0, 0));
        lblVfyCedula.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVfyCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 170, 10));

        lblVfyNombres.setBackground(new java.awt.Color(255, 0, 0));
        lblVfyNombres.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVfyNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 170, 10));

        lblVfyApellido.setBackground(new java.awt.Color(255, 0, 0));
        lblVfyApellido.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVfyApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 170, 10));

        lblVfyCorreo.setBackground(new java.awt.Color(255, 0, 0));
        lblVfyCorreo.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVfyCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 170, 10));

        lblVfyCelular.setBackground(new java.awt.Color(255, 0, 0));
        lblVfyCelular.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVfyCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 170, 10));
        getContentPane().add(lblVfyUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 170, 10));
        getContentPane().add(lblVfyContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 170, 10));
        getContentPane().add(lblVfyFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 170, 10));
        getContentPane().add(lblVfyRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 170, 10));

        botonSalir.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/taskbar_start_menu.png"))); // NOI18N
        botonSalir.setText("Menú");
        botonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 50));

        b_GroupEmpleados.add(rbM);
        rbM.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        rbM.setForeground(new java.awt.Color(255, 255, 255));
        rbM.setText("M");
        rbM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMMouseClicked(evt);
            }
        });
        getContentPane().add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 50, -1));

        b_GroupEmpleados.add(rbF);
        rbF.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        rbF.setForeground(new java.awt.Color(255, 255, 255));
        rbF.setText("F");
        rbF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbFMouseClicked(evt);
            }
        });
        getContentPane().add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 50, -1));

        fecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaFocusLost(evt);
            }
        });
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 170, -1));

        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Administrador", "Registrador", "Seguridad", "Limpieza", "Invitado" }));
        cbRol.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbRolFocusLost(evt);
            }
        });
        getContentPane().add(cbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 170, -1));

        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 170, -1));

        txtContra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraFocusLost(evt);
            }
        });
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 170, -1));

        lblGeneromp.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblGeneromp.setForeground(new java.awt.Color(255, 255, 255));
        lblGeneromp.setText("Género:");
        getContentPane().add(lblGeneromp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        lblFechaNEmp4.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblFechaNEmp4.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNEmp4.setText("Fecha N:");
        getContentPane().add(lblFechaNEmp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        lblCargoEmp3.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblCargoEmp3.setForeground(new java.awt.Color(255, 255, 255));
        lblCargoEmp3.setText("Cargo:");
        getContentPane().add(lblCargoEmp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 70, 30));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 110, 20));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 140, -1));

        lblBuscar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/find.png"))); // NOI18N
        lblBuscar.setText("Busqueda");
        getContentPane().add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 120, -1));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 520, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/kuser.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        lblempleadoxd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/beos_menu.png"))); // NOI18N
        getContentPane().add(lblempleadoxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, -1, -1));

        lbcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        lbcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbcerrarActionPerformed(evt);
            }
        });
        getContentPane().add(lbcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 20, 20));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOCOLOR2.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        PgConect conect = new PgConect();
        
        try {
            if (conect.perEmpl(txtCedula.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Registro existente");
            } else if (!Val.isNumber(txtCedula.getText())||
                    Val.hollow(txtNombres.getText()) ||
                    Val.hollow(txtApellidos.getText()) ||
                    !Val.email(txtCorreo.getText()) ||
                    !(rbM.isSelected() || rbF.isSelected()) ||
                    !Val.isNumber(txtCelular.getText()) ||
                    !Val.edad(fecha.getDate()) ||
                    cbRol.getSelectedIndex() == 0 ) {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            } else {
                Empleado emp = new Empleado(txtCedula.getText(), txtNombres.getText(),
                        txtApellidos.getText(), txtUsuario.getText(), txtContra.getText(),
                        fecha.getDate(), txtCelular.getText(),
                        txtCorreo.getText(), genero, cbRol.getSelectedItem().toString());
                if (conect.pkPerson(emp.getCedula())) {
                    System.out.println("solo empleado");
                    ResultSet idRol = conect.rol(emp.getCargo());
                    if (idRol.next()) {
                        conect.insEmp(emp.getId_Emp(), idRol.getString("idrol"), emp.getCedula(),
                                emp.getUsuario(), emp.getContraseña());
                        JOptionPane.showMessageDialog(rootPane, "Empleado guardado");
                        tblModelo();
                        limpiar();
                    } 
                } else {
                    System.out.println("persona y empleado");
                    ResultSet idRol = conect.rol(emp.getCargo());
                    if (idRol.next()) {
                        conect.insPer(emp.getCedula(), emp.getNombres(),
                                emp.getApellidos(), emp.getFechaNacimiento(), emp.getCelular(),
                                emp.getCorreo(), emp.getGenero());
                        conect.insEmp(emp.getId_Emp(), idRol.getString("idrol"), emp.getCedula(),
                                (emp.getUsuario() == null ? "   " : emp.getUsuario()), 
                                (emp.getContraseña() == null ? "   " : emp.getContraseña()));
                        JOptionPane.showMessageDialog(rootPane, "Empleado guardado");
                        tblModelo();
                        limpiar();
                    } 
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void rbMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMMouseClicked
        genero = rbM.getText();
    }//GEN-LAST:event_rbMMouseClicked

    private void rbFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbFMouseClicked
        genero = rbF.getText();
    }//GEN-LAST:event_rbFMouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        try {
            String idEmp = tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 0).toString();
            PgConect con = new PgConect();
            con.elimEmp(idEmp);
            tblModelo();
        } catch (SQLException ex) {
            Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        if (!Val.isNumber(txtCedula.getText())) {
            lblVfyCedula.setText("Deben ser 10 digitos");
        } else if (!Val.digVfy(txtCedula.getText())) {
            lblVfyCedula.setText("No es una cedula");
        } else {
            lblVfyCedula.setText(null);
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
                        b_GroupEmpleados.setSelected(rbM.getModel(), true);
                    }  else if (gen.equalsIgnoreCase("F")) {
                        b_GroupEmpleados.setSelected(rbF.getModel(), true);
                    }
                    fecha.setDate(utilDate);
                }
            } catch (SQLException ex) {
                Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtNombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusLost
        if (Val.hollow(txtNombres.getText())) {
            lblVfyNombres.setText("Campo Obligatorio");
        } else {
            lblVfyNombres.setText(null);
        }
    }//GEN-LAST:event_txtNombresFocusLost

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
        if (Val.hollow(txtApellidos.getText())) {
            lblVfyApellido.setText("Campo Obligatorio");
        } else {
            lblVfyApellido.setText(null);
        }
    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        if (!Val.isNumber(txtCelular.getText())) {
            lblVfyCelular.setText("Deben ser 10 difgitos");
        } else {
            lblVfyCelular.setText(null);
        }
    }//GEN-LAST:event_txtCelularFocusLost

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if (!Val.email(txtCorreo.getText())) {
            lblVfyCorreo.setText("No es un correo");
        } else {
            lblVfyCorreo.setText(null);
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
                || Val.isNumber(txtCedula.getText())) {
            getToolkit();
            evt.consume();
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

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (!Val.usuario(txtUsuario.getText())) {
            lblVfyUsu.setText("Deben ser de 8 a 9 caracteres");
        } else {
            lblVfyUsu.setText(null);
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void cbRolFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbRolFocusLost
        if (cbRol.getSelectedIndex() == 0) {
            lblVfyRol.setText("Escoger un cargo");
        } else {
            lblVfyRol.setText(null);
        }
    }//GEN-LAST:event_cbRolFocusLost

    private void txtContraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraFocusLost
        if (!Val.contraseña(txtContra.getText())) {
            lblVfyContra.setText("Al menos 1 mayus, 1 num ,1 simb 8carateres");
        } else {
            lblVfyContra.setText(null);
        }
    }//GEN-LAST:event_txtContraFocusLost

    private void fechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaFocusLost
        if (!Val.edad(fecha.getDate())) {
            lblVfyFecha.setText("Menor de edad");
        } else {
            lblVfyFecha.setText(null);
        } 
    }//GEN-LAST:event_fechaFocusLost


    private void tblEmpleadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmpleadosKeyReleased
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
              
            String idEmp = tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 0).toString();
            String cedula =  tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 1).toString();
            String nombre =  tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 2).toString();
            String apellido =  tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 3).toString();
            String rol =  tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 4).toString();
            String usuario = tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 5).toString();
            String contraseña = tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 6).toString();
            Date fechanac =  (Date) tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 7);
            String correo =  tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 8).toString();
            String celular =  tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 9).toString();
            String genero =  tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 10).toString();
            
            PgConect con = new PgConect();
            con.modificarPer(cedula, nombre, apellido, (java.sql.Date) fechanac, celular, correo, genero);
            con.modificarEmp(idEmp, usuario, contraseña);
            
        }
    }//GEN-LAST:event_tblEmpleadosKeyReleased

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        try {
            buscar(txtBuscar.getText(), txtBuscar.getText());
        } catch (SQLException ex) {
            Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void lbcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbcerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_lbcerrarActionPerformed

    public void limpiar() {
        txtCedula.setText(null);
        txtNombres.setText(null);
        txtApellidos.setText(null);
        fecha.setDate(null);
        txtCorreo.setText(null);
        txtCelular.setText(null);
        b_GroupEmpleados.setSelected(rbM.getModel(), false);
        b_GroupEmpleados.setSelected(rbF.getModel(), false);
        txtUsuario.setText(null);
        txtContra.setText(null);
        cbRol.setSelectedIndex(0);
        lblVfyCedula.setText(null);
        lblVfyNombres.setText(null);
        lblVfyApellido.setText(null);
        lblVfyFecha.setText(null);
        lblVfyRol.setText(null);
        lblVfyUsu.setText(null);
        lblVfyContra.setText(null);
        lblVfyCorreo.setText(null); 
        
    }
    
    public void buscar(String nombre, String cedula) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        PgConect conec = new PgConect();
        Connection conectar = conec.Conectar();

        modelo.addColumn("ID Empleado");
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Rol");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("F.Nacimiento");
        modelo.addColumn("Correo");
        modelo.addColumn("Celular");
        modelo.addColumn("Genero");
        tblEmpleados.setModel(modelo);
        String sql = " ";
        if (nombre.equals(" ")) {
            sql = " SELECT idempleado, empleados.cedula, nombre, apellido, "
                    + "rolnombre, usuario, contraseña, fechanac, correo, celular, genero "
                    + " FROM empleados, personas, roles "
                    + " WHERE personas.cedula = empleados.cedula AND empleados.idrol = roles.idrol;";
        } else {
            sql = " SELECT idempleado, empleados.cedula, nombre, apellido, "
                    + "rolnombre, usuario, contraseña, fechanac, correo, celular, genero "
                    + " FROM empleados, personas, roles "
                    + " WHERE personas.cedula = empleados.cedula AND "
                    + "empleados.idrol = roles.idrol AND nombre like '%" + nombre + "%';";
        }
        String Usuarios[] = new String[11];
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
                Usuarios[8] = resul.getString(9);
                Usuarios[9] = resul.getString(10);
                Usuarios[10] = resul.getString(11);
                modelo.addRow(Usuarios);

            }
            tblEmpleados.setModel(modelo);
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
                new REmpleado().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup b_GroupEmpleados;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> cbRol;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lbcerrar;
    private javax.swing.JLabel lblApellidosEmp;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCargoEmp3;
    private javax.swing.JLabel lblCedulaEmp;
    private javax.swing.JLabel lblCelularmp1;
    private javax.swing.JLabel lblCorreomp3;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblFechaNEmp4;
    private javax.swing.JLabel lblGeneromp;
    private javax.swing.JLabel lblNombresEmp;
    private javax.swing.JLabel lblVfyApellido;
    private javax.swing.JLabel lblVfyCedula;
    private javax.swing.JLabel lblVfyCelular;
    private javax.swing.JLabel lblVfyContra;
    private javax.swing.JLabel lblVfyCorreo;
    private javax.swing.JLabel lblVfyFecha;
    private javax.swing.JLabel lblVfyNombres;
    private javax.swing.JLabel lblVfyRol;
    private javax.swing.JLabel lblVfyUsu;
    private javax.swing.JLabel lblempleadoxd;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
