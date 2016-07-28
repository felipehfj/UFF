/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

/**
 *Esta classe representa o usuário cliente, cujas permissões são de apenas 
 * consultar produtos
 * @author felipe
 */
public class Cliente extends Pessoa{

    public Cliente(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Cliente: " + super.getNome();
    }
    
  
    /**
     * Consulta um produto passando o seu código. Retorna o produto 
     * consultado, caso exista
     * @param codigo
     * @return Produto
     */

    public Produto consultarPreco(int codigo, Leitor leitor){
        
        return null;
    }
    
}
