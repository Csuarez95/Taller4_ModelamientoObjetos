package com.company;

import static java.lang.Math.pow;

/**
 * Clase abstracta con las características de los planetas.
 * @author Cristian Suárez Acosta.
 */
public abstract class PlanetarySystem {

    /**
     * Atributos con las características comunes de los planetas.
     */
    private double mass;
    private double density;
    private double sunDistance;
    private int id;
    private String name;

    /**
     * Constructor con las características de los planetas.
     * @param mass Atributo para almacenar la masa del planeta.
     * @param density Atributo para almacenar la densidad del planeta.
     * @param sunDistance Atributo para almacenar la masa del planeta.
     * @param id Atributo para almacenar la identificación del planeta.
     * @param name Atributo para almacenar el nombre del planeta.
     */
    public PlanetarySystem(double mass,
                           double density,
                           double sunDistance,
                           int id,
                           String name) {
        this.mass = mass;
        this.density = density;
        this.sunDistance = sunDistance;
        this.id = id;
        this.name = name;
    }

    /**
     * Método para retornar la masa del planeta.
     * @return Masa del planeta
     */
    public double getMass() {
        return mass;
    }

    /**
     * Método para asignar al atributo la masa del planeta.
     * @param mass Almacenamiento de la masa del planeta.
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * Método para retornar la densidad del planeta.
     * @return Densidad del planeta
     */
    public double getDensity() {
        return density;
    }

    /**
     * Método para asignar al atributo la densidad del planeta.
     * @param density Almacenamiento de la densidad del planeta.
     */
    public void setDensity(double density) {
        this.density = density;
    }

    /**
     * Método para retornar la distancia con el sol del planeta.
     * @return Distancia con el sol del planeta
     */
    public double getSunDistance() {
        return sunDistance;
    }

    /**
     * Método para asignar al atributo la distancia con el sol del planeta.
     * @param sunDistance Almacenamiento de la distancia con el sold del
     *                    planeta.
     */
    public void setSunDistance(double sunDistance) {
        this.sunDistance = sunDistance;
    }

    /**
     * Método para retornar el ID del planeta.
     * @return ID del planeta
     */
    public int getId() {
        return id;
    }

    /**
     * Método para asignar al atributo el ID del planeta.
     * @param id Almacenamiento del ID del planeta.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método para retornar el nombre del planeta.
     * @return Nombre del planeta
     */
    public String getName() {
        return name;
    }

    /**
     * Método para asignar el nombre del planeta.
     * @param name Almacenamiento del nombre del planeta.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método toString para impresión de los datos almacenados en los
     * atributos.
     * @return Información de cada uno de los planetas.
     */
    @Override
    public String toString() {
        return "ID: " + id +
                ", Nombre: " + name +
                ", Masa (Kg): " + mass +
                ", Densidad (gr/cm^3): " + density +
                ", Distancia del sol (Km): " + sunDistance;
    }

    /**
     * Método para calcular la atracción gravitacional entre dos planetas.
     * @param mass1 Parámetro para ingresar la masa del planeta 1.
     * @param mass2 Parámetro para ingresar la masa del planeta 2.
     * @param distance Distancia entre los 2 planetas.
     */
    public static void gravitationalAttraction (double mass1, double mass2,
                                           double distance) {

        double F = (0.0000000000667 * (mass1 * mass2) / pow(distance, 2));

        System.out.println("La atracción obtenida entre los dos cuerpos es " +
                "F = " + F + " N");
    } //Cierre del método gravitationalAttraction
} //Cierre de la clase PlanetarySystem
