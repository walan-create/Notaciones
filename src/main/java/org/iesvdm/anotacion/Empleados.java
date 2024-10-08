package org.iesvdm.anotacion;

import java.lang.annotation.*;

//Esta es para agrupar anotaciones de empleados
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Empleados {
    Empleado [] value();
}
