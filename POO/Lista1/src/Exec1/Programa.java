/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec1;

/**
 *
 * @author felipe
 */
public class Programa {
    public static void main(String[] args){
        Equacao eq = new Equacao(1, 3, 1);
        System.out.println(eq.toString());
        double[] raizes = eq.calculaRaizes();
        System.out.println("raizes: " + raizes[0] + ", " + raizes[1]);
    }
    
    
    
    
}
