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

public class Asignatura {
    private int id;
    private int codigo;
    private String nombre;
    private List<Periodo> periodos;
    private String estado;

    public Asignatura() {}

    public Asignatura(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Periodo> getPeriodos() { return periodos; }
    public void setPeriodos(List<Periodo> periodos) { this.periodos = periodos; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double calcularPromedioFinal() {
        if (periodos == null || periodos.isEmpty()) return 0;
        double suma = 0;
        int cantidad = 0;
        for (Periodo p : periodos) {
            suma += p.getCalificacionGeneral().getNota();
            cantidad++;
        }
        return cantidad == 0 ? 0 : suma / cantidad;
    }
}