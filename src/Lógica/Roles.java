package Lógica;

public class Roles {

    private String idRol;
    private String rolNombre;
    private String usuario;
    private String contraseña;

    public Roles(String idRol, String rolNombre, String usuario, String contraseña) {
        this.idRol = idRol;
        this.rolNombre = rolNombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
