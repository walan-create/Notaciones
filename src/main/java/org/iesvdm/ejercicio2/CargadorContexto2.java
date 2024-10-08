package org.iesvdm.ejercicio2;

import org.iesvdm.anotacion.Directivo;
import org.iesvdm.anotacion.Oficial;
import org.iesvdm.anotacion.Tecnico;
import org.iesvdm.estructura.Empresa;

import java.lang.annotation.Annotation;

public class CargadorContexto2 {

    //Este cargador de contexto se encarga de cargar los empleados anotados en la clase Empresa
    public static Empresa cargadorContexto2(){
        //Creamos la empresa que vamos a devolver
        Empresa empresaDevolver = new Empresa("Empresa Ejercicio 2");
        //Empleado[] empleadosAnotaciones = Empresa.class.getAnnotationsByType(Empleado.class);
        Annotation[] anotacionesEmpresa = Empresa.class.getAnnotations();

        //Recorremos los empleados anotados
        for ( Annotation anotacionEmpresa : anotacionesEmpresa){
            if (anotacionEmpresa instanceof Directivo){
                //Si es un directivo lo añadimos a la empresa
                Directivo directivoAnotacion = (Directivo) anotacionEmpresa;
                org.iesvdm.estructura.Directivo directivo = new org.iesvdm.estructura.Directivo(
                        directivoAnotacion.empleado().apellido(),
                        directivoAnotacion.empleado().nombre(),
                        directivoAnotacion.codigoDespacho()
                );
                empresaDevolver.getEmpleados().add(directivo);
            }else if (anotacionEmpresa instanceof Oficial){
                //Si es un oficial lo añadimos a la empresa
                Oficial oficialAnotacion = (Oficial) anotacionEmpresa;
                org.iesvdm.estructura.Oficial oficial = new org.iesvdm.estructura.Oficial(
                        oficialAnotacion.operario().empleado().apellido(),
                        oficialAnotacion.operario().empleado().nombre(),
                        oficialAnotacion.operario().codigoTaller()
                );
                empresaDevolver.getEmpleados().add(oficial);
            }else if (anotacionEmpresa instanceof Tecnico){
                //Si es un tecnico lo añadimos a la empresa
                Tecnico oficialAnotacion = (Tecnico) anotacionEmpresa;
                org.iesvdm.estructura.Tecnico tecnico = new org.iesvdm.estructura.Tecnico(
                        oficialAnotacion.operario().empleado().apellido(),
                        oficialAnotacion.operario().empleado().nombre(),
                        oficialAnotacion.operario().codigoTaller()

                );
                empresaDevolver.getEmpleados().add(tecnico);
            }
        }

        return empresaDevolver;
    }
}
