package org.iesvdm.estructura;

public class Tecnico extends Operario{

    String perfil;

    public Tecnico(String apellido, String nombre, int codigoTaller) {
        super(apellido, nombre, codigoTaller);
    }
    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "perfil='" + perfil + '\'' +
                ", codigoTaller=" + codigoTaller +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}'+ "\n";
    }
}
