package Adopcion.Servicio;

import Adopcion.Entidades.Perro;
import Adopcion.Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;


public class PersonaServicio {
 
    static Scanner read = new Scanner(System.in);
    
    
    /*
    la lógica necesaria para asignarle a cada Persona un Perro 
    */
    
    /*
    Para adoptar un perro, si no lo adoptan, devuelvo la persona solita
    */
    public Persona adoptarPerro(ArrayList<Perro> listaPerros, Persona persona){
        String reiniciar = "";
        do {
            System.out.println("---PERROS DISPONIBLES PARA ADOPCIÓN---");
        for (Perro perro : listaPerros) {
            System.out.println(perro.toString());
            System.out.println("Desea adoptar este perro?");
            String respuesta = read.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                persona.setMascota(perro);
                System.out.println("---FELICITACIONES, USTED HA ADOPTADO UN PERRO---");
                //VER SI EL PERRO REALMENTE SE REMUEVE DE LA LISTA, PORQ NO RETORNO UNA LISTA DE PERROS EN EL MÉTODO
                listaPerros.remove(perro);
                return persona;
            }
        }
        System.out.println("USTED HA AGOTADO TODAS LAS OPCIONES DISPONIBLES");
        System.out.println("Desea ver las opciones nuevamente?");
        reiniciar = read.nextLine();
        } while (reiniciar.equalsIgnoreCase("si"));
        return persona;
    }
    
    public Persona crearPersona() {
       Persona persona = new Persona();
        System.out.println("---CREANDO PERSONA---");
        System.out.println("Ingrese el nombre de la persona ");
        persona.setNombre(read.nextLine());
        System.out.println("Ingrese el apellido de " + persona.getNombre());
        persona.setApellido(read.nextLine());
        System.out.println("Ingrese el DNI de " + persona.getNombre() + " " + persona.getApellido());
        persona.setDocumento(read.nextInt());
        read.nextLine();
        System.out.println("Ingrese la edad de " + persona.getNombre() + " " + persona.getApellido());
        persona.setEdad(read.nextInt());
        read.nextLine();
       
       return persona;
    }
    
    //Creando lista de Personas
    
    public ArrayList <Persona> listarPersonas() {
        String respuesta = "";
        ArrayList<Persona> listaPersonas = new ArrayList();
        do {
            listaPersonas.add(crearPersona());
            System.out.println("Desea añadir otra persona?");
            respuesta = read.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
        
        return listaPersonas;
    }
}
