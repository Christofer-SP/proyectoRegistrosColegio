/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Kyle
 */
import ModeloRegistro.Asignatura;
import ModeloRegistro.Docente;

import java.util.List;

public class ControladorDocente {

    private Docente docente;

    public ControladorDocente(Docente docente) {
        this.docente = docente;
    }

    public List<Asignatura> obtenerAsignaturas() {
        return docente.getAsignaturas();
    }

    public void registrarNotaBimestral(Asignatura asignatura, int periodoIndex, int nota) {
        if (periodoIndex >= 0 && periodoIndex < asignatura.getPeriodos().size()) {
            asignatura.getPeriodos().get(periodoIndex).getCalificacionGeneral().setNota(nota);
        }
    }

    public double obtenerPromedioFinal(Asignatura asignatura) {
        return asignatura.calcularPromedioFinal();
    }
}
