/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloRegistro;

/**
 *
 * @author Kyle
 */
import java.time.LocalDate;

public class Conducta {
    private int id;
    private String comentario;
    private char nota; // A, B, C, D
    private LocalDate fecha;

    public Conducta() {}

    public Conducta(String comentario, char nota, LocalDate fecha) {
        this.comentario = comentario;
        this.nota = nota;
        this.fecha = fecha;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }

    public char getNota() { return nota; }
    public void setNota(char nota) { this.nota = nota; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}

