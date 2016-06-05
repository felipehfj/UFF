/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec19;

/**
 *
 * @author felipe
 */
public class Item {
    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        
        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        
        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
    }

    @Override
    public String toString() {
        return "Item{" + "produto=" + produto + ", quantidade=" + quantidade + '}';
    }
    
}
