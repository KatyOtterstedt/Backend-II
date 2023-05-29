package Baraja.Entidades;

import Baraja.Enumeraciones.Palo;
import java.util.*;

public class Carta {

    //Hago los valores final porq total no se van a modificar
    private final Integer VALOR;
    private final Palo PALO;

    public Carta(Integer VALOR, Palo PALO) {
        this.VALOR = VALOR;
        this.PALO = PALO;
    }

    public Integer getVALOR() {
        return VALOR;
    }

    public Palo getPALO() {
        return PALO;
    }

    @Override
    public String toString() {
        return "Carta{" + "VALOR=" + VALOR + ", PALO=" + PALO + '}';
    }

    //Creo el comparator para comparar palos de las cartas
    public static Comparator<Carta> compararPalo = (Carta c1, Carta c2) -> c2.getPALO().compareTo(c1.getPALO());
    

    //Creo el comparator para comparar números de las cartas (SI ES INT NO FUNCIONA=> INTEGER)
    
    public static Comparator<Carta> compararNros = (Carta c1, Carta c2) -> c2.getVALOR().compareTo(c1.getVALOR());
    
}
