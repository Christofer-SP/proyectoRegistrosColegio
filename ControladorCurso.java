/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Kyle
 */
import ModeloRegistro.Curso;
import java.util.ArrayList;
import java.util.List;

public class ControladorCurso {
    private List<Curso> cursos;

    public ControladorCurso() {
        cursos = new ArrayList<>();
    }

    public Curso crearCurso(int id, String nombre, String estado) {
        Curso curso = new Curso(id, nombre, estado);
        cursos.add(curso);
        return curso;
    }

    public Curso buscarCurso(String nombre) {
        for (Curso c : cursos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public Curso buscarCurso(int id) {
        for (Curso c : cursos) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
