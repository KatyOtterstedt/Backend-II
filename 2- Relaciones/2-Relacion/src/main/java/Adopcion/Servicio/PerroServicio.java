package Adopcion.Servicio;

import Adopcion.Entidades.Perro;
import Perro.enumeraciones.Raza;
import Perro.enumeraciones.Size;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroServicio {

    static Scanner read = new Scanner(System.in);

    public Perro crearPerro() {
        Perro perro = new Perro();
        System.out.println("Ingrese el nombre del perro ");
        perro.setNombre(read.nextLine());
        System.out.print ("Ingrese la raza de " + perro.getNombre());
        perro.setRaza(Raza.obtenerRaza());
        System.out.print("Ingrese el tamaño de " + perro.getNombre());
        perro.setSize(Size.obtenerSize());
        System.out.println("Ingrese la edad de " + perro.getNombre());
        perro.setEdad(read.nextInt());
        read.nextLine();

        return perro;
    }
    
     //Creando lista de Personas
    
    public ArrayList <Perro> listarPerros() {
        String respuesta = "";
        ArrayList<Perro> listaPerros = new ArrayList();
        do {
            listaPerros.add(crearPerro());
            System.out.println("Desea añadir otro perro?");
            respuesta = read.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
        
        return listaPerros;
    }

    

}
