/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

/**
 *Esta classe abstrata serve como molde para as suas classes filhas, dinheiro e 
 *cartão
 * @author felipe
 */
public abstract class Pagamento {

    protected Cliente cliente;
    protected double valorCompra;

    public Pagamento(Cliente cliente, double valorCompra) {
        this.cliente = cliente;
        this.valorCompra = valorCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
        
    /**
     *
     * @return 
     */
    public abstract double efetuarPagamento();

    //abstract void setValorRecebido(double valorCliente);
}
