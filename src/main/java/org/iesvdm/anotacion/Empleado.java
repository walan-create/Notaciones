package org.iesvdm.anotacion;


import java.lang.annotation.*;

//Meta anotaciones
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Empleados.class)
@Documented
public @interface Empleado {
    String nombre();
    String apellido();
    String clase();
    int codigoDepartamento();
}
