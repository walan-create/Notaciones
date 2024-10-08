package org.iesvdm.estructura;

public class Empleado {

    String nombre;
    String apellido;

    public Empleado(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}'+ "\n";
    }
}
