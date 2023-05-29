package RuletaRusa.Servicio;

import RuletaRusa.Entidades.Juego;
import RuletaRusa.Entidades.Jugador;
//import RuletaRusa.Entidades.Revolver;

public class JuegoServicio {

//Creo los objetos servicio de c/u de las otras clases
    JugadorServicio servJug = new JugadorServicio();
    RevolverServicio servRev = new RevolverServicio();

//Constructor usando como parámetros los q vienen de las otras clases
    public Juego crearJuego() {
        Juego juego = new Juego();
        juego.setListaJugadores(servJug.inicializarJugadores());
        for (Jugador jugador : juego.getListaJugadores()) {
            System.out.println(jugador.getNombre());
            System.out.println(" ");
        }
        juego.setRevolver(servRev.llenarRevolver());
        return juego;
    }

//Genero la ronda q se va a correr tantas veces como sea necesaria 
    public Juego ronda(Juego juego, int index) {
        //Si la cámara actual tiene la bala, setear el jugador a shot true
        if (servJug.disparo(juego.getRevolver())) {
            juego.getListaJugadores().get(index).setShot(true);
            //Si la cámara actual NO tiene la bala, setear el jugador a shot false
        } else {
            juego.getListaJugadores().get(index).setShot(false);
        }
        //Devuelvo el juego con el atributo correspondiente
        return juego;
    }
}
