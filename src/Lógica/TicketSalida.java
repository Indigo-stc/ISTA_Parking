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
 * @author Kevin Maldonado
 */
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

    /**
     * @return the fecha_salida
     */
    public Date getFecha_salida() {
        return fecha_salida;
    }

    /**
     * @param fecha_salida the fecha_salida to set
     */
    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    /**
     * @return the id_tsalida
     */
    public String getId_tsalida() {
        return id_tsalida;
    }

    /**
     * @param id_tsalida the id_tsalida to set
     */
    public void setId_tsalida(String id_tsalida) {
        this.id_tsalida = id_tsalida;
    }

    /**
     * @return the id_tinicio
     */
    public String getId_tinicio() {
        return id_tinicio;
    }

    /**
     * @param id_tinicio the id_tinicio to set
     */
    public void setId_tinicio(String id_tinicio) {
        this.id_tinicio = id_tinicio;
    }

    /**
     * @return the costo
     */
    public Double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
}
