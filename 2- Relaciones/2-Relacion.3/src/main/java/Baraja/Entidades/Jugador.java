package Baraja.Entidades;

import java.util.*;

public class Jugador {
    //El Jugador sólo tiene como atributo sus cartas y su nombre
    private String nombreJugador;
    private ArrayList cartasEnMano;

    public Jugador() {
        //Lo hago tipo ArrayList para q empiece con un orden y luego se baraje, en lugar de hacer un conjunto q ya arranca mezclado
        cartasEnMano = new ArrayList<>();
        //Creo tmb las listas q contendrán los posibles juegos para separarlos de las cartas más "tirables"
        ArrayList<Carta> posiblesEscaleras = new ArrayList<>();
        cartasEnMano.add(posiblesEscaleras);
        ArrayList<Carta> posiblesPalos = new ArrayList<>();
        cartasEnMano.add(posiblesPalos);
        //Armo también una lista de cartas "tirables"
         ArrayList<Carta> cartasTirables = new ArrayList<>();
        cartasEnMano.add(cartasTirables);
    }
        
    public ArrayList getCartasEnMano() {
        return cartasEnMano;
    }

    public void setCartasEnMano(ArrayList cartasEnMano) {
        this.cartasEnMano = cartasEnMano;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    
    

}
