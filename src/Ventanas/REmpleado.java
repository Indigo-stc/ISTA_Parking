package Ventanas;

import ConexionPG.PgConect;
import Lógica.Empleado;
import Validaciones.Val;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class REmpleado extends javax.swing.JFrame {

    public static ArrayList<Empleado> listaEmpleados = new ArrayList();

    String genero = null;
    DefaultTableModel dtm;

    public REmpleado() {
        initComponents();
        setLocationRelativeTo(null);
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
        comboCargo = new javax.swing.JComboBox<>();
        txtCedula = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        rbF = new javax.swing.JRadioButton();
        rbM = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        fecha = new com.toedter.calendar.JDateChooser();
        botonRegistrar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        MOSTRAR = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        lblVerificarCedula = new javax.swing.JLabel();
        lblverificarNombres = new javax.swing.JLabel();
        lblVerificarApellido = new javax.swing.JLabel();
        lblverificarCorreo = new javax.swing.JLabel();
        lblVerfiCelular = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblvrfUsu = new javax.swing.JLabel();
        lblvrfContra = new javax.swing.JLabel();
        lblvrfFecha = new javax.swing.JLabel();
        lblvrfCargo = new javax.swing.JLabel();
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

        comboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Administrador", "Registrador", "Seguridad", "Limpieza", "Invitado" }));
        comboCargo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboCargoFocusLost(evt);
            }
        });
        getContentPane().add(comboCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 170, -1));

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
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
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
        rbF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFActionPerformed(evt);
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

        tablaEmpleados.setFont(new java.awt.Font("Cascadia Code", 1, 10)); // NOI18N
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cédula", "Nombres", "Apellidos", "Cargo", "Fecha N.", "Correo", "Celular", "Genero"
            }
        ));
        tablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados);

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

        MOSTRAR.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        MOSTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoMostrar.png"))); // NOI18N
        MOSTRAR.setText("MOSTRAR");
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });
        getContentPane().add(MOSTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 150, 40));

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

        lblVerificarCedula.setBackground(new java.awt.Color(255, 0, 0));
        lblVerificarCedula.setForeground(new java.awt.Color(255, 0, 0));
        lblVerificarCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblVerificarCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(lblVerificarCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, 10));

        lblverificarNombres.setBackground(new java.awt.Color(255, 0, 0));
        lblverificarNombres.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblverificarNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, 10));

        lblVerificarApellido.setBackground(new java.awt.Color(255, 0, 0));
        lblVerificarApellido.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVerificarApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 170, 10));

        lblverificarCorreo.setBackground(new java.awt.Color(255, 0, 0));
        lblverificarCorreo.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblverificarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 170, 10));

        lblVerfiCelular.setBackground(new java.awt.Color(255, 0, 0));
        lblVerfiCelular.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblVerfiCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 170, 10));

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
        getContentPane().add(lblvrfUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 170, 10));
        getContentPane().add(lblvrfContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 170, 20));
        getContentPane().add(lblvrfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 170, 20));
        getContentPane().add(lblvrfCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 200, 20));

        jPanel1.setBackground(new java.awt.Color(54, 77, 103));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFActionPerformed

    }//GEN-LAST:event_rbFActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        PgConect conect = new PgConect(); 
        try {
            if (conect.pkPerson(txtCedula.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Registro existente");
            } else if (!Val.isNumber(txtCedula.getText())||
                    Val.hollow(txtNombres.getText()) ||
                    Val.hollow(txtApellidos.getText()) ||
                    !Val.email(txtCorreo.getText()) ||
                    !(rbM.isSelected() || rbF.isSelected()) ||
                    !Val.isNumber(txtCelular.getText()) ||
                    !Val.edad(fecha.getDate()) ||
                    comboCargo.getSelectedIndex() == 0 ) {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            } else {
                Empleado emp = new Empleado(txtCedula.getText(), txtNombres.getText(),
                        txtApellidos.getText(), txtUsuario.getText(), txtContra.getText(),
                        fecha.getDate(), txtCelular.getText(),
                        txtCorreo.getText(), genero, comboCargo.getSelectedItem().toString());
               
                ResultSet idRol = conect.rol(emp.getCargo());
                if (idRol.next()) {
                    conect.insPer(emp.getCedula(), emp.getNombres(),
                            emp.getApellidos(), emp.getFechaNacimiento(), emp.getCelular(),
                            emp.getCorreo(), emp.getGenero());
                    conect.insEmp(emp.getId_Emp(), idRol.getString("idrol"), emp.getCedula(),
                            emp.getUsuario(), emp.getContraseña());
                    JOptionPane.showMessageDialog(rootPane, "Empleado guardado");
                    actualizarDatos();
                    limpiar();
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

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed

    }//GEN-LAST:event_txtNombresActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        PgConect conect = new PgConect();
        int index = tablaEmpleados.getSelectedRow();
        String cedula = listaEmpleados.get(index).getCedula();
        if (conect.eliminarEmp(cedula)) {
            try {
                ArrayList<Empleado> temp = conect.mostrar();
                listaEmpleados.clear();
                for (int i = 0; i < temp.size(); i++) {
                    listaEmpleados.add(temp.get(i));
                }
                actualizarDatos();

            } catch (SQLException ex) {
                Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(rootPane, "Eliminado exitosamente");
        } else {
            JOptionPane.showMessageDialog(rootPane, "No eliminado   ");
        }
        limpiar();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void tablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadosMouseClicked
        int indexSlct = tablaEmpleados.getSelectedRow();
        mostrarDatos(indexSlct);
    }//GEN-LAST:event_tablaEmpleadosMouseClicked

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
//        PgConect conect = new PgConect();
//        int index = tablaEmpleados.getSelectedRow();
//        String cedula = listaEmpleados.get(index).getCedula();
//        conect.modificar(cedula, cedula, cedula, genero, cedula);
//        try {
//            ArrayList<Personas> temp = Personas.all();
//            listaPersona.clear();
//            for (int i = 0; i < temp.size(); i++) {
//                listaPersona.add(temp.get(i));
//            }
//            actualizarDatos();
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        limpiar();
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
        PgConect conect = new PgConect();
        try {
            ArrayList<Empleado> tempo = conect.mostrar();
            listaEmpleados.clear();
            for (int i = 0; i < tempo.size(); i++) {
                listaEmpleados.add(tempo.get(i));
            }
            actualizarDatos();
        } catch (SQLException ex) {
            Logger.getLogger(REmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
    }//GEN-LAST:event_MOSTRARActionPerformed

    private void lblVerificarCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblVerificarCedulaKeyTyped
        
    }//GEN-LAST:event_lblVerificarCedulaKeyTyped

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        if (!Val.isNumber(txtCedula.getText())) {
            lblVerificarCedula.setText("Deben ser 10 digitos");
        } else if (!Val.digVfy(txtCedula.getText())) {
            lblVerificarCedula.setText("No es una cedula");
        } else {
            lblVerificarCedula.setText(null);
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtNombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusLost
        if (Val.hollow(txtNombres.getText())) {
            lblverificarNombres.setText("Campo Obligatorio");
        } else {
            lblverificarNombres.setText(null);
        }
    }//GEN-LAST:event_txtNombresFocusLost

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
        if (Val.hollow(txtApellidos.getText())) {
            lblVerificarApellido.setText("Campo Obligatorio");
        } else {
            lblVerificarApellido.setText(null);
        }
    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        if (!Val.isNumber(txtCelular.getText())) {
            lblVerfiCelular.setText("Deben ser 10 difgitos");
        } else {
            lblVerfiCelular.setText(null);
        }
    }//GEN-LAST:event_txtCelularFocusLost

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if (!Val.email(txtCorreo.getText())) {
            lblverificarCorreo.setText("No es un correo");
        } else {
            lblverificarCorreo.setText(null);
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
            lblvrfUsu.setText("Deben ser de 8 a 9 caracteres");
        } else {
            lblvrfUsu.setText(null);
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void comboCargoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboCargoFocusLost
        if (comboCargo.getSelectedIndex() == 0) {
            lblvrfCargo.setText("Escoger un cargo");
        } else {
            lblvrfCargo.setText(null);
        }
    }//GEN-LAST:event_comboCargoFocusLost

    private void txtContraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraFocusLost
        if (!Val.contraseña(txtContra.getText())) {
            lblvrfContra.setText("Al menos 1 mayus, 1 num ,1 simb 8carateres");
        } else {
            lblvrfContra.setText(null);
        }
    }//GEN-LAST:event_txtContraFocusLost

    private void fechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaFocusLost
        if (!Val.edad(fecha.getDate())) {
            lblvrfFecha.setText("Menor de edad");
        } else {
            lblvrfFecha.setText(null);
        } 
    }//GEN-LAST:event_fechaFocusLost

