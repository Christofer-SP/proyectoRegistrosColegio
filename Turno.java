/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloRegistro;

/**
 *
 * @author Kyle
 */
import java.time.LocalTime;

public class Turno {
    private int id;
    private String tipo;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String descripcion;
    private String estado;

    public Turno() {}
    
    public Turno(String tipo) {
        this.tipo = tipo;
    }
    
    public Turno(String tipo, LocalTime horaInicio, LocalTime horaFin, String descripcion, String estado) {
        this.tipo = tipo;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public LocalTime getHoraInicio() { return horaInicio; }
    public void setHoraInicio(LocalTime horaInicio) { this.horaInicio = horaInicio; }

    public LocalTime getHoraFin() { return horaFin; }
    public void setHoraFin(LocalTime horaFin) { this.horaFin = horaFin; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
