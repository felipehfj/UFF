/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec19;

import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Pedido {

    private Cliente cliente;
    private ArrayList itens = new ArrayList();
    private String formaPagamento;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido(Cliente cliente, Item item) {
        this.cliente = cliente;
        this.itens.add(item);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
     public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList getItem() {
        return itens;
    }

    public void addItem(Item item) {
           this.itens.add(item);
    }
    
    public void listarItens(){
        for(int i = 0; i < itens.size(); i++){
            Item item = (Item) itens.get(i);
            System.out.println(item.toString());
        }
   
    }
    
    public float totalPagamento(){
        float total = 0;
        
        for(int i = 0; i < itens.size(); i++){
            Item item = (Item) itens.get(i);
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        
        return total;
        
    }

    @Override
    public String toString() {
        return "Pedido{" + "cliente=" + cliente + ", itens=" + itens + '}';
    }
    
    public void imprimePedido(){
        System.out.println("******Pedido******\n" +
        "Cliente: " + this.cliente.getNome() + "\n" +
        "------Itens------\n" +
        "Produto\tValor\tQtde\tSubtotal");
        for(int i = 0; i < itens.size(); i++) {
            Item item = (Item) itens.get(i);
            System.out.println(item.getProduto().getNome() + "\t " + item.getProduto().getPreco() + "\t " + item.getQuantidade() + "\t " + item.getProduto().getPreco() * item.getQuantidade());
        }
        System.out.println("");
        System.out.println("Total: R$ " + totalPagamento());
        System.out.println("Forma de pagamento:" + this.getFormaPagamento());
                   
    }

}