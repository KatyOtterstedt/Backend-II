package Producto.Service_6;

import Producto_6.Product;

//import java.util.HashMap;
import java.util.Scanner;

/*
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap).
 */
public class ProductService {

    static Scanner read = new Scanner(System.in);

   //Mostrar HashMap
    public void verTabla(Product product) {
        product.mostrarTabla();
        
    }
    
    
    
            
    
    public Product crearTabla() {
        //Dentro del constructor, se inicializa el HashMap
        Product product = new Product();
        //Creo el HashMap y el objeto Product para poder luego agregarle cosas
        //product.setTabla(new HashMap());
        return product;
    }

    //Introducir elementos a la lista
    public Product introducirElemento(Product product) {
        String respuesta = "";
        do {
            System.out.println("Ingrese el nombre del producto que desea agregar a la lista");
            String tipoProducto = read.next();
            System.out.println("Ingrese el precio de dicho producto");
            Double precioProducto = read.nextDouble();
            product.getTabla().put(tipoProducto, precioProducto);
            System.out.println("Desea ingresar otro producto (Si/No)");
            respuesta = read.next();

        } while (respuesta.equalsIgnoreCase("Si"));
        return product;
    }

    //Modificar precio de un elemento de la lista
    public Product modificarPrecio(Product product) {
        System.out.println("Ingrese el nombre del producto cuyo precio desea modificar");
        String nombreProducto = read.next();
        if (product.getTabla().containsKey(nombreProducto)) {
            System.out.println("El producto se encuentra en la lista");
            System.out.println("Qué precio desea asignarle a ese producto?");
            //Para cambiar el valor de un elemento sabiendo su key, se hace con el put tmb
            product.getTabla().put(nombreProducto, read.nextDouble());
        } else {
            System.out.println("El producto no se encuentra en la lista");
        }

        return product;
    }

    //Eliminar un producto de la lista
    public Product eliminarProducto(Product product) {
        System.out.println("Ingrese el nombre del producto a eliminar");
        String nombreProducto = read.next();

        if (product.getTabla().containsKey(nombreProducto)) {
            System.out.println("El producto se encuentra en la lista");
            //Para eliminar un elemento del mapa, me alcanza con tener su key
            product.getTabla().remove(nombreProducto);
        } else {
            System.out.println("El producto NO se encuentra en la lista");
        }

        return product;
    }
}
