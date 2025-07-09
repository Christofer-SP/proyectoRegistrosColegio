/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Kyle
 */
import java.util.List;

public interface GenericoDAO<T> {
    void insertar(T obj);
    void actualizar(T obj);
    void eliminar(int id);
    T buscarPorId(int id);
    List<T> listarTodos();
}
