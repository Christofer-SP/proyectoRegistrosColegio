/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloRegistro;

/**
 *
 * @author Kyle
 */
public class Especialidad {
    private int id;
    private String nombre;
    private String areaConocimiento;
    private String descripcion;
    private String estado;

    public Especialidad() {}

    public Especialidad(String nombre, String areaConocimiento, String descripcion, String estado) {
        this.nombre = nombre;
        this.areaConocimiento = areaConocimiento;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getAreaConocimiento() { return areaConocimiento; }
    public void setAreaConocimiento(String areaConocimiento) { this.areaConocimiento = areaConocimiento; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
