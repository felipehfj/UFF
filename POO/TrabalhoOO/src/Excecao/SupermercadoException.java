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
public class SupermercadoException extends Exception{
    protected String msg;

    public SupermercadoException(String msg) {
        super(msg);
        this.msg = msg;
    }
    
    @Override
    public String getMessage(){
        return "Erro: " + msg;
    }
}
