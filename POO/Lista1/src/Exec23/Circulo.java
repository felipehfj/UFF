/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec23;

/**
 *
 * @author felipe
 */
public class Circulo implements IFigura{
    private double raio = 0;
    
    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }
    
}
