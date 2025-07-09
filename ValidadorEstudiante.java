/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Date;

/**
 *
 * @author Kyle
 */
public class ValidadorEstudiante {
    public static String validar(String tipoDoc, String numDoc, String nombres, String apellidos,
                                 String telefono, String nivel, String tipoTurno,
                                 String grado, String seccion, String pass, String confirm, Date fecha) {

        if (tipoDoc.equals("seleccione un tipo")) return "Debe seleccionar un tipo de documento.";
        if (numDoc.isEmpty()) return "Debe ingresar el número de documento.";
        if (!numDoc.matches("\\d{8,12}")) return "El número de documento debe tener entre 8 y 12 dígitos.";
        if (nombres.isEmpty()) return "Debe ingresar el nombre del estudiante.";
        if (apellidos.isEmpty()) return "Debe ingresar los apellidos del estudiante.";
        if (telefono.isEmpty()) return "Debe ingresar el número de teléfono.";
        if (!telefono.matches("\\d{9}")) return "El número de teléfono debe tener 9 dígitos.";
        if (nivel.equals("seleccione nivel")) return "Debe seleccionar el nivel educativo.";
        if (tipoTurno.equals("Seleccione")) return "Debe seleccionar el turno.";
        if (grado.equals("Seleccione")) return "Debe seleccionar el grado.";
        if (seccion.equals("Seleccione seccion")) return "Debe seleccionar la sección.";
        if (fecha == null) return ("Debe seleccionar una fecha de nacimiento.");
        if (pass.isEmpty()) return "Debe ingresar una contraseña.";
        if (confirm.isEmpty()) return "Debe confirmar la contraseña.";
        if (!pass.equals(confirm)) return "Las contraseñas no coinciden.";
        if (pass.length() < 6) return "La contraseña debe tener al menos 6 caracteres.";

        return null; // válido
    }
}