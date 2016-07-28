/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.main;

import br.uff.ic.supermercado.modelo.*;
import br.uff.ic.supermercado.excecao.*;
import java.util.ArrayList;
import java.util.List;

/**
 *Esta classe representa a main, ou seja é nela que é executado o programa
 * @author felipe
 * @author caios_000
 */
public class Mercado {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */

    private static List<Caixa> caixas;
    private static List<Gerente> gerentes;
    private static String estoqueInicial;
    private static Estoque estoque;
    private static Leitor leitor;
    private static List<Registradora> registradoras;
    private static Vendas vendas;
    private static Balanca balanca;

    public static void main(String[] args) throws ProdutoNaoEncontradoException, NaoTemQuantidadeException, TipoProdutoInvalidoException {
        rodaPrograma();
    }

    Mercado(List<Caixa> caixas, List<Gerente> gerentes, Estoque estoque, Leitor leitor, List<Registradora> registradoras, Vendas vendas) {
        this.caixas = caixas;
        this.gerentes = gerentes;
        this.estoque = estoque;
        this.leitor = leitor;
        this.registradoras = registradoras;
        this.estoqueInicial = estoque.toString();
        this.vendas = vendas;
    }
    /**
     * Instancia todos os objetos que serão usados,possui alguns valores 
     * pré-estabelecidos para teste,chama o sistema com todos os dados instanciados aqui
     * @throws ProdutoNaoEncontradoException
     * @throws NaoTemQuantidadeException
     * @throws TipoProdutoInvalidoException 
     */
    public static void rodaPrograma() throws ProdutoNaoEncontradoException, NaoTemQuantidadeException, TipoProdutoInvalidoException {
        List<Caixa> listacaixas = new ArrayList<>();
        List<Gerente> listagerentes = new ArrayList<>();
        List<ProdutoEstoque> listaProdutos = new ArrayList<>();
        IOHelper controle = new IOHelper();
        Sistema sistema = new Sistema();
        List<Registradora> instanciaregistradoras = new ArrayList<>();

        instanciaregistradoras.add(new Registradora(1));
        instanciaregistradoras.add(new Registradora(2));
        instanciaregistradoras.add(new Registradora(3));
      
        String[] matriculas = {"Caio", "Jose", "Joao", "Davi", "Felipe", "Vitor", "Leonardo"};

        for (int i = 0; i < 7; i++) {
            if (i < 5) {
                Caixa caixa = new Caixa(matriculas[i], (""+Math.random()*10000));
                listacaixas.add(caixa);
            } else {
                Gerente gerente = new Gerente(matriculas[i], (""+Math.random()*10000));
                listagerentes.add(gerente);
            }
        }

        listaProdutos.add(new ProdutoEstoque("Banana", 1, 2.99, Produto.PESO, 500.0));
        listaProdutos.add(new ProdutoEstoque("Alcatra", 2, 20.99, Produto.PESO, 250.0));
        listaProdutos.add(new ProdutoEstoque("Batata", 3, 3.50, Produto.PESO, 1000.0));
        listaProdutos.add(new ProdutoEstoque("Arroz", 4, 5.50, Produto.UNIDADE, 350));
        listaProdutos.add(new ProdutoEstoque("Leite Condensado", 5, 5.99,Produto.UNIDADE, 652));
        listaProdutos.add(new ProdutoEstoque("Atum", 6, 7.00, Produto.UNIDADE, 88));

        Estoque instanciaestoque = new Estoque(listaProdutos);

        Leitor instancialeitor = new Leitor();
        Vendas vendas = new Vendas();

        Mercado mercado = new Mercado(listacaixas, listagerentes, instanciaestoque, instancialeitor, instanciaregistradoras, vendas);

        Sistema.MenuAcesso(mercado, controle);
    }

    Estoque getEstoque() {
        return this.estoque;
    }
    
    Caixa procuraCaixa(String nome) {
        for (Caixa c : this.caixas) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    Registradora getRegistradora(int i) {
        return this.registradoras.get(i-1);
    }
    
    Registradora procuraRegistradora(int i){
        for(Registradora reg : registradoras){
            if(reg.getIdentificador() == i){
                return reg;
            }
        }
        return null;
    }
    
    public void imprimirRegistradoras(){
        for(Registradora r : registradoras){
            System.out.println(r);
        }
    }

    Leitor getLeitor() {
        return this.leitor;
    }

    String getEstoqueInicial() {
        return (this.estoqueInicial);
    }

    public static List<Caixa> getCaixas() {
        return caixas;
    }

    public static List<Gerente> getGerentes() {
        return gerentes;
    }

    public static List<Registradora> getRegistradoras() {
        return registradoras;
    }

    public Vendas getVendas() {
        return vendas;
    }
    
    
    
    
}
