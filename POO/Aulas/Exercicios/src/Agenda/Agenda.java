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

public class Agenda {

    Scanner keyboard = new Scanner(System.in);
    OrdenadorNome ordn = new OrdenadorNome();
    OrdenadorIdade ordi = new OrdenadorIdade();

    public void povoarArrayPessoas(Pessoa[] pessoas) {

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
            System.out.println("Nome " + (i + 1) + ":");
            pessoas[i].setNome(keyboard.next());
            System.out.println("Idade " + (i + 1) + ":");
            pessoas[i].setIdade(keyboard.nextInt());
        }
    }

    public int escolherOpcaoDeOrdenacao() {

        System.out.println("Vetores preenchidos. Deseja ordena-los por nome ou por idade?");
        System.out.println("Escolha o numero correspondente:");
        System.out.println("1 = nome");
        System.out.println("2 = idade");

        int opcao = keyboard.nextInt();

        return opcao;
    }

    public void ordenarVetorDePessoas(Pessoa[] pessoas, int input) {
        switch (input) {

            case 1:
                ordn.ordena(pessoas);
                System.out.println("Vetores ordenados por nome. ");
                break;

            case 2:
                ordi.ordena(pessoas);
                System.out.println("Vetores ordenados por idade. ");
                break;
        }
    }

    public void imprimirVetorDePessoas(Pessoa[] pessoas) {
        int i;
        System.out.println("Imprimindo vetores: ");

        for (i = 0; i < pessoas.length; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.print("Nome: ");
            System.out.println(pessoas[i].getNome());
            System.out.print("Idade: ");
            System.out.println(pessoas[i].getIdade());
            System.out.println();
        }
    }
}
