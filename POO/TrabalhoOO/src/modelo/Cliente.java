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
public class Cliente extends Pessoa{
    private String endereco;
    
    public Cliente() {
    
    }
    
    public Cliente(String nome, String cpf, String endereco) {
        super(nome, cpf);
        this.endereco = endereco;
    }

    /**
     * Retorna o endereço do Cliente
     * @return String
     */
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public double consultarPreco(ProdutoUnidade p){
       
        return p.getPreco(); 
    }
    
}
