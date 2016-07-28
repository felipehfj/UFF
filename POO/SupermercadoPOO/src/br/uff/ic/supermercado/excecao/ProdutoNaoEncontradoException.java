/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.excecao;

/**
 *Esta classe herda métodos da classe SupermercadoException e é uma classe de 
 *exceção que identifica quando um produto não foi encontrado em uma busca por 
 *produto
 * @author felipe
 */
public class ProdutoNaoEncontradoException extends SupermercadoException{
    
    public ProdutoNaoEncontradoException(String message) {
        super(message);
    }
    
}
