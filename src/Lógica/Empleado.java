package Lógica;

import java.util.Date;
import java.util.UUID;

public class Empleado extends Persona {

    private String cargo;
    private final String id_Emp;

    public Empleado(String cedula, String nombres, String apellidos, Date fechaNacimiento, String celular, String correo, String genero, String cargo) {
        super(cedula, nombres, apellidos, fechaNacimiento, celular, correo, genero);
        this.cargo = cargo;
        this.id_Emp = "Emp-" + UUID.randomUUID().toString().substring(0, 3);
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

}
