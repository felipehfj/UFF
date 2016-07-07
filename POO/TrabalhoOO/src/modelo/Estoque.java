/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Excecao.*;
import java.util.List;

/**
 *
 * @author felipe
 */
public class Estoque {

    private List<Produto> estoque;

    public Estoque() {

    }

    public Estoque(List<Produto> estoque) {
        this.estoque = estoque;
    }

    /**
     *
     * @param pe
     */
    public void addProduto(Produto pe) {
        Produto lp;

        if (estoque.contains(pe)) {
            int i = estoque.indexOf(pe);
            lp = estoque.get(i);
            lp.setQuantidade(lp.getQuantidade() + pe.getQuantidade());
            estoque.add(i, lp);
        } else {
            this.estoque.add(pe);
        }
    }
    
    /**
     *
     * @param nome
     * @param quantidade
     * @return boolean
     */
    public boolean addProduto(String nome, double quantidade){
        
        Produto pe = this.buscaPorNome(nome);
        int indice = 0;
        
        if(pe != null){
            indice = estoque.indexOf(pe);
            pe.setQuantidade(pe.getQuantidade() + quantidade);
            estoque.add(indice, pe);
        }
        return false;       
    }

    public boolean baixarQuantidade(String nome, double quantidade) throws NaoTemQuantidadeException {
        Produto pe = this.buscaPorNome(nome);
        if (this.temQuantidade(pe, quantidade)) {
            pe.setQuantidade(pe.getQuantidade() - quantidade);
            estoque.add(estoque.indexOf(pe), pe);
            return true;
        }
        throw new NaoTemQuantidadeException("Não tem a quantidade solicitada");
    }

    private Produto buscaPorNome(String nome) {
        for (Produto pe : estoque) {
            if (pe.getNome().equalsIgnoreCase(nome)) {
                return pe;
            }
        }
        return null;
    }

    /**
     *
     * @param pe
     * @param quantidade
     * @return
     */
    public boolean temQuantidade(Produto pe, double quantidade) {
        return quantidade < pe.getQuantidade();
    }
}
