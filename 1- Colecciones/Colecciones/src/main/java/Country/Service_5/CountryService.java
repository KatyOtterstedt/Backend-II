package Country.Service_5;

import Paises_5.Country;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el 
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, 
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer 
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
cómo se ordena un conjunto.

 */
public class CountryService {

    static Scanner read = new Scanner(System.in);

    //Crear conjunto de los países
    public HashSet<Country> crearListaPaises() {
        //Creamos el conjunto de objetos Country
        HashSet<Country> conjuntoPaises = new HashSet();
        String respuesta = "";
        //Adicionamos países
        do {
            System.out.println("Ingrese el nombre del país a adicionar");
            //Creamos el objeto Country
            Country country = new Country(read.next());
            conjuntoPaises.add(country);

            System.out.println("Quiere adicionar otro país? (Si/No)");
            respuesta = read.next();

        } while (respuesta.equalsIgnoreCase("si"));

        return conjuntoPaises;
    }

    //Mostrar conjunto de países
    //Al hacerlo con Collection <?> lo q hace es q tome una collection, ya sea ArrayList o HashSet
    public void mostrarPaises(Collection<?> listaPaises) {
        System.out.println("---LISTA PAÍSES---");

        listaPaises.forEach(pais -> {
            System.out.println(pais.toString());
        });
        System.out.println(" ");

    }

    //Ordenar alfabéticamente
    public void ordenarPorNombre(HashSet<Country> conjuntoPaises) {
        //El conjunto no se ordena => lo convierto a lista
        ArrayList<Country> listaPaises = new ArrayList(conjuntoPaises);
        //Ordeno usando el Comparator
        listaPaises.sort(Country.compararNombre);
        System.out.println("---PAÍSES ORDENADOS---");
        mostrarPaises(listaPaises);
        System.out.println(" ");

    }

    /*
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
al usuario
     */
    public HashSet<Country> eliminarPais(HashSet<Country> conjuntoPaises) {
        System.out.println("Ingrese un país a eliminar");
        String paisBuscado = read.next();
        int size = conjuntoPaises.size();
        //TENGO Q PONERLE TIPO AL ITERATOR PORQ SINO SE ROMPE
        Iterator<Country> it = conjuntoPaises.iterator();
        while (it.hasNext()) {
            if (paisBuscado.equals((it.next()).getPais())) {
                it.remove();
            } else {
            }
        }
        if (conjuntoPaises.size() == size) {
            System.out.println("El país no se encunetra en el conjunto");
        }

        mostrarPaises(conjuntoPaises);
        return conjuntoPaises;
    }
}
