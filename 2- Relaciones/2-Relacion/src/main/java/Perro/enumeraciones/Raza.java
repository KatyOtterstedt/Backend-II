package Perro.enumeraciones;

import java.util.Scanner;

public enum Raza {
    CANICHE, BORDER_COLLIE, LABRADOR, NULL;
    
    static Scanner read = new Scanner(System.in);
    
     //Para poder ingresar la raza por input q es una enumeración
    public static Raza obtenerRaza() {
        System.out.println(" (CANICHE, BORDER COLLIE, LABRADOR):");

        String razaIngresada = read.nextLine();

        switch (razaIngresada.toUpperCase()) {
            case "BORDER COLLIE":
                return Raza.BORDER_COLLIE;
            case "CANICHE":
                return Raza.CANICHE;
            case "LABRADOR":
                return Raza.LABRADOR;
            default:
                System.out.println("Raza inválida. Seleccionando NULL por defecto.");
                return Raza.NULL;
        }
    }

}
