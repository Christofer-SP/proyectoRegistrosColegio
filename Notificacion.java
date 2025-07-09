package ModeloRegistro;

import java.util.Date;

public class Notificacion {
    private Estudiante destinatario;
    private String mensaje;
    private String nivel; // "urgente" o "normal"
    private Date fecha;

    public Notificacion() {}

    public Notificacion(Estudiante destinatario, String mensaje, String nivel, Date fecha) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.nivel = nivel;
        this.fecha = fecha;
    }

    // Getters y setters

    public Estudiante getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Estudiante destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Notificación [" + nivel.toUpperCase() + "] para " +
               destinatario.getNombres() + ": " + mensaje + " (" + fecha + ")";
    }
}
