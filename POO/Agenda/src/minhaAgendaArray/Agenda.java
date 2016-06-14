/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaAgendaArray;

import java.security.SecureRandom;

/**
 *
 * @author felipe
 */
public class Agenda {
    private Pessoa[] contatos = new Pessoa[20];
    private int cont = 0;
    
    public Agenda() {

    }

    public Pessoa addContato(Pessoa pessoa) {
        this.contatos[cont] = new Pessoa(pessoa.getNome(), pessoa.getTelefone());
        cont++;
        return pessoa;
    }

    public void listarNome() {
        OrdenadorNome ordem = new OrdenadorNome();
        ordem.sort(contatos);
        this.imprimir();
    }

    public void listarTelefone() {
        OrdenadorTelefone ordem = new OrdenadorTelefone();
        ordem.sort(contatos);
        this.imprimir();
    }

    public void imprimir() {
        for(Pessoa pessoa : contatos) {
            System.out.println("Nome: " + pessoa.getNome() + " | Telefone: " + pessoa.getTelefone());
        }
    }

    public void popula() {
        for (int i = 0; i < contatos.length; i++) {
            this.addContato(new Pessoa(this.geraNome(10),this.geraTelefone(8)));
        }
    }

    private String geraNome(int len) {
        final String UCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String DCASE = "abcdefghijklmnopqrstuvwxyz";
        
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        
        sb.append(UCASE.charAt(rnd.nextInt(UCASE.length())));
        for (int i = 1; i < len; i++) {
            sb.append(DCASE.charAt(rnd.nextInt(DCASE.length())));
        }
        return sb.toString();
    }
    
    private String geraTelefone(int len) {
        final String tel = "0123456789";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(tel.charAt(rnd.nextInt(tel.length())));
        }
        sb.insert(len/2, "-");
        return sb.toString();
    }

}
