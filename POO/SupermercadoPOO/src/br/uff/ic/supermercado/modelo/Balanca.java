/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

import br.uff.ic.supermercado.excecao.TipoProdutoInvalidoException;

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
    /**
     * Retorna o produto associado a balança
     * 
     * @return Produto
     */
    public Produto getProduto() {
        return produto;
    }
    

    /**
     * Retorna o valor a se pagar pela quantidade de produto utiliza o valor
     * unitario do produto multiplicado pelo peso gerado para calcular o valor a
     * se pagar
     *
     * @param produto
     * @return double
     * @throws br.uff.ic.supermercado.excecao.TipoProdutoInvalidoException
     */
    public double getPeso(Produto produto) throws TipoProdutoInvalidoException {
        if (produto.getTipo() == Produto.PESO){
            double peso = Math.random();
            
            return peso;
        }
        throw new TipoProdutoInvalidoException("Produto não é do tipo vendido por peso.");
    }
}
