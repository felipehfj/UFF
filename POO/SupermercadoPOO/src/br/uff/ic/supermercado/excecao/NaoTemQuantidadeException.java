/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.excecao;

/**
 *Esta classe herda metódos da classe SupermercadoException e é uma classe de 
 *exceção para quando não há quantidade suficiente de um certo produto no 
 *estoque
 * @author felipe
 */
public class NaoTemQuantidadeException extends SupermercadoException{

    public NaoTemQuantidadeException(String message) {
        super(message);
    }
    
}
