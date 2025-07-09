/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloRegistro;

/**
 *
 * @author Kyle
 */
public class Cargo {
    private int id;
    private String tipo;
    private int jerarquia;
    private String descripcion;
    private String estado;

    public Cargo() {}

    public Cargo(String tipo, int jerarquia, String descripcion, String estado) {
        this.tipo = tipo;
        this.jerarquia = jerarquia;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getJerarquia() { return jerarquia; }
    public void setJerarquia(int jerarquia) { this.jerarquia = jerarquia; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}