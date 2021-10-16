package entidades;

import java.util.UUID;

public class Puesto {

    private short idpuesto;
    private String tipo;
    private boolean ocupado;

    public Puesto(String tipo) {
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

    /**
     * @return the idpuesto
     */
    public short getIdpuesto() {
        return idpuesto;
    }

    /**
     * @param idpuesto the idpuesto to set
     */
    public void setIdpuesto(short idpuesto) {
        this.idpuesto = idpuesto;
    }

    @Override
    public String toString() {
        return "Puesto{" + "idpuesto=" + idpuesto + '}';
    }
}
