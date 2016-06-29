/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author felipe
 */
public class Main {

    public static void main(String args[]) throws InterruptedException {
        Thread t1 = new Thread(new Tarefa("A"));
        Thread t2 = new Thread(new Tarefa("B"));
        
        t1.start();
        //Thread.sleep(1);
        t2.start();
        
        t1.join();
        System.out.println("Fim da thread A.");        
        
        t2.join();
        System.out.println("Fim da thread B.");        

        //for (int i = 0; i <= 100; i+=20){
        //    System.out.println("Tarefa main: " + i + "%");
        //}
        
        System.out.println("Fim da thread principal");
    }
}
