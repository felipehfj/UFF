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
public class Leitor {
    
    private Produto produto;

    /**
     *
     * @param produto
     */
    public Leitor(Produto produto) {
        this.produto = produto;
    }
        
    /**
     * Determina o valor do produto pelo seu peso
     * @param codigo
     * @return double
     */
    public double getValor(int codigo, Estoque estoque) {
         
        return 0.0;       
    }
    
}
