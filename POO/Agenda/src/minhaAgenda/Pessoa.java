/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaAgenda;

/**
 *
 * @author felipe
 */
public class Pessoa implements Comparable<Object>{
    private String nome;
    private String telefone;

    public Pessoa(){
    
    }
    
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getTelefone() {
        return telefone;
    }
    
    @Override   
    public int compareTo(Object o){
        if(o instanceof Pessoa){
            return this.nome.compareToIgnoreCase(((Pessoa)o).getNome());
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", telefone=" + telefone + '}';
    }
    
    
    
}
