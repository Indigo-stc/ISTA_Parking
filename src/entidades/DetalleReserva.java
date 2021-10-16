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
    private String idalquiler;
    private String placa;
    private String puesto;
    private Double costo;

    public DetalleReserva(String idalquiler, String placa, String puesto, Double costo) {
        this.iddetalle = "Alq-" +UUID.randomUUID().toString().substring(0, 8);
        this.idalquiler = idalquiler;
        this.placa = placa;
        this.puesto = puesto;
        this.costo = costo;
    }

    public String getIddetalle() {
        return iddetalle;
    }

    public String getIdalquiler() {
        return idalquiler;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
}
