package com.company;

/**
 * Clase que hereda de la clase abstracta Vehícule los atributos para la
 * creación de un vehículo tipo bicicleta.
 * @author Cristian Suárez Acosta.
 */
public class Bike extends Vehicule {

    /**
     * Atributo para almacenar la cantidad de discos de la bicicleta.
     */
    private int bicyclePlate;

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
     * @param bicyclePlate Cantidad de discos de la bicicleta.
     */
    public Bike(int passengers,
                boolean crew,
                int wheelsNumber,
                int enrollmentDate,
                String transportation,
                int speed,
                boolean fuel,
                String name,
                int bicyclePlate) {
        super(passengers, crew, wheelsNumber, enrollmentDate, transportation,
                speed, fuel, name);
        this.bicyclePlate = bicyclePlate;
    }

    /**
     * Método sobreescrito para impresión de los aspectos de los vehículos,
     * heredando de la clase abstracta Vehícule.
     * @return Objeto de tipo Bike con la información registrada.
     */
    @Override
    public String toString() {
        return super.toString() + "; Número de platos: " + bicyclePlate + "]";
    }
}
