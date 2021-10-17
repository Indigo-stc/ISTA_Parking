package entidades;

public class Vehiculo {

    private final String placa;
    private String modelo;
    private short tipo;
    

    public Vehiculo(String placa, String modelo, short tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    
    
}
