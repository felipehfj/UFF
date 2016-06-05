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
public class Ponto3D {
    private double x;
    private double y;
    private double z;
    
    public Ponto3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double calculaDistancia(Ponto3D p){
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2) + Math.pow(z - p.z, 2));
    }
    
    static public double calculaDistancia(Ponto3D p1, Ponto3D p2){
        return p1.calculaDistancia(p2);
    }
    
    @Override
    public String toString(){
        return "x= " + x + ", y= " + y + ", z= " + z;
    }
}
