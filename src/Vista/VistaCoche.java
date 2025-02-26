/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Coche;
import java.util.List;

public class VistaCoche {
    public void imprimirDetallesCoches(List<Coche> coches) {
        System.out.println("Lista de coches:");
        for (Coche coche : coches) {
            System.out.println(coche);
        }
    }
}