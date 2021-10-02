/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica;

/**
 *
 * @author User
 */
public class Puesto {
    private String idpuesto,tipo,estado;

    public Puesto(String idpuesto, String tipo, String estado) {
        this.idpuesto = idpuesto;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getIdpuesto() {
        return idpuesto;
    }

    public void setIdpuesto(String idpuesto) {
        this.idpuesto = idpuesto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
