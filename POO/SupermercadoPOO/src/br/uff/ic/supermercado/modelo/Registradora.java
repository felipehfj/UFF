/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

import br.uff.ic.supermercado.excecao.NaoTemQuantidadeException;
import br.uff.ic.supermercado.excecao.ProdutoNaoEncontradoException;
import java.util.List;

/**
 *Esta classe registradora rerpesenta uma registradora real de um mercado, nela 
 * é possivel imprimir detalhes da venda e finalizar a venda
 * @author felipe
 */
public class Registradora {
    private int identificador;
    private Caixa caixa;
    private Cliente cliente;
    private Balanca balanca;
    private Estoque estoque;
    private Carrinho carrinho;
    private double total;
    private Pagamento pagamento;
    
    public Registradora(int identificador){
        this.identificador = identificador;
    }

    public Registradora(int identificador, Caixa caixa, Cliente cliente, Balanca balanca, Estoque estoque, Carrinho carrinho) {
        this.identificador = identificador;
        this.caixa = caixa;
        this.cliente = cliente;
        this.balanca = balanca;
        this.estoque = estoque;
        this.carrinho = carrinho;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Balanca getBalanca() {
        return balanca;
    }

    public void setBalanca(Balanca balanca) {
        this.balanca = balanca;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
    
    public double getTotalVenda(){
        this.total = carrinho.getTotalVenda();
        return total;
    }
    /**
     * Imprime de forma organizada o número da registradora,o nome do caixa, o 
     * nome do cliente e os itens comprados,alem de calcular o total da venda
     */
    public void obterDetalheVenda(){
        System.out.println("**** Nota *****");
        System.out.println("Registradora: " + this.identificador);
        System.out.println("Caixa: " + caixa.getNome() + " Mat: " + caixa.getMatricula());
        System.out.println("Cliente: " + cliente.getNome());
        carrinho.listarItens();
        total = carrinho.getTotalVenda();
        System.out.println("Total: " + this.total);
    } 
    /**
     * Finaliza a venda, diminuindo a quantidade de cada item comprado do 
     * estoque, caso tenha aquela quantidade e fazendo o processo de pagamento 
     * por cartão ou dinheiro e mostrando na tela o troco caso seja dinheiro
     * @throws NaoTemQuantidadeException
     * @throws ProdutoNaoEncontradoException 
     */
    public void finalizaVenda() throws NaoTemQuantidadeException, ProdutoNaoEncontradoException{
        List<ItemVenda> itens = carrinho.getItens();
        
        for(ItemVenda item : itens){
            ProdutoEstoque diminuirProduto = estoque.diminuirProduto(item.getProduto().getNome(), item.getQuantidade());
        }
        
        IOHelper io = new IOHelper();
        System.out.println("Forma de pagamento");
        
        int i = 0;
        boolean flag = true;
        do{
            System.out.println("Digite 1 para cartão e 2 para dinheiro");
            i = io.getInteiro();
            if(i==1 || i==2){
                flag = false;
            }
        }while(flag);
       
        total = this.getTotalVenda();
        
        if(i == 1){
            System.out.print("Numero cartão: ");
            String numero = io.getString();
            pagamento = new Cartao(numero, cliente, total);
            pagamento.efetuarPagamento();
        }
        
        if(i == 2){
            pagamento = new Dinheiro(cliente, total);
            double valorCliente;
            do{
                System.out.print("Digite o valor recebido do cliente: ");
                valorCliente = io.getDouble();
            } while(valorCliente < pagamento.getValorCompra());
            ((Dinheiro)pagamento).setValorRecebido(valorCliente);
            System.out.println("Troco: R$" + pagamento.efetuarPagamento());
        }
    }

    @Override
    public String toString() {
        return "Registradora: " + this.identificador;
    }
    
    
}
