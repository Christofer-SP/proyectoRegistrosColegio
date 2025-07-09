/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import DAO.UsuarioDAO;
/**
 *
 * @author Kyle
 */
public class GeneradorCorreo {

    public static String generarCorreoInstitucional(String nombres, String apellidos, String numDoc, UsuarioDAO usuarioDAO) {
        String primerNombre = nombres.split(" ")[0].toLowerCase();
        String primerApellido = apellidos.split(" ")[0].toLowerCase();
        String correoBase = primerNombre;
        String dominio = "@edu.pe";

        // 1. Intentar con últimos 2 dígitos
        String sufijo = numDoc.length() >= 2 ? numDoc.substring(numDoc.length() - 2) : numDoc;
        String correo = correoBase + sufijo + primerApellido + dominio;

        if (!usuarioDAO.existeCorreo(correo)) return correo;

        // 2. Intentar con últimos 3 dígitos
        if (numDoc.length() >= 3) {
            sufijo = numDoc.substring(numDoc.length() - 3);
            correo = correoBase + sufijo + primerApellido + dominio;
            if (!usuarioDAO.existeCorreo(correo)) return correo;
        }

        // 3. Intentar con todos los dígitos del documento
        correo = correoBase + numDoc + primerApellido + dominio;
        if (!usuarioDAO.existeCorreo(correo)) return correo;

        // 4. Última opción: añadir número incremental
        int contador = 1;
        while (true) {
            correo = correoBase + numDoc + primerApellido + contador + dominio;
            if (!usuarioDAO.existeCorreo(correo)) return correo;
            contador++;
        }
    }
}
