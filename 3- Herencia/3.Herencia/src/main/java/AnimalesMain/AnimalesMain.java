package AnimalesMain;

import Animales.*;
import Animales.Hijos.Perro;

public class AnimalesMain {

    public static void main(String[] args) {
        Animal perro = new Perro("Perrito", "Croquetas", 5, "Cocker");
        perro.Alimentarse();
    }
    
}
