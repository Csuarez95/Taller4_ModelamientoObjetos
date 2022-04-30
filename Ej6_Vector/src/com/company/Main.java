package com.company;

import java.util.Vector;

/**
 * Programa creado para el llenado de un vector con valores enteros que se
 * ingresan por teclado con la condicion de que si se ingresa el mismo número
 * dos veces seguidas, el programa se detiene e imprime el vector con los
 * valores almacenados.
 * @author Cristian Suárez Acosta.
 */
public class Main {

    public static void main(String[] args) {

        /**
         * Instancia de la clase Vector.
         */
        Vector vectorPrint = new Vector(3);

        /**
         * Atributo para almacenar la capacidad inicial del vector.
         */
        int size = vectorPrint.capacity();
        System.out.println("Tamaño inicial del vector: " + size);
        vectorPrint = VectorNumbers.vectorFill(size);
        System.out.println("El vector ingresado es: ");
        System.out.println(vectorPrint);
    } //Cierre del método Main.
} //Cierre de la clase Main.
