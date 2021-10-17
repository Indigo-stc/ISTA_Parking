package entidades;

import java.util.Date;
import java.util.UUID;

public class TicketIngreso {
    
    private String idTicked, Placa;
    private short idPuesto;
    private Date  f_Ingreso;

    public TicketIngreso(short idPuesto, String Placa, Date f_Ingreso) {
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

    public Date getF_Ingreso() {
        long form = f_Ingreso.getTime();
        java.sql.Date sqlfecha = new java.sql.Date(form);
        return sqlfecha;
    }

    public void setF_Ingreso(Date f_Ingreso) {
        this.f_Ingreso = f_Ingreso;
    }
    
}
