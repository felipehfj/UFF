/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec36;

/**
 *
 * @author felipe
 */
public class Main {
    public static void main(String args[]) throws InterruptedException {
        final int NUMERO = 500;
        
        Thread t1 = new Thread(new Primos("A", 2, NUMERO/2));
        Thread t2 = new Thread(new Primos("B", NUMERO/2, NUMERO));
                
        t1.start();
        t2.start();
    }
}
