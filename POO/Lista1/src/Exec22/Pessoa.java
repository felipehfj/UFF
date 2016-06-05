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
public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setPai(Pessoa pai){
        this.pai = pai;
    }
    
    public void setMae(Pessoa mae){
        this.mae = mae;
    }
    
    public void imprimeArvore(){
        System.out.println(this.nome);
        
        if(this.pai != null){
            System.out.print("Pai> ");
            pai.imprimeArvore();
        }
        
        if(this.mae != null){
            System.out.print("Mãe> ");
            mae.imprimeArvore();
        }
        
    }
    
}
