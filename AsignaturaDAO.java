/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Kyle
 */
import ModeloRegistro.Asignatura;
import DAO.ConexionSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AsignaturaDAO implements GenericoDAO<Asignatura> {

    @Override
    public void insertar(Asignatura a) {
        String sql = "INSERT INTO Asignatura (codigo, nombre, estado) VALUES (?, ?, ?)";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, a.getCodigo());
            stmt.setString(2, a.getNombre());
            stmt.setString(3, a.getEstado());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actualizar(Asignatura a) {
        String sql = "UPDATE Asignatura SET codigo=?, nombre=?, estado=? WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, a.getCodigo());
            stmt.setString(2, a.getNombre());
            stmt.setString(3, a.getEstado());
            stmt.setInt(4, a.getId());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Asignatura WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Asignatura buscarPorId(int id) {
        String sql = "SELECT * FROM Asignatura WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Asignatura a = new Asignatura();
                a.setId(rs.getInt("id"));
                a.setCodigo(rs.getInt("codigo"));
                a.setNombre(rs.getString("nombre"));
                a.setEstado(rs.getString("estado"));
                return a;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Asignatura> listarTodos() {
        List<Asignatura> lista = new ArrayList<>();
        String sql = "SELECT * FROM Asignatura";

        try (Connection conn = ConexionSQL.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Asignatura a = new Asignatura();
                a.setId(rs.getInt("id"));
                a.setCodigo(rs.getInt("codigo"));
                a.setNombre(rs.getString("nombre"));
                a.setEstado(rs.getString("estado"));
                lista.add(a);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }
}
