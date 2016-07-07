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
public class Caixa extends Funcionario {
    
    public Caixa(String matricula) {
        super(matricula);
    }

    public Caixa(String matricula, String nome, String cpf) {
        super(matricula, nome, cpf);
    }
    
    public void efetuarVenda(){
        
    }
    
}
