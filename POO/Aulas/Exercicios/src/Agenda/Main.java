/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

/**
 *
 * @author felipe
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Agenda agenda = new Agenda();
        //Tamanho inicial escolhido: 5;
        final int ARRAY_SIZE = 5;
        Pessoa[] pessoas = new Pessoa[ARRAY_SIZE];
        int input;

        do {
            System.out.println("Serao preenchidas " + ARRAY_SIZE + " posicoes dos vetores");

            //Solicitar ao usuario ARRAY_SIZE inputs de Nomes e Idades
            agenda.povoarArrayPessoas(pessoas);

            //Solicitar ao usuario a opcao de ordenacao
            input = agenda.escolherOpcaoDeOrdenacao();

            //Chamar método para ordenar conforme a opcao escolhida
            agenda.ordenarVetorDePessoas(pessoas, input);

            //Imprimir o vetor de pessoas
            agenda.imprimirVetorDePessoas(pessoas);

            //Solicitar o input para repetir novamente o procedimento
            System.out.println("Digite 0 se deseja terminar ou qualquer outro valor para repetir o processo.");
            input = keyboard.nextInt();
        }
        while(input != 0);
    }
}