/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Kyle
 */
import ModeloRegistro.Docente;
import ModeloRegistro.TipoIdentidad;
import DAO.ConexionSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DocenteDAO implements GenericoDAO<Docente> {

    @Override
    public void insertar(Docente d) {
        String sql = "INSERT INTO Docente (nombres, apellidos, tipo_doc, codigo_doc, genero, direccion, celular, grado_academico, es_tutor, anios_experiencia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, d.getNombres());
            stmt.setString(2, d.getApellidos());
            stmt.setString(3, d.getTipoDocIdentidad().getNombre());
            stmt.setString(4, d.getCodigoDocIdentidad());
            stmt.setString(5, d.getGenero());
            stmt.setString(6, d.getDireccion());
            stmt.setString(7, d.getNumCelular());
            stmt.setString(8, d.getGradoAcademico());
            stmt.setBoolean(9, d.isEsTutor());
            stmt.setInt(10, d.getAniosExperiencia());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actualizar(Docente d) {
        String sql = "UPDATE Docente SET nombres=?, apellidos=?, tipo_doc=?, codigo_doc=?, genero=?, direccion=?, celular=?, grado_academico=?, es_tutor=?, anios_experiencia=? WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, d.getNombres());
            stmt.setString(2, d.getApellidos());
            stmt.setString(3, d.getTipoDocIdentidad().getNombre());
            stmt.setString(4, d.getCodigoDocIdentidad());
            stmt.setString(5, d.getGenero());
            stmt.setString(6, d.getDireccion());
            stmt.setString(7, d.getNumCelular());
            stmt.setString(8, d.getGradoAcademico());
            stmt.setBoolean(9, d.isEsTutor());
            stmt.setInt(10, d.getAniosExperiencia());
            stmt.setInt(11, d.getId());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Docente WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Docente buscarPorId(int id) {
        String sql = "SELECT * FROM Docente WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Docente d = new Docente();
                d.setId(rs.getInt("id"));
                d.setNombres(rs.getString("nombres"));
                d.setApellidos(rs.getString("apellidos"));
                d.setCodigoDocIdentidad(rs.getString("codigo_doc"));
                d.setGenero(rs.getString("genero"));
                d.setDireccion(rs.getString("direccion"));
                d.setNumCelular(rs.getString("celular"));
                d.setGradoAcademico(rs.getString("grado_academico"));
                d.setEsTutor(rs.getBoolean("es_tutor"));
                d.setAniosExperiencia(rs.getInt("anios_experiencia"));

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
    public List<Docente> listarTodos() {
        List<Docente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Docente";
        try (Connection conn = ConexionSQL.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Docente d = new Docente();
                d.setId(rs.getInt("id"));
                d.setNombres(rs.getString("nombres"));
                d.setApellidos(rs.getString("apellidos"));
                d.setCodigoDocIdentidad(rs.getString("codigo_doc"));
                d.setGenero(rs.getString("genero"));
                d.setDireccion(rs.getString("direccion"));
                d.setNumCelular(rs.getString("celular"));
                d.setGradoAcademico(rs.getString("grado_academico"));
                d.setEsTutor(rs.getBoolean("es_tutor"));
                d.setAniosExperiencia(rs.getInt("anios_experiencia"));

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
