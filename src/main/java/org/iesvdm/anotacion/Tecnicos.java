package org.iesvdm.anotacion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//Esta es para agrupar anotaciones de tecnicos
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Tecnicos {
    Tecnico[] value();
}
