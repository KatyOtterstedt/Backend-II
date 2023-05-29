package Alumno_3;

import java.util.ArrayList;

public class Alumno {

    /*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
con sus 3 notas. 

*/
    private String nombre;
    private ArrayList <Integer> notas;

    public Alumno() {
        notas = new ArrayList();
    }

     
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList <Integer> getNotas() {
        return notas;
    }

    //En vez del set normal hago un método q me permita agregarle elementos a una lista
    public void setNotas(Integer elemento) {
        this.notas.add(elemento);
    }
    
    
    
}
