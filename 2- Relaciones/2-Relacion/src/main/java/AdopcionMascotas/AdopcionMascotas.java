package AdopcionMascotas;

import Adopcion.Entidades.Perro;
import Adopcion.Servicio.PerroServicio;
import Adopcion.Entidades.Persona;
import Adopcion.Servicio.PersonaServicio;
import java.util.ArrayList;

public class AdopcionMascotas {

    /*
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
     */
    public static void main(String[] args) {

        PersonaServicio servPersona = new PersonaServicio();
        PerroServicio servPerro = new PerroServicio();
        
        //Genero las listas de perros y personas disponibles en la plataforma de adopción
        ArrayList<Persona> listaPersonas = servPersona.listarPersonas();
        ArrayList<Perro> listaPerros = servPerro.listarPerros();
        
        for (Persona persona : listaPersonas) {
            System.out.println("---INICIANDO TRÁMITE DE ADOPCIÓN DEL CLIENTE " + persona.getNombre() + " " + persona.getApellido() + "---");
            servPersona.adoptarPerro(listaPerros, persona);
        }
        
        
    }

}
