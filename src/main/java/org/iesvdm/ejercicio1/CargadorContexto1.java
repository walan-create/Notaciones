package org.iesvdm.ejercicio1;
import org.iesvdm.anotacion.Empleado;
import org.iesvdm.estructura.*;

public class CargadorContexto1 {

    //Este cargador de contexto se encarga de cargar los empleados anotados en la clase Empresa
    public static Empresa cargadorContextoEmpresa() {

        //Obtenemos los empleados anotados
        Empleado[] empleadosAnotaciones = Empresa.class.getAnnotationsByType(Empleado.class);
        //Creamos la empresa que vamos a devolver
        Empresa empresaDevolver = new Empresa("Empresa Ejercicio 1");

        //Recorremos los empleados anotados
        for (Empleado empleadoAnotacion : empleadosAnotaciones) {
            if (empleadoAnotacion.clase().equalsIgnoreCase("Directivo")) {
                //Si es un directivo lo añadimos a la empresa
                Directivo directivo = new Directivo(
                        empleadoAnotacion.apellido(),
                        empleadoAnotacion.nombre(),
                        empleadoAnotacion.codigoDepartamento()
                );
                empresaDevolver.getEmpleados().add(directivo);
            }else if (empleadoAnotacion.clase().equalsIgnoreCase("Operario")){
                //Si es un operario lo añadimos a la empresa
                Operario operario = new Operario(
                        empleadoAnotacion.apellido(),
                        empleadoAnotacion.nombre(),
                        empleadoAnotacion.codigoDepartamento()
                );
                empresaDevolver.getEmpleados().add(operario);
            }else if (empleadoAnotacion.clase().equalsIgnoreCase("Tecnico")){
                //Si es un tecnico lo añadimos a la empresa
                Tecnico tecnico = new Tecnico(
                        empleadoAnotacion.apellido(),
                        empleadoAnotacion.nombre(),
                        empleadoAnotacion.codigoDepartamento()
                );
                empresaDevolver.getEmpleados().add(tecnico);
            }else if (empleadoAnotacion.clase().equalsIgnoreCase("Oficial")){
                //Si es un oficial lo añadimos a la empresa
                Oficial oficial = new Oficial(
                        empleadoAnotacion.apellido(),
                        empleadoAnotacion.nombre(),
                        empleadoAnotacion.codigoDepartamento()
                );
                empresaDevolver.getEmpleados().add(oficial);
            }
        }

        return empresaDevolver;
    }
}
