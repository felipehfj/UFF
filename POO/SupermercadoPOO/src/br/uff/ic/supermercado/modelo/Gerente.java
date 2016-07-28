/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

import java.util.Date;

/**
 *Esta classe representa o usuário Gerente, nela podem ser adicionados produtos 
 * ao estoque alem de poder emitir relatórios de venda e de estoque
 * @author felipe
 */
public class Gerente extends Funcionario{

    public Gerente(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public String toString() {
        return "Gerente: " + super.getNome();
    }
    
    /**
     *
     * @param produto
     * @param estoque
     * @return produto
     */    
   public Produto adicionarProdutoEstoque(Produto produto, Estoque estoque){
       
       return null;
   }

    /**
     * Emite o relatorio das vendas do dia. Recebe o repositorio de vendas e a data a ser pesquisada
     * @param venda
     * @param data
     */   
   public void emitirRelatorioVendas(Vendas venda){
       
   }
   
    /**
     * Emite o relatorio do estoque
     * @param estoque
     * @param data
     */
    public void emitirRelatorioEstoque(Estoque estoque){
       
   }
    
}
