package ConexionPG;

import Lógica.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;
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
          //  stat.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(PgConect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    public boolean insRol(String idRol, String rolnombre, String usuario, String contraseña) {
        String nquery = "INSERT INTO rol("
                + "idrol, rolnombre, usuario, contraseña)"
                + "VALUES ('"+ idRol +"', '"+ rolnombre +"', '"+ usuario +"', '"+ contraseña +"');";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT rol");
            return false;
        }
    }
    
    /*
    txtCedula.getText(), txtNombres.getText(),
                    txtApellidos.getText(), fecha.getDate(), txtCelular.getText(),
                    txtCorreo.getText(), genero, comboCargo.getSelectedItem().toString()
    */
    
    public boolean insPer(String cedula, String nombres, String apellidos,
            Date f_nac, String celular, String correo, String genero) {
        String nquery = "INSERT INTO personas ("
                + "cedula, nombre, apellido, fechanac, celular, correo, genero)"
                + "VALUES ('"+ cedula +"', '"+ nombres +"', '"+ apellidos +"', "
                + "'"+ f_nac +"', '"+ celular +"', '"+ correo +"', '"+ genero +"');";
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
                + "WHERE cedula = '"+ cedula +"';";
        if (query(query) == null) {
            System.out.println("no hay registros");
            return false;
        } else {
            return true;
        }
    }
    
    public boolean insEmp(String id_Emp, String rol, String cedula, String usuario, String contraseña) {
        String nquery = "INSERT INTO empleados ("
                + "idempleado, idrol, cedula, usuario, contraseña)"
                + "VALUES ('"+ id_Emp +"', '"+ rol +"', '"+ cedula +"', '"+ usuario +"', '"+ contraseña +"');";
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
                + "VALUES ('"+ idCli +"', '"+ cedula +"');";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT cliente");
            return false;
        }
    }
    
    public boolean insVehi(String placa, String modelo, String tipo) {
        String nquery = "INSERT INTO vehiculos ("
                + "placa, modelo, tipo)"
                + "VALUES ('"+ placa +"', '"+ modelo +"', '"+ tipo +"');";
        if (noQuery(nquery) == null) {
            return true;
        } else {
            System.out.println("ERROR INSERT vehiculo");
            return false;
        }
    }
    
    public boolean perVeh(String idClie, String placa) {
        String nquery = "INSERT INTO due_v("
                + "idcliente, placa)"
                + "VALUES ('"+ idClie +"', '"+ placa +"');";
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
                + " WHERE rolnombre IN ('"+ rolnombre +"');";
        ResultSet idRol = query(query);
        if (idRol == null) {
            System.out.println("no hay datos");
            System.out.println(idRol);
            return null;
        } else {
            return idRol;
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

        
        

      public static boolean eliminar(String cedula) {
         PgConect connect= new PgConect();
        String nsql = "DELETE FROM personas\n" +
                    "WHERE cedula = '" + cedula + "';"; 
        if (connect.noQuery(nsql) == null) {
            return true;
        } else {
            System.out.println("Error");
            return false;
        }
    }
        public static void modificar(String cedula, String nombres, String apellidos, Date fechaNacimiento,String celular, String correo, String genero) {
        long jtime = fechaNacimiento.getTime();
        java.sql.Date sqltime = new java.sql.Date(jtime);
        PgConect connect= new PgConect();
        String nsql = "UPDATE public.personas\n" +
            "SET nombre='"+nombres+"', apellido='"+apellidos+"', fechanac='"+sqltime+"', celular='"+celular+"', correo='"+correo+"', genero='"+genero+"'\n" +
            "WHERE cedula_cli = '" + cedula + "';"; 
        if (connect.noQuery(nsql) == null) {
            System.out.println("Modificado exitosamente");
        }
    }
}
