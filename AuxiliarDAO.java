/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Kyle
 */

import ModeloRegistro.Auxiliar;
import ModeloRegistro.NivelEducativo;
import ModeloRegistro.TipoIdentidad;
import DAO.ConexionSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuxiliarDAO implements GenericoDAO<Auxiliar> {

    @Override
    public void insertar(Auxiliar a) {
        String sql = "INSERT INTO Auxiliar (nombres, apellidos, tipo_doc, codigo_doc, genero, direccion, celular, nivel_educativo, capacitado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, a.getNombres());
            stmt.setString(2, a.getApellidos());
            stmt.setString(3, a.getTipoDocIdentidad().getNombre());
            stmt.setString(4, a.getCodigoDocIdentidad());
            stmt.setString(5, a.getGenero());
            stmt.setString(6, a.getDireccion());
            stmt.setString(7, a.getNumCelular());
            stmt.setString(8, a.getNivelEducativo().getTipo());
            stmt.setBoolean(9, a.isCapacitado());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actualizar(Auxiliar a) {
        String sql = "UPDATE Auxiliar SET nombres=?, apellidos=?, tipo_doc=?, codigo_doc=?, genero=?, direccion=?, celular=?, nivel_educativo=?, capacitado=? WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, a.getNombres());
            stmt.setString(2, a.getApellidos());
            stmt.setString(3, a.getTipoDocIdentidad().getNombre());
            stmt.setString(4, a.getCodigoDocIdentidad());
            stmt.setString(5, a.getGenero());
            stmt.setString(6, a.getDireccion());
            stmt.setString(7, a.getNumCelular());
            stmt.setString(8, a.getNivelEducativo().getTipo());
            stmt.setBoolean(9, a.isCapacitado());
            stmt.setInt(10, a.getId());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Auxiliar WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Auxiliar buscarPorId(int id) {
        String sql = "SELECT * FROM Auxiliar WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Auxiliar a = new Auxiliar();
                a.setId(rs.getInt("id"));
                a.setNombres(rs.getString("nombres"));
                a.setApellidos(rs.getString("apellidos"));
                a.setCodigoDocIdentidad(rs.getString("codigo_doc"));
                a.setGenero(rs.getString("genero"));
                a.setDireccion(rs.getString("direccion"));
                a.setNumCelular(rs.getString("celular"));
                a.setCapacitado(rs.getBoolean("capacitado"));

                TipoIdentidad tipo = new TipoIdentidad();
                tipo.setNombre(rs.getString("tipo_doc"));
                a.setTipoDocIdentidad(tipo);

                NivelEducativo nivel = new NivelEducativo();
                nivel.setTipo(rs.getString("nivel_educativo"));
                a.setNivelEducativo(nivel);

                return a;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Auxiliar> listarTodos() {
        List<Auxiliar> lista = new ArrayList<>();
        String sql = "SELECT * FROM Auxiliar";
        try (Connection conn = ConexionSQL.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Auxiliar a = new Auxiliar();
                a.setId(rs.getInt("id"));
                a.setNombres(rs.getString("nombres"));
                a.setApellidos(rs.getString("apellidos"));
                a.setCodigoDocIdentidad(rs.getString("codigo_doc"));
                a.setGenero(rs.getString("genero"));
                a.setDireccion(rs.getString("direccion"));
                a.setNumCelular(rs.getString("celular"));
                a.setCapacitado(rs.getBoolean("capacitado"));

                TipoIdentidad tipo = new TipoIdentidad();
                tipo.setNombre(rs.getString("tipo_doc"));
                a.setTipoDocIdentidad(tipo);

                NivelEducativo nivel = new NivelEducativo();
                nivel.setTipo(rs.getString("nivel_educativo"));
                a.setNivelEducativo(nivel);

                lista.add(a);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
}
