package org.iesvdm.estructura;

public class Directivo extends Empleado{

    int codigoDespacho;

    public Directivo(String apellido, String nombre, int codigoDespacho) {
        super(apellido, nombre);
        this.codigoDespacho = codigoDespacho;
    }
    public int getCodigoDespacho() {
        return codigoDespacho;
    }
    public void setCodigoDespacho(int codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", codigoDespacho=" + codigoDespacho +
                '}'+ "\n";
    }
}
