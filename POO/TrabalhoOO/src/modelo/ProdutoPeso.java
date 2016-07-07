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
public class ProdutoPeso extends Produto{

    public ProdutoPeso() {
    }

    public ProdutoPeso(String nome, int codigo) {
        super(nome, codigo);
    }

    public ProdutoPeso(String nome, int codigo, double precoUnitario) {
        super(nome, codigo, precoUnitario);
    }

    public ProdutoPeso(String nome, int codigo, double preco, double quantidade) {
        super(nome, codigo, preco, quantidade);
    }

    @Override
    public double getPrecoTotal() {
        return this.getPreco() * this.getQuantidade();
    }
          
}
