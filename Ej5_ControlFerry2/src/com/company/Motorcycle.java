package com.company;

/**
 * Clase que hereda de la clase abstracta Vehícule los atributos para la
 * creación de un vehículo tipo Motocicleta.
 * @author Cristian Suárez Acosta.
 */
public class Motorcycle extends Vehicule {

    /**
     * Atributo para almacenar tipo de motocicleta de acuerdo a la posición
     * del conductor.
     */
    private String drivingPosition;

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
     * @param drivingPosition Posición del conductor.
     */
    public Motorcycle(int passengers,
                      boolean crew,
                      int wheelsNumber,
                      int enrollmentDate,
                      String transportation,
                      int speed, boolean fuel,
                      String name,
                      String drivingPosition) {
        super(passengers, crew, wheelsNumber, enrollmentDate, transportation,
                speed, fuel, name);
        this.drivingPosition = drivingPosition;
    }

    /**
     * Método sobreescrito para impresión de los aspectos de los vehículos,
     * heredando de la clase abstracta Vehícule.
     * @return Objeto de tipo Motorcycle con la información registrada.
     */
    @Override
    public String toString() {
        return super.toString() + "; Posición de manejo: " + drivingPosition
                + "]";
    }
}
