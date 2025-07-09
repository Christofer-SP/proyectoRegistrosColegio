// ModeloRegistro/Usuario.java
package ModeloRegistro;
public class Usuario {
    private int id;
    private String email;
    private String contrasenia;
    private String rol; // "DIRECTOR", "DOCENTE", "AUXILIAR", "ESTUDIANTE"

    public Usuario() {}

    public Usuario(String email, String contrasenia, String rol) {
        this.email = email;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContrasenia() { return contrasenia; }
    public void setContrasenia(String contrasenia) { this.contrasenia = contrasenia; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}