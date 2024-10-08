package org.iesvdm.anotacion;

import java.lang.annotation.*;

//Esta es para agrupar anotaciones de oficiales
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Oficiales {
    Oficial[] value();
}
