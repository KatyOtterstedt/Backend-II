package Alumno.Service_3;

import Alumno_3.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 

 */
public class AlumnoService {

    static Scanner read = new Scanner(System.in);

    private Alumno crearAlumno() {

        //Crear alumnos individuales
        Alumno alumno = new Alumno();
        System.out.println("Ingrese el nombre del alumno");
        alumno.setNombre(read.next());
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la " + (i + 1) + "° nota");
            Integer nota = read.nextInt();
            alumno.setNotas(nota);
        }

        return alumno;
    }

    //Crear lista de alumnos
    public ArrayList listaAlumnos() {
        ArrayList listaAlumnos = new ArrayList();
        String respuesta;
        do {
            listaAlumnos.add(crearAlumno());
            System.out.println("Desea agregar otro alumno (si/no)");
            respuesta = read.next();
        } while (respuesta.equalsIgnoreCase("si"));

        return listaAlumnos;
    }

    /*
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
promedio final, devuelto por el método y mostrado en el main
     */
    public double notaFinal(ArrayList<Alumno> listaAlumnos) {
        double promedio = 0;
        System.out.println("Ingrese el alumno que desea obtener la nota");
        String alumnoBuscado = read.next();
        //Chequeo si el alumno esta en la lista
        int indiceAlumno = buscarAlumno(listaAlumnos, alumnoBuscado);
        // int edad = p.getEdad();
        //Chequeo en q posicion de la lista esta
        // int indice = listaAlumnos.indexOf(alumnoBuscado);
        //System.out.println("indice = " + indice);
        //Calculo el promedio de notas de ese alumno en funcion de la cantidad de notas que tenga
        if (indiceAlumno >= 0) {
            for (Integer nota : (listaAlumnos.get(indiceAlumno).getNotas())) {
                promedio += nota;
            }
            promedio /= (listaAlumnos.get(indiceAlumno).getNotas()).size();
            System.out.println("promedio = " + promedio);
        } else {
            System.out.println("Alumno no encontrado");

        }

        return promedio;
    }

    //Busco un alumno en la lista y en base a eso doy la ntoa final
    private int buscarAlumno(ArrayList<Alumno> listaAlumnos, String alumnoBuscado) {

        //Esto me lo corrigio solo el IDE, esperemos q este bien
        for (Alumno a : listaAlumnos) {
            if (a.getNombre().equalsIgnoreCase(alumnoBuscado)) {
                return listaAlumnos.indexOf(a);
            }

        }
        System.out.println("El alumno no fue encontrado");

        return -1;
    }

//    public boolean listaIgnoreCase(ArrayList lista, Object obj) {
//        //Collections.frequency
//        if (obj instanceof CaseInsensitiveString) {
//            return this.value.equalsIgnoreCase(((CaseInsensitiveString) obj).value);
//        }
//        if (obj instanceof String) {
//            return this.value.equalsIgnoreCase((String) obj);
//        }
//        return false;
//    }
}
