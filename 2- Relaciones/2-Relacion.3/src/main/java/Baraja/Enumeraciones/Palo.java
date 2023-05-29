package Baraja.Enumeraciones;

public enum Palo {
    
    /*En Java, las enumeraciones siguen el orden en el que se declaran sus elementos
    => las declaro en orden alfabético para q sea más fácil de seguir
    */
    BASTO, COPA, ESPADA, ORO;

    private static final Palo[] palos = Palo.values();
    public static Palo getPalo(int i) {
        return Palo.palos[i];
    }
       
}
