package Paises_5;

import java.util.Comparator;

/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el 
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, 
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer 
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
al usuario
 */
public class Country {

    private String pais;
    //Agrego para tener otra opción de comparator
    private Integer cantHabitantes;

    public Integer getCantHabitantes() {
        return cantHabitantes;
    }

    public void setCantHabitantes(Integer cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }
    
    

    public Country(String pais) {
        this.pais = pais;
    }

    
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Country{" + "pais=" + pais + '}';
    }
    
    
    
    //Creo un Comparator para ordenar
    
    //Se crea una clase anónima que implementa la interfaz Comparator
    //ANÓNIMA = CLASE SIN NOMBRE (sólo una implementación)
    //Es INNER CLASS porq se usa dentro de un método
    //Instancia la clase Country implementando la interfaz comparator en la misma (?
    public static Comparator<Country> compararNombre = new Comparator<Country> (){ //Llave de inicio de clase anónima
        @Override //Sobreescribo el método abstracto de la interfaz
        public int compare(Country c1, Country c2) {
            return c1.getPais().compareTo(c2.getPais());
        }
    }; //Llave de cierre de la clase anónima
   
    //Usando la interfaz funcional a partir de una función lambda (no requiere clase anónima)
    public static Comparator<Country> compararHabitantes = (Country c1, Country c2) ->
            c1.getCantHabitantes().compareTo(c2.getCantHabitantes()) 
    ; 
}
