/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfism;

/**
 *
 * @author felipe
 */
public abstract class Animal {
    
    private String nome;
    private int idade;
    
    public Animal(){
        
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
     
    public abstract String fala();
    
}
