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
public class Equacao {
    private static final int GRAU = 2;
    private double a;
    private double b;
    private double c;
    
    public Equacao(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public String toString(){
        return a + "x^2 + " + b + "x + " + c + "= 0";
    }
    
    private double calculaDelta(){
        return Math.pow(b, 2) - 4 * a * c;
    }
    
    public double[] calculaRaizes(){
        double[] raizes = new double[GRAU];
        double delta;
        delta = calculaDelta();
        if(delta >= 0.0){
            raizes[0] = ((-b + Math.sqrt(delta)) / (2 * a));
            raizes[1] = ((-b - Math.sqrt(delta)) / (2 * a));
        }
        
        return raizes;
    }
}
