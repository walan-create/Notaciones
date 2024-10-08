package org.iesvdm.anotacion;

import java.lang.annotation.*;

//Esta notacion es para agrupar anotaciones de empleados2
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Empleados2 {
    Empleado2 [] value();
}
