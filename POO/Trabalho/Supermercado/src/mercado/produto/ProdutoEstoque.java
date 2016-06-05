/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.produto;

/**
 *
 * @author felipe
 */
public class ProdutoEstoque extends Produto{

    private int quantidade;
        
    public ProdutoEstoque(String nome, double preco) {
        super(nome, preco);
    }

    public ProdutoEstoque(String nome, double preco, int quantidade) {
        super(nome, preco);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public boolean hasQuantidadeItens(int quantidade){
        return this.quantidade <= quantidade;
    }
    
    public boolean retirarEstoque(int quantidade){
        if (this.hasQuantidadeItens(quantidade)){
            this.setQuantidade(this.quantidade - quantidade);
            return true;
        }
        return false;
    }
    
    public boolean inserirQuantidade(int quantidade){
        this.setQuantidade(this.quantidade + quantidade);
        return true;
    }

    @Override
    public String toString() {
        return "ProdutoEstoque{" + "nome=" + this.getNome() + "preço=" + this.getPreco() + "quantidade=" + quantidade + '}';
    }
    
    
}
