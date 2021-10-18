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
        this.idAlquiler = "Alq-" + UUID.randomUUID().toString().substring(0, 12);
        this.idcliente = idcliente;
        this.idempleado = idempleado;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public String getIdAlquiler() {
        return idAlquiler;
    }

    public java.sql.Date getFechaIngreso() {
        java.sql.Date sqlTS = new java.sql.Date(fechaIngreso.getTime());
        return sqlTS;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public java.sql.Date getFechaSalida() {
        java.sql.Date sqlTS = new java.sql.Date(fechaSalida.getTime());
        return sqlTS;
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
