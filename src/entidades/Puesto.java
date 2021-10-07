/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.UUID;

/**
 *
 * @author User
 */
public class Puesto {
    private final String idpuesto;
    private String tipo;
    private boolean ocupado;

    public Puesto(String tipo) {
        this.idpuesto = "puest-" + UUID.randomUUID().toString().substring(0, 3);
        this.tipo = tipo;
        this.ocupado = false;
    }

    public String getIdpuesto() {
        return idpuesto;
    }

   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getOcupado() {
        return ocupado;
    }

  
    
    
}
