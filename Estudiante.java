package ModeloRegistro;

import java.util.List;
import java.time.LocalDate;

public class Estudiante extends Persona {
    private LocalDate fechaNacimiento;
    private List<Asistencia> asistencias;
    private List<Conducta> conductas;
    private Turno turno;
    private Grado grado;
    private Seccion seccion;
    private NivelEducativo nivelEducativo;

    public Estudiante() {}

    public Estudiante(String nombres, String apellidos, TipoIdentidad tipoDoc, String codigoDoc, LocalDate fechaNacimiento) {
        super(nombres, apellidos, tipoDoc, codigoDoc);
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(List<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }

    public List<Conducta> getConductas() {
        return conductas;
    }

    public void setConductas(List<Conducta> conductas) {
        this.conductas = conductas;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public NivelEducativo getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(NivelEducativo nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }
}
