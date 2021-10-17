package ConexionPG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
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
        String query = "SELECT usuario, contraseña, empleados.idrol, rolnombre, idempleado "
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

    public ResultSet personas(String cedula) {
        String query = "SELECT * FROM personas "
                + "WHERE cedula = '" + cedula + "'";
        ResultSet persona = query(query);
        return persona;
    }

    public ResultSet vehiculos(String placa){
    
        String query = "SELECT * FROM vehiculos "
                + "WHERE placa = '"+ placa +"';";
        ResultSet vehiculos = query(query);
        return vehiculos;
    }
    
    public ResultSet pkVehiculo(String placa) throws SQLException {
        String query = "SELECT placa "
                + "FROM vehiculos "
                + "WHERE placa = '" + placa + "';";
        return query(query);
    }
    
    public boolean pkAlquiler(String idalquiler) throws SQLException{
        String query = "SELECT idalquiler "
                + "FROM alquileres "
                + "WHERE idalquiler = '" + idalquiler + "';";
        
        if (query(query).next()){
            return true;
        }else{
            System.out.println("No hay alquileres registrados");
            return false;
        }
    }
    
    public ResultSet pkAlq(String idalquiler){
        String query = "SELECT idalquiler "
                + "FROM alquileres "
                + "WHERE idalquiler = '" + idalquiler + "';";
        ResultSet alquileres = query(query);
        return alquileres;
    }

    public boolean pkPropietarios(String idcliente) throws SQLException {

        String query = "SELECT idcliente "
                + "FROM propietarios "
                + "WHERE idcliente = '" + idcliente + "';";
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

    public boolean usuario(String cedula) throws SQLException {
        String query = "SELECT idcliente "
                + "FROM clientes "
                + "WHERE idpersona = '" + cedula + "';";
        if (query(query).next()) {
            return true;
        } else {
            System.out.println("No hay registros");
            return false;
        }
    }
    
    public boolean pkalquiler(String idalquiler) throws SQLException{
    
        String query = "SELECT idalquiler "
                + "FROM alquileres "
                + "WHERE idalquilers = '" + idalquiler + "';";
        
        if(query(query).next()){
            return true;
        }else{
            System.out.println("No hay registros");
            return false;
        }
    }

    public boolean insEmp(String id_Emp, String rol, String cedula, String usuario, String contraseña) {
        String nquery = "INSERT INTO empleados ("
                + "idempleado, idrol, cedula, usuario, contraseña, activo) "
                + "VALUES ('" + id_Emp + "', '" + rol + "', '" + cedula + "', '" + usuario + "', '" + contraseña + "', " + true + ");";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT empleado");
            return false;
        }
    }
    
    public boolean insDetR(String iddetalle, String idalquiler, String placa, short idpuesto, int costo) {
        String nquery = "INSERT INTO detallesalquiler ("
                + "iddetalle, idalquiler, placa, idpuesto, costo) "
                + "VALUES ('" + iddetalle + "', '" + idalquiler + "', '" + placa + "', '" + idpuesto + "', '" + costo + ");";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT detalle");
            return false;
        }
    }

    public boolean insCli(String idCli, String cedula, boolean activo) {
        String nquery = "INSERT INTO clientes ("
                + "idcliente, idpersona, activo)"
                + "VALUES ('" + idCli + "', '" + cedula + "', " + true + ");";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT cliente");
            return false;
        }
    }
    


    public boolean insVehi(String placa, String modelo, int tipo) {
        String nquery = "INSERT INTO vehiculos ("
                + "placa, modelo, idtipo, activo) "
                + "VALUES ('" + placa + "', '" + modelo + "', " + tipo + ", TRUE);";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT vehiculo");
            return false;
        }
    }

    public boolean insDuenio(String idcliente, String placa) {
        String nquery = "INSERT INTO propietarios ( "
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
        String nquery = "INSERT INTO propietarios ("
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

    public ResultSet tipo() {
        String query = "SELECT * FROM tipos; ";
        return query(query);
    }

    public ResultSet roles() {
        String query = "SELECT * FROM roles";
        return query(query);
    }

    public ResultSet pkCedCli(String cedula) {
        String query = "SELECT idcliente "
                + "FROM clientes "
                + "WHERE idpersona = '" + cedula + "' AND activo = TRUE";
        return query(query);
    }

    public ResultSet pkIDCli(String idcliente) {
        String query = "SELECT idcliente "
                + "FROM clientes "
                + "WHERE idcliente = '" + idcliente + "' AND activo = TRUE";
        return query(query);
    }
    
    public ResultSet CrV(String cedula, String placa) throws SQLException {
        String query = "SELECT cedula, clientes.idcliente, vehiculos.placa "
                + "FROM clientes, propietarios, vehiculos, personas "
                + "WHERE cedula = '" + cedula + "' AND  cedula = idpersona AND clientes.idcliente = propietarios.idcliente "
                + "AND propietarios.placa = '" + placa + "' AND propietarios.placa = vehiculos.placa "
                + "AND vehiculos.activo = TRUE;";
        return query(query);
    }
    
    public ResultSet DetR(String placa) throws SQLException {
        String query = "SELECT puestos.idpuesto, vehiculos.placa, tipos.denominacion "
                + "FROM puestos, vehiculos, tipos "
                + "WHERE vehiculos.placa = '" + placa + "' AND puestos.idpuesto = detallealquiler.idpuesto "
                + "AND propietarios.placa = vehiculos.placa; ";
        return query(query);
    }
    
    public boolean insRva(String idalquiler, String idcliente, String idempleado, Date fechaIngreso, Date fechaSalida) {
        String nquery = "INSERT INTO alquileres ( "
                + "idalquiler, idcliente, idempleado, fechaing, fechasal)"
                + " VALUES ('" + idalquiler + "', '" + idcliente + "', '" + idempleado + "', '" + fechaIngreso
                + "', '" + fechaSalida + "');";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT alquiler");
            return false;
        }
    }

    public ResultSet mostrarEmp() {
        String query = "SELECT idempleado, empleados.cedula, nombre, apellido, "
                + "rolnombre, usuario, contraseña, fechanac, correo, celular, genero "
                + "FROM empleados, personas, roles "
                + "WHERE personas.cedula = empleados.cedula AND empleados.idrol = roles.idrol AND activo = " + true + ";";
        return query(query);
    }

    public boolean elimEmp(String idempleado) {
        String noquery = "UPDATE empleados "
                + "SET activo = " + false + " "
                + "WHERE idempleado = '" + idempleado + "';";
        if (noQuery(noquery) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public boolean elimVeh(String placa) {
        String noquery = "UPDATE vehiculos "
                + "SET activo = " + false + " "
                + "WHERE placa = '" + placa + "';";
        if (noQuery(noquery) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

//    public boolean elimVeh (String placa){
//        String noquery = "DELETE FROM vehiculos CASCADE"
//                            +" WHERE placa = '"+placa+"';";
//        
//        if(noQuery(noquery) == null){
//            return true;
//        }else{
//            System.out.println("ERROR");
//            return false;
//        }
//    }
    public boolean elimCli(String idcliente) {
        String noquery = "UPDATE clientes "
                + "SET activo = " + false + " "
                + "WHERE idcliente = '" + idcliente + "';";
        if (noQuery(noquery) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }
    
    public ResultSet cbxPuestos(String placa) {
        String sql = "SELECT DISTINCT puestos.idpuesto, puestos.idpuesto, ocupado "
                + "FROM puestos, vehiculos, tipos "
                + "WHERE vehiculos.placa = '"+ placa +"' AND puestos.idtipo = vehiculos.idtipo "
                + "AND puestos.idtipo = tipos.idtipo AND tipos.idtipo = vehiculos.idtipo "
                + "AND puestos.ocupado = FALSE;";
        return query(sql);
    }
    
    public ResultSet owner(String cedula, String placa) {
        String query = "SELECT DISTINCT idpersona, clientes.idcliente, vehiculos.placa "
                + "FROM clientes, propietarios, vehiculos "
                + "WHERE idpersona = '"+ cedula +"' AND clientes.idcliente = propietarios.idcliente "
                + "AND vehiculos.placa = '"+ placa +"' AND propietarios.placa = vehiculos.placa "
                + "AND vehiculos.activo = TRUE; ";
        return query(query);
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

    public void modificarVeh(String placa, String modelo, int tipo) {
        String noquery = "UPDATE vehiculos "
                + "SET placa = '" + placa + "', modelo = '" + modelo + "', idtipo = " + tipo + " "
                + "WHERE placa = '" + placa + "';";
        if (noQuery(noquery) == null) {
            System.out.println("Modificaco exitosamente");
        }
    }

    public ResultSet mostrarCli() throws SQLException {
        String query = "SELECT idcliente, personas.cedula, nombre, apellido, fechanac, correo, celular, genero,clientes.activo "
                + "FROM clientes, personas "
                + "WHERE personas.cedula= clientes.idpersona AND activo = " + true + ";";
        ResultSet rs = query(query);
        if (rs == null) {
            System.out.println("No se han encontrado datos");
            return null;
        } else {
            return rs;
        }
    }

    public ResultSet mostrarVeh() throws SQLException {

        String query = "SELECT vehiculos.placa, propietarios.idcliente, modelo, idtipo "
                + "FROM vehiculos, propietarios, clientes "
                + "WHERE vehiculos.placa = propietarios.placa AND vehiculos.activo = TRUE AND "
                + "clientes.idcliente = propietarios.idcliente;";
        ResultSet rs = query(query);
        if (rs == null) {
            System.out.println("No se han encontrado datos");
            return null;
        } else {
            return rs;
        }
    }

    public boolean insPuesto(int tipo) {

        String nquery = "INSERT INTO puestos ("
                + "idpuesto, idtipo, ocupado)"
                + "VALUES (default, " + tipo + ", FALSE);";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT puesto");
            return false;
        }
    }

    public ResultSet mostrarPue() throws SQLException {
        String query = "SELECT idpuesto, idtipo, ocupado"
                + " FROM puestos ";
        ResultSet rs = query(query);
        if (rs == null) {
            System.out.println("No se han encontrado datos");
            return null;
        } else {
            return rs;
        }
    }

    public void modiificarPue(String idpuesto, String tipo, boolean ocupado) {
        String noquery = "UPDATE puestos "
                + "SET  idtipo = '" + tipo + "', ocupado ='" + ocupado + "' "
                + "WHERE idpuesto = '" + idpuesto + "';";
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
                + "  WHERE clientes.idpersona= personas.cedula AND nombre LIKE '" + nombre + "%';";
        ResultSet rs = query(query);
        if (rs == null) {
            System.out.println("No se han encontrado datos");
            return null;
        } else {
            return rs;
        }
    }

//    public boolean insTicket(String idTicketI, String cedula, Date fechaI) {
//        
//    }
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

    public boolean actualizarestadoCli(boolean activo) {
        String noquery = "UPDATE clientes"
                + "  SET  activo='" + true + "' ";

        if (noQuery(noquery) == null) {
            return true;
        } else {
            System.out.println("ERROR UPDATE cliente");
            return false;
        }
    }

}
