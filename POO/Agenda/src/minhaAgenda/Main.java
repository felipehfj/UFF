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
public class Main {

    public static void main(String args[]) {
        Pessoa p1 = new Pessoa("Felipe", "3497-2016");
        Pessoa p2 = new Pessoa("Henrique", "99295-6072");
        Pessoa p3 = new Pessoa("Amarelo", "99295-6072");
        
        Agenda agenda = new Agenda();
        
        agenda.addContato(p1);
        agenda.addContato(p2);
        agenda.addContato(p3);
        
        //agenda.removeContato(p1);
        
        //agenda.imprimir();
        //agenda.listarNome();
        //System.out.println("");
        //agenda.listarTelefone();
        
        agenda.popula();
        
        //agenda.imprimir();
        agenda.listarNome();
        
        agenda.listarTelefone();
    }
    
}
