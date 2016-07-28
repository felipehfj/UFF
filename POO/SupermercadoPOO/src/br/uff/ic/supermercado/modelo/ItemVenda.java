/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

/**
 *Esta classe representa um item de venda, nela pode-se calcular o subtotal de 
 *um item a ser vendido
 * @author felipe
 */
public class ItemVenda {

    private Produto produto;
    private double quantidade;

    public ItemVenda() {
    }
    
    public ItemVenda(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    /**
     *Multiplica o preço de um produto pela quantidade que será comprada 
     *retornando o valor obtido dessa multiplicação
     * @return 
     */
    public double obterSubtotal() {
        return this.produto.getPrecoUnitario() * quantidade;
    }
}
