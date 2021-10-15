package entidades;

import java.util.Date;
import java.util.UUID;

public class Reserva {
    
    private final String idAlquiler;
    private String idcliente;
    private String idempleado;
    private Date fechaIngreso;
    private Date fechaSalida;

    public Reserva(String idcliente, String idempleado, Date fechaIngreso, Date fechaSalida) {
        this.idAlquiler = "Alq-" + UUID.randomUUID().toString().substring(0, 8);
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public String getIdAlquiler() {
        return idAlquiler;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }
    
    
}
