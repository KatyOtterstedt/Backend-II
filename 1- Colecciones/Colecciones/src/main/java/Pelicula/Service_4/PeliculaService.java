package Pelicula.Service_4;

import Pelicula_4.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/*
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo 
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario 
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere 
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones: 
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en 
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
 */
public class PeliculaService {

    static Scanner read = new Scanner(System.in);

//Ordenar alfabéticamente título
    public ArrayList<Pelicula> ordenarTitulo(ArrayList<Pelicula> listaPelis) {
        System.out.println("Películas en orden alfabético de título");
        listaPelis.sort(Pelicula.compararOrdenTitulo);
        mostrarLista(listaPelis);
        return listaPelis;
    }

    //Ordenar alfabéticamente director
    public ArrayList<Pelicula> ordenarDirector(ArrayList<Pelicula> listaPelis) {
        System.out.println("Películas en orden alfabético de director");
        listaPelis.sort(Pelicula.compararOrdenDirector);
        mostrarLista(listaPelis);
        return listaPelis;
    }

//Ordenar en orden ascendente de duración
    public ArrayList<Pelicula> ordenarDuracAscend(ArrayList<Pelicula> listaPelis) {
        System.out.println("Películas en orden ascendente de duración");
        listaPelis.sort(Pelicula.compararDuracionAscendente);
        mostrarLista(listaPelis);
        return listaPelis;
    }

    //Ordenar en orden descendente de duración
    public ArrayList<Pelicula> ordenarDuracDescend(ArrayList<Pelicula> listaPelis) {
        System.out.println("Películas en orden descendente de duración");
        

        listaPelis.sort(Pelicula.compararDuracionDescendente);
        mostrarLista(listaPelis);
        return listaPelis;
    }

    //Método para mostrar sólo los elementos de duración > 1h
    public void mostrarMayores(ArrayList<Pelicula> listaPelis) {
        //Acá le tengo q poner el .toHours para q esté bien
        System.out.println("Películas de más de 1 hora");
        

        for (Pelicula peli : listaPelis) {
            if (peli.getDuracion() > 1) {
                System.out.println(peli);
            }
        }
        
    }

    //Método para mostrar todos los elementos de la lista
    public void mostrarLista(ArrayList<Pelicula> listaPelis) {
        listaPelis.forEach((Pelicula peli) -> {
            System.out.println(peli.toString());
        });
    }

    //Método para el bucle con la lista de películas
    public ArrayList<Pelicula> crearListaPeliculas() {
        ArrayList <Pelicula> listaPelis = new ArrayList();
        String respuesta = "";
        do {
            System.out.println(" ");
            System.out.println("---Ahora le pediremos los datos de la película ---");
            System.out.println(" ");

            listaPelis.add(crearPelicula());

            System.out.println("---Desea agregar otra película (si/no)---");
            respuesta = read.nextLine();

        } while (respuesta.equalsIgnoreCase("si"));
        return listaPelis;
    }

    //Método para ingresar todos los atributos de la película
    private Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el título de la película");
        pelicula.setTitulo(read.nextLine());

        System.out.println("Ingrese el nombre del director de la película");
        pelicula.setDirector(read.nextLine());

        System.out.println("Ingrese la duración de la película (en horas)");
        pelicula.setDuracion(read.nextInt());
        //Acá va un nextLine vacío después del nextInt porq sino algo del buffer y hay una variable q no me lee
        read.nextLine();
        return pelicula;

    }
}
