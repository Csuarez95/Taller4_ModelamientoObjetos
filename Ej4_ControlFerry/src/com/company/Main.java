package com.company;

import java.util.ArrayList;

/**
 * Programa para la creación de control de un Ferry el cual permite crear
 * hasta 10 vehículos almacenando los aspectos comunes de los vehículos.
 * @author Cristian Suárez Acosta.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenido al programa para control de un Ferry");
        /**
         * Instancia de un objeto de tipo CreateVehicule para almacenamiento
         * de la información.
         */
        ArrayList<CreateVehicule> createVehicule = new ArrayList<>();

        /**
         * Ciclo para la creación de los vehículos con un máximo de 10.
         */
        for (int i = 0; i < 10; i++) {
            CreateVehicule.addVehicule(createVehicule);
        }
        /**
         * Ciclo para la impresión de los vehículos registrados.
         */
        for (Vehicule i: createVehicule) {
            System.out.println(i.toString());
        }
    }
}
