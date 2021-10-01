package Lógica;

public class Vehiculo {

    private final String placa;
    private String modelo;
    private String tipo;
    private String cedula;

    public Vehiculo(String placa, String modelo, String tipo, String cedula) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.cedula = cedula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
