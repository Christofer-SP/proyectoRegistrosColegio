/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloRegistro;

/**
 *
 * @author Kyle
 */
import java.util.List;

public class Seccion {
    private int id;
    private String nombre; // ejemplo: "A", "B", etc.
    private String observaciones;
    private Docente docente;
    private Auxiliar auxiliarACargo;
    private List<Aula> aulas;
    private List<Matricula> matriculas;
    private String estado;

    public Seccion() {}
    
    public Seccion(String nombre) {
        this.nombre = nombre;
    }    

    public Seccion(String nombre, String observaciones, Docente docente, Auxiliar auxiliar) {
        this.nombre = nombre;
        this.observaciones = observaciones;
        this.docente = docente;
        this.auxiliarACargo = auxiliar;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public Docente getDocente() { return docente; }
    public void setDocente(Docente docente) { this.docente = docente; }

    public Auxiliar getAuxiliarACargo() { return auxiliarACargo; }
    public void setAuxiliarACargo(Auxiliar auxiliarACargo) { this.auxiliarACargo = auxiliarACargo; }

    public List<Aula> getAulas() { return aulas; }
    public void setAulas(List<Aula> aulas) { this.aulas = aulas; }

    public List<Matricula> getMatriculas() { return matriculas; }
    public void setMatriculas(List<Matricula> matriculas) { this.matriculas = matriculas; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
