/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec2;

/**
 *
 * @author felipe
 */
public class Programa {
    public static void main(String[] args){
        Ponto3D p1 = new Ponto3D(0, 0, 0);
        Ponto3D p2 = new Ponto3D(2, 2, 2);
        System.out.println(p1.calculaDistancia(p2));
        System.out.println(Ponto3D.calculaDistancia(p1, p2));
        
        
        Ponto p3 = new Ponto(new double[] {0, 0, 0});
        Ponto p4 = new Ponto(new double[] {2, 2, 2});
        System.out.println(p3.calculaDistancia(p4));
        System.out.println(Ponto.calculaDistancia(p3, p4));
        
        Ponto p5 = new Ponto(new double[] {0, 0});
        Ponto p6 = new Ponto(new double[] {2, 2});
        System.out.println(p5.calculaDistancia(p6));
        System.out.println(Ponto.calculaDistancia(p5, p6));
    }    
}
