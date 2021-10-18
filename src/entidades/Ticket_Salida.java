package entidades;

import java.util.Date;
import java.util.UUID;

public class Ticket_Salida {
    private Date fecha_salida;
    private String id_tsalida;
    private String id_tinicio;
    private short idTarifa;

    public Ticket_Salida(Date fecha_salida, String id_tinicio, short idTarifa) {
        this.fecha_salida = fecha_salida;
        this.id_tsalida = this.id_tsalida = "Tis-" + UUID.randomUUID().toString().substring(0, 12);
        this.id_tinicio = id_tinicio;
        this.idTarifa = idTarifa;
    }

    public java.sql.Timestamp getFecha_salida() {
        java.sql.Timestamp sqlTS = new java.sql.Timestamp(this.fecha_salida.getTime());
        return sqlTS;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getId_tsalida() {
        return id_tsalida;
    }

    public String getId_tinicio() {
        return id_tinicio;
    }

    public void setId_tinicio(String id_tinicio) {
        this.id_tinicio = id_tinicio;
    }

    public short getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(short idTarifa) {
        this.idTarifa = idTarifa;
    }

}
