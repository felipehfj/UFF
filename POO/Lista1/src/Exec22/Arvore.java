/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec22;

/**
 *
 * @author felipe
 */
public class Arvore {
    
    public static void main(String[] args){
        Pessoa eu = new Pessoa("Felipe Ferreira", 32);
        Pessoa pai = new Pessoa("Paulo", 53);
        Pessoa mae = new Pessoa("Conceição", 53);
        
        Pessoa paiMae = new Pessoa("Joaquim", 80);
        Pessoa maeMae = new Pessoa("Aurora", 86);
        
        mae.setPai(paiMae);
        mae.setMae(maeMae);
        
        pai.setPai(new Pessoa("João", 77));
        pai.setMae(new Pessoa("Gloria", 77));
        
        eu.setPai(pai);
        eu.setMae(mae);
        
        eu.imprimeArvore();
        
    }
    
}
