package com.company;

import java.util.Scanner;
import java.util.Vector;

/**
 * Clase creada para el llenado del vector con los valores que se ingresan
 * por teclado.
 * @author Cristian Suárez Acosta.
 */
public class VectorNumbers {

    /**
     * Método encargado de realizar el llenado del vector con los valores
     * ingresados por teclado.
     * @param size Determina el tamaño del vector.
     * @return Vector con los valores almacenados después de ingresar el
     * mismo número dos veces seguidas.
     */
    public static Vector vectorFill(int size) {

        Vector vector = new Vector(3);
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese el valor para el vector");
            vector.add(i, input.nextInt());
            if (i != 0) {
                if (vector.elementAt(i - 1).equals(vector.elementAt(i))) {
                    break;
                }
            }
            size++;
        } //Cierre del ciclo for.
        return vector;
    } //Cierre del método vectorFill.
} //Cierre de la clase VectorNumbers.
