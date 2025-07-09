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
public class Docente extends Empleado {
    private String gradoAcademico;
    private boolean esTutor;
    private int aniosExperiencia;
    private List<Asignatura> asignaturas;

    public Docente() {}

    public Docente(String nombres, String apellidos, TipoIdentidad tipoDoc, String codigoDoc, String gradoAcademico, boolean esTutor, int aniosExperiencia) {
        super(nombres, apellidos, tipoDoc, codigoDoc, null, 0);
        this.gradoAcademico = gradoAcademico;
        this.esTutor = esTutor;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public boolean isEsTutor() {
        return esTutor;
    }

    public void setEsTutor(boolean esTutor) {
        this.esTutor = esTutor;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
