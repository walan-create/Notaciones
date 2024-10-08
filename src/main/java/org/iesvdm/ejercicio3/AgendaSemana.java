package org.iesvdm.ejercicio3;

import org.iesvdm.anotacion.Tarea;

import java.util.ArrayList;
import java.util.List;

@Tarea(titulo = "Reunión de equipo", descripcion = "Reunión semanal con el equipo de desarrollo", diaSemana = "Lunes", hora = "10:00")
@Tarea(titulo = "Revisión de código", descripcion = "Revisar el código de los compañeros", diaSemana = "Miércoles", hora = "14:00")
@Tarea(titulo = "Planificación de sprint", descripcion = "Planificación del próximo sprint", diaSemana = "Viernes", hora = "09:00")
public class AgendaSemana {
    List<org.iesvdm.ejercicio3.Tarea> tareas=new ArrayList<>();

    public AgendaSemana() {
    }

    public List<org.iesvdm.ejercicio3.Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<org.iesvdm.ejercicio3.Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "AgendaSemana{" +
                "tareas=" + tareas +
                '}';
    }
}
