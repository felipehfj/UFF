/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec20;

import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();
    
    public Agenda(){
        
    }
    
    public Agenda(Contato contato) {
        this.addContato(contato);
    }
    
    public void addContato(Contato contato){
        this.contatos.add(contato);
    }
    
    public Contato getContato(String nome){
        Contato c = null;
        for(Contato contato : this.contatos){
            if(contato.getNome().equalsIgnoreCase(nome)){
                return contato;
            }
        }
        return c;
    }
    
    public void listarContatos(){
        this.contatos.stream().forEach((contato) -> {
            System.out.println(contato.toString());
        });
    }
}
