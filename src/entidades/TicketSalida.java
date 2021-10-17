package entidades;

import java.util.Date;
import java.util.UUID;

public class TicketSalida {
    private Date fecha_salida;
    private String id_tsalida;
    private String id_tinicio;
    private Double costo;

    public TicketSalida(Date fecha_salida, String id_tsalida, String id_tinicio, Double costo) {
        this.fecha_salida = fecha_salida;
        this.id_tsalida = "TIS-" + UUID.randomUUID().toString().substring(0, 3);
        this.id_tinicio = id_tinicio;
        this.costo = costo;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getId_tsalida() {
        return id_tsalida;
    }

    public void setId_tsalida(String id_tsalida) {
        this.id_tsalida = id_tsalida;
    }

    public String getId_tinicio() {
        return id_tinicio;
    }

    public void setId_tinicio(String id_tinicio) {
        this.id_tinicio = id_tinicio;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
}
