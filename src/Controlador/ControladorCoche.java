/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Coche;
import Vista.VistaCoche;
import java.util.ArrayList;
import java.util.List;

public class ControladorCoche {
    private List<Coche> coches;
    private VistaCoche vista;

    public ControladorCoche(VistaCoche vista) {
        this.vista = vista;
        this.coches = new ArrayList<>();
    }

    public void agregarCoche(String marca, String modelo, int año) {
        Coche coche = new Coche(marca, modelo, año);
        coches.add(coche);
    }

    public void mostrarCoches() {
        vista.imprimirDetallesCoches(coches);
    }
}