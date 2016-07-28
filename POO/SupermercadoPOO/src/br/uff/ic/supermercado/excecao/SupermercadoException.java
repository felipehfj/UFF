/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.excecao;

/**
 *Esta classe herda da classe Exception e é uma classe de exceção e tem como 
 *classes filhas as classes de exceção deste pacote 
 * @author felipe
 */
public class SupermercadoException extends Exception{
        
    public SupermercadoException(String message) {
        super("Supermercado: " + message);
    }
    
}
