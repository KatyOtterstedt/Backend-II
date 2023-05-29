package Baraja.Servicios;

import Baraja.Entidades.*;
import Baraja.Enumeraciones.Palo;
import java.util.*;

/*
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
luego se llama al método, este no mostrara esa primera carta.

 */
public class BarajaServicio {

    //Siguiente carta de la baraja
    public void siguienteCarta(Baraja baraja) {
        //Si el stack NO está vacío
        if (!baraja.getCartasEnMazo().isEmpty()) {
            System.out.println(baraja.getCartasEnMazo().peek().toString());
        } else {
            System.out.println("Ya no hay cartas en el mazo");
            //Si no hay cartas, remezcla las q había en juego
            System.out.println("Remezclando las cartas en juego para poder tomar la siguiente carta");
            reMezclar(baraja);
            System.out.println(baraja.getCartasEnMazo().peek().toString());
        }

    }

    //Para mezclar las cartas descartadas una vez q se termina el mazo
    public void reMezclar(Baraja baraja) {
        // Llenar el ArrayList con los elementos del Stack
        while (!baraja.getCartasEnJuego().isEmpty()) {
            //Elimina el elemento del stack a la vez q lo añade a la lista
            baraja.getMazo().add(baraja.getCartasEnJuego().pop());
        }
        //Mezcla dicha lista
        barajar(baraja);
        //Rellena el mazo de juego con el nuevo orden
        baraja.getCartasEnMazo().addAll(baraja.getMazo());
    }

    //Repartir cantidad de cartas pedidas
    public void darCartas(Baraja baraja, ArrayList<Jugador> listaJugadores, int cantCartas) {
        //Mezclo las cartas antes de repartir
        barajar(baraja);
        //Agrego las cartas mezcladas(arraylist) a un stack(cartasEnMazo) para q solo se pueda sacar la de arriba
        baraja.getCartasEnMazo().addAll(baraja.getMazo());
        //Para la cantidad de cartas totales, para cada jug=> pasa por los dos jugadores y después pasa al sig nro de carta
        for (int i = 0; i < cantCartas; i++) {
            for (Jugador jugador : listaJugadores) {
                //Agrego la carta q está arriba de todo en el mazo a la mano del jug
                jugador.getCartasEnMano().add(baraja.getCartasEnMazo().peek());
                //Elimino dicha carta del mazo
                baraja.getCartasEnMazo().pop();
            }
        }
    }

    //Mostrar las cartas q quedan en el mazo
    public void mostrarBarajaRemanente(Baraja baraja) {
        baraja.getCartasEnMazo().forEach(carta -> {
            System.out.println(carta.toString());
        });
    }

    //barajar(): cambia de posición todas las cartas aleatoriamente.
    //Lo q se puede mezclar es el mazo (ArrayList)
    public void barajar(Baraja baraja) {
        Collections.shuffle(baraja.getMazo());
    }

    //Método NO PEDIDO para inicializar la baraja
    public Baraja inicializarBaraja() {
        Baraja baraja = new Baraja();
        // int cantPalos = 4;
        int cantCartasPorPalo = 12;
        //Creo un vector con todos los palos del Enum para poder ir accediendo de a uno
        Palo[] palos = Palo.values();
        for (Palo paloActual : palos) {
            for (int j = 0; j < cantCartasPorPalo; j++) {
                Carta carta = new Carta();
                if (j < 7 || j > 8) {
                    carta.setNro(j + 1);
                    carta.setPalo(paloActual);
                    //Voy agregando cartas de a una al atributo mazo del objeto Baraja
                    baraja.getCartasEnMazo().add(carta);
                }
            }
        }

        return baraja;

    }
}
