/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec14;

/**
 *
 * @author felipe
 */
public class Main {
    public static void main(String[] args) {
        Vetor vetor1 = new Vetor(50);
        Vetor vetor2 = new Vetor(50);
        
        vetor1.popula();
        vetor2.popula();
        System.out.println("Criado");        
        vetor1.imprime();
        vetor2.imprime();
        
        vetor1.ordena();
        vetor2.ordena();
        System.out.println("Ordenado");
        vetor1.imprime();
        vetor2.imprime();
        
        Vetor vetor3 = vetor1.soma(vetor2.getVetor());
        System.out.println("Novo vetor");
        vetor3.imprime();
    }
}
