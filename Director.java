
package ModeloRegistro;

/**
 *
 * @author Kyle
 */
import java.time.LocalDate;
import java.util.List;

public class Director extends Empleado {
    private LocalDate fechaInicioGestion;
    private LocalDate fechaFinGestion;
    private boolean disponibleReuniones;
    private List<Empleado> empleados;

    public Director() {}

    public Director(String nombres, String apellidos, TipoIdentidad tipoDoc, String codigoDoc, LocalDate fechaIngreso, double salarioBase,
                    LocalDate fechaInicioGestion, LocalDate fechaFinGestion, boolean disponibleReuniones) {
        super(nombres, apellidos, tipoDoc, codigoDoc, fechaIngreso, salarioBase);
        this.fechaInicioGestion = fechaInicioGestion;
        this.fechaFinGestion = fechaFinGestion;
        this.disponibleReuniones = disponibleReuniones;
    }

    public LocalDate getFechaInicioGestion() {
        return fechaInicioGestion;
    }

    public void setFechaInicioGestion(LocalDate fechaInicioGestion) {
        this.fechaInicioGestion = fechaInicioGestion;
    }

    public LocalDate getFechaFinGestion() {
        return fechaFinGestion;
    }

    public void setFechaFinGestion(LocalDate fechaFinGestion) {
        this.fechaFinGestion = fechaFinGestion;
    }

    public boolean isDisponibleReuniones() {
        return disponibleReuniones;
    }

    public void setDisponibleReuniones(boolean disponibleReuniones) {
        this.disponibleReuniones = disponibleReuniones;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}