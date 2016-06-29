/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author felipe
 */
public class Main {

    public static void main(String args[]) throws InterruptedException {
        final long N = 45;

        long  startTime = System.currentTimeMillis();
        Fibonacci f = new Fibonacci(N);
        System.out.println(f.fib(N));
        System.out.println("Tempo normal: " + (System.currentTimeMillis() - startTime));
        
        
        startTime = System.currentTimeMillis();
        Fibonacci fn0 = new Fibonacci(N-1);
        Fibonacci fn1 = new Fibonacci(N-2);
        
        Thread t1 = new Thread(fn0);
        Thread t2 = new Thread(fn1);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println(fn0.getR() + fn1.getR());
        System.out.println("Tempo thread: " + (System.currentTimeMillis() - startTime));
        
    }
    
}
