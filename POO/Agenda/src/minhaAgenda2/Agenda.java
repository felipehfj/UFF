/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaAgenda2;

import java.security.SecureRandom;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Agenda {
    private ArrayList<Pessoa> contatos = new ArrayList<>();

    public Agenda() {

    }

    public Pessoa addContato(Pessoa pessoa) {
        this.contatos.add(pessoa);
        return pessoa;
    }

    /**
     *
     * @param pessoa
     * @return
     */
    public boolean removeContato(Pessoa pessoa) {
        if (!this.contatos.contains(pessoa)) {
            return false;
        } else {
            this.contatos.remove(pessoa);
            return true;
        }
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
        contatos.stream().forEach((c) -> {
            System.out.println("Nome: " + c.getNome() + " | Telefone: " + c.getTelefone());
        });
    }

    public void popula() {
        for (int i = 0; i < 20; i++) {
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
