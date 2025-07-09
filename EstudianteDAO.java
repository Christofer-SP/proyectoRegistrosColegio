package DAO;

import ModeloRegistro.Estudiante;
import ModeloRegistro.TipoIdentidad;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO implements GenericoDAO<Estudiante> {

    // NUEVO: insertar y obtener el ID generado automáticamente
    public int insertarYObtenerId(Estudiante e) {
        String sql = "INSERT INTO Estudiante (nombres, apellidos, tipo_doc, codigo_doc, genero, direccion, celular, fecha_nacimiento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, e.getNombres());
            stmt.setString(2, e.getApellidos());
            stmt.setString(3, e.getTipoDocIdentidad().getNombre());
            stmt.setString(4, e.getCodigoDocIdentidad());
            stmt.setString(5, e.getGenero());
            stmt.setString(6, e.getDireccion());
            stmt.setString(7, e.getNumCelular());
            stmt.setDate(8, Date.valueOf(e.getFechaNacimiento()));
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1); // Retorna el ID generado
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    @Override
    public void insertar(Estudiante e) {
        // Método base si no necesitas el ID
        String sql = "INSERT INTO Estudiante (nombres, apellidos, tipo_doc, codigo_doc, genero, direccion, celular, fecha_nacimiento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, e.getNombres());
            stmt.setString(2, e.getApellidos());
            stmt.setString(3, e.getTipoDocIdentidad().getNombre());
            stmt.setString(4, e.getCodigoDocIdentidad());
            stmt.setString(5, e.getGenero());
            stmt.setString(6, e.getDireccion());
            stmt.setString(7, e.getNumCelular());
            stmt.setDate(8, Date.valueOf(e.getFechaNacimiento()));
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public boolean existeDocumento(String doc) {
        String sql = "SELECT COUNT(*) FROM Estudiante WHERE codigo_doc = ?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, doc);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void actualizar(Estudiante e) {
        String sql = "UPDATE Estudiante SET nombres=?, apellidos=?, tipo_doc=?, codigo_doc=?, genero=?, direccion=?, celular=?, fecha_nacimiento=? WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, e.getNombres());
            stmt.setString(2, e.getApellidos());
            stmt.setString(3, e.getTipoDocIdentidad().getNombre());
            stmt.setString(4, e.getCodigoDocIdentidad());
            stmt.setString(5, e.getGenero());
            stmt.setString(6, e.getDireccion());
            stmt.setString(7, e.getNumCelular());
            stmt.setDate(8, Date.valueOf(e.getFechaNacimiento()));
            stmt.setInt(9, e.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Estudiante WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Estudiante buscarPorId(int id) {
        String sql = "SELECT * FROM Estudiante WHERE id=?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Estudiante e = new Estudiante();
                e.setId(rs.getInt("id"));
                e.setNombres(rs.getString("nombres"));
                e.setApellidos(rs.getString("apellidos"));
                e.setCodigoDocIdentidad(rs.getString("codigo_doc"));
                e.setGenero(rs.getString("genero"));
                e.setDireccion(rs.getString("direccion"));
                e.setNumCelular(rs.getString("celular"));
                e.setFechaNacimiento(rs.getDate("fecha_nacimiento").toLocalDate());

                TipoIdentidad tipo = new TipoIdentidad();
                tipo.setNombre(rs.getString("tipo_doc"));
                e.setTipoDocIdentidad(tipo);

                return e;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Estudiante> listarTodos() {
        List<Estudiante> lista = new ArrayList<>();
        String sql = "SELECT * FROM Estudiante";
        try (Connection conn = ConexionSQL.obtenerConexion();
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Estudiante e = new Estudiante();
                e.setId(rs.getInt("id"));
                e.setNombres(rs.getString("nombres"));
                e.setApellidos(rs.getString("apellidos"));
                e.setCodigoDocIdentidad(rs.getString("codigo_doc"));
                e.setGenero(rs.getString("genero"));
                e.setDireccion(rs.getString("direccion"));
                e.setNumCelular(rs.getString("celular"));
                e.setFechaNacimiento(rs.getDate("fecha_nacimiento").toLocalDate());

                TipoIdentidad tipo = new TipoIdentidad();
                tipo.setNombre(rs.getString("tipo_doc"));
                e.setTipoDocIdentidad(tipo);

                lista.add(e);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
}
