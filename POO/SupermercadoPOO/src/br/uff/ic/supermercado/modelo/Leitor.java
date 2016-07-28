/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

import br.uff.ic.supermercado.excecao.ProdutoNaoEncontradoException;

/**
 *Esta classe simula um leitor de código de barras e portanto consegue consultar
 * um produto do estoque procurando-o por seu código de barras
 * @author felipe
 */
public class Leitor {
    
    private int codigo;
    private Estoque estoque;

    public Leitor() {
    }

    public Leitor(int codigo, Estoque estoque) {
        this.codigo = codigo;
        this.estoque = estoque;
    }
    
    /**
     * Consulta e retorna o valor cadastrado do produto
     *
     * @param codigo
     * @param estoque
     * @throws br.uff.ic.supermercado.excecao.ProdutoNaoEncontradoException
     */
    public void consultarProduto(int codigo, Estoque estoque) throws ProdutoNaoEncontradoException {
        Produto produto = estoque.buscarPorCodigo(codigo);

        if (produto != null) {

            System.out.println("Consulta produto");
            System.out.println("Código\tNome\tPreço Unitário");
            System.out.println(produto.getCodigo() + "\t" + produto.getNome() + "\t" + produto.getPrecoUnitario());
            if (produto.getTipo() == Produto.PESO) {
                System.out.println("Exibido o valor por kilo. Solicitamos pesar numa balança mais próxima.");
            }
        }
    }
    /**
     * Procura um produto do estoque por seu código e retorna esse produto,caso 
     * exista no estoque
     * @param codigo
     * @param estoque
     * @return
     * @throws ProdutoNaoEncontradoException 
     */
    public Produto consultarProdutoEstoque(int codigo, Estoque estoque) throws ProdutoNaoEncontradoException {
        return (Produto)estoque.buscarPorCodigo(codigo);
        
        }
}
