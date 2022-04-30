package com.company;

/**
 * Clase que hereda de la clase abstracta Vehícule los atributos para la
 * creación de un vehículo tipo Camión.
 * @author Cristian Suárez Acosta.
 */
public class Truck extends Vehicule {

    /**
     * Atributo para almacenar la altura del camión.
     */
    private int height;

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
     * @param height Altura del camión.
     */
    public Truck(int passengers,
                 boolean crew,
                 int wheelsNumber,
                 int enrollmentDate,
                 String transportation,
                 int speed,
                 boolean fuel,
                 String name,
                 int height) {
        super(passengers, crew, wheelsNumber, enrollmentDate, transportation,
                speed, fuel, name);
        this.height = height;
    }

    /**
     * Método sobreescrito para impresión de los aspectos de los vehículos,
     * heredando de la clase abstracta Vehícule.
     * @return Objeto de tipo Truck con la información registrada.
     */
    @Override
    public String toString() {
        return super.toString() + "; Altura camión: " + height + "]";
    }
}
