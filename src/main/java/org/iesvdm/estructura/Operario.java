package org.iesvdm.estructura;

public class Operario extends Empleado{

    int codigoTaller;

    public Operario(String apellido, String nombre, int codigoTaller) {
        super(apellido, nombre);
        this.codigoTaller = codigoTaller;
    }
    public int getCodigoTaller() {
        return codigoTaller;
    }
    public void setCodigoTaller(int codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "codigoTaller=" + codigoTaller +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}'+ "\n";
    }
}
