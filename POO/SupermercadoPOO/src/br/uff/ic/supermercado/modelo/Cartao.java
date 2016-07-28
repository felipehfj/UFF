/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

/**
 *Esta classe herda métodos da classe pagamento, sua função é simular o 
 * pagamento por cartão, dessa forma não possui troco, diferente da classe 
 * dinheiro
 * @author felipe
 */
public class Cartao extends Pagamento{
    private String numero;

    public Cartao(String numero, Cliente cliente, double valor) {
        super(cliente, valor);
        this.numero = numero;
    }

    @Override
    public double efetuarPagamento() {
        return 0.0;
    }
    
}
