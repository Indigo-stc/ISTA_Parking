package entidades;

import java.util.UUID;

public class Puesto {

    private short idpuesto;
    private short tipo;
    private boolean ocupado;

    public Puesto(short idpuesto, short tipo, boolean ocupado) {
        this.idpuesto = idpuesto;
        this.tipo = tipo;
        this.ocupado = ocupado;
    }

    public short getIdpuesto() {
        return idpuesto;
    }

    public void setIdpuesto(short idpuesto) {
        this.idpuesto = idpuesto;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return String.valueOf(idpuesto);
    }
}
