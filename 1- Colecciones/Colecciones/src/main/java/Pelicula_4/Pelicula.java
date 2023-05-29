package Pelicula_4;

import java.util.Comparator;

/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, 
tendremos una clase Pelicula con el título, director y duración de la película (en horas). 

*/
public class Pelicula {
    private String titulo;
    private String director;
    //private int duracion;
    private Integer duracion;
    //= Duration.ofHours(2).plusMinutes(30); // crea una duración de 2 horas y 30 minutos

   
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

     //DEJO DEFINIDO EL METODO PARA IMPRIMIR LOS OBJETOS
    @Override
    public String toString() {
        return "Pelicula{" + "título=" + titulo + ", director=" + director + ", duración=" + duracion + "}";
    }

    
    //Comparar según duración ASCENDENTE (va primero peli1 y después peli2 en los argumentos)
    public static Comparator<Pelicula> compararDuracionAscendente = (Pelicula p1, Pelicula p2) -> p1.getDuracion().compareTo(p2.getDuracion());

    
     //Comparar según duración DESCENDENTE (va primero peli2 y después peli1 en los argumentos)
    public static Comparator <Pelicula> compararDuracionDescendente = (Pelicula peli1, Pelicula peli2) -> peli2.getDuracion().compareTo(peli1.getDuracion());
    
    // Comparar según título en orden alfabético
    public static Comparator <Pelicula> compararOrdenTitulo = (Pelicula peli1, Pelicula peli2) -> peli1.getTitulo().compareTo(peli2.getTitulo());
    
    // Comparar según director en orden alfabético
    public static Comparator <Pelicula> compararOrdenDirector = (Pelicula peli1, Pelicula peli2) -> {
        return peli1.getDirector().compareTo(peli2.getDirector());
    };
}