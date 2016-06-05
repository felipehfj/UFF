/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec19;

/**
 *
 * @author felipe
 */
public class Supermercado {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Felipe");
        Produto produto1 = new Produto("Arroz", 4.65f, 10);
        Produto produto2 = new Produto("Feijão", 5.56f, 25);

        Item item1 = new Item(produto1, 2);
        Item item2 = new Item(produto2, 4);
        
        Pedido pedido = new Pedido(cliente, item1);
        pedido.addItem(item2);
        pedido.setFormaPagamento("Cheque");
        pedido.imprimePedido();

    }
}
