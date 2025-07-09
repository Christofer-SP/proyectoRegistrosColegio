package ModeloRegistro;

/**
 *
 * @author Kyle
 */

import java.time.LocalDate;
import java.util.List;

public class Asistencia {
    private int id;
    private LocalDate fecha;
    private List<Periodo> periodos; // Asistencia por periodo (p1, p2, p3, p4)
    private String observaciones;
    private String estado;

    public Asistencia() {}

    public Asistencia(LocalDate fecha, List<Periodo> periodos) {
        this.fecha = fecha;
        this.periodos = periodos;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public List<Periodo> getPeriodos() { return periodos; }
    public void setPeriodos(List<Periodo> periodos) { this.periodos = periodos; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
