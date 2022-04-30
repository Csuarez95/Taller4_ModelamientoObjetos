package com.company;

import java.util.ArrayList;

/**
 * Clase que hereda de Planets la información de las características de cada
 * uno de los planetas.
 * @author Cristian Suárez Acosta.
 */
public class Planets extends PlanetarySystem {

    /**
     * Constructor para la definición de los atributos de los planetas.
     * @param mass Atributo para almacenar la masa del planeta.
     * @param density Atributo para almacenar la densidad del planeta.
     * @param sunDistance Atributo para almacenar la masa del planeta.
     * @param id Atributo para almacenar la identificación del planeta.
     * @param name Atributo para almacenar el nombre del planeta.
     */
    public Planets(double mass,
                   double density,
                   double sunDistance,
                   int id,
                   String name) {
        super(mass, density, sunDistance, id, name);
    }

    /**
     * Método para asignar las características de cada uno de los planetas.
     * @return Lista con las características de los planetas.
     */
    public static ArrayList<PlanetarySystem> printPlanet() {
        ArrayList<PlanetarySystem> planetarySystems = new ArrayList<>();

        Planets mercury = new Planets(3.30e23, 5.4, 57.910e3, 1, "Mercurio");
        Planets venus = new Planets(4.87e24, 5.2, 108.200e3, 2, "Venus");
        Planets earth = new Planets(5.97e24, 5.5, 146.600e3, 3, "Tierra");
        Planets mars = new Planets(6.42e23, 3.9, 227.940e3, 4, "Marte");
        Planets jupiter = new Planets(1.90e27, 1.3, 778.330e3, 5, "Júpiter");
        Planets saturn = new Planets(5.68e26, 0.7, 1429.400e3, 6, "Saturno");
        Planets uranus = new Planets(8.68e25, 1.3, 2870.990e3, 7, "Urano");
        Planets neptune = new Planets(1.92e26, 1.6, 4504.300e3, 8, "Neptuno");

        planetarySystems.add(mercury);
        planetarySystems.add(venus);
        planetarySystems.add(earth);
        planetarySystems.add(mars);
        planetarySystems.add(jupiter);
        planetarySystems.add(saturn);
        planetarySystems.add(uranus);
        planetarySystems.add(neptune);

        return planetarySystems;
    } //Cierre del método printPlanet.
}
