/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Kyle
 */
import ModeloRegistro.Usuario;
import DAO.ConexionSQL;

import java.sql.*;

public class UsuarioDAO {

    public Usuario buscarPorCredenciales(String email, String contrasenia) {
        String sql = "SELECT * FROM Usuario WHERE email=? AND contrasenia=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, contrasenia);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setEmail(rs.getString("email"));
                usuario.setContrasenia(rs.getString("contrasenia"));
                usuario.setRol(rs.getString("rol"));
                return usuario;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    

    public void insertar(Usuario u) {
        String sql = "INSERT INTO Usuario (email, contrasenia, rol) VALUES (?, ?, ?)";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getContrasenia());
            stmt.setString(3, u.getRol());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public boolean existeCorreo(String correo) {
        String sql = "SELECT COUNT(*) FROM Usuario WHERE email = ?";
        try (Connection conn = ConexionSQL.obtenerConexion();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, correo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return false;
        }
}
