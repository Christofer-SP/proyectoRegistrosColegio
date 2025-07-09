package ModeloRegistro;

import java.util.Date;

public class Comentario {
    private Estudiante estudiante;
    private Auxiliar auxiliar;
    private String texto;
    private Date fecha;

    public Comentario() {}

    public Comentario(Estudiante estudiante, Auxiliar auxiliar, String texto, Date fecha) {
        this.estudiante = estudiante;
        this.auxiliar = auxiliar;
        this.texto = texto;
        this.fecha = fecha;
    }

    // ===== Getters y Setters =====

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Auxiliar getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(Auxiliar auxiliar) {
        this.auxiliar = auxiliar;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Comentario sobre " + estudiante.getNombres() + " " + estudiante.getApellidos() +
               " por " + auxiliar.getNombres() + ": " + texto +
               " [" + fecha + "]";
    }
}
