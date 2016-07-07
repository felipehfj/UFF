/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec23;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe
 */
public class Main {
    public static void main(String[] args) {
        List<IFigura> figuras = new ArrayList<>();
        
        figuras.add(new Retangulo(2, 2));
        figuras.add(new Quadrado(4));
        figuras.add(new Triangulo(2, 1));
        figuras.add(new Circulo(1));
        
        for(IFigura f : figuras){
            if(f instanceof Retangulo && f.getClass().getSimpleName().equals("Retangulo")){
                System.out.println("Lado 1 do retangulo: " + ((Retangulo)f).getL1());
                //f.getClass().
                }
            System.out.println("Area: " + f.area());
        }
    }
}
