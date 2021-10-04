package entidades;

import java.sql.Date;
import java.util.UUID;

public class Cliente extends Persona{
    
    private final String idCli;

    public Cliente(String cedula, String nombres, String apellidos, Date fechaNacimiento, String celular, String correo, String genero) {
        super(cedula, nombres, apellidos, fechaNacimiento, celular, correo, genero);
        this.idCli = "Cli-" +UUID.randomUUID().toString().substring(0, 3);
    }

    public String getIdCli() {
        return idCli;
    }
    
}
