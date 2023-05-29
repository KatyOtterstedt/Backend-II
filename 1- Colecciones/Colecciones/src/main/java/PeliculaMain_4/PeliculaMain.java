package PeliculaMain_4;

import Pelicula.Service_4.PeliculaService;
import Pelicula_4.Pelicula;
import java.util.ArrayList;

public class PeliculaMain {

    public static void main(String[] args) {
        PeliculaService serv = new PeliculaService();
        ArrayList <Pelicula> listaPelis = serv.crearListaPeliculas();
        serv.mostrarLista(listaPelis);
        serv.mostrarMayores(listaPelis);
        serv.ordenarDuracAscend(listaPelis);
        serv.ordenarDuracDescend(listaPelis);
        serv.ordenarDirector(listaPelis);
        serv.ordenarTitulo(listaPelis);
        for (int i = 0; i < 10; i++) {
            
        }
        
    }
    
}
