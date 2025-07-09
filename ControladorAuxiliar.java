package Controlador;
import ModeloRegistro.Conducta;
import ModeloRegistro.Estudiante;

import java.time.LocalDate;

public class ControladorAuxiliar {

    public void registrarConducta(Estudiante estudiante, char letra, String comentario) {
        Conducta conducta = new Conducta(comentario, letra, LocalDate.now());
        estudiante.getConductas().add(conducta);
    }

    public boolean tieneConductaInadecuada(Estudiante estudiante) {
        return estudiante.getConductas().stream().anyMatch(c -> c.getNota() == 'C' || c.getNota() == 'D');
    }
}