/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

/**
 *Esta classe herda métodos da classe pagamento,simulando o pagamento feito com 
 * dinheiro e portanto possui uma forma de calcular o troco
 * @author felipe
 */
public class Dinheiro extends Pagamento{
    public double valorRecebido;
    public double troco;
    
    public Dinheiro(Cliente cliente, double valorCompra, double valorRecebido) {
        super(cliente, valorCompra);
        this.valorRecebido = valorRecebido;
    }
    
    Dinheiro(Cliente cliente, double total) {
        super(cliente,total);
    }
    
    public void setValorRecebido(double valorRecebido){
        this.valorRecebido = valorRecebido;
    }
    
    public double getValorRecebido() {
        return valorRecebido;
    }

    public double getTroco() {
        return this.troco;
    }
    /**
     * Simula a efetivação de uma pagamento co dinheiro, diminuindo o valor 
     * entregue pelo cliente do valor total da compra e retornando o valor de 
     * troco que essa subtração gera para o atributo troco dessa classe
     * @return double
     */
    @Override
    public double efetuarPagamento() {
        this.troco = this.valorRecebido - super.getValorCompra();
        return troco;
    }  
    
}
