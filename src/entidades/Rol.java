package entidades;

public class Rol {
    
    private short idrol;
    private String rolnombre;

    public Rol(short idrol, String rolnombre) {
        this.idrol = idrol;
        this.rolnombre = rolnombre;
    }

    public short getIdrol() {
        return idrol;
    }

    public void setIdrol(short idrol) {
        this.idrol = idrol;
    }

    public String getRolnombre() {
        return rolnombre;
    }

    public void setRolnombre(String rolnombre) {
        this.rolnombre = rolnombre;
    }

    @Override
    public String toString() {
        return this.rolnombre;
    }
    
    
}
