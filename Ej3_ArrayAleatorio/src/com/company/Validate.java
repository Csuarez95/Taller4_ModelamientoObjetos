package com.company;

import java.util.Scanner;

/**
 * Clase creada para la validación de los datos ingresados, teniendo en
 * cuenta que los valores integrados por teclado sean numéricos.
 */
public class Validate {

    /**
     * Método para la validación de ingreso de enteros por teclado.
     * @return Número ingresado por teclado.
     */
    public static int verificationNumber () {
        Boolean verification = false;
        Scanner input = new Scanner(System.in);
        int number = 0;
        while (!verification){
            try {
                number = Integer.parseInt(input.nextLine());
                verification = true;
            } catch (Exception e) {
                System.out.println("No es permitido ese valor " +
                        "por favor, ingrese uno válido");
            }
        } //Cierre del ciclo While.
        return number;
    } //Cierre del método verificationNumber.
} //Cierre de la clase Validate.
