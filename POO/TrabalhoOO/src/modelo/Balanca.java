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
public class Balanca {
    
    private Produto produto;

    public Balanca() {
    }
       
    public Balanca(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
            
    /**
     * Retorna o valor a se pagar pela quantidade de produto
     * utiliza o valor unitario do produto multiplicado pelo peso gerado
     * para calcular o valor a se pagar
     * @return double
     */
    public double getValorPagar() {
        double peso = Math.random();
        produto.setQuantidade(peso);
        return produto.getPrecoUnitario() * peso;
    }
}
