/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author felipe
 */
public class ItemVenda {
    private ProdutoUnidade produto;
    private double quantidade;
    private double subtotal;
    
    public ItemVenda(ProdutoUnidade produto){
        this.produto = produto;
    }
    
    public ItemVenda(ProdutoUnidade produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ProdutoUnidade getProduto() {
        return produto;
    }

    public void setProduto(ProdutoUnidade produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
        
    public double getSubtotal(){
        return subtotal;
    }
    
    public double calculaSubtotal(){
        return produto.getPreco() * quantidade;
    }
}
