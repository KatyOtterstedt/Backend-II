package ProductoMain_6;

import Producto.Service_6.ProductService;
import Producto_6.Product;
import java.util.Scanner;

public class ProductoMain {

    static Scanner read = new Scanner(System.in);

    /*
     Realizar un menú para lograr todas las acciones previamente mencionadas.
     */
    public static void main(String[] args) {

        ProductService service = new ProductService();
        Product product = service.crearTabla();
        int respuesta = 0;
        do {
            System.out.println("---MENÚ---"
                    + "\n 1. Agregar elemento a la tabla"
                    + "\n 2. Modificar precio a un elemento existente"
                    + "\n 3. Eliminar un producto"
                    + "\n 4. Mostrar tabla de productos"
                    + "\n 5. Salir");
            respuesta = read.nextInt();

            switch (respuesta) {
                case 1:
                    product = service.introducirElemento(product);
                    service.verTabla(product);
                    break;

                case 2:
                    product = service.modificarPrecio(product);
                    service.verTabla(product);
                    break;

                case 3:
                    product = service.eliminarProducto(product);
                    service.verTabla(product);
                    break;

                case 4:
                    service.verTabla(product);
                    break;

                default:
                    System.out.println(" ");
                    System.out.println("---CERRANDO SISTEMA---");

            }
        } while (respuesta != 5);

    }

}
