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

public class Periodo {
    private int id;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private CalificacionGeneral calificacionGeneral;
    private String observaciones;
    private String estado;

    public Periodo() {}

    public Periodo(String nombre, LocalDate fechaInicio, LocalDate fechaFin, CalificacionGeneral calificacionGeneral, String observaciones) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.calificacionGeneral = calificacionGeneral;
        this.observaciones = observaciones;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public LocalDate getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDate fechaFin) { this.fechaFin = fechaFin; }

    public CalificacionGeneral getCalificacionGeneral() { return calificacionGeneral; }
    public void setCalificacionGeneral(CalificacionGeneral calificacionGeneral) { this.calificacionGeneral = calificacionGeneral; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
