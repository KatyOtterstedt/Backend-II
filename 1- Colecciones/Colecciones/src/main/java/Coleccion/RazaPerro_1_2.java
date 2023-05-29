package Coleccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class RazaPerro_1_2 {

    static Scanner read = new Scanner(System.in);

    public ArrayList crearListaRazas() {
        ArrayList<String> listaRazas = new ArrayList();
        String respuesta;
        do {
            System.out.println("Ingrese una raza de perro");
            listaRazas.add(read.next());
            System.out.println("Quiere guardar otro perro (SI/NO)");
            respuesta = read.next();

        } while (respuesta.equalsIgnoreCase("si"));
        return listaRazas;
    }

    public void mostrarArrayList(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + 1 + ") " + lista.get(i));
        }
    }

    /*
  Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
la lista ordenada
     */
    public ArrayList eliminarPerro(ArrayList array, String raza) {
        //Creo el objeto de tipo Iterator CON EL MISMO TIPO DE DATO Q LA COLECCIÓN, sino no me deja usarlo como String
        Iterator<String> it = array.iterator();
        //Le digo a la Collection q me diga si el ingresado no está, no entro al bucle directamente
        if (Collections.frequency(array, raza) == 0) {
            System.out.println("La raza ingresada no se encuentra en la lista");
        } else {
            //Le digo al iterator q se fije si hay un elemento sig
            while (it.hasNext()) {
                //Le digo q si lo hay se fije si es igual al ingresado y si es así, lo remueva      
                if ((it.next()).equalsIgnoreCase(raza)) {
                    it.remove();
                }
                //Ordeno el array de todas formas
                Collections.sort(array);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        RazaPerro_1_2 razas = new RazaPerro_1_2();
        ArrayList lista = razas.crearListaRazas();
        System.out.println("Ingrese una raza de perro de la lista: ");
        razas.mostrarArrayList(lista);
        String raza = read.next();
        lista = razas.eliminarPerro(lista, raza);
        razas.mostrarArrayList(lista);
    }
}
