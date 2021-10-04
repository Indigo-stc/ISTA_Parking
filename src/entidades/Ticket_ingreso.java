package entidades;

import java.util.Date;
import java.util.UUID;

public class Ticket_ingreso {
    
    private Date  Fecha_Ingreso;
    private String idticked,idpuesto,placa;

public Ticket_ingreso(){
    this.idticked = "N-"+UUID.randomUUID().toString().substring(0, 3);
}
    public String getIdticket(){
         return idticked; 
    }
  
}
