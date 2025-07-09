/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Kyle
 */
import DAO.MatriculaDAO;
import ModeloRegistro.Matricula;

import java.util.List;

public class ControladorMatricula {

    private MatriculaDAO matriculaDAO = new MatriculaDAO();

    public void registrarMatricula(Matricula m) {
        matriculaDAO.insertar(m);
    }

    public List<Matricula> listarMatriculas() {
        return matriculaDAO.listarTodos();
    }
}
