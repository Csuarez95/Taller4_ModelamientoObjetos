package com.company;

import java.util.ArrayList;

/**
 * Clase creada para el llenado del Arraylist con números aleatprios empleando
 * la clase Math.
 * @author Cristian Suárez Acosta.
 */
public class RandomNumbers {

    /**
     * Método creado para generar el array con valores aleatorios.
     * @param value Parámetros para determinar el tamaño del array.
     * @return Array con los valores aleatorios.
     */
    public static ArrayList random(int value) {

        /**
         * Instancia de la clase Arraylist.
         */
        ArrayList numberList = new ArrayList();

        /**
         * Ciclo para llenado del Arraylist con valores aleatorios,
         * multiplicando cada valor por el tamaño del vector y sumando 1 para
         * evitar que se añada el número 0 al array.
         */
        for (int i = 0; i < value; i++) {
            int aleatory = (int) (Math.random() * value) + 1;
            numberList.add(aleatory);
        }
        return numberList;
    }
}
