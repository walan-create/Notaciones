package org.iesvdm.estructura;

import org.iesvdm.anotacion.*;
import org.iesvdm.anotacion.Directivo;
import org.iesvdm.anotacion.Empleado;
import org.iesvdm.anotacion.Oficial;
import org.iesvdm.anotacion.Operario;
import org.iesvdm.anotacion.Tecnico;

import java.util.ArrayList;
import java.util.List;

//Ejercicio 1
//Los empleados pertenecen a la notación Empleado y se distingue tu tipo por el atributo clase
@Empleado(nombre = "Julio", apellido = "Vega", clase = "Directivo", codigoDepartamento = 1)
@Empleado(nombre = "Pedro", apellido = "Alcaraz", clase = "Tecnico", codigoDepartamento = 2)
@Empleado(nombre = "Maria", apellido = "Gonzalez", clase = "Oficial", codigoDepartamento = 3)

//Ejercicio 2
//Los empleados pertenecen a la notación Empleado2 y se distinguen directamente por su anotación
@Directivo(empleado=@Empleado2(nombre = "Julio", apellido = "Vega"), codigoDespacho = 1)
@Tecnico(operario=@Operario(empleado = @Empleado2(nombre = "Pedro", apellido = "Alcaraz"),codigoTaller = 2), perfil = "Tecnico")
@Oficial(operario=@Operario(empleado = @Empleado2(nombre = "Maria", apellido = "Gonzalez"),codigoTaller = 3), categoria = "Oficial")

public class Empresa {

    String nombre;
    List<org.iesvdm.estructura.Empleado> empleados=new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados=new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<org.iesvdm.estructura.Empleado> getEmpleados() {
        return empleados;
    }
    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
