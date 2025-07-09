/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloRegistro;

/**
 *
 * @author Kyle
 */
public class NivelEducativo {
    private int id;
    private String tipo;
    private String descripcion;
    private String estado;

    public NivelEducativo() {}
    
    public NivelEducativo(String tipo) {
        this.tipo = tipo;
    }
    public NivelEducativo(String tipo, String descripcion, String estado) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
