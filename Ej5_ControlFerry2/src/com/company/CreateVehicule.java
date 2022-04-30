package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase para la creación de los vehículos, heredando de la clase abstracta
 * vehículo todos los atributos que componen la creación del vehículo.
 * @author Cristian Suárez Acosta.
 */

public class CreateVehicule extends Vehicule{

    /**
     * Constructor que hereda de la clase abstracta vehícule los atributos.
     * @param passengers Número de pasajeros.
     * @param crew Presencia o ausencia de tripulación.
     * @param wheelsNumber Número de ruedas.
     * @param enrollmentDate Año de matrícula.
     * @param transportation Medio de desplazamiento.
     * @param speed Velocidad máxima del vehículo.
     * @param fuel Presencia o ausencia de combustible.
     * @param name Nombre del vehículo.
     */
    public CreateVehicule(int passengers,
                          boolean crew,
                          int wheelsNumber,
                          int enrollmentDate,
                          String transportation,
                          int speed,
                          boolean fuel,
                          String name) {
        super(passengers, crew, wheelsNumber, enrollmentDate, transportation,
                speed, fuel, name);
    }

    /**
     * Método para la creacción del objeto que almacena las características
     * de cada vehículo.
     * @param vehicules Arraylist vacío para almacenar las características de
     *                  los vehículos que son ingresados por teclado de
     *                  acuerdo con el dato solicitado.
     * @param id Identificador para reconocer el tipo de vehículo que está
     *           almacenando la información, de acuerdo con esta selección,
     *           se presentan características propias de cada vehículo para
     *           el registro de la información.
     * @return Objeto con la información registrada.
     */
    public static ArrayList<Vehicule> addVehicule(
            ArrayList<Vehicule> vehicules, int id) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vehículo");
        String name = input.nextLine();
        name = Validation.verificationString(name);

        System.out.println("Ingrese el número de pasajeros del vehículo");
        int passengers = Validation.verificationNumber();

        System.out.println("¿Hay o no tripulación?");
        System.out.println("Escriba 1 para Si y 2 para no");
        boolean crew = true;
        boolean flagValue1 = true;
        int value1 = 0;
        while (flagValue1) {
            value1 = Validation.verificationNumber();
            switch (value1) {
                case 1:
                    crew = true;
                    flagValue1 = false;
                    break;
                case 2:
                    crew = false;
                    flagValue1 = false;
                    break;
                default:
                    System.out.println("Ingrese un valor dentro de las " +
                            "opciones");
            }
        }


        System.out.println("Ingrese el número de ruedas");
        int wheelNumber = Validation.verificationNumber();

        System.out.println("Ingrese el año de matriculación");
        int enrollmentDate = Validation.verificationNumber();

        System.out.println("Ingrese el medio por el que se desplaza");
        String transportation = input2.nextLine();
        transportation = Validation.verificationString(transportation);

        System.out.println("Ingrese la velocidad máxima del vehículo en " +
                "kilómetros");
        int speed = Validation.verificationNumber();

        System.out.println("¿Tiene o no combustible?");
        System.out.println("Ingrese 1 para Si y 2 para no");
        boolean fuel = true;
        boolean flagValue2 = true;
        int value2 = 0;
        while (flagValue2) {
            value2 = Validation.verificationNumber();
            switch (value2) {
                case 1:
                    fuel = true;
                    flagValue2 = false;
                    break;
                case 2:
                    fuel = false;
                    flagValue2 = false;
                    break;
                default:
                    System.out.println("Ingrese un valor dentro de las " +
                            "opciones");
            }
        }

        /**
         * Condicionales implementados para identificación del aspecto único
         * de cada uno de los vehículos para ser almacenado en el objeto.
         */
        if (id == 1) {
            boolean flag1 = true;
            boolean doorsNumber = true;
            while (flag1) {
                System.out.println("¿El vehículo tiene 3 puertas?\n1. SI\n2. " +
                        "NO");
                int value = Validation.verificationNumber();
                switch (value) {
                    case 1:
                        System.out.println("El vehículo tiene 3 puertas");
                        doorsNumber = true;
                        flag1 = false;
                        break;
                    case 2:
                        System.out.println("El vehículo tiene 5 puertas");
                        doorsNumber = false;
                        flag1 = false;
                        break;
                    default:
                        System.out.println("Ingrese un número dentro de las " +
                                "opciones");
                }
            }

            Car vehicule = new Car(passengers, crew, wheelNumber,
                    enrollmentDate, transportation, speed, fuel, name,
                    doorsNumber);
            vehicules.add(vehicule);

        } else if (id == 2) {
            System.out.println("Seleccione la posición del pasajero");
            System.out.println("1. Deportivo\n2. Estándar\n3. Crucero");
            int selection = Validation.verificationNumber();
            boolean flag2 = true;
            String drivingPosition = "";
            while (flag2) {
                switch (selection) {
                    case 1:
                        drivingPosition = "Deportivo";
                        flag2 = false;
                        break;
                    case 2:
                        drivingPosition = "Estándar";
                        flag2 = false;
                        break;
                    case 3:
                        drivingPosition = "Crucero";
                        flag2 = false;
                        break;
                    default:
                        System.out.println("Ingrese un número dentro de las " +
                                "opciones");
                }
            }
            Motorcycle vehicule = new Motorcycle(passengers, crew, wheelNumber,
                    enrollmentDate, transportation, speed, fuel, name,
                    drivingPosition);
            vehicules.add(vehicule);

        } else if (id == 3) {
            System.out.println("Ingrese la altura del camión en metros");
            int height = Validation.verificationNumber();

            Truck vehicle = new Truck(passengers, crew, wheelNumber,
                    enrollmentDate, transportation, speed, fuel, name, height);
            vehicules.add(vehicle);

        } else if (id == 4) {
            System.out.println("Ingrese el número de platos de la bicicleta");
            int bicyclePlate = Validation.verificationNumber();

            Bike vehicle = new Bike(passengers, crew, wheelNumber,
                    enrollmentDate, transportation, speed, fuel, name,
                    bicyclePlate);
            vehicules.add(vehicle);

        } else if (id == 5) {
            System.out.println("Ingrese el número de mástiles");
            int mastsNumber = Validation.verificationNumber();

            Boat vehicle = new Boat(passengers, crew, wheelNumber,
                    enrollmentDate, transportation, speed, fuel, name,
                    mastsNumber);
            vehicules.add(vehicle);
        }

        System.out.println("Se ha creado el vehículo con éxito");
        System.out.println("----------------------------------");

        return vehicules;
    }
}

