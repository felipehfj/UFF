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
public class Ponto {
    private double[] coordenadas;
  
    public Ponto(double[] coordenadas){
        this.coordenadas = coordenadas;
    }
    
    public double calculaDistancia(Ponto p){
        // TODO checar se p tem o mesmo numero de coordenadas que o interno
        double soma = 0.0;
        for(int i = 0; i < coordenadas.length; i++){
            soma += Math.pow(coordenadas[i] - p.coordenadas[i], 2);
        }
        return Math.sqrt(soma);
    }
    
    static public double calculaDistancia(Ponto p1, Ponto p2){
        return p1.calculaDistancia(p2);
    }
}
