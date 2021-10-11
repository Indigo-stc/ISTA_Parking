package entidades;

import java.util.Date;
import java.util.UUID;

public class Ticket_ingreso {
    
    private String idTicked,idPuesto,Placa;
    private Date  f_Ingreso;

    public Ticket_ingreso(String idTicked, String idPuesto, String Placa, Date f_Ingreso) {
        this.idTicked = "N-"+UUID.randomUUID().toString().substring(0, 6);
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

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(String idPuesto) {
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
