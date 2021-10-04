package entidades;

public class Roles {

    private String idRol;
    private String rolNombre;

    public Roles(String idRol, String rolNombre) {
        this.idRol = idRol;
        this.rolNombre = rolNombre;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }
    
}
