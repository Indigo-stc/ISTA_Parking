package entidades;

import java.util.Date;
import java.util.UUID;

public class Ticket_Ingreso {
    
    private String idTicked, Placa;
    private short idPuesto;
    private Date  f_Ingreso;

    public Ticket_Ingreso(short idPuesto, String Placa, Date f_Ingreso) {
        this.idTicked = "N-"+UUID.randomUUID().toString().substring(0, 12);
        this.idPuesto = idPuesto;
        this.Placa = Placa;
        this.f_Ingreso = f_Ingreso;
    }

    public String getIdTicked() {
        return idTicked;
    }

    public void setIdTicked(String idTicked) {
        this.idTicked = idTicked;
    }

    public short getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(short idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public java.sql.Timestamp getF_Ingreso() {
        java.sql.Timestamp sqlTS = new java.sql.Timestamp(this.f_Ingreso.getTime());
        return sqlTS;
    }

    public void setF_Ingreso(Date f_Ingreso) {
        this.f_Ingreso = f_Ingreso;
    }
    
}
