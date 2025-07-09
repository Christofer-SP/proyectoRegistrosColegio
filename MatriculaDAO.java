/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Kyle
 */
import ModeloRegistro.Estudiante;
import ModeloRegistro.Matricula;
import DAO.ConexionSQL;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MatriculaDAO implements GenericoDAO<Matricula> {

    @Override
    public void insertar(Matricula m) {
        String sql = "INSERT INTO Matricula (fecha_inicio, fecha_fin, estudiante_id, nivel_educativo, grado, estado, seccion) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDate(1, Date.valueOf(m.getFechaInicio()));
            stmt.setDate(2, m.getFechaFin() != null ? Date.valueOf(m.getFechaFin()) : null);
            stmt.setInt(3, m.getEstudiante().getId());
            stmt.setString(4, m.getNivelEducativo().getTipo());
            stmt.setString(5, m.getGrado().getTipo());
            stmt.setString(6, m.getEstado());
            stmt.setString(7, m.getSeccionn().getNombre());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actualizar(Matricula m) {
        String sql = "UPDATE Matricula SET fecha_inicio=?, fecha_fin=?, estudiante_id=?, nivel_educativo=?, grado=?, estado=? WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDate(1, Date.valueOf(m.getFechaInicio()));
            stmt.setDate(2, m.getFechaFin() != null ? Date.valueOf(m.getFechaFin()) : null);
            stmt.setInt(3, m.getEstudiante().getId());
            stmt.setString(4, m.getNivelEducativo().getTipo());
            stmt.setString(5, m.getGrado().getTipo());
            stmt.setString(6, m.getEstado());
            stmt.setInt(7, m.getId());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Matricula WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Matricula buscarPorId(int id) {
        String sql = "SELECT * FROM Matricula WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Matricula m = new Matricula();
                m.setId(rs.getInt("id"));
                m.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                m.setFechaFin(rs.getDate("fecha_fin") != null ? rs.getDate("fecha_fin").toLocalDate() : null);
                m.setEstado(rs.getString("estado"));

                Estudiante e = new Estudiante();
                e.setId(rs.getInt("estudiante_id"));
                m.setEstudiante(e);

                // nivel y grado solo como String
                ModeloRegistro.NivelEducativo nivel = new ModeloRegistro.NivelEducativo();
                nivel.setTipo(rs.getString("nivel_educativo"));
                m.setNivelEducativo(nivel);

                ModeloRegistro.Grado grado = new ModeloRegistro.Grado();
                grado.setTipo(rs.getString("grado"));
                m.setGrado(grado);

                return m;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Matricula> listarTodos() {
        List<Matricula> lista = new ArrayList<>();
        String sql = "SELECT * FROM Matricula";
        try (Connection conn = ConexionSQL.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Matricula m = new Matricula();
                m.setId(rs.getInt("id"));
                m.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                m.setFechaFin(rs.getDate("fecha_fin") != null ? rs.getDate("fecha_fin").toLocalDate() : null);
                m.setEstado(rs.getString("estado"));

                Estudiante e = new Estudiante();
                e.setId(rs.getInt("estudiante_id"));
                m.setEstudiante(e);

                ModeloRegistro.NivelEducativo nivel = new ModeloRegistro.NivelEducativo();
                nivel.setTipo(rs.getString("nivel_educativo"));
                m.setNivelEducativo(nivel);

                ModeloRegistro.Grado grado = new ModeloRegistro.Grado();
                grado.setTipo(rs.getString("grado"));
                m.setGrado(grado);

                lista.add(m);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    public int contarEstudiantesEnSeccion(String nivel, String grado, String seccion) {
    String sql = "SELECT COUNT(*) FROM Matricula WHERE nivel_educativo = ? AND grado = ? AND seccion = ?";
    try (Connection conn = ConexionSQL.obtenerConexion();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, nivel);
        stmt.setString(2, grado);
        stmt.setString(3, seccion);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}
}
