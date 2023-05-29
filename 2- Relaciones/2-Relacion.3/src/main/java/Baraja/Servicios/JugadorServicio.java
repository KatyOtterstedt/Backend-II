package Baraja.Servicios;

import Baraja.Entidades.*;
import Baraja.Enumeraciones.Palo;
import java.util.*;

public class JugadorServicio {

    static Scanner read = new Scanner(System.in);

    //Inicializando Jugador
    public Jugador inicializarJugador() {
        Jugador jugador = new Jugador();
        System.out.println("Ingrese el nombre del jugador");
        jugador.setNombreJugador(read.nextLine());
        return jugador;
    }

    //Para ver las cartas en mano
    //Mostrar las cartas q quedan en el mazo
    public void mostrarCartasEnMano(Jugador jugador) {
        int i = 1;
        System.out.println("Cartas en mano:");

        for (Carta carta : jugador.getCartasEnMano()) {
            System.out.println(i + ") " + carta.toString());
            i++;
        }
    }

    //Para tirar una carta al juego
    public void descartarCarta(Jugador jugador, Baraja baraja) {
        mostrarCartasEnMano(jugador);
        System.out.println("Indique el número de carta que desea descartar");
        int cartaElegida = read.nextInt();
        read.nextLine();
        //Agrego la carta a tirar en el mazo
        baraja.getCartasEnJuego().push(jugador.getCartasEnMano().get(cartaElegida));
        //Elimina la carta q quería tirar de las cartas en mano del jugador
        jugador.getCartasEnMano().remove(cartaElegida);
    }

    //Para comparar los números de las cartas del mismo palo
    public void compararDentroDelPalo(Jugador jugador) {
        
    }
    
    //Primero necesito ordenar los nros de cada palo
    public void ordenarDentroDelPalo(Jugador jugador) {
        //Ordeno las cartas en mano según el palo
        jugador.getCartasEnMano().sort(Carta.compararPalo);
        for (Palo  palo:Palo.values()) {
            if (true) {
                
            }
        }
    }
}
