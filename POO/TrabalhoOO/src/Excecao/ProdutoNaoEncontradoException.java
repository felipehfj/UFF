/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao;

/**
 *
 * @author felipe
 */
public class ProdutoNaoEncontradoException extends SupermercadoException{
    
    public ProdutoNaoEncontradoException(String msg) {
        super(msg);
    }
    
    @Override
    public String getMessage(){
        return "Produto " + msg + " não encontrado.";
    }
    
}
