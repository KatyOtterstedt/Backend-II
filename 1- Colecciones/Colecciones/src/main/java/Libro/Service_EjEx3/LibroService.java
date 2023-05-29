package Libro.Service_EjEx3;

import Libreria_EjEx3.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class LibroService {

    static Scanner read = new Scanner(System.in);

    //Creo el método para devolver un libro 
    public HashSet<Libro> devoluciónLibro(HashSet<Libro> stock) {
        System.out.println("Ingrese el título del libro que desea devolver");
        String solicitud = read.nextLine();
        for (Libro libro : stock) {
            if (libro.getTitulo().equals(solicitud) && libro.getCantPrestados() > 0) {
                libro.aumentarEjemplares();
                libro.disminuirCantPrestados();
                System.out.println("--- GRACIAS POR REGRESAR EL LIBRO ---");
                return stock;
            } else if (libro.getTitulo().equals(solicitud)) {
                System.out.println("-- NO SE HAN PRESTADO EJEMPLARES DE ESE LIBRO ---");
                return stock;
            }
        }
        System.out.println("--EL LIBRO NO SE ENCUENTRA EN NUESTRO CATÁLOGO--");
        return stock;
    }

    //Creo el método para préstamo
    public HashSet<Libro> prestamoLibro(HashSet<Libro> stock) {
        System.out.println("Ingrese el título del libro que desea retirar");
        String solicitud = read.nextLine();
        for (Libro libro : stock) {
            if (libro.getTitulo().equals(solicitud) && libro.getCantEjemplares() > 0) {
                libro.disminuirEjemplares();
                libro.aumentarCantPrestados();
                System.out.println("--CANTIDAD DE EJEMPLARES RESTANTES: " + libro.getCantEjemplares() + " ---");
                return stock;
            } else if (libro.getTitulo().equals(solicitud)) {
                System.out.println("-- NO QUEDAN EJEMPLARES RESTANTES EN STOCK---");
                return stock;
            }
        }
        System.out.println("--EL LIBRO NO SE ENCUENTRA EN NUESTRO CATÁLOGO--");
        return stock;
    }

    //Creo el conjunto de libros
    public HashSet<Libro> crearConjuntoLibros() {
        HashSet<Libro> stock = new HashSet();
        String respuesta = "";
        do {
            System.out.println("---INGRESO DE NUEVO LIBRO---");
            Libro libro = crearLibro();
            stock.add(libro);
            System.out.println("Desea ingresar otro libro? (Si/No)");
            respuesta = read.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

        return stock;
    }

    //Creo un libro individual
    public Libro crearLibro() {
        Libro libro = new Libro();
        //read.nextLine();
        System.out.println("Ingrese el título del libro");
        libro.setTitulo(read.nextLine());
        System.out.println("Ingrese el nombre del autor");
        libro.setAutor(read.nextLine());
        System.out.println("Ingrese la cantidad de ejemplares en existencia");
        libro.setCantEjemplares(read.nextInt());
        read.nextLine();
        //Como recién estoy creando el libro, entonces la cant prestada es cero
        libro.setCantPrestados(0);

        return libro;
    }

    //Mostrar el Stock
    public void mostrarStock(HashSet<Libro> stock) {
        System.out.println("---CATÁLOGO---");
        

        stock.forEach(libro -> {
            System.out.println(libro.toString());
        });
    }
}
