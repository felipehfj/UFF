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
public class Retangulo implements IFigura{
    private double l1 = 0;
    private double l2 = 0;

    public Retangulo(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }
    
    @Override
    public double area() {
        return l1 * l2;
    }

    public double getL1() {
        return l1;
    }
    
    
    
}
