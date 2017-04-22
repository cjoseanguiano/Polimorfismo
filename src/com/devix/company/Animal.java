package com.devix.company;

/**
 * Created by carlosjoseanguiano on 22/04/17.
 */
public abstract class Animal implements IAnimal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor Animal, " + "Nombre del Animal" +
                ": " + this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public abstract void tipoAnimal();
}
