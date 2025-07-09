/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Kyle
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionSQL {

    private static final String URL = "jdbc:sqlserver://KYLEPC:1433;databaseName=SistemaEscolar;encrypt=true;trustServerCertificate=true";
    private static final String USUARIO = "sa"; // o el que configuraste
    private static final String CONTRASENIA = "1234"; // cambia si no es esa

    public static Connection obtenerConexion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
            System.out.println("Conexion establecida correctamente.");
            return con;
        } catch (Exception e) {
            System.err.println("Error en la conexion:");
            e.printStackTrace();
            return null;
        }
    }
}
