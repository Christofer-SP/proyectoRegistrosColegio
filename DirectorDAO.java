/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Kyle
 */
import ModeloRegistro.Director;
import ModeloRegistro.TipoIdentidad;
import DAO.ConexionSQL;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DirectorDAO implements GenericoDAO<Director> {

    @Override
    public void insertar(Director d) {
        String sql = "INSERT INTO Director (nombres, apellidos, tipo_doc, codigo_doc, genero, direccion, celular, fecha_inicio_gestion, fecha_fin_gestion, disponible_reuniones) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, d.getNombres());
            stmt.setString(2, d.getApellidos());
            stmt.setString(3, d.getTipoDocIdentidad().getNombre());
            stmt.setString(4, d.getCodigoDocIdentidad());
            stmt.setString(5, d.getGenero());
            stmt.setString(6, d.getDireccion());
            stmt.setString(7, d.getNumCelular());
            stmt.setDate(8, Date.valueOf(d.getFechaInicioGestion()));
            stmt.setDate(9, Date.valueOf(d.getFechaFinGestion()));
            stmt.setBoolean(10, d.isDisponibleReuniones());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actualizar(Director d) {
        String sql = "UPDATE Director SET nombres=?, apellidos=?, tipo_doc=?, codigo_doc=?, genero=?, direccion=?, celular=?, fecha_inicio_gestion=?, fecha_fin_gestion=?, disponible_reuniones=? WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, d.getNombres());
            stmt.setString(2, d.getApellidos());
            stmt.setString(3, d.getTipoDocIdentidad().getNombre());
            stmt.setString(4, d.getCodigoDocIdentidad());
            stmt.setString(5, d.getGenero());
            stmt.setString(6, d.getDireccion());
            stmt.setString(7, d.getNumCelular());
            stmt.setDate(8, Date.valueOf(d.getFechaInicioGestion()));
            stmt.setDate(9, Date.valueOf(d.getFechaFinGestion()));
            stmt.setBoolean(10, d.isDisponibleReuniones());
            stmt.setInt(11, d.getId());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Director WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Director buscarPorId(int id) {
        String sql = "SELECT * FROM Director WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Director d = new Director();
                d.setId(rs.getInt("id"));
                d.setNombres(rs.getString("nombres"));
                d.setApellidos(rs.getString("apellidos"));
                d.setCodigoDocIdentidad(rs.getString("codigo_doc"));
                d.setGenero(rs.getString("genero"));
                d.setDireccion(rs.getString("direccion"));
                d.setNumCelular(rs.getString("celular"));
                d.setFechaInicioGestion(rs.getDate("fecha_inicio_gestion").toLocalDate());
                d.setFechaFinGestion(rs.getDate("fecha_fin_gestion").toLocalDate());
                d.setDisponibleReuniones(rs.getBoolean("disponible_reuniones"));

                TipoIdentidad tipo = new TipoIdentidad();
                tipo.setNombre(rs.getString("tipo_doc"));
                d.setTipoDocIdentidad(tipo);

                return d;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Director> listarTodos() {
        List<Director> lista = new ArrayList<>();
        String sql = "SELECT * FROM Director";
        try (Connection conn = ConexionSQL.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Director d = new Director();
                d.setId(rs.getInt("id"));
                d.setNombres(rs.getString("nombres"));
                d.setApellidos(rs.getString("apellidos"));
                d.setCodigoDocIdentidad(rs.getString("codigo_doc"));
                d.setGenero(rs.getString("genero"));
                d.setDireccion(rs.getString("direccion"));
                d.setNumCelular(rs.getString("celular"));
                d.setFechaInicioGestion(rs.getDate("fecha_inicio_gestion").toLocalDate());
                d.setFechaFinGestion(rs.getDate("fecha_fin_gestion").toLocalDate());
                d.setDisponibleReuniones(rs.getBoolean("disponible_reuniones"));

                TipoIdentidad tipo = new TipoIdentidad();
                tipo.setNombre(rs.getString("tipo_doc"));
                d.setTipoDocIdentidad(tipo);

                lista.add(d);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
}
