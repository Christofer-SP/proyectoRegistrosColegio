/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloRegistro;

/**
 *
 * @author Kyle
 */
public abstract class Persona {
    protected int id;
    protected String nombres;
    protected String apellidos;
    protected TipoIdentidad tipoDocIdentidad;
    protected String codigoDocIdentidad;
    protected String genero;
    protected String direccion;
    protected String numCelular;
    protected String observaciones;
    protected String estado;

    public Persona() {}
    public Persona(String nombres, String apellidos, TipoIdentidad tipoDoc, String codigoDocIdentidad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocIdentidad = tipoDoc;
        this.codigoDocIdentidad = codigoDocIdentidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoIdentidad getTipoDocIdentidad() {
        return tipoDocIdentidad;
    }

    public void setTipoDocIdentidad(TipoIdentidad tipoDocIdentidad) {
        this.tipoDocIdentidad = tipoDocIdentidad;
    }

    public String getCodigoDocIdentidad() {
        return codigoDocIdentidad;
    }

    public void setCodigoDocIdentidad(String codigoDocIdentidad) {
        this.codigoDocIdentidad = codigoDocIdentidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
