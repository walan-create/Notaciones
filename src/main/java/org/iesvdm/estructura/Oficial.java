package org.iesvdm.estructura;

public class Oficial extends Operario{

    String categoria;

    public Oficial(String apellido, String nombre, int codigoTaller) {
        super(apellido, nombre, codigoTaller);
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
