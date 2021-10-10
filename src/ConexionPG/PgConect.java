package ConexionPG;

import entidades.Persona;
import entidades.Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;

public class PgConect {

    Connection conex;
    Statement stat;
    ResultSet rSet;

    String cadConexion = "jdbc:postgresql://localhost:5432/BASE";
    String pgUser = "postgres";
    String pgPassword = "1234";

    public PgConect() {

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Se Cargo Driver.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conex = DriverManager.getConnection(cadConexion, pgUser, pgPassword);
            System.out.println("Se conecto DB.");
        } catch (SQLException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public SQLException noQuery(String nsql) {
        System.out.println(nsql);
        try {
            stat = conex.createStatement();
            stat.execute(nsql);
            stat.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }

    public ResultSet query(String sql) {
        System.out.println(sql);
        try {
            stat = conex.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            //stat.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet login(String usuario, String contraseña) throws SQLException {
        String query = "SELECT usuario, contraseña, empleados.idrol, rolnombre "
                + "FROM empleados, roles "
                + "WHERE usuario = '" + usuario + "' AND empleados.idrol = roles.idrol "
                + "AND contraseña = '" + contraseña + "';";
        ResultSet rolnombre = query(query);
        if (rolnombre == null) {
            System.out.println("no hay datos");
            System.out.println(rolnombre);
            return null;
        } else {
            return rolnombre;
        }
    }

    public boolean insPer(String cedula, String nombres, String apellidos,
            Date f_nac, String celular, String correo, String genero) {
        String nquery = "INSERT INTO personas ("
                + "cedula, nombre, apellido, fechanac, celular, correo, genero) "
                + "VALUES ('" + cedula + "', '" + nombres + "', '" + apellidos + "', "
                + "'" + f_nac + "', '" + celular + "', '" + correo + "', '" + genero + "');";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT persona");
            return false;
        }
    }

    public boolean pkPerson(String cedula) throws SQLException {
        String query = "SELECT cedula "
                + "FROM personas "
                + "WHERE cedula = '" + cedula + "';";
        if (query(query).next()) {
            return true;
        } else {
            System.out.println("No hay registros");
            return false;
        }
    }

    public boolean pkVehiculo(String placa) throws SQLException {
        String query = "SELECT placa "
                + "FROM vehiculo "
                + "WHERE placa = '" + placa + "';";
        if (query(query).next()) {
            return true;
        } else {
            System.out.println("No hay vehiculos registrados");
            return false;
        }

    }

    public boolean perEmpl(String cedula) throws SQLException {
        String query = "SELECT idempleado "
                + "FROM empleados "
                + "WHERE cedula = '" + cedula + "';";
        if (query(query).next()) {
            return true;
        } else {
            System.out.println("No hay registros");
            return false;
        }
    }

    public boolean usuario(String usuario) throws SQLException {
        String query = "SELECT usuario "
                + "FROM empleados "
                + "WHERE usuario = '" + usuario + "'";
        if (query(query).next()) {
            return true;
        } else {
            System.out.println("no hay registros");
            return false;
        }
    }

    public boolean insEmp(String id_Emp, String rol, String cedula, String usuario, String contraseña) {
        String nquery = "INSERT INTO empleados ("
                + "idempleado, idrol, cedula, usuario, contraseña) "
                + "VALUES ('" + id_Emp + "', '" + rol + "', '" + cedula + "', '" + usuario + "', '" + contraseña + "');";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT empleado");
            return false;
        }
    }

    public boolean insCli(String idCli, String cedula) {
        String nquery = "INSERT INTO clientes ("
                + "idcliente, idpersona)"
                + "VALUES ('" + idCli + "', '" + cedula + "');";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT cliente");
            return false;
        }
    }

    public boolean insVehi(String placa, String modelo, String tipo) {
        String nquery = "INSERT INTO vehiculo ("
                + "placa, modelo, tipo) "
                + "VALUES ('" + placa + "', '" + modelo + "', '" + tipo + "');";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT vehiculo");
            return false;
        }
    }

    public boolean insDuenio(String idcliente, String placa) {
        String nquery = "INSERT INTO due_v ( "
                + "idcliente, placa ) "
                + "VALUES ('" + idcliente + "', '" + placa + "');";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT dueño");
            return false;
        }
    }

    public boolean perVeh(String idcli, String placa) {
        String nquery = "INSERT INTO due_v ("
                + "idcliente, placa )"
                + "VALUES ('" + idcli + "', '" + placa + "');";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT perVeh");
            return false;
        }
    }

    public ResultSet rol(String rolnombre) throws SQLException {
        String query = "SELECT idrol"
                + " FROM roles"
                + " WHERE rolnombre IN ('" + rolnombre + "');";
        ResultSet idRol = query(query);
        if (idRol == null) {
            System.out.println("no hay datos");
            return null;
        } else {
            return idRol;
        }
    }

