package ModeloRegistro;

import java.util.List;

public class Grado {
    private int id;
    private String tipo; // por ejemplo: "1ro", "2do", etc.
    private Turno turno;
    private int numAulas;
    private CalificacionGeneral promedio; // promedio general del grado
    private List<Asignatura> asignaturas;
    private String estado;

    public Grado() {}
    public Grado(String tipo) {
        this.tipo = tipo;
    }

    public Grado(String tipo, Turno turno, int numAulas, CalificacionGeneral promedio) {
        this.tipo = tipo;
        this.turno = turno;
        this.numAulas = numAulas;
        this.promedio = promedio;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Turno getTurno() { return turno; }
    public void setTurno(Turno turno) { this.turno = turno; }

    public int getNumAulas() { return numAulas; }
    public void setNumAulas(int numAulas) { this.numAulas = numAulas; }

    public CalificacionGeneral getPromedio() { return promedio; }
    public void setPromedio(CalificacionGeneral promedio) { this.promedio = promedio; }

    public List<Asignatura> getAsignaturas() { return asignaturas; }
    public void setAsignaturas(List<Asignatura> asignaturas) { this.asignaturas = asignaturas; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
