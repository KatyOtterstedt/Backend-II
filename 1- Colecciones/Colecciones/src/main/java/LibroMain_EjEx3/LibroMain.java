package LibroMain_EjEx3;

import Libreria_EjEx3.Libro;
import Libro.Service_EjEx3.LibroService;
import java.util.HashSet;
import java.util.Scanner;

public class LibroMain {

    static Scanner read = new Scanner(System.in);

    /*
     Realizar un menú para lograr todas las acciones previamente mencionadas.
     */
    public static void main(String[] args) {

        LibroService service = new LibroService();
        HashSet<Libro> stock = service.crearConjuntoLibros();
        int respuesta = 0;
        do {
            System.out.println("---MENÚ---"
                    + "\n 1. Agregar libro al stock"
                    + "\n 2. Pedir un libro prestado"
                    + "\n 3. Devolver un libro"
                    + "\n 4. Mostrar stock"
                    + "\n 5. Salir");
            respuesta = read.nextInt();
            read.nextLine();
            switch (respuesta) {
                case 1:
                    stock.add(service.crearLibro());
                    service.mostrarStock(stock);
                    break;

                case 2:
                    stock = service.prestamoLibro(stock);
                    service.mostrarStock(stock);
                    break;

                case 3:
                    stock = service.devoluciónLibro(stock);
                    service.mostrarStock(stock);
                    break;

                case 4:
                    service.mostrarStock(stock);
                    break;

                default:
                    System.out.println(" ");
                    System.out.println("---CERRANDO SISTEMA---");
            }

        } while (respuesta != 5);

    }

}
