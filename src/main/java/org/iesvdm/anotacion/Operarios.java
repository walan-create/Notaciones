package org.iesvdm.anotacion;

import java.lang.annotation.*;

//Esta es para agrupar anotaciones de operarios
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Operarios {
    Operario[] value();
}
