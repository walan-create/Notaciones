package org.iesvdm.anotacion;

import java.lang.annotation.*;

//Esta Notación es para poder tener varias anotaciones de Directivo en una clase
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Directivos {
    Directivo[] value();
}
