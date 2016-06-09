/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author felipe
 */
public class Agenda {
    public static Pessoa agenda[];
            
    public static void main(String[] args) {
        agenda = new Pessoa[5];
        
        agenda[0] = new Pessoa("Felipe", 1);
        agenda[1] = new Pessoa("Henrique", 12);
        agenda[2] = new Pessoa("Ferreira", 19);
        agenda[3] = new Pessoa("Jesus", 16);
        agenda[4] = new Pessoa("Felipe", 2);
        
        Agenda a = new Agenda();
        
        a.listarIdade();
        
        a.listarNome();
    }

    public void listarNome() {
        Ordenador o = new OrdenadorNome();
        o.ordena(agenda);
        imprime();
    }

    public void listarIdade() {
        Ordenador o = new OrdenadorIdade();
        o.ordena(agenda);
        imprime();
    }

    public void imprime() {
        for(Pessoa p : agenda){
            System.out.println(p.toString());
        }
    }

}
