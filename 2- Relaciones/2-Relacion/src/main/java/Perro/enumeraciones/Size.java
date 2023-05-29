package Perro.enumeraciones;

import java.util.Scanner;

public enum Size {
    GRANDE, MEDIANO, PEQUEÑO, NULL;
    
    static Scanner read = new Scanner(System.in);
    
    
    //Método para después poder ingresar el tamaño por input dado q es una enumeración
    public static Size obtenerSize() {
        System.out.println(" (GRANDE, MEDIANO, PEQUEÑO):");

        String tamañoIngresado = read.nextLine();

        switch (tamañoIngresado.toUpperCase()) {
            case "GRANDE":
                return Size.GRANDE;
            case "MEDIANO":
                return Size.MEDIANO;
            case "PEQUEÑO":
                return Size.PEQUEÑO;
            default:
                System.out.println("Tamaño inválido. Seleccionando NULL por defecto.");
                return Size.NULL;
        }
    }
}
