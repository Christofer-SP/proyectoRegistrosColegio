/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Kyle
 */
import DAO.UsuarioDAO;
import ModeloRegistro.Usuario;

public class ControladorLogin {

    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public Usuario autenticar(String email, String contrasenia) {
        return usuarioDAO.buscarPorCredenciales(email, contrasenia);
    }

    public String obtenerRol(Usuario usuario) {
        if (usuario == null) return null;
        return usuario.getRol(); // Ya está en Usuario
    }
}
