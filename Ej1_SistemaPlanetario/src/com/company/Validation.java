package com.company;

import java.util.Scanner;

/**
 * Interfaz creada para la verificación en el ingreso de los valores numéricos.
 * @author Cristian Suárez Acosta.
 */
public interface Validation {

    /**
     * Método para la comprobación del ingreso por teclado de los ID de los
     * planetas de la lista.
     * @return Valor ingresado por teclado.
     */
    static int verificationNumber () {
        Boolean verification = false;
        Scanner input = new Scanner(System.in);
        int number = 0;
        while (!verification){
            try {
                System.out.println("Ingrese un número dentro de las opciones");
                number = Integer.parseInt(input.nextLine());
                verification = true;
            } catch (Exception e) {
                System.out.println("El valor debe ser el ID de los planetas " +
                        "listados");
            }
        } //Cierre del ciclo While.
        return number;
    } //Cierre del método verificationNumber.
}
