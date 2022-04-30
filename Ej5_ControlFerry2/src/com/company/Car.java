package com.company;

/**
 * Clase que hereda de la clase abstracta Vehícule los atributos para la
 * creación de un vehículo tipo Carro.
 * @author Cristian Suárez Acosta.
 */
public class Car extends Vehicule {

    /**
     * Atributo para almacenar el booleano del carro para determinar si
     * cuenta con 3 o 5 puertas.
     */
    private boolean doorsNumber;

    /**
     * Herencia de los atributos de la clase abstracta Vehicule.
     * @param passengers Número de pasajeros.
     * @param crew Presencia o ausencia de tripulación.
     * @param wheelsNumber Número de ruedas.
     * @param enrollmentDate Año de matrícula.
     * @param transportation Medio de desplazamiento.
     * @param speed Velocidad máxima del vehículo.
     * @param fuel Presencia o ausencia de combustible.
     * @param name Nombre del vehículo.
     * @param doorsNumber Número de puertas.
     */
    public Car(int passengers,
               boolean crew,
               int wheelsNumber,
               int enrollmentDate,
               String transportation,
               int speed, boolean fuel,
               String name,
               boolean doorsNumber) {
        super(passengers, crew, wheelsNumber, enrollmentDate, transportation,
                speed, fuel, name);
        this.doorsNumber = doorsNumber;
    }

    /**
     * Método sobreescrito para impresión de los aspectos de los vehículos,
     * heredando de la clase abstracta Vehícule.
     * @return Objeto de tipo Car con la información registrada.
     */
    @Override
    public String toString() {
        return super.toString() + "; Número puertas (3 puertas = true // " +
                "5 puertas = false): " + doorsNumber + "]";
    }
}
