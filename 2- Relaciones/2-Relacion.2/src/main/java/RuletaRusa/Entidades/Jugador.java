package RuletaRusa.Entidades;

/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica 
si está mojado o no el jugador). 
 */
public class Jugador {
    private int ID;
    private static int contadorID = 1;
    private String nombre;
    private boolean shot; //si le dispararon o no

     
    

    public Jugador() {
        this.ID = contadorID;
        contadorID++;
        this.nombre = "Jugador " + ID;
    }

    public int getContadorID() {
        return contadorID;
    }

    public void setContadorID(int contadorID) {
        this.contadorID = contadorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isShot() {
        return shot;
    }

    public void setShot(boolean shot) {
        this.shot = shot;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + ", contadorID=" + contadorID + ", nombre=" + nombre + ", shot=" + shot + '}';
    }
    
    
    
    
    
}
