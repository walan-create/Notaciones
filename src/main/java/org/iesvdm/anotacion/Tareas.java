package org.iesvdm.anotacion;

import java.lang.annotation.*;

//Esta es para agrupar anotaciones de tareas
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Tareas {
    Tarea[] value();
}
