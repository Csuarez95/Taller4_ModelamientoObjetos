package com.company;

import java.util.ArrayList;

/**
 * Programa para observar las características de los planetas y determinar la
 * Fuerza gravitatoria entre 2 planetas que se encuentren en la lista.
 * @author Cristian Suárez Acosta
 */
public class Main {

    public static void main(String[] args){

        /**
         * Atributo para que el programa se ejecute de manera cíclica.
         */
        boolean flag = true;
        /**
         * Objeto creado del tipo PlanetarySystem para mostrar la información
         * de los planetas.
         */
        ArrayList<PlanetarySystem> planetarySystems;
        /**
         * Acceso a la clase Planets para la impresión de las características.
         */
        planetarySystems = Planets.printPlanet();
        for (PlanetarySystem i:planetarySystems) {
            System.out.println(i);
        }

        System.out.println("Se presentan los planetas del sistema solar");
        System.out.println("-------------------------------------------");
        System.out.println("Seleccione los planetas para determinar la " +
                "atracción gravitatoria");

        while (flag){
            /**
             * Solicitud de ID de los planetas que desea calcular la fuerza
             * gravitatoria.
             */
            System.out.println("Ingrese el ID del primer planeta");
            int id1 = Validation.verificationNumber();
            System.out.println("Ingrese el ID del segundo planeta");
            int id2 = Validation.verificationNumber();

            /**
             * Condicional para validar que los valores ingresados por
             * teclado estén en el rago establecido y que no se ingrese el
             * mismo ID.
             */
            if (id1 <= planetarySystems.size() && id1 > 0 &&
                    id2 <= planetarySystems.size() && id2 > 0) {
                if (id1 == id2) {
                    System.out.println("No se puede ingresar el mismo planeta");
                } else {
                    PlanetarySystem planet1 = planetarySystems.get(id1 - 1);
                    PlanetarySystem planet2 = planetarySystems.get(id2 - 1);

                    PlanetarySystem.gravitationalAttraction(planet1.getMass(),
                            planet2.getMass(),
                            (planet1.getSunDistance() - planet2.getSunDistance()));
                    System.exit(0);
                    flag = false;
                }
            } else {
                System.out.println("Uno de los valores ingresados no está en " +
                        "el rango especificado, por favor, ingrese los " +
                        "valores entre 1 y " + planetarySystems.size());
            }
        } //Fin de ciclo while.
    } //Cierre del método principal
} //Cierre de la clase principal
