package org.iesvdm.anotacion;

import lombok.ToString;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Tareas.class)
@Target(ElementType.TYPE)
@Documented
public @interface Tarea {
    String titulo() default "";
    String descripcion() default "";
    String diaSemana() default "";
    String hora() default "";
}
