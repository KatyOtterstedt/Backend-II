package Animales.Hijos;

import Animales.Animal;

public class Perro extends Animal{

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        System.out.println(this.nombre + " come " + this.alimento);
        

    }
    
}
