package org.iesvdm.ejercicio3;

public class Tarea {
    private String titulo;
    private String descripcion;
    private String diaSemana;
    private String hora;

    public Tarea(String titulo, String descripcion, String diaSemana, String hora) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.diaSemana = diaSemana;
        this.hora = hora;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", diaSemana='" + diaSemana + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}
