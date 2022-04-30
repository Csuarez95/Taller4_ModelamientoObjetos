package com.company;

/**
 * ¿Es posible ejecutar un programa en java que contenga varias clases con
 * métodos main? En caso positivo, ¿cómo se determina el punto de entrada a
 * un programa?
 * Para dar respuesta al enunciado anterior, sí es posible ejecutar un
 * programa que tenga varios métodos main, sin embargo, el método que cuente
 * con la característica de public static void main(String[] args) será el
 * que se ejecutará primeramente cuando arranque la ejecución del programa,
 * mientras que los otros métodos main seran tomados como sobrecargas en el
 * algoritmo, dado que cada método tendría una firma única.
 *
 * En el siguiente algoritmo se observa que indiferente de la posición en la
 * que se encuentre el método con la característica public static void main
 * (String[] args) será ejecutado de primero.
 */
public class Main {

    /**
     * Método secundario para imprimir un String.
     * @param value Mensaje de impresión de String.
     */
    public static void main(String value) {
        System.out.println("Método para imprimir String");
    }

    /**
     * Método principal que se ejecuta primero.
     * @param args Ejecución principal del algoritmo.
     */
    public static void main(String[] args) {
        System.out.println("Método que será ejecutado inicialmente");
    }

    /**
     * Método secundario para imprimir un entero.
     * @param i Mensaje de impresión de entero.
     */
    public static void main(int i) {
        System.out.println("Método para imprimir entero");
    }
}
