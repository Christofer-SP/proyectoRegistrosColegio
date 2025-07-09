/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloRegistro;

/**
 *
 * @author Kyle
 */
import java.time.LocalDate;

public class Matricula {
    private int id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Estudiante estudiante;
    private NivelEducativo nivelEducativo;
    private Grado grado;
    private String estado;
    private Seccion seccionn;

    public Matricula() {}

    public Matricula(LocalDate fechaInicio, Estudiante estudiante, NivelEducativo nivelEducativo, Grado grado, Seccion seccionn) {
        this.fechaInicio = fechaInicio;
        this.estudiante = estudiante;
        this.nivelEducativo = nivelEducativo;
        this.grado = grado;
        this.seccionn = seccionn;
    }

    public Seccion getSeccionn() { return seccionn; }
    public void setSeccionn(Seccion seccionn) {this.seccionn = seccionn;}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public LocalDate getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDate fechaFin) { this.fechaFin = fechaFin; }

    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }

    public NivelEducativo getNivelEducativo() { return nivelEducativo; }
    public void setNivelEducativo(NivelEducativo nivelEducativo) { this.nivelEducativo = nivelEducativo; }

    public Grado getGrado() { return grado; }
    public void setGrado(Grado grado) { this.grado = grado; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    
    
}