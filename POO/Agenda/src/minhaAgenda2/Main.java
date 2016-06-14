/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaAgenda2;

/**
 *
 * @author felipe
 */
public class Main {

    public static void main(String args[]) {
        Agenda agenda = new Agenda();
              
        agenda.popula();
        
        System.out.println("Agenda sem ordenação");
        agenda.imprimir();
        
        System.out.println("Ordenação por nome");
        agenda.listarNome();
        
        System.out.println("Ordenação por telefone");
        agenda.listarTelefone();
        
        System.out.println("Agenda sem ordenação");
        agenda.imprimir();
    }
    
}
