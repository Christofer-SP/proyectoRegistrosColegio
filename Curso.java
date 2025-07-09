/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloRegistro;

/**
 *
 * @author Kyle
 */
import java.util.List;
import java.util.ArrayList;

public class Curso {
    private int id;
    private String nombre;
    private List<Double> calificaciones;
    private double promedio;
    private String estado;

    public Curso() {
        this.calificaciones = new ArrayList<>();
    }

    public Curso(int id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.calificaciones = new ArrayList<>();
        this.promedio = 0;
    }

    public void agregarNota(double nota) {
        calificaciones.add(nota);
        calcularPromedio();
    }

    private void calcularPromedio() {
        if (calificaciones.isEmpty()) {
            promedio = 0;
            return;
        }
        double suma = 0;
        for (double nota : calificaciones) suma += nota;
        promedio = suma / calificaciones.size();
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Double> getCalificaciones() { return calificaciones; }
    public double getPromedio() { return promedio; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return nombre + " (Promedio: " + promedio + ")";
    }
}
