/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

import br.uff.ic.supermercado.excecao.NaoTemQuantidadeException;
import br.uff.ic.supermercado.excecao.ProdutoNaoEncontradoException;

/**
 *Esta classe representa o funcionário "Caixa" tendo representatividade lógica, mas não funcional
 * 
 * @author felipe
 */
public class Caixa extends Funcionario{

    public Caixa(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public String toString() {
        return "Caixa: " + super.getNome();
    }
    /**
     * Finaliza a venda chamando o método finalizaVenda da classe registradora
     * 
     * @param registradora
     * @throws NaoTemQuantidadeException
     * @throws ProdutoNaoEncontradoException 
     */
    public void finalizaVenda(Registradora registradora) throws NaoTemQuantidadeException, ProdutoNaoEncontradoException{
        registradora.finalizaVenda();
    }
}
