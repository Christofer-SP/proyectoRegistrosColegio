/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Kyle
 */
import java.util.Scanner;

public class ValidarDatos {

    private static final Scanner sc = new Scanner(System.in);

    public static String leerTextoNoVacio(String mensaje) {
        String input;
        do {
            System.out.print(mensaje);
            input = sc.nextLine().trim();
        } while (input.isEmpty());
        return input;
    }

    public static String leerDNI() {
        String dni;
        do {
            System.out.print("DNI (8 dígitos): ");
            dni = sc.nextLine().trim();
        } while (!dni.matches("\\d{8}"));
        return dni;
    }

    public static String leerCorreo() {
        String correo;
        do {
            System.out.print("Correo electrónico: ");
            correo = sc.nextLine().trim();
        } while (!correo.contains("@") || correo.startsWith("@") || correo.endsWith("@"));
        return correo;
    }

    public static String leerContrasenia() {
        String contrasenia;
        do {
            System.out.print("Contraseña (mínimo 4 caracteres): ");
            contrasenia = sc.nextLine().trim();
        } while (contrasenia.length() < 4);
        return contrasenia;
    }

    public static String leerCelular() {
        String celular;
        do {
            System.out.print("Celular (9 dígitos): ");
            celular = sc.nextLine().trim();
        } while (!celular.matches("\\d{9}"));
        return celular;
    }
    public static int leerEdad() {
        int edad;
        do {
            System.out.print("Edad (11-18): ");
            edad = Integer.parseInt(sc.nextLine());
        } while (edad < 11 || edad > 18);
        return edad;
    }

    public static String leerGrado() {
        String grado;
        do {
            System.out.print("Grado (1 a 5): ");
            grado = sc.nextLine();
        } while (!grado.matches("[1-5]"));
        return grado;
    }

    public static String leerSeccion() {
        String seccion;
        do {
            System.out.print("Sección (letra A-Z): ");
            seccion = sc.nextLine().toUpperCase();
        } while (!seccion.matches("[A-Z]"));
        return seccion;
    }
    public static String leerTurno() {
        String turno;
        while (true) {
            System.out.println("Seleccione Turno:");
            System.out.println("1. Mañana");
            System.out.println("2. Tarde");
            System.out.print("Opción: ");
            String opcion = sc.nextLine().trim();
            switch (opcion) {
            case "1":
                turno = "mañana";
                return turno;
            case "2":
                turno = "tarde";
                return turno;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
    public static double leerSueldo() {
        Scanner sc = new Scanner(System.in);
        double sueldo;
        do {
            System.out.print("Sueldo (mayor que 0): ");
            try {
            sueldo = Double.parseDouble(sc.nextLine());
            if (sueldo <= 0) {
                System.out.println(" El sueldo debe ser mayor a 0.");
            }
        } catch (NumberFormatException e) {
            System.out.println(" Entrada inválida. Ingrese un número.");
            sueldo = -1;
        }
    } while (sueldo <= 0);
        return sueldo;
    }
    public static String leerAreaTrabajo() {
        return leerTextoNoVacio("Área de trabajo: ");
    }
    public static String leerEspecialidad() {
        return leerTextoNoVacio("Especialidad del profesor: ");
    }
    
}
