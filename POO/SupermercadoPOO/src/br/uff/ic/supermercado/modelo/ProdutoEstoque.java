/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

/**
 *Esta classe representa um produto de estoque,nela é possivel fazer 
 * modificações em um produto de estoque
 * @author felipe
 */
public class ProdutoEstoque extends Produto{
    private double quantidade;
   
    public ProdutoEstoque(String nome, int codigo, double precoUnitario, int tipo) {
        super(nome, codigo, precoUnitario, tipo);
    }

    public ProdutoEstoque(String nome, int codigo, double precoUnitario, int tipo, double quantidade) {
        super(nome, codigo, precoUnitario, tipo);
        this.quantidade = quantidade;
    }

    /**
     *
     * @param produto
     * @param quantidade
     */
    public ProdutoEstoque(Produto produto, double quantidade) {
        super(produto.getNome(), produto.getCodigo(), produto.getPrecoUnitario(), produto.getTipo());
        this.quantidade = quantidade;
    }
    
    /**
     *
     * @param produto
     */
    public ProdutoEstoque(Produto produto) {
        super(produto.getNome(), produto.getCodigo(), produto.getPrecoUnitario(), produto.getTipo());
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return super.toString() + " Qtd: " + quantidade;
    }    
}
