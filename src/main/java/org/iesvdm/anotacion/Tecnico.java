package org.iesvdm.anotacion;


import java.lang.annotation.*;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Repeatable(Tecnicos.class)
@Target(ElementType.TYPE)
@Documented
public @interface Tecnico {
    //Tiene como atributos una notacion Operario que a la vez tiene como atributo una notacion Empleado
    Operario operario();
    String perfil();
}