//    public ResultSet idcliente(String idcliente) {
//
//        String query = "SELECT placa "
//                + "FROM due_v "
//                + "WHERE idcliente IN ('" + idcliente + "') ";
//
//        ResultSet idCliente = query(query);
//        if (idCliente == null) {
//            System.out.println("No hay datos");
//            return null;
//        } else {
//            return idCliente;
//        }
//    }
    public ResultSet mostrarEmp() throws SQLException {
        String query = "SELECT idempleado, empleados.cedula, nombre, apellido, "
                + "rolnombre, usuario, contraseña, fechanac, correo, celular, genero "
                + "FROM empleados, personas, roles "
                + "WHERE personas.cedula = empleados.cedula AND empleados.idrol = roles.idrol;";
        ResultSet rs = query(query);
        if (rs == null) {
            System.out.println("No se han encontrado datos");
            return null;
        } else {
            return rs;
        }
    }

    public boolean elimEmp(String idempleado) {
        String noquery = "DELETE FROM empleados "
                + "WHERE idempleado = '" + idempleado + "';";
        if (noQuery(noquery) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public void modificarEmp(String idempleado, String usuario,
            String contraseña) {
        String noquery = "UPDATE empleados "
                + "SET usuario = '" + usuario + "', contraseña = '" + contraseña + "'\n"
                + "WHERE idempleado = '" + idempleado + "';";
        if (noQuery(noquery) == null) {
            System.out.println("Modificado exitosamente");
        }
    }

    public boolean eliminarPer(String cedula) {

        String noquery = "DELETE FROM personas "
                + "WHERE cedula = '" + cedula + "';";

        if (noQuery(noquery) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public void modificarPer(String cedula, String nombre, String apellido, Date fechanac,
            String celular, String correo, String genero) {
        long jtime = fechanac.getTime();
        java.sql.Date sqltime = new java.sql.Date(jtime);
        String noquery = "UPDATE personas "
                + "SET nombre = '" + nombre + "', apellido = '" + apellido + "', fechanac = '"
                + sqltime + "', celular = '" + celular + "', correo = '" + correo + "', genero = '" + genero + "'\n"
                + "WHERE cedula = '" + cedula + "';";
        if (noQuery(noquery) == null) {
            System.out.println("Modificado exitosamente");
        }
    }

    public void modificarVeh(String placa, String modelo, String tipo) {
        String noquery = "UPDATE vehiculo "
                + "SET placa = '" + placa + "', modelo = '" + modelo + "', tipo = '" + tipo + "'"
                + "WHERE placa = '" + placa + "';";
        if (noQuery(noquery) == null) {
            System.out.println("Modificaco exitosamente");
        }
    }

    public ArrayList searchPer(String nombre, String apellido) throws SQLException {
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        String query = "SELECT cedula, nombre, apellido, fechanac, celular, correo, genero "
                + "FROM personas\n"
                + "WHERE nombre = '" + nombre + "' AND apellido = '" + apellido + "';";
        Persona per;
        if (query(query) == null) {
            System.out.println("No se han encontrado datos");
            return null;
        } else {
            ResultSet rs = query(query);
            while (rs.next()) {
                System.out.println(rs);
                per = new Persona(rs.getString("cedula"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getDate("fechanac"),
                        rs.getString("celular"),
                        rs.getString("correo"),
                        rs.getString("genero"));
                listaPersonas.add(per);
            }
            return listaPersonas;
        }
    }

    public ResultSet mostrarCli() throws SQLException {
        String query = "SELECT idcliente, personas.cedula, nombre, apellido, fechanac, correo, celular, genero "
                + "FROM clientes, personas "
                + "WHERE personas.cedula= clientes.idpersona ;";
        ResultSet rs = query(query);
        if (rs == null) {
            System.out.println("No se han encontrado datos");
            return null;
        } else {
            return rs;
        }
    }

    public ResultSet mostrarVeh() throws SQLException {

        String query = "SELECT vehiculo.placa, idcliente, modelo, tipo "
                + "FROM vehiculo, due_v "
                + "WHERE vehiculo.placa = due_v.placa;";
        ResultSet rs = query(query);
        if (rs == null) {
            System.out.println("No se han encontrado datos");
            return null;
        } else {
            return rs;
        }
    }

    public boolean insPuesto(String idpuesto, String tipo, boolean ocupado) {

        String nquery = "INSERT INTO puesto ("
                + "idpuesto, tipo, ocupado)"
                + "VALUES ('" + idpuesto + "', '" + tipo + "', '" + ocupado + "');";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT puesto");
            return false;
        }
    }

    public ResultSet mostrarPuest() throws SQLException {
        String query = "SELECT idpuesto, tipo, ocupado"
                + " FROM puesto";
        ResultSet rs = query(query);
        if (rs == null) {
            System.out.println("No se han encontrado datos");
            return null;
        } else {
            return rs;
        }
    }

    public void modificarPuesto(String tipo, boolean ocupado) {
        String noquery = "UPDATE puesto "
                + "SET  tipo = '" + tipo + "', ocupado ='" + ocupado + "';";
        if (noQuery(noquery) == null) {
            System.out.println("Modificado exitosamente");
        }
    }

    public boolean pkPuesto(String idpuesto) throws SQLException {
        String query = "SELECT idpuesto "
                + "FROM puesto "
                + "WHERE idpuesto = '" + idpuesto + "';";
        if (query(query).next()) {
            return true;
        } else {
            System.out.println("No hay registros");
            return false;
        }
    }

    public ResultSet buscarcliente(String nombre) throws SQLException {
        String query = "SELECT clientes.idcliente,clientes.idpersona,personas.nombre,personas.apellido,personas.fechanac,personas.celular,personas.correo,personas.genero"
                + "  FROM clientes,personas"
                + "  WHERE clientes.idpersona= personas.cedula AND nombre LIKE '"+nombre+"%';";
        ResultSet rs = query(query);
        if (rs == null) {
            System.out.println("No se han encontrado datos");
            return null;
        } else {
            return rs;
        }
    }

       public Connection Conectar() {   
        Connection conect = null;
        try {
            conect = DriverManager.getConnection(cadConexion, pgUser, pgPassword);
        } catch (SQLException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
        }
             try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Se Cargo Driver.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
        }
       return conect; 
    }
       
 
       
}