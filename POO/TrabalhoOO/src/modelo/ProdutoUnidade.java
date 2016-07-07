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
public class ProdutoUnidade extends Produto{

    public ProdutoUnidade() {
    }

    public ProdutoUnidade(String nome, int codigo) {
        super(nome, codigo);
    }

    public ProdutoUnidade(String nome, int codigo, double precoUnitario) {
        super(nome, codigo, precoUnitario);
    }

    public ProdutoUnidade(String nome, int codigo, double preco, double quantidade) {
        super(nome, codigo, preco, quantidade);
    }

    @Override
    public double getPrecoTotal() {
        return this.getPreco();
    }

    @Override
    public int compareTo(Produto o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
