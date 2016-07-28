/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

import br.uff.ic.supermercado.excecao.NaoTemQuantidadeException;
import br.uff.ic.supermercado.excecao.ProdutoNaoEncontradoException;
import java.util.LinkedList;
import java.util.List;

/**
 *Esta classe representa o estoque e portanto todas as modificações no estoque 
 * provem dela, tambem é nela que estão os métodos de busca por produtos em 
 * estoque e o método de impressão do estoque
 * @author felipe
 */
public class Estoque {

    private List<ProdutoEstoque> produtos;

    public Estoque() {
        this.produtos = new LinkedList<>();
    }

    public Estoque(List<ProdutoEstoque> produtoEstoque) {
        this.produtos = produtoEstoque;
    }
    /**
     * Adiciona um produto ao estoque, caso ele não exista nele, e caso exista 
     * incrementa a quantidade deste produto em estoque
     * @param produto
     * @param quantidade
     * @return 
     */
    public ProdutoEstoque incrementarProduto(Produto produto, double quantidade) {
        ProdutoEstoque produtoAux2 = new ProdutoEstoque(produto, quantidade);

        if (produtos.contains(produtoAux2)) {
            ProdutoEstoque produtoAux1 = null;
            int indice = produtos.indexOf(produtoAux2);
            produtoAux1 = produtos.get(indice);
            produtoAux1.setQuantidade(produtoAux1.getQuantidade() + quantidade);
            this.alterarEstoque(produtoAux1, indice);
            return produtoAux1;
        } else {
            produtos.add(produtoAux2);
            return produtoAux2;
        }
    }
    /**
     * Procura por um produto em estoque e diminui a sua quantidade, simulando 
     * uma provavel compra onde a quantidade em estoque é diminuida devido aos 
     * itens comprados
     * @param nome
     * @param quantidade
     * @return
     * @throws NaoTemQuantidadeException
     * @throws ProdutoNaoEncontradoException 
     */
    public ProdutoEstoque diminuirProduto(String nome, double quantidade) throws NaoTemQuantidadeException, ProdutoNaoEncontradoException {
        ProdutoEstoque produtoAux =  this.buscarPorNome(nome);
        if(produtoAux != null){
            if(this.temQuantidade(nome, quantidade)){
                int indice = produtos.indexOf(produtoAux);
                produtoAux.setQuantidade(produtoAux.getQuantidade() - quantidade);
                this.alterarEstoque(produtoAux, indice);
                return produtoAux;
            }
        }
        return produtoAux;
    }
    /**
     * Altera a quantidade de um produto em estoque
     * @param produto
     * @param indice 
     */
    private void alterarEstoque(ProdutoEstoque produto, int indice) {
        produtos.remove(indice);
        produtos.add(produto);
    }
   /**
    * Busca um produto no estoque procurando-o por nome
    * @param nome
    * @return
    * @throws ProdutoNaoEncontradoException 
    */
    public ProdutoEstoque buscarPorNome(String nome) throws ProdutoNaoEncontradoException{
        for (ProdutoEstoque pe : produtos) {
            if (pe.getNome().equalsIgnoreCase(nome)) {
                return pe;
            }
        }
        throw new ProdutoNaoEncontradoException("O produto procurado {" + nome + "} não foi encontrado na nossa base de dados.");   
    }
    /**
     * Busca um produto no estoque procurando-o por seu código
     * @param codigo
     * @return
     * @throws ProdutoNaoEncontradoException 
     */
    public ProdutoEstoque buscarPorCodigo(int codigo) throws ProdutoNaoEncontradoException{
        for(ProdutoEstoque pe : produtos){
            if(pe.getCodigo() == codigo){
                return pe;
            }
        }
        throw new ProdutoNaoEncontradoException("O produto procurado {" + codigo + "} não foi encontrado na nossa base de dados.");   
    }
    /**
     * Verifica se um certo produto possui uma certa quantidade em estoque,
     * retornando true caso tenha ou dispara uma exceção caso não tenha
     * @param nome
     * @param quantidade
     * @return
     * @throws NaoTemQuantidadeException
     * @throws ProdutoNaoEncontradoException 
     */
    public boolean temQuantidade(String nome, double quantidade) throws NaoTemQuantidadeException, ProdutoNaoEncontradoException{
        ProdutoEstoque produtoAux = (ProdutoEstoque) this.buscarPorNome(nome);
        
        if(produtoAux != null){
            if(produtoAux.getQuantidade() >= quantidade){
                return true;
            }
            throw new NaoTemQuantidadeException("Não possuimos a quantidade solicitada.");
        }
        
        return false;
    }
    
    @Override
    public String toString(){
       
        StringBuilder string = new StringBuilder();
        string.append("Cod\tNome\t\tPreço Unitário\t\tTipo\t\tQtd em estoque\n");
        this.produtos.stream().map((p) -> {
            string.append(p.getCodigo());
            return p;
        }).map((p) -> {
            string.append(": ");
            string.append(p.getNome());
            return p;
        }).map((p) -> {
            string.append("\t\t");
            string.append(p.getPrecoUnitario());
            return p;
        }).map((p) -> {
            string.append("\t\t");
            string.append(p.getTipoString());
            return p;
        }).map((p) -> {
            string.append("\t\t");
            string.append(p.getQuantidade());
            return p;
        }).forEach((_item) -> {
            string.append("\n");
        });
        return string.toString();
    }
    /**
     * Imprime todos os produtos do estoque
     */
    public void imprimirEstoque() {
        produtos.stream().forEach((produto) -> {
            System.out.println(produto);
        });
    }
    
    public List<ProdutoEstoque> obterEstoqueProduto(){
        return this.produtos;
    }
    /**
     * Procura algum prduto na lista que tenha o código passado como parâmetro,
     * retornando true caso tenha e false caso não tenha
     * @param codigo
     * @return 
     */
    public boolean buscarPorCodigoBool(int codigo){
        return produtos.stream().anyMatch((pLocal) -> (pLocal.getCodigo() == codigo));
    }
}
