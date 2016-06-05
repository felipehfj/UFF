/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
Para cada produto informado (nome, preço e quantidade), escreva o nome do
produto comprado e o valor total a ser pago, considerando que são oferecidos
descontos pelo número de unidade compradas, segundo a tabela abaixo:	

a: Até 10 unidades: valor total 
b: de 11 a  20 unidades: 10% de desconto
c: de 21 a  50 unidades: 20% de desconto	
d: acima de 50 unidades: 25% de desconto

 */
package Exec4;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class ValoresProdutos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nomeProduto;
        double preco;
        int quantidade;
        double total;
        boolean parada = true;
        final double D10P = 0.10;
        final double D20P = 0.20;
        final double D25P = 0.25;

        while (parada) {
            System.out.println("Digite o nome do produto ou 'sair'.");
            System.out.print("> ");
            nomeProduto = teclado.nextLine();
            
            if (!nomeProduto.equalsIgnoreCase("sair")) {
                System.out.print("Digite o preço do produto: ");
                preco = teclado.nextDouble();
                System.out.print("Digite a quantidade do produto a ser comprada: ");
                quantidade = teclado.nextInt();
                teclado.nextLine();
                
                if (quantidade <= 10) {
                    total = (quantidade * preco);
                } else if (quantidade > 10 && quantidade <= 20) {
                    total = (quantidade * preco);
                    total += total * D10P;
                } else if (quantidade > 21 && quantidade <= 50) {
                    total = (quantidade * preco);
                    total += total * D20P;
                } else {
                    total = (quantidade * preco);
                    total += total * D25P;
                }
                System.out.println("");
                System.out.println("Produto: " + nomeProduto);
                System.out.println("Total: " + total);

            } else {
                return;
            }

        }

    }

}
