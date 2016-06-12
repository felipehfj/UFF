/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaAgenda;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author felipe
 */
public class Agenda {
    private ArrayList<Pessoa> contatos = new ArrayList<>();

    public Agenda() {
    
    }
    
    public Pessoa addContato(Pessoa pessoa){
        this.contatos.add(pessoa);
        return pessoa;
    }
    
    /**
     *
     * @param pessoa
     * @return
     */
    public boolean removeContato(Pessoa pessoa){
        if(!this.contatos.contains(pessoa)){
            return false;
        } else {
            this.contatos.remove(pessoa);
            return true;
        }
    }
    
    public void listarNome(){
        Ordenador ordem = new OrdenadorNome();
        ordem.ordena(contatos);
        this.imprimir();
    }
    
    public void listarTelefone(){
        Ordenador ordem = new OrdenadorTelefone();
        ordem.ordena(contatos);
        this.imprimir();
    }
    
    public void imprimir(){
        contatos.stream().forEach((c) -> {
            System.out.println("Nome: " + c.getNome() + " | Telefone: " + c.getTelefone());
        });
    }
    
    public void popula(){
        for(int i = 0; i < 20; i++){
            this.addContato(new Pessoa("A"+Math.random(), ""+Math.random()));
        }
    }
    
    
}
