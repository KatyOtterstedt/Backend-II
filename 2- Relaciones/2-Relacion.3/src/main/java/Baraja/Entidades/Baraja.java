package Baraja.Entidades;

import java.util.*;

/*
La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
*/
public class Baraja {
    private Stack<Carta> cartasEnJuego;
    private Stack<Carta> cartasEnMazo;
    private ArrayList<Carta> mazo;
    private Carta siguienteCarta;

    public Baraja() {
        //Lo hago tipo ArrayList para q empiece con un orden y luego se baraje, en lugar de hacer un conjunto q ya arranca mezclado
        cartasEnMazo = new Stack<>();
        cartasEnJuego = new Stack<>();
        mazo = new ArrayList<>();
    }

    public Stack<Carta> getCartasEnJuego() {
        return cartasEnJuego;
    }

    public void setCartasEnJuego(Stack<Carta> cartasEnJuego) {
        this.cartasEnJuego = cartasEnJuego;
    }

    public Stack<Carta> getCartasEnMazo() {
        return cartasEnMazo;
    }

    public void setCartasEnMazo(Stack<Carta> cartasEnMazo) {
        this.cartasEnMazo = cartasEnMazo;
    }

    public Carta getSiguienteCarta() {
        return siguienteCarta;
    }

    public void setSiguienteCarta(Carta siguienteCarta) {
        this.siguienteCarta = siguienteCarta;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }
    

    
    
    
    
    
}
