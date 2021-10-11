package entidades;

import java.util.UUID;

public class Puesto {
    
    private final String idpuesto;
    private String tipo;
    private boolean ocupado;

    public Puesto(String tipo) {
        this.idpuesto = "Pst-" + UUID.randomUUID().toString().substring(0, 4);
        this.tipo = tipo;
        this.ocupado = false;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
}
