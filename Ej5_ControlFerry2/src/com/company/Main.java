package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa para la creación de control de un Ferry el cual permite crear
 * diferentes tipos de vehículos con características únicas de acuerdo con la
 * selección hasta completar un total de 10 registros.
 * @author Cristian Suárez Acosta.
 */
public class Main {

    public static void main(String[] args) {

        Scanner option = new Scanner(System.in);
        ArrayList<Vehicule> vehiculeArrayList = new ArrayList<>();
        System.out.println("-----------------------------------------");
        System.out.println("Bienvenido al programa para la construcción de " +
                "diferentes vehículos");

        int i = 0;
        while (i < 10) {
            System.out.println("-----------------------------------------");
            System.out.println("Seleccione una de las siguientes opciones");
            System.out.println("1. Coche\n2. Moto\n3. Camión\n4. Bicicleta\n5" +
                    ". Lancha\n6. Salir del programa");
            int selection = Validation.verificationNumber();
            /**
             * Condicional Switch-case para determinar el tipo de vehículo
             * que se requiere registrar.
             */
            switch (selection) {
                case 1:
                    System.out.println("Creando coche");
                    CreateVehicule.addVehicule(vehiculeArrayList, 1);
                    for (Vehicule j: vehiculeArrayList) {
                        System.out.println(j.toString());
                    }
                    break;
                case 2:
                    System.out.println("Creando moto");
                    CreateVehicule.addVehicule(vehiculeArrayList, 2);
                    for (Vehicule j: vehiculeArrayList) {
                        System.out.println(j.toString());
                    }
                    break;
                case 3:
                    System.out.println("Creando Camión");
                    CreateVehicule.addVehicule(vehiculeArrayList, 3);
                    for (Vehicule j: vehiculeArrayList) {
                        System.out.println(j.toString());
                    }
                    break;
                case 4:
                    System.out.println("Creando Bicicleta");
                    CreateVehicule.addVehicule(vehiculeArrayList, 4);
                    for (Vehicule j: vehiculeArrayList) {
                        System.out.println(j.toString());
                    }
                    break;
                case 5:
                    System.out.println("Creando lancha");
                    CreateVehicule.addVehicule(vehiculeArrayList, 5);
                    for (Vehicule j: vehiculeArrayList) {
                        System.out.println(j.toString());
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    i = 11;
                    System.exit(0);
                default:
                    System.out.println("Ingrese valor dentro de las opciones");
                    i--;
            } //Cierre de switch case
            i++;
        } //Cierre del ciclo while.
        System.out.println("Programa finalizado");
    } //Cierre del método Main.
} //Cierre de la clase principal.
