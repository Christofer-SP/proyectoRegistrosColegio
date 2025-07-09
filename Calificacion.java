package ModeloRegistro;

/**
 *
 * @author Kyle
 */
public class Calificacion {
    private String curso;
    private double nota;

    public Calificacion() {}

    public Calificacion(String curso, double nota) {
        this.curso = curso;
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Calificacion{" + "curso=" + curso + ", nota=" + nota + '}';
    }
    
    
}
