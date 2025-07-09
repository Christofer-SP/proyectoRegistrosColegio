/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Kyle
 */
import ModeloRegistro.Contrato;
import DAO.ConexionSQL;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContratoDAO implements GenericoDAO<Contrato> {

    @Override
    public void insertar(Contrato c) {
        String sql = "INSERT INTO Contrato (tipo, fecha_inicio, fecha_fin, jornada, sueldo_mensual, renovable, observaciones, estado, turno) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, c.getTipo());
            stmt.setDate(2, Date.valueOf(c.getFechaInicio()));
            stmt.setDate(3, Date.valueOf(c.getFechaFin()));
            stmt.setString(4, c.getJornada());
            stmt.setDouble(5, c.getSueldoMensual());
            stmt.setBoolean(6, c.isRenovable());
            stmt.setString(7, c.getObservaciones());
            stmt.setString(8, c.getEstado());
            stmt.setString(9, c.getTurno().getTipo()); // solo guardamos nombre del turno

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actualizar(Contrato c) {
        String sql = "UPDATE Contrato SET tipo=?, fecha_inicio=?, fecha_fin=?, jornada=?, sueldo_mensual=?, renovable=?, observaciones=?, estado=?, turno=? WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, c.getTipo());
            stmt.setDate(2, Date.valueOf(c.getFechaInicio()));
            stmt.setDate(3, Date.valueOf(c.getFechaFin()));
            stmt.setString(4, c.getJornada());
            stmt.setDouble(5, c.getSueldoMensual());
            stmt.setBoolean(6, c.isRenovable());
            stmt.setString(7, c.getObservaciones());
            stmt.setString(8, c.getEstado());
            stmt.setString(9, c.getTurno().getTipo());
            stmt.setInt(10, c.getId());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Contrato WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Contrato buscarPorId(int id) {
        String sql = "SELECT * FROM Contrato WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Contrato c = new Contrato();
                c.setId(rs.getInt("id"));
                c.setTipo(rs.getString("tipo"));
                c.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                c.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                c.setJornada(rs.getString("jornada"));
                c.setSueldoMensual(rs.getDouble("sueldo_mensual"));
                c.setRenovable(rs.getBoolean("renovable"));
                c.setObservaciones(rs.getString("observaciones"));
                c.setEstado(rs.getString("estado"));

                ModeloRegistro.Turno turno = new ModeloRegistro.Turno();
                turno.setTipo(rs.getString("turno"));
                c.setTurno(turno);

                return c;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Contrato> listarTodos() {
        List<Contrato> lista = new ArrayList<>();
        String sql = "SELECT * FROM Contrato";
        try (Connection conn = ConexionSQL.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Contrato c = new Contrato();
                c.setId(rs.getInt("id"));
                c.setTipo(rs.getString("tipo"));
                c.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                c.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                c.setJornada(rs.getString("jornada"));
                c.setSueldoMensual(rs.getDouble("sueldo_mensual"));
                c.setRenovable(rs.getBoolean("renovable"));
                c.setObservaciones(rs.getString("observaciones"));
                c.setEstado(rs.getString("estado"));

                ModeloRegistro.Turno turno = new ModeloRegistro.Turno();
                turno.setTipo(rs.getString("turno"));
                c.setTurno(turno);

                lista.add(c);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }
}
