package org.iesvdm.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Oficiales.class)
@Target(ElementType.TYPE)
@Documented
public @interface Oficial {
    //Tiene como atributos una notacion Operario que a la vez tiene como atributo una notacion Empleado
    Operario operario();
    String categoria();
}
