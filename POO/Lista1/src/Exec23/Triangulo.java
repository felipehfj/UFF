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
public class Triangulo implements IFigura{
    private double base = 0;
    private double altura = 0;
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
        
    @Override
    public double area() {
        return (base * altura) / 2;
    }
    
}
