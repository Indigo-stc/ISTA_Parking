package entidades;

import java.util.Date;
import java.util.UUID;

public class Empleado extends Persona {

    private String cargo;
    private final String id_Emp;
    private String usuario;
    private String contraseña;

    public Empleado(String cedula, String nombres, String apellidos, 
            String usuario, String contraseña, Date fechaNacimiento, String celular, String correo, String genero, String cargo) {
        super(cedula, nombres, apellidos, fechaNacimiento, celular, correo, genero);
        this.cargo = cargo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.id_Emp = "Emp-" + UUID.randomUUID().toString().substring(0, 4);
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getId_Emp() {
        return id_Emp;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
