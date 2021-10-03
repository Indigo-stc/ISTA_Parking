/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author User
 */
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
