package entidades;

import java.util.Date;
import java.util.UUID;

public class Empleado extends Persona {

    private short idrol;
    private final String id_Emp;
    private String usuario;
    private String contraseña;

    public Empleado(String cedula, String nombres, String apellidos, 
            String usuario, String contraseña, Date fechaNacimiento, String celular, String correo, String genero, short idrol) {
        super(cedula, nombres, apellidos, fechaNacimiento, celular, correo, genero);
        this.idrol = idrol;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.id_Emp = "Emp-" + UUID.randomUUID().toString().substring(0, 12);
    }
    
    public short getIdrol() {
        return idrol;
    }

    public void setIdrol(short idrol) {
        this.idrol = idrol;
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
