/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.main;

import br.uff.ic.supermercado.modelo.*;
import br.uff.ic.supermercado.excecao.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author felipe
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *Esta classe apresenta um conjunto de menus que compõem o sistema, atraves dele 
 *é capaz de ter acesso como gerente, funcionário ou cliente
 * @author caios_000
 */
public class Sistema {
    /**
     * O menu de acesso inicial, nele ocorre a distinção de acesso para cliente, funcionário e gerente
     * @param mercado
     * @param controle
     * @throws ProdutoNaoEncontradoException
     * @throws NaoTemQuantidadeException
     * @throws TipoProdutoInvalidoException 
     */
    public static void MenuAcesso(Mercado mercado, IOHelper controle) throws ProdutoNaoEncontradoException, NaoTemQuantidadeException, TipoProdutoInvalidoException {
        int op;
        do {
            System.out.println("[1] ACESSO GERENTE");
            System.out.println("[2] ACESSO CAIXA");
            System.out.println("[3] ACESSO CLIENTE");
            System.out.println("[4] SAIR");
            op = controle.getInteiro();
            switch (op) {
                case 1:
                    imprimeMenuGerente(mercado, controle);
                    break;
                case 2:
                    imprimeMenuCaixa(mercado, controle);
                    break;
                case 3:
                    imprimeMenuCliente(mercado, controle);
                    break;
            }
        } while (op != 4);
    }
    /**
     * Ao entrar com o acesso de gerente é iniciado esse menu,onde é possivel 
     * adicionar produtos ao estoque e gerar relatórios de venda ou estoque
     * @param mercado
     * @param iohelp
     * @throws ProdutoNaoEncontradoException 
     */
    public static void imprimeMenuGerente(Mercado mercado, IOHelper iohelp) throws ProdutoNaoEncontradoException {
        int op;
        do {
            System.out.println("[1] ADICIONAR PRODUTO AO ESTOQUE");
            System.out.println("[2] GERAR RELATÓRIO DE VENDAS");
            System.out.println("[3] GERAR RELATÓRIO DE ESTOQUE");
            System.out.println("[4] SAIR");
            op = iohelp.getInteiro();
            switch (op) {
                case 1:
                    //adicionar produto ao estoque por gerente.
                    imprimeAdicaoDeProduto(mercado, iohelp);
                    break;
                case 2:
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("Registradora " + i +":");
                        mercado.getVendas().listarVendasRegistradora(i);
                        //mercado.getRegistradora(i).geraRelatorio();
                    }
                    break;
                case 3:
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
                    Date date = new Date();
                    System.out.println(dateFormat.format(date));
                    System.out.println("Estoque Inicial: ");
                    System.out.println(mercado.getEstoqueInicial());
                    System.out.println("Estoque Atual: ");
                    System.out.println(mercado.getEstoque().toString());
                    break;
            }
        } while (op != 4);
    }
    /**
     *Ao entrar com o acesso de caixa é iniciado esse menu,onde é possivel 
     *vender itens
     * @param mercado
     * @param iohelp
     * @throws ProdutoNaoEncontradoException
     * @throws NaoTemQuantidadeException
     * @throws TipoProdutoInvalidoException 
     */
    public static void imprimeMenuCaixa(Mercado mercado, IOHelper iohelp) throws ProdutoNaoEncontradoException, NaoTemQuantidadeException, TipoProdutoInvalidoException {

        int op;
        Caixa caixa;
        Cliente cliente;
        Estoque estoque = mercado.getEstoque();
        Carrinho carrinho;
        Registradora registradora;

        do {
            System.out.println("[1] VENDER ITEM");
            System.out.println("[2] SAIR");
            op = iohelp.getInteiro();
            switch (op) {
                case 1:
                    registradora = iniciaRegistradoraID(mercado, iohelp);
                    caixa = Sistema.iniciaCaixa(mercado, iohelp);
                    cliente = Sistema.iniciaCliente(iohelp);
                    carrinho = iniciaCarrinho(registradora, estoque, iohelp);
                    
                    registradora.setCaixa(caixa);
                    registradora.setCliente(cliente);
                    registradora.setEstoque(estoque);
                    registradora.setCarrinho(carrinho);
                    
                    registradora.obterDetalheVenda();
                    
                    registradora.finalizaVenda();
                    mercado.getVendas().adicionarVenda(registradora);

            }
        } while (op != 2);
    }
    /**
     *Ao entrar com o acesso de cliente é iniciado esse menu,onde é possivel 
     *ler o valor de um produto com seu códido
     * @param mercado
     * @param iohelp
     * @throws ProdutoNaoEncontradoException 
     */
    public static void imprimeMenuCliente(Mercado mercado, IOHelper iohelp) throws ProdutoNaoEncontradoException {
        int op;
        do {
            System.out.println("[1] LER VALOR DO PRODUTO");
            System.out.println("[2] SAIR");
            op = iohelp.getInteiro();
            switch (op) {
                case 1:
                    //Ler Valor do produto em Leitor
                    int op1 = 1;
                    do {
                        try {
                            System.out.println("DIGITE O CODIGO DO PRODUTO [-1: SAIR]: ");
                            int codprod = iohelp.getInteiro();
                            if (codprod != -1) {
                                Produto p = (Produto)mercado.getLeitor().consultarProdutoEstoque(codprod, mercado.getEstoque());
                                System.out.println(p.getCodigo() + ": " + p.getNome() + " " + p.getTipoString() +" R$: "+ p.getPrecoUnitario());
                            } else {
                                op1 = 2;
                            }
                        } catch (ProdutoNaoEncontradoException e) {
                            System.out.println("PRODUTO NÃO EXISTE EM ESTOQUE");
                            System.out.println("DESEJA PROCURAR O VALOR DE OUTRO PRODUTO? [1] SIM [2] NÃO");
                            op1 = iohelp.getInteiro();
                        }
                    } while (op1 != 2);
                    break;
            }
        } while (op != 2);

    }
    /**
     *Imprime o menu de adição de produto, acessivel pelo menu de gerente, 
     *cadastrando um produto novo atraves de interação com o usuário
     * @param mercado
     * @param iohelp
     * @throws ProdutoNaoEncontradoException 
     */
    static void imprimeAdicaoDeProduto(Mercado mercado, IOHelper iohelp) throws ProdutoNaoEncontradoException {
        System.out.println("DIGITE CÓDIGO DO PRODUTO: ");
        int cod = iohelp.getInteiro();
        if (mercado.getEstoque().buscarPorCodigoBool(cod)) {
            System.out.println("PRODUTO JÁ EXISTE EM ESTOQUE, DESEJA INCREMENTAR QUANTIDADE? [1] SIM [2] NÃO");
            int op = iohelp.getInteiro();
            if (op == 1) {
                ProdutoEstoque produto = mercado.getEstoque().buscarPorCodigo(cod);

                System.out.println("DIGITE O PESO DO PRODUTO A SER ADICIONADO: ");
                double quantidade = iohelp.getDouble();
                mercado.getEstoque().incrementarProduto(produto, quantidade);
            }
        } else {
            System.out.println("DIGITE O NOME DO PRODUTO: ");
            String nome = iohelp.getString();
            System.out.println("DIGITE O PREÇO DO PRODUTO: ");
            double preco = iohelp.getDouble();
            System.out.println("PRODUTO É VENDIDO POR: [1] peso [2] unidade");
            int op = iohelp.getInteiro();
            if (op == 1) {
                System.out.println("DIGITE O PESO DO PRODUTO: ");
                double quantidade = iohelp.getDouble();
                mercado.getEstoque().incrementarProduto(new ProdutoEstoque(nome, cod, preco, Produto.PESO), quantidade);
            } else if (op == 2) {
                System.out.println("DIGITE A QUANTIDADE DO PRODUTO: ");
                int quantidade = iohelp.getInteiro();
                mercado.getEstoque().incrementarProduto(new ProdutoEstoque(nome, cod, preco, Produto.UNIDADE), quantidade);
            }
        }
    }
    /**
     *Loga um caixa a uma registradora para que ele possa efetuar vendas
     * @param mercado
     * @param iohelp
     * @return 
     */
    private static Registradora iniciaRegistradoraID(Mercado mercado, IOHelper iohelp) {

        Registradora reg = null;
        int op;
        boolean flag = false;

        do {
            System.out.println("REGISTRADORAS DISPONIVEIS");
            mercado.imprimirRegistradoras();
            System.out.println("DIGITE O NUMERO DA REGISTRADORA PARA LOGAR: ");
            op = iohelp.getInteiro();
            reg = mercado.procuraRegistradora(op);
            if(reg != null){
                reg.setBalanca(new Balanca());
                flag = false;
            } else {
                flag = true;
            }
            
        } while (flag);

        return reg;
    }
   
    private static Caixa iniciaCaixa(Mercado mercado, IOHelper iohelp) {
        Caixa caixa = null;
        do {
            System.out.println("DIGITE O NOME DO FUNCIONÁRIO: ");
            String nome = iohelp.getString();
            caixa = mercado.procuraCaixa(nome);
            if (caixa == null) {
                System.out.println("CAIXA NÃO ENCONTRADO NO SISTEMA. TENTE NOVAMENTE.");
            }
        } while (caixa == null);
        return caixa;
    }

    private static Cliente iniciaCliente(IOHelper iohelp) {
        Cliente cliente = null;
        do {
            System.out.println("DIGITE O NOME DO CLIENTE: ");
            String nome = iohelp.getString();
            cliente = new Cliente(nome);
        } while (cliente.getNome().equals(""));

        return cliente;
    }

    private static Carrinho iniciaCarrinho(Registradora reg, Estoque estoque, IOHelper iohelp) throws TipoProdutoInvalidoException {
        Carrinho carrinho = new Carrinho();
        int op = 0;
        Produto produto = new Produto();
        do {
            ItemVenda item = new ItemVenda();
            double peso;
            boolean flag = false;
            do {
                try {
                    System.out.println("DIGITE O CÓDIGO DO PRODUTO [-1: SAIR]: ");
                    op = iohelp.getInteiro();
                    if (op <= 0) {
                        break;
                    }
                    produto = estoque.buscarPorCodigo(op);
                    flag = false;
                } catch (ProdutoNaoEncontradoException ex) {
                    System.out.println("PRODUTO NÃO ENCONTRADO");
                    flag = true;
                }
            } while (flag);

            do {
                if (op <= 0) {
                    break;
                }
                try {
                    if (produto.getTipo() == Produto.PESO) {
                        
                        peso = reg.getBalanca().getPeso(produto);
                        System.out.println("PESO: " + peso + " kg");
                        flag = estoque.temQuantidade(produto.getNome(), peso);
                        item.setQuantidade(peso);

                    }
                    if (produto.getTipo() == Produto.UNIDADE) {
                        System.out.println("DIGITE A QUANTIDADE DESEJADA: ");
                        double quantidade = iohelp.getDouble();
                        flag = estoque.temQuantidade(produto.getNome(), quantidade);
                        item.setQuantidade(quantidade);
                    }
                    item.setProduto(produto);
                    System.out.println("PRODUTO: " + produto.getNome());

                    carrinho.addItemVenda(item);

                } catch (NaoTemQuantidadeException e) {
                    System.out.println("NÃO HÁ ESSA QUANTIDADE EM ESTOQUE");
                    flag = false;
                } catch (ProdutoNaoEncontradoException ex) {
                    System.out.println("PRODUTO NÃO ENCONTRADO");
                    flag = false;
                }
            } while (!flag);

        } while (op > 0);

        return carrinho;
    }

}
