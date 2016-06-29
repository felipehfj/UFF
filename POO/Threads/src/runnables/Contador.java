/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnables;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author felipe
 */
public class Contador implements Runnable {

    private int numero = 0;
    private final Set<Integer> numeros = new HashSet<>();
    private static final int MAX = 10000;

    /**
     *
     * @return
     */
    public synchronized int proximo() {
        return numero++;
    }

    public boolean continua() {
        return numero < MAX;
    }

    @Override
    public void run() {
        while (continua()) {
            int proximoNumero = proximo();
            if (!numeros.add(proximoNumero)) {
                System.out.println("Colisão: " + proximoNumero);
            }
        }
    }
}
