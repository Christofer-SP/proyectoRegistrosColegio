package Controlador;

/**
 *
 * @author Kyle
 */
import ModeloRegistro.Estudiante;

public class ControladorEstudiante {

    private Estudiante estudiante;

    public ControladorEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void mostrarResumen() {
        System.out.println("Nombre: " + estudiante.getNombres() + " " + estudiante.getApellidos());
        System.out.println("Documento: " + estudiante.getCodigoDocIdentidad());
        System.out.println("Fecha nacimiento: " + estudiante.getFechaNacimiento());
        System.out.println("Conducta: ");
        estudiante.getConductas().forEach(c -> {
            System.out.println(" - " + c.getNota() + ": " + c.getComentario());
        });
    }
}
