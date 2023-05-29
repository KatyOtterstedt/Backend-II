package RuletaRusa.Servicio;

import RuletaRusa.Entidades.Revolver;
import java.util.Random;

public class RevolverServicio {

    static Random random = new Random();

    //Para setear las posiciones del revolver
    public Revolver llenarRevolver() {
        Revolver revolver = new Revolver();
        System.out.println("---INICIALIZANDO REVOLVER---");
        revolver.setPosicionActual(random.nextInt(6)+1);
        System.out.println("La posición actual es: " + revolver.getPosicionActual());
        revolver.setPosicionBala(random.nextInt(6)+1);
        System.out.println("La bala está en la posición " + revolver.getPosicionBala());
        System.out.println(" ");
        return revolver;
    }

    //Para disparar si coinciden las posiciones     
    public boolean disparar(Revolver revolver) {
        return revolver.getPosicionActual() == revolver.getPosicionBala();
    }

    //Para girar el tambor (cambiar cámara actual)
    public Revolver siguienteCamara(Revolver revolver) {
        //System.out.println("Posición actual: " + revolver.getPosicionActual());
        //System.out.println("Moviendo cámara");
        if (revolver.getPosicionActual()==6) {
         revolver.setPosicionActual(1);   
        } else {
            revolver.setPosicionActual(revolver.getPosicionActual() + 1);
        }
        
        //System.out.println("Posición actual: " + revolver.getPosicionActual());
        return revolver;
    }
}
