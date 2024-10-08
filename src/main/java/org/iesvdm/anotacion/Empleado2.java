package org.iesvdm.anotacion;


import java.lang.annotation.*;

//Meta anotaciones
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Empleados2.class)
@Documented
public @interface Empleado2 {
    String nombre();
    String apellido();
}