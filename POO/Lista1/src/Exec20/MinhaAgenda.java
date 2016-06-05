/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec20;

import oracle.jrockit.jfr.tools.ConCatRepository;

/**
 *
 * @author felipe
 */
public class MinhaAgenda {
    public static void main(String[] args){
        Contato c1 = new Contato("Felipe", "1111-1111");
        Contato c2 = new Contato("Henrique", "2222-2222");
        Contato c3 = new Contato("Ferreira", "3333-3333");
        
        Agenda agenda = new Agenda();
        
        agenda.addContato(c1);
        agenda.addContato(c2);
        agenda.addContato(c3);
        
        agenda.listarContatos();
    }
    
}
