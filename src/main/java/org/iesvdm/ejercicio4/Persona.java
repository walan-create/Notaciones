package org.iesvdm.ejercicio4;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Value;

@Data //Genera los métodos básicos de los atributos de la clase como los getters, setters, toString, etc.
@Builder //Genera un constructor con todos los atributos de la clase que nos permite crear objetos de la clase sin tener que pasar todos los atributos.
@Value //Genera una clase inmutable, es decir, una vez que se crea un objeto de esta clase no se puede modificar.
public class Persona {
    String nombre;
    @NonNull //Genera una excepción si el atributo que se le pasa es nulo.
    String apellido;
    int edad;
    String dni;
}
