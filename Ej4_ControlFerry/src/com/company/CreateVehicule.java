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
     *                 los vehículos que son ingresados por teclado de
     *                  acuerdo con el dato solicitado.
     * @return Objeto con la información registrada.
     */
    public static ArrayList<CreateVehicule> addVehicule(
            ArrayList<CreateVehicule> vehicules) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vehículo");
        String name = input.nextLine();
        name = Validation.verificationString(name);

        System.out.println("Ingrese el número de pasajeros del vehículo");
        int passengers = Validation.verificationNumber();

        System.out.println("¿Hay o no tripulación?");
        System.out.println("Escriba true para Si y false para no");
        boolean crew = input.nextBoolean(); //Falta validar el ingreso boolean

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
        System.out.println("Escriba true para Si y false para no");
        boolean fuel = input.nextBoolean();

        CreateVehicule vehicule = new CreateVehicule(passengers, crew,
                wheelNumber, enrollmentDate, transportation, speed, fuel,
                name);

        vehicules.add(vehicule);

        System.out.println("Se ha creado el vehículo con éxito");
        System.out.println("----------------------------------");

        return vehicules;
    } //Cierre del método addVehicule.
} //Cierre de la clase CreateVehicule.
