package org.iesvdm.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Operarios.class)
@Target(ElementType.TYPE)
@Documented
public @interface Operario {
    Empleado2 empleado();
    int codigoTaller();
}