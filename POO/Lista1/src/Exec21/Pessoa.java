/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec21;

/**
 *
 * @author felipe
 */
public class Pessoa {
    private String nome;
    
    public Pessoa(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa {" + "nome=" + nome + '}';
    }
  
}