//    private void Busqueda(String isNumber) {
//        System.out.println("Busqueda");
//
//        List<Empleado> emp = new ArrayList <> ();
//
//        emp = listaEmpleados.stream().filter(x -> x.getCedula().equals(isNumber)).collect(Collectors.toList());
//        System.out.println(emp);
//        dtm.setNumRows(0);
//        emp.stream().forEach(e -> {
//
//            String fila[] = {e.getCedula(), e.getNombres(), e.getApellidos(), e.getCargo(), e.getCorreo(),
//                e.getCelular(), e.getGenero()};
//
//            dtm.addRow(fila);
//
//        });
//    }
    public void mostrarDatos(int seleccionado) {

        txtCedula.setText(listaEmpleados.get(seleccionado).getCedula());
        txtCedula.setEditable(false);
        txtNombres.setText(listaEmpleados.get(seleccionado).getNombres());
        txtApellidos.setText(listaEmpleados.get(seleccionado).getApellidos());
        fecha.setDate(listaEmpleados.get(seleccionado).getFechaNacimiento());
        txtCorreo.setText(listaEmpleados.get(seleccionado).getCorreo());
        txtCelular.setText(listaEmpleados.get(seleccionado).getCelular());
        if (listaEmpleados.get(seleccionado).getGenero().compareTo("M") == 0) {
            rbM.setSelected(true);
            rbF.setSelected(false);
        } else {
            if (listaEmpleados.get(seleccionado).getGenero().compareTo("F") == 0) {
                rbF.setSelected(true);
                rbM.setSelected(false);
            }
        }
    }

    public void limpiar() {
        txtCedula.setText(null);
        txtNombres.setText(null);
        txtApellidos.setText(null);
        fecha.setDate(null);
        txtCorreo.setText(null);
        txtCelular.setText(null);
        b_GroupEmpleados.setSelected(rbM.getModel(), false);
        b_GroupEmpleados.setSelected(rbF.getModel(), false);
        comboCargo.setSelectedIndex(0);
    }

    public void actualizarDatos() {

        String matriz[][] = new String[listaEmpleados.size()][10];
        for (int i = 0; i < listaEmpleados.size(); i++) {

            matriz[i][0] = listaEmpleados.get(i).getId_Emp();
            matriz[i][1] = listaEmpleados.get(i).getCedula();
            matriz[i][2] = listaEmpleados.get(i).getNombres();
            matriz[i][3] = listaEmpleados.get(i).getApellidos();
            matriz[i][4] = listaEmpleados.get(i).getCargo();
            matriz[i][5] = listaEmpleados.get(i).getFechaNacimiento().toString();
            matriz[i][6] = listaEmpleados.get(i).getCorreo();
            matriz[i][7] = listaEmpleados.get(i).getCelular();
            matriz[i][8] = listaEmpleados.get(i).getGenero();
        }
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Cédula", "Nombres", "Apellidos", "Cargo", "Fecha N.", "Correo", "Celular", "Genero"
                }
        ));
    }

    private void Eliminar() {
        DefaultTableModel mdl = (DefaultTableModel) tablaEmpleados.getModel();
        int seleccion = tablaEmpleados.getSelectedRow();
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
    }

    public void modificar() {

        int indexSlct = tablaEmpleados.getSelectedRow();
        if (indexSlct != -1) {
            listaEmpleados.get(indexSlct).setCedula(txtCedula.getText());
            listaEmpleados.get(indexSlct).setNombres(txtNombres.getText());
            listaEmpleados.get(indexSlct).setApellidos(txtApellidos.getText());
            listaEmpleados.get(indexSlct).setFechaNacimiento(fecha.getDate());
            listaEmpleados.get(indexSlct).setCorreo(txtCorreo.getText());
            listaEmpleados.get(indexSlct).setCelular(txtCelular.getText());
            limpiar();
            actualizarDatos();

            /*
            
             */
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
    private javax.swing.JButton MOSTRAR;
    private javax.swing.ButtonGroup b_GroupEmpleados;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> comboCargo;
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
    private javax.swing.JLabel lblVerfiCelular;
    private javax.swing.JLabel lblVerificarApellido;
    private javax.swing.JLabel lblVerificarCedula;
    private javax.swing.JLabel lblverificarCorreo;
    private javax.swing.JLabel lblverificarNombres;
    private javax.swing.JLabel lblvrfCargo;
    private javax.swing.JLabel lblvrfContra;
    private javax.swing.JLabel lblvrfFecha;
    private javax.swing.JLabel lblvrfUsu;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
