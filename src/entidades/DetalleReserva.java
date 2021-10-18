/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.UUID;

/**
 *
 * @author Kevin Maldonado
 */
public class DetalleReserva {
    private final String iddetalle;
    private String placa;
    private short puesto;
    private int idtarifa;

    public DetalleReserva(String placa, short puesto, int idtarifa) {
        this.iddetalle = "FAC-" +UUID.randomUUID().toString().substring(0, 8);
        this.placa = placa;
        this.puesto = puesto;
        this.idtarifa = idtarifa;
    }

    public String getIddetalle() {
        return iddetalle;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public short getPuesto() {
        return puesto;
    }

    public void setPuesto(short puesto) {
        this.puesto = puesto;
    }

    public int getIdtarifa() {
        return idtarifa;
    }

    public void setIdtarifa(int idtarifa) {
        this.idtarifa = idtarifa;
    }
}
