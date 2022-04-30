package com.company;

import java.util.ArrayList;

/**
 * Programa para llenar un array con números aleatorios empleando la clase
 * Math y organizando el array usando el método de burbuja o quicksort.
 * @author Cristian Suárez Acosta.
 */
public class Main {

    public static void main(String[] args) {

        /**
         * Creación de un arraylist para almacenar los valores del aleatorios.
         */
        ArrayList numberList;

        /**
         * Atributo para determinar el la continuación del programa para
         * organizar el arraylist en los métodos especificados.
         */
        boolean flag = true;

        System.out.println("LLenado de Array");
        System.out.println("Ingrese el tamaño de la lista");
        int value = Validate.verificationNumber();
        numberList = RandomNumbers.random(value);
        System.out.println(numberList);

        while (flag) {
            /**
             * Menú para selección del método para organizar el array.
             */
            System.out.println("Seleccione el método de organización que " +
                    "desee");
            System.out.println("1. Método burbuja\n2. Método quick sort\n3. " +
                    "Salir");
            int option = Validate.verificationNumber();

            /**
             * COndicional Swits para organizar el array con el método deseado.
             */
            switch (option) {
                case 1:
                    System.out.println("Método burbuja");
                    Methods.bubbleMethodList(numberList);
                    break;
                case 2:
                    System.out.println("Método quick sort");
                    Methods.quickSortList(numberList, 0, numberList.size() - 1);
                    System.out.println(numberList);
                    break;
                case 3:
                    System.out.println("Finalizando el programa");
                    flag = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Seleccionó una opción que no está en la " +
                            "lista, por favor ingrese una opción válida");
            } // Cierre del switch-case
        } // Cierre del ciclo while.
    } //Cierre del método Main.
}
