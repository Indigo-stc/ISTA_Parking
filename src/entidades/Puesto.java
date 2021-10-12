package entidades;

public class Puesto {

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
    
}
