package Controlador;

import ModeloRegistro.*;
import util.ValidarDatos;

import DAO.*;
import ModeloRegistro.*;

import java.util.List;

public class ControladorDirector {
    private DocenteDAO docenteDAO = new DocenteDAO();
    private AuxiliarDAO auxiliarDAO = new AuxiliarDAO();
    private EstudianteDAO estudianteDAO = new EstudianteDAO();
    private MatriculaDAO matriculaDAO = new MatriculaDAO();

    // Contratar docente
    public void registrarDocente(Docente docente) {
        docenteDAO.insertar(docente);
    }

    public List<Docente> listarDocentes() {
        return docenteDAO.listarTodos();
    }

    // Contratar auxiliar
    public void registrarAuxiliar(Auxiliar auxiliar) {
        auxiliarDAO.insertar(auxiliar);
    }

    public List<Auxiliar> listarAuxiliares() {
        return auxiliarDAO.listarTodos();
    }

    // Matricular estudiante
    public void registrarEstudiante(Estudiante estudiante) {
        estudianteDAO.insertar(estudiante);
    }

    public void matricularEstudiante(Matricula matricula) {
        matriculaDAO.insertar(matricula);
    }

    public List<Estudiante> listarEstudiantes() {
        return estudianteDAO.listarTodos();
    }
}