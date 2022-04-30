package com.company;

/**
 * Clase abstracta Vehicule (Ferry) para la definición de los aspectos comunes
 * de los vehículos, registrando por teclado la información solicitada y
 * finalmente imprimir por consola la información de cada vehículo creado.
 * @author Cristian Suárez Acosta.
 */

public abstract class Vehicule {

    /**
     * Atributo para almacenar la cantidad de pasajeros.
     */
    private int passengers;
    /**
     * Atributo para almacenar la existencia o no de tripulación.
     */
    private boolean crew;
    /**
     * Atributo para almacenar la cantidad de ruedas.
     */
    private int wheelsNumber;
    /**
     * Atributo para almacenar la fecha de matricula.
     */
    private int enrollmentDate;
    /**
     * Atributo para almacenar el medio de desplazamiento.
     */
    private String transportation;
    /**
     * Atributo para almacenar la velocidad máxima del vehículo.
     */
    private int speed;
    /**
     * Atributo para almacenar si hay o no combustible en el vehículo.
     */
    private boolean fuel;
    /**
     * Atributo para almacenar el nombre del vehículo.
     */
    private String name;

    /**
     * Constructor para inicializar el objeto de la clase que contiene las
     * características de los vehículos.
     * @param passengers Número de pasajeros.
     * @param crew Presencia o ausencia de tripulación.
     * @param wheelsNumber Número de ruedas.
     * @param enrollmentDate Año de matrícula.
     * @param transportation Medio de desplazamiento.
     * @param speed Velocidad máxima del vehículo.
     * @param fuel Presencia o ausencia de combustible.
     * @param name Nombre del vehículo.
     */
    public Vehicule(int passengers, boolean crew, int wheelsNumber,
                    int enrollmentDate, String transportation,
                    int speed, boolean fuel, String name) {
        this.passengers = passengers;
        this.crew = crew;
        this.wheelsNumber = wheelsNumber;
        this.enrollmentDate = enrollmentDate;
        this.transportation = transportation;
        this.speed = speed;
        this.fuel = fuel;
        this.name = name;
    }

    /**
     * Método para obtener la cantidad de pasajeros.
     * @return Cantidad de pasajeros.
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * Método para almacenar la cantidad de pasajeros.
     * @param passengers Número de pasajeros.
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    /**
     * Método para obtener si hay o no tripulación.
     * @return Presencia de tripulación.
     */
    public boolean isCrew() {
        return crew;
    }

    /**
     * Método para almacenar la presencia o no de tripulación.
     * @param crew Presencia de tripulación.
     */
    public void setCrew(boolean crew) {
        this.crew = crew;
    }

    /**
     * Método para obtener la cantidad de ruedas del vehículo.
     * @return Número de ruedas.
     */
    public int getWheelsNumber() {
        return wheelsNumber;
    }

    /**
     * Método para almacenar cantidad de ruedas del vehículo.
     * @param wheelsNumber Número de ruedas de tripulación.
     */
    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    /**
     * Método para obtener el año de matrícula.
     * @return Año de matrícula.
     */
    public int getEnrollmentDate() {
        return enrollmentDate;
    }

    /**
     * Método para almacenar el año de matrícula del vehículo.
     * @param enrollmentDate Año de matricula del vehículo.
     */
    public void setEnrollmentDate(int enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    /**
     * Método para obtener el medio de desplazamiento del vehículo.
     * @return Medio de desplazamiento.
     */
    public String getTransportation() {
        return transportation;
    }

    /**
     * Método para almacenar el medio de desplazamiento del vehículo.
     * @param transportation Medio de desplazamiento del vehículo.
     */
    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    /**
     * Método para obtener la velocidad del vehículo.
     * @return Velocidad del vehículo.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Método para almacenar la velocidad del vehículo.
     * @param speed Velocidad del vehículo.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Método para obtener si el vehículo tiene o no combustible.
     * @return Presencia de combustible.
     */
    public boolean isFuel() {
        return fuel;
    }

    /**
     * Método para almacenar la presencia o no de combustible del vehículo.
     * @param fuel Presencia de combustible del vehículo.
     */
    public void setFuel(boolean fuel) {
        this.fuel = fuel;
    }

    /**
     * Método para obtener el nombre del vehículo.
     * @return Nombre del vehículo.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para almacenar el nombre del vehículo.
     * @param name Nombre del vehículo.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método sobreescrito para impresión de los aspectos de los vehículos.
     * @return Objeto con la información registrada para cada uno de los
     * vehículos.
     */
    @Override
    public String toString() {
        return "Vehicule[" +
                "Nombre: " + name +
                "; Número de pasajeros: " + passengers +
                "; ¿Hay tripulación? " + crew +
                "; Número de ruedas: " + wheelsNumber +
                "; Año de matricula: " + enrollmentDate +
                "; Medio de desplazamiento: " + transportation +
                "; Velocidad en Km/s: " + speed +
                "; ¿Tiene combustible? " + fuel;
    }
}

