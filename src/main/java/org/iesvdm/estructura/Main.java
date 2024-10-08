package org.iesvdm.estructura;

import org.iesvdm.anotacion.Tarea;
import org.iesvdm.ejercicio1.CargadorContexto1;
import org.iesvdm.ejercicio2.CargadorContexto2;
import org.iesvdm.ejercicio3.AgendaSemana;
import org.iesvdm.ejercicio3.CargadorContextoTareas;
import org.iesvdm.ejercicio4.Persona;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
//        System.out.println("Bienvenido al gestor de empresa");
//        System.out.println("Cargando contexto de aplicación...");
//        Empresa empresaNueva = CargadorContexto1.cargadorContextoEmpresa();
//        System.out.println(empresaNueva.getEmpleados());

        //Ejercicio 2
//        System.out.println("Bienvenido al gestor de empresa");
//        System.out.println("Cargando contexto de aplicación...");
//        Empresa empresaNueva= CargadorContexto2.cargadorContexto2();
//        System.out.println(empresaNueva);

        //Ejercicio3
//        AgendaSemana agendaSemana = CargadorContextoTareas.cargadorContextoTareas();
//        System.out.println(agendaSemana.getTareas());

        //Ejercicio 4
//        Persona persona = Persona.builder()
//                .nombre("Antonio")
//                //.apellido(null) Daría una excepción porque es @NonNull
//                .apellido("García")
//                .edad(30)
//                .build();
//        //persona.setApellido("García"); No funcionaria porque a pesar de que tiene el @Data, es un @Value
//        System.out.println(persona);



    }
}
