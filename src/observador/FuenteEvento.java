/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;
import java.util.*;

/**
 *
 * @author PC
 */
class FuenteEvento extends Observable implements Runnable {
    public void run() {
        while (true) {
            String respuesta = new Scanner(System.in).next();
            setChanged();
            notifyObservers(respuesta);
        }
    }
}
