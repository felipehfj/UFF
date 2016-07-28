/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *Esta classe cria uma lista de itens de venda,da classe itemVenda, adiciona 
 * itens que serão comprados, lista esses itens na tela e calcula o total a ser 
 * pago
 * @author felipe
 */
public class Carrinho {

    private List<ItemVenda> itens;
    private double totalVenda;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }
    /**
     * Adiciona um item na lista de itens a ser vendidos
     * 
     * @param item 
     */
    public void addItemVenda(ItemVenda item) {
        this.itens.add(item);
    }

    List<ItemVenda> getItens() {
        return this.itens;
    }
    /**
     * Somando o preço de cada subtotal, que por sua vez é a multiplicação de 
     * cada item por sua quantidade,este método retorna o valor total da compra
     * 
     * @return double
     */
    public double getTotalVenda() {
        this.totalVenda=0;
        itens.stream().forEach((item) -> {
            this.totalVenda += item.getProduto().getPrecoUnitario() * item.getQuantidade();
        });

        return totalVenda;
    }
    /**
     * Lista todos os itens de uma lista de itens de venda
     */
    public void listarItens() {
        int contador = 0;
        System.out.println("***** Venda *****");
        System.out.println("N\tNome\tQnt\tTipo\tValor\tSubtotal");
        for (ItemVenda item : itens) {
            System.out.println(++contador + "\t"
                    + item.getProduto().getNome() + "\t"
                    + item.getQuantidade() + "\t"
                    + item.getProduto().getTipoString() + "\t"
                    + item.getProduto().getPrecoUnitario() + "\t"
                    + item.obterSubtotal());
        }

    }
}
