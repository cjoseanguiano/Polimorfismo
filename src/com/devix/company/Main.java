package com.devix.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Creamos animal, un objeto Perro de tipo Animal
        Animal animal = new Perro("Terry");
        animal.tipoAnimal();
        animal.comunicarse();
        System.out.println();

        //Creamos perro, un objwto Perro de tipo Perro
        Perro perro = new Perro("Hercules");
        perro.tipoAnimal();
        System.out.println();

        //Creamos animalPoliformico, un objeto perro de tipo Animal, asignamos una referencia ya existente
        Animal animalPolimorfico = perro;
        animalPolimorfico.tipoAnimal();
        System.out.println();

        //Reasignamos la referencia del objeto animal a el objeto perro.
        perro = (Perro)animal;
        perro.tipoAnimal();
        System.out.println();

        //Creamos gato, un objeto Gato de tipo Animal
        Animal gato = new Gato("Douglas");
        gato.tipoAnimal();
        gato.comunicarse();
        System.out.println();

        IAnimal gatoIAnimal = new Gato("Pitufo");
        gatoIAnimal.comunicarse();

        System.out.println("Constante en la interfaz Animal " + IAnimal.valor);
    }
}
