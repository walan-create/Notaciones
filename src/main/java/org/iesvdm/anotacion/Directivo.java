package org.iesvdm.anotacion;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Directivos.class)
@Target(ElementType.TYPE)
@Documented
public @interface Directivo {
    //Esta notación Directivo tiene cómo atributo un empleado con todos sus atributos.
    Empleado2 empleado();
    int codigoDespacho();
}
