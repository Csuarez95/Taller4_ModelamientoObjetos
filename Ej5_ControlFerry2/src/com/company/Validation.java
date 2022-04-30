package com.company;

import java.util.Scanner;

/**
 * Clase para la validación de los datos que son ingresados por teclado,
 * tanto para el reconocimiento de los números como para evitar los campos
 * vacíos en los registros del teclado.
 * @author Cristian Suárez Acosta.
 */
public class Validation {

    /**
     * Método que verifica que el dato que sea ingresado por teclado
     * corresponda a un número.
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
    } //Cierre del método verificationNumber

    /**
     * Método que verifica que los datos de tipo String que sean ingresados
     * no contengan un campo vacío.
     * @param string Dato que será comprobado dentro del método.
     * @return Dato ingresado por teclado.
     */
    public static String verificationString (String string) {
        while (string.isEmpty()){
            Scanner input = new Scanner(System.in);
            System.out.println("El campo de texto no puede estar vacío, por " +
                    "favor ingrese el texto soliciado");
            string = input.nextLine();
        }
        return string;
    } //Cierre del método verificationString.
} //Cierre de la clase Validation.

