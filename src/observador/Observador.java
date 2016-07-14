/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import static java.lang.System.out;
import java.util.Observable;

/**
 *
 * @author PC
 */

public class Observador {
    public static void main(String[] args) {
        out.println("Introducir Texto >");
        FuenteEvento fuenteEvento = new FuenteEvento();

        fuenteEvento.addObserver( (Observable obj, Object arg) -> {
            out.println("\nRespuesta recibida: " + arg);
        });

        new Thread(fuenteEvento).start();
    }
}
