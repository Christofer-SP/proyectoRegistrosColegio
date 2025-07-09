/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloRegistro;

/**
 *
 * @author Kyle
 */
public class Ubicacion {
    private int id;
    private String edificio;   // Ejemplo: "Pabellón A"
    private String planta;     // Ejemplo: "Segundo Piso"
    private String referencia; // Ejemplo: "Frente al laboratorio"

    public Ubicacion() {}

    public Ubicacion(String edificio, String planta, String referencia) {
        this.edificio = edificio;
        this.planta = planta;
        this.referencia = referencia;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEdificio() { return edificio; }
    public void setEdificio(String edificio) { this.edificio = edificio; }

    public String getPlanta() { return planta; }
    public void setPlanta(String planta) { this.planta = planta; }

    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }
}
