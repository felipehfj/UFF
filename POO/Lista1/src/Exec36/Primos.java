/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec36;

/**
 *
 * @author felipe
 */
public class Primos implements Runnable{
    private String nome;
    private int inicio = 0;
    private int fim = 0;
    
    public Primos(String nome, int inicio, int fim) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
    }
        
    @Override
    public void run() {
        boolean primo = false;
        int i, j;
        for(i = this.inicio; i <= this.fim; i++){
            primo=false;
            for(j = 2; j < i; j++){
                if(i % j == 0){
                    primo = true;
                }
            }
            if(!primo){
                System.out.println(nome + ": " + j);
            }
        }
    }  
}
