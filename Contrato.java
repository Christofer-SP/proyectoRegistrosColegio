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

public class Contrato {
    private int id;
    private String tipo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String jornada;
    private double sueldoMensual;
    private boolean renovable;
    private String observaciones;
    private String estado;
    private Turno turno;

    public Contrato() {}

    public Contrato(String tipo, LocalDate fechaInicio, LocalDate fechaFin, String jornada, double sueldoMensual, boolean renovable, String observaciones, Turno turno) {
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.jornada = jornada;
        this.sueldoMensual = sueldoMensual;
        this.renovable = renovable;
        this.observaciones = observaciones;
        this.turno = turno;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public LocalDate getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDate fechaFin) { this.fechaFin = fechaFin; }

    public String getJornada() { return jornada; }
    public void setJornada(String jornada) { this.jornada = jornada; }

    public double getSueldoMensual() { return sueldoMensual; }
    public void setSueldoMensual(double sueldoMensual) { this.sueldoMensual = sueldoMensual; }

    public boolean isRenovable() { return renovable; }
    public void setRenovable(boolean renovable) { this.renovable = renovable; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Turno getTurno() { return turno; }
    public void setTurno(Turno turno) { this.turno = turno; }
}
