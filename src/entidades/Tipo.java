/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Kevin Maldonado
 */
public class Tipo {
    private short idtipo;
    private String denominacion;

    public Tipo(short idtipo, String denominacion) {
        this.idtipo = idtipo;
        this.denominacion = denominacion;
    }

    public short getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(short idtipo) {
        this.idtipo = idtipo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return this.denominacion;
    }
}
