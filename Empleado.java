package ModeloRegistro;

import java.time.LocalDate;
import java.util.List;

public class Empleado extends Persona {
    protected LocalDate fechaIngreso;
    protected double salarioBase;
    protected List<Especialidad> especialidades;
    protected Cargo cargo;
    protected Contrato contrato;

    public Empleado() {}

    public Empleado(String nombres, String apellidos, TipoIdentidad tipoDoc, String codigoDoc, LocalDate fechaIngreso, double salarioBase) {
        super(nombres, apellidos, tipoDoc, codigoDoc);
        this.fechaIngreso = fechaIngreso;
        this.salarioBase = salarioBase;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}
