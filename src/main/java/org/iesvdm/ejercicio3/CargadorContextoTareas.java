package org.iesvdm.ejercicio3;

import org.iesvdm.anotacion.Tarea;
import java.lang.annotation.Annotation;
import java.util.List;

public class CargadorContextoTareas {

    //Este cargador de contexto se encarga de cargar las tareas anotadas en la clase AgendaSemana
    public static AgendaSemana cargadorContextoTareas() {
        //Obtenemos las tareas anotadas
        AgendaSemana agendaSemanaDevolver = new AgendaSemana();
        //Obtenemos las tareas anotadas
        Tarea[] tareas = AgendaSemana.class.getAnnotationsByType(Tarea.class);

        //Recorremos las tareas anotadas
        for (Tarea tarea : tareas) {
            //Cómo sabemos que es una anotacion de Tarea simplemente instanciamos la clase Tarea dando los valores de la anotación
            //y la añadimos a la lista de tareas de la agenda
            org.iesvdm.ejercicio3.Tarea tareaDevolver = new org.iesvdm.ejercicio3.Tarea(
                    tarea.titulo(),
                    tarea.descripcion(),
                    tarea.diaSemana(),
                    tarea.hora()
            );
            agendaSemanaDevolver.getTareas().add(tareaDevolver);
        }
        return agendaSemanaDevolver;
    }
}
