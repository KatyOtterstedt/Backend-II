package RuletaRusa.Servicio;

import RuletaRusa.Entidades.Jugador;
import RuletaRusa.Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/*
El número de jugadores será decidido por el usuario, pero 
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6. 
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
public class JugadorServicio {

    //private int jugadorActual = 1;
    static Scanner read = new Scanner(System.in);

    //Creando jugadores
    public ArrayList<Jugador> inicializarJugadores() {
        System.out.println("---INGRESE LA CANTIDAD DE JUGADORES---");
        System.out.println("Máximo 6");
        int cantidad = read.nextInt();
        read.nextLine();
        ArrayList<Jugador> listaJugadores = new ArrayList();
        if (cantidad > 6) {
            System.out.println("Dije que el máximo es 6, no se crean más jugadores");
            for (int i = 0; i < 6; i++) {
                listaJugadores.add(new Jugador());
            }
        } else {
            for (int i = 0; i < cantidad; i++) {
                listaJugadores.add(new Jugador());
            }
        }

        return listaJugadores;
    }

    /*
    disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
     */
    //Dispara y devuelve el boolean q se le va a asignar al jugador en el atributo 'shot'
    public boolean disparo(Revolver revolver) {
        RevolverServicio serv = new RevolverServicio();
        boolean disparo = serv.disparar(revolver);
        serv.siguienteCamara(revolver);
        return disparo;
    }
}
