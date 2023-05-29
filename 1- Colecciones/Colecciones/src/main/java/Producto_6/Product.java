package Producto_6;

import java.util.HashMap;


/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
 El HashMap tendrá de llave el nombre del producto y de valor el precio. 

 */

public class Product {
//    private String tipo;
//    private Double precio;
    //Llave del HashMap (nombre producto) => HAY UNO SOLO
    private HashMap<String, Double> tabla;
    
        
    //Quiero probar q no se pueda devolver el producto individual sino solo la tabla
    //=> creo set y get sólo de la tabla

    
    public Product() {
        this.tabla = new HashMap();
    }

//    public String getTipo() {
//        return tipo;
//    }
//
//    public void setTipo(String tipo) {
//        this.tipo = tipo;
//    }
//
//    public Double getPrecio() {
//        return precio;
//    }
//
//    public void setPrecio(Double precio) {
//        this.precio = precio;
//    }

 
    public void setTabla(HashMap<String, Double> tabla) {
        this.tabla = tabla;
    }

    public HashMap<String, Double> getTabla() {
        return tabla;
    }

    //Para mostrar la tabla de precios
    public void mostrarTabla(){
        tabla.entrySet().forEach(entry -> {
            System.out.println("Nombre producto = " + entry.getKey()
                    + ", precio= " + entry.getValue());
        });
    }
    
    
}
