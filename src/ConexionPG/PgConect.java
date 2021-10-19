package ConexionPG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
           // stat.close();
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
    
    public ResultSet trueEmp(String cedula) {
        String query = "SELECT * FROM empleados "
                + "WHERE cedula = '" + cedula + "' AND activo = TRUE";
        return query(query);
    }
    
    public void activarEmp(String cedula, short idrol, String usuario, String contraseña) {
        String noquery = "UPDATE empleados "
                + "SET idrol = '"+ idrol +"', activo = " + true + ", usuario = '"+ usuario +"',"
                + "contraseña = '"+ contraseña +"' "
                + "WHERE cedula = '" + cedula + "';";
        if (noQuery(noquery) == null) {
        } else {
            System.out.println("ERROR");
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

    public boolean insEmp(String id_Emp, short rol, String cedula, String usuario, String contraseña) {
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
                + "iddetalle, idalquiler, placa, idpuesto, idtarifa) "
                + "VALUES ('" + iddetalle + "', '" + idalquiler + "', '" + placa + "', '" + idpuesto + "', " + costo + ");";
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

    public ResultSet getIdRol(String rolnombre) {
        String query = "SELECT idrol"
                + " FROM roles"
                + " WHERE rolnombre IN ('" + rolnombre + "');";
        return query(query);
    }

    public ResultSet tipo() {
        String query = "SELECT * FROM tipos; ";
        return query(query);
    }
    
    public ResultSet cbxTipos() {
        String query = "SELECT idtipo FROM tipos "
                + "ORDER BY denominacion" ;
        return query(query);
    }

    public ResultSet cbxRoles() {
        String query = "SELECT * FROM roles "
                + "ORDER BY rolnombre ASC;";
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
    
  /*  public ResultSet owner(String cedula, String placa) {
        String query = "SELECT DISTINCT idpersona, clientes.idcliente, vehiculos.placa "
                + "FROM clientes, propietarios, vehiculos "
                + "WHERE idpersona = '"+ cedula +"' AND clientes.idcliente = propietarios.idcliente "
                + "AND vehiculos.placa = '"+ placa +"' AND propietarios.placa = vehiculos.placa "
                + "AND vehiculos.activo = TRUE; ";
        return query(query);
    }*/
    
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
    
   /* public ResultSet cbxPuestos(String placa) {
        String sql = "SELECT DISTINCT puestos.idpuesto, puestos.idpuesto, ocupado "
                + "FROM puestos, vehiculos, tipos "
                + "WHERE vehiculos.placa = '"+ placa +"' AND puestos.idtipo = vehiculos.idtipo "
                + "AND puestos.idtipo = tipos.idtipo AND tipos.idtipo = vehiculos.idtipo "
                + "AND puestos.ocupado = FALSE;";
        return query(sql);
    }*/
    
    public ResultSet owner(String cedula, String placa) {
        String query = "SELECT DISTINCT idpersona, clientes.idcliente, vehiculos.placa "
                + "FROM clientes, propietarios, vehiculos "
                + "WHERE idpersona = '"+ cedula +"' AND clientes.idcliente = propietarios.idcliente "
                + "AND vehiculos.placa = '"+ placa +"' AND propietarios.placa = vehiculos.placa "
                + "AND vehiculos.activo = TRUE; ";
        return query(query);
    }

    public void modificarEmp(String idempleado, String usuario,
            String contraseña, short idrol) {
        String noquery = "UPDATE empleados "
                + "SET usuario = '" + usuario + "', contraseña = '" + contraseña + "',"
                + "idrol = '"+ idrol +"'"
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

       
    public boolean actualizarestadoCli(String cedula) {
        String noquery = "UPDATE clientes"
                +"  SET  activo = TRUE "
                + "WHERE idpersona = '"+ cedula +"'";  
        if (noQuery(noquery) == null) {
            return true;
        } else {
            System.out.println("ERROR UPDATE cliente");
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
    
    public boolean insTIng(String idticketing, String idempleado, String idcliente,
            String placa, short idpuesto, java.sql.Timestamp ingreso) {
        String nquery = "INSERT INTO public.ticketsing("
                + "idticketing, idempleado, idcliente, placa, idpuesto, fechaing) "
                + "VALUES ('"+ idticketing +"', '"+ idempleado +"', '"+ idcliente +"',"
                + " '"+ placa +"', '"+ idpuesto +"', '"+ ingreso +"');";
        return noQuery(nquery) == null;
    }
    
    public boolean insTSal(String idsalida, String idingreso, short tarifa,
            java.sql.Timestamp f_salida) {
        String nquery = "INSERT INTO public.ticketssal( "
                + "idticketsal, idticketing, idtarifa, fechasal) "
                + "VALUES ('"+ idsalida +"', '"+ idingreso +"', "+ tarifa +", '"+ f_salida +"');";
        return noQuery(nquery) == null;
    }
    
    public boolean ocupaPue(short idpuesto) {
        String sql = "UPDATE puestos "
                + "SET ocupado = TRUE "
                + "WHERE idpuesto = "+ idpuesto +";";
        return noQuery(sql) == null;
    }
    
    public boolean desOcupaPue(short idpuesto) {
        String sql = "UPDATE puestos "
                + "SET ocupado = FALSE "
                + "WHERE idpuesto = "+ idpuesto +";";
        return noQuery(sql) == null;
    }
    
    public ResultSet buscarTicketsIng(String cadena) {
        String sql;
        if (cadena.trim().equals("")) {
            sql = "SELECT idticketing, idpersona, placa, idpuesto, fechaing "
                    + "FROM ticketsing, clientes "
                    + "WHERE ticketsing.idcliente = clientes.idcliente;";
        } else {
            sql = "SELECT idticketing, idpersona, placa, idpuesto, fechaing "
                    + "FROM ticketsing, clientes "
                    + "WHERE (idpersona LIKE '%" + cadena + "%' OR placa LIKE '%" + cadena + "%') AND ticketsing.idcliente = clientes.idcliente "
                    + "AND clientes.activo = TRUE";
        }
        return query(sql);
    }
    public ResultSet buscarTicketsIngpdf(String idalquiler) {
        String sql;
        if (idalquiler.trim().equals("")) {
            sql = "SELECT idticketing, idpersona, placa, idpuesto, fechaing "
                    + "FROM ticketsing, clientes "
                    + "WHERE ticketsing.idcliente = clientes.idcliente;";
        } else {
            sql = "SELECT idticketing, idpersona, placa, idpuesto, fechaing "
                    + " FROM ticketsing, clientes "
                    + "WHERE idticketing  = '" + idalquiler + "' AND ticketsing.idcliente = clientes.idcliente "
                    + "AND clientes.activo = TRUE ";
        }
        return query(sql);
    }
    
    public ResultSet buscarDetalle(String placa){
        String sql;
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
        return query(sql);
    }
    
    
    public ResultSet buscarTicketsSal(String cadena) {
        String sql = "SELECT ticketssal.idticketsal, ticketsing.idticketing, clientes.idpersona, tarifas.costo_hora,  "
                + "fechaing::time, fechasal::time, "
                + "extract(min from (fechasal - fechaing)) as Tiempo, "
                + "extract(min from (fechasal - fechaing))*(costo_hora/60) as CostoTolatal "
                + "FROM ticketssal, ticketsing, tarifas, clientes "
                + "WHERE ticketssal.idticketing = ticketsing.idticketing AND ticketssal.idtarifa = tarifas.idtarifa "
                + "AND clientes.idcliente = ticketsing.idcliente AND ticketsing.idticketing = '"+ cadena +"';";
        return query(sql);
    }
    
    public ResultSet buscarDetXAlquiler(String alquiler) {
        String sql = "SELECT iddetalle, detallesalquiler.idalquiler, detallesalquiler.placa, costo_hora, "
                + "detallesalquiler.idpuesto, fechaing, fechasal, (fechasal - fechaing), "
                + "(fechasal - fechaing)*(costo_hora*24) "
                + "FROM alquileres, detallesalquiler, tarifas "
                + "WHERE alquileres.idalquiler = detallesalquiler.idalquiler "
                + "AND tarifas.idtarifa = detallesalquiler.idtarifa AND detallesalquiler.idalquiler = '"+ alquiler +"';";
        return query(sql);
    }
       
    public ResultSet pkTicketIng(String ticket) {
        String sql = "SELECT * FROM ticketsing "
                + "WHERE idticketing = '"+ ticket +"'";
        return query(sql) ;
    }
    
    public ResultSet ticketIdTarifa(String ticket) {
        String sql = "SELECT idtarifa "
                + "FROM tarifas, vehiculos, ticketsing "
                + "WHERE idticketing = '"+ ticket +"' AND tarifas.idtipo = vehiculos.idtipo "
                + "AND vehiculos.placa = ticketsing.placa;";
        return query(sql) ;
    }
    
    public ResultSet IDTarifaDet(String placa) {
        String sql = "SELECT idtarifa "
                + "FROM tarifas, vehiculos "
                + "WHERE vehiculos.placa = '"+ placa +"';";
        return query(sql) ;
    }
    
    public boolean tixts(String ticket) {
        String sql = "SELECT * FROM ticketssal "
                + "WHERE idticketing = '"+ ticket +"'";
        try {
            return query(sql).next();
        } catch (SQLException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ResultSet buscarTicketsSal1(String cadena) {
        String sql;
        if (cadena.trim().equals("")) {
            sql = "";
        } else {
            sql = "SELECT idticketing, idpersona, placa, idpuesto, fechaing "
                    + "FROM ticketsing, clientes "
                    + "WHERE (idpersona LIKE '%" + cadena + "%' OR placa LIKE '%" + cadena + "%') AND ticketsing.idcliente = clientes.idcliente "
                    + "AND clientes.activo = TRUE";
        }
        return query(sql);
    }
    
    public boolean elimAlquilerSinUsar(String idalquiler) {
        String sql = "DELETE FROM alquileres "
                + "WHERE idalquiler = '"+ idalquiler +"'";
        return noQuery(sql) == null;
    }
    
    public boolean alquilerXdetalle(String alquiler) {
        String sql = "SELECT * FROM detallesalquiler "
                + "WHERE idalquiler = '"+ alquiler +"'";
        try {
            if (query(sql).next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ResultSet totatl(String cadena) {
        String sql = "SELECT sum((fechasal - fechaing)*(costo_hora*24)) "
                + "FROM alquileres, detallesalquiler, tarifas "
                + "WHERE alquileres.idalquiler = detallesalquiler.idalquiler  "
                + "AND tarifas.idtarifa = detallesalquiler.idtarifa AND detallesalquiler.idalquiler = '"+ cadena +"';";
        return query(sql);
    }
}
