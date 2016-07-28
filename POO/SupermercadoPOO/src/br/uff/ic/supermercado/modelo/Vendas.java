/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

import java.util.LinkedList;
import java.util.List;

/**
 *Esta classe representa uma venda, nela é possivel criar uma nova venda,listar 
 * vendas seja de todas as registradoras, ou de uma registradora em específico
 * @author felipe
 */
public class Vendas {

    private List<Registradora> vendas;

    public Vendas() {
        this.vendas = new LinkedList<>();
    }

    public void adicionarVenda(Registradora registradora){
        this.vendas.add(registradora);
    }
    /**
     * Lista todas as vendas 
     */
    public void listarVendas(){
        vendas.stream().forEach((reg) -> {
            reg.obterDetalheVenda();
        });
    }
    /**
     * Lista todas as vendas de uma registradora passada como parâmetro
     * @param identificador 
     */
    public void listarVendasRegistradora(int identificador){
        vendas.stream().filter((reg) -> (reg.getIdentificador() == identificador)).forEach((reg) -> {
            reg.obterDetalheVenda();
        });
    }
}
