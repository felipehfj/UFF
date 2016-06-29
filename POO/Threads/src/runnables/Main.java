/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnables;

/**
 *
 * @author felipe
 */
public class Main {

    public static void main(String args[]) {
        Runnable contador = new Contador();

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(contador);
            t.start();
        }
    }
}
