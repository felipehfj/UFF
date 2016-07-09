/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec13;

/**
 *
 * @author felipe
 */
public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(100);
        
        vetor.popula();
        vetor.imprime();
        
        vetor.ordena();
        vetor.imprime();
        
    }
}
