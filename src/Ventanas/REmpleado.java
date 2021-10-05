package Ventanas;

import ConexionPG.PgConect;
import entidades.Empleado;
import Validaciones.Val;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Date;

public class REmpleado extends javax.swing.JFrame {

    public static ArrayList<Empleado> listaEmpleados = new ArrayList();

    String genero = null;
    DefaultTableModel dtm;

    public REmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            tblModelo();
        } catch (SQLException ex) {
            Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tblModelo() throws SQLException {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_GroupEmpleados = new javax.swing.ButtonGroup();
        lblApellidosEmp = new javax.swing.JLabel();
        lblEmpleados = new javax.swing.JLabel();
        lblCedulaEmp = new javax.swing.JLabel();
        lblNombresEmp = new javax.swing.JLabel();
        lblCargoEmp3 = new javax.swing.JLabel();
        lblFechaNEmp4 = new javax.swing.JLabel();
        lblGeneromp = new javax.swing.JLabel();
        lblCelularmp1 = new javax.swing.JLabel();
        lblCorreomp3 = new javax.swing.JLabel();
        cbRol = new javax.swing.JComboBox<>();
        txtCedula = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        rbF = new javax.swing.JRadioButton();
        rbM = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        fecha = new com.toedter.calendar.JDateChooser();
        botonRegistrar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        lblVfyCedula = new javax.swing.JLabel();
        lblVfyNombres = new javax.swing.JLabel();
        lblVfyApellido = new javax.swing.JLabel();
        lblVfyCorreo = new javax.swing.JLabel();
        lblVfyCelular = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblVfyUsu = new javax.swing.JLabel();
        lblVfyContra = new javax.swing.JLabel();
        lblVfyFecha = new javax.swing.JLabel();
        lblVfyRol = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblApellidosEmp.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblApellidosEmp.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidosEmp.setText("Apellidos:");
        getContentPane().add(lblApellidosEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblEmpleados.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        lblEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleados.setText("EMPLEADOS");
        getContentPane().add(lblEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 30));

        lblCedulaEmp.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblCedulaEmp.setForeground(new java.awt.Color(255, 255, 255));
        lblCedulaEmp.setText("Cédula:");
        getContentPane().add(lblCedulaEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblNombresEmp.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblNombresEmp.setForeground(new java.awt.Color(255, 255, 255));
        lblNombresEmp.setText("Nombres:");
        getContentPane().add(lblNombresEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lblCargoEmp3.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblCargoEmp3.setForeground(new java.awt.Color(255, 255, 255));
        lblCargoEmp3.setText("Cargo:");
        getContentPane().add(lblCargoEmp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 70, 30));

        lblFechaNEmp4.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblFechaNEmp4.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNEmp4.setText("Fecha N:");
        getContentPane().add(lblFechaNEmp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        lblGeneromp.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblGeneromp.setForeground(new java.awt.Color(255, 255, 255));
        lblGeneromp.setText("Género:");
        getContentPane().add(lblGeneromp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        lblCelularmp1.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblCelularmp1.setForeground(new java.awt.Color(255, 255, 255));
        lblCelularmp1.setText("Celular:");
        getContentPane().add(lblCelularmp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        lblCorreomp3.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblCorreomp3.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreomp3.setText("Correo:");
        getContentPane().add(lblCorreomp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Administrador", "Registrador", "Seguridad", "Limpieza", "Invitado" }));
        cbRol.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbRolFocusLost(evt);
            }
        });
        getContentPane().add(cbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 170, -1));

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
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 170, -1));

        txtNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresFocusLost(evt);
            }
        });
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 170, -1));

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
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 170, -1));

        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 170, -1));

        b_GroupEmpleados.add(rbF);
        rbF.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        rbF.setForeground(new java.awt.Color(255, 255, 255));
        rbF.setText("F");
        rbF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbFMouseClicked(evt);
            }
        });
        getContentPane().add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 50, -1));

        b_GroupEmpleados.add(rbM);
        rbM.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        rbM.setForeground(new java.awt.Color(255, 255, 255));
        rbM.setText("M");
        rbM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMMouseClicked(evt);
            }
        });
        getContentPane().add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 50, -1));

        tblEmpleados.setFont(new java.awt.Font("Cascadia Code", 1, 10)); // NOI18N
        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblEmpleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblEmpleadosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 820, 170));

        fecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaFocusLost(evt);
            }
        });
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 170, -1));

        botonRegistrar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardar.png"))); // NOI18N
        botonRegistrar.setText("REGISTRAR");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, 40));

        botonEliminar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBorrar.png"))); // NOI18N
        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 150, 40));

        botonModificar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditar.png"))); // NOI18N
        botonModificar.setText("MODIFICAR");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 150, 40));

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/find.png"))); // NOI18N
        botonBuscar.setText("BUSCAR");
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 110, 30));

        botonLimpiar.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLimpiar.png"))); // NOI18N
        botonLimpiar.setText("LIMPIAR");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 130, 40));

        botonSalir.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 100, -1));

        lblVfyCedula.setBackground(new java.awt.Color(255, 0, 0));
        lblVfyCedula.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVfyCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, 10));

        lblVfyNombres.setBackground(new java.awt.Color(255, 0, 0));
        lblVfyNombres.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVfyNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, 10));

        lblVfyApellido.setBackground(new java.awt.Color(255, 0, 0));
        lblVfyApellido.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVfyApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 170, 10));

        lblVfyCorreo.setBackground(new java.awt.Color(255, 0, 0));
        lblVfyCorreo.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVfyCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 170, 10));

        lblVfyCelular.setBackground(new java.awt.Color(255, 0, 0));
        lblVfyCelular.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVfyCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 170, 10));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 110, 20));

        txtContra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraFocusLost(evt);
            }
        });
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 170, -1));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 140, -1));

        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 170, -1));
        getContentPane().add(lblVfyUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 170, 10));
        getContentPane().add(lblVfyContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 170, 20));
        getContentPane().add(lblVfyFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 170, 20));
        getContentPane().add(lblVfyRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 200, 20));

        jPanel1.setBackground(new java.awt.Color(54, 77, 103));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

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
                                emp.getUsuario(), emp.getContraseña());
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

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        
    }//GEN-LAST:event_botonModificarActionPerformed

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
        System.exit(0);
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
            Date fechanac =  (Date) tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 5);
            String usuario = tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 6).toString();
            String contraseña = tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 7).toString();
            String correo =  tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 8).toString();
            String celular =  tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 9).toString();
            String gender =  tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 10).toString();
            
            PgConect con = new PgConect();
            con.modificarPer(cedula, nombre, apellido, fechanac, celular, correo, gender);
            con.modificarEmp(idEmp, usuario, contraseña);
        }
    }//GEN-LAST:event_tblEmpleadosKeyReleased

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
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> cbRol;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidosEmp;
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
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
