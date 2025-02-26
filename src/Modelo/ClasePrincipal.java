/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorCoche;
import Vista.VistaCoche;

/**
 *
 * @author Isaac
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        VistaCoche vista = new VistaCoche();
        ControladorCoche controlador = new ControladorCoche(vista);

        // Agregar coches
        controlador.agregarCoche("Toyota", "Corolla", 2020);
        controlador.agregarCoche("Honda", "Civic", 2019);
        controlador.agregarCoche("Ford", "Mustang", 2021);
        controlador.agregarCoche("KIA", "PICANTO", 2021);

        // Mostrar coches
        controlador.mostrarCoches();
    }
}
