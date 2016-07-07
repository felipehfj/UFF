/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Excecao.NaoTemQuantidadeException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author felipe
 */
public class Venda {
    private Cliente cliente;
    private Registradora registradora;
    private ArrayList<ItemVenda> itensVenda;
    private Estoque estoque;
    
    public Venda(){
        
    }

    public Venda(Cliente cliente, Registradora registradora) {
        this.cliente = cliente;
        this.registradora = registradora;
    }
        
    public Venda(Cliente cliente, Registradora registradora, ArrayList<ItemVenda> itensVenda) {
        this.cliente = cliente;
        this.registradora = registradora;
        this.itensVenda = itensVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Registradora getRegistradora() {
        return registradora;
    }

    public void setRegistradora(Registradora registradora) {
        this.registradora = registradora;
    }

    public ArrayList<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ArrayList<ItemVenda> itensVenda) throws NaoTemQuantidadeException {
        for (ItemVenda item : itensVenda) {
            this.itensVenda.add(this.addItemLocal(item));
        }
    }
    
    public void addItemVenda(ItemVenda item) throws NaoTemQuantidadeException{
        this.addItemLocal(item);
    }
    
    public double calcularTotal(){
        double total = 0f;
        for (ItemVenda itens : itensVenda) {
            total += itens.calculaSubtotal();
        }
        return total;
    }

    private ItemVenda addItemLocal(ItemVenda item) throws NaoTemQuantidadeException{
        ItemVenda it = null;
        if(estoque.baixarQuantidade(item.getProduto().getNome(), item.getQuantidade())) {
            this.itensVenda.add(item);
            it = item;
            return it;
        }
        return it;
    }
}
