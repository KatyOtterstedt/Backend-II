package Baraja.App;

import Baraja.Entidades.Baraja;
import Baraja.Servicios.BarajaServicio;

public class BarajaApp {

    public static void main(String[] args) {

        BarajaServicio serv = new BarajaServicio();
        Baraja baraja = serv.inicializarBaraja();
        

    }
    
}
