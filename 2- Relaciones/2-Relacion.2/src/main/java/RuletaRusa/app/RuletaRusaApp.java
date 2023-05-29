package RuletaRusa.app;

import RuletaRusa.Entidades.Juego;
import RuletaRusa.Servicio.JuegoServicio;

public class RuletaRusaApp {

    /*
    Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
     */
    public static void main(String[] args) {

        JuegoServicio servJueg = new JuegoServicio();

        System.out.println("---INICIANDO EL JUEGO DE RULETA RUSA---");
        //Inicio el juego con sus atributos correspondientes
        Juego juego = servJueg.crearJuego();
        boolean balaDisparada = false;
        int index = 0;

        //Se juegan rondas hasta q se dispara la bala
        do {
            System.out.println("---RONDA NÚMERO " + (index + 1) + "---");
            String jugadorActual = juego.getListaJugadores().get(index).getNombre();
            System.out.println("---JUEGA EL " + jugadorActual + "---");
            juego = servJueg.ronda(juego, index);
            balaDisparada = juego.getListaJugadores().get(index).isShot();
            if (balaDisparada) {
                System.out.println("---JUGADOR DISPARADO---");
            } else {
                System.out.println("---JUGADOR SE SALVÓ---");
            }
            index++;
        } while (balaDisparada == false && index < juego.getListaJugadores().size());
    }

}
