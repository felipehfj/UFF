/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *Esta classe auxilia na entrada de dados, e em casos de erro tipo,dispara 
 *mensagens de erro ao invés de parar o programa e disparar mensagens do 
 *compilador.
 * Obs: Os tipos auxiliados por essa classe são: Inteiro,Double e String.
 * Obs²:Em caso de modificação da classe favor atualizar a observação acima, se 
 * necessário.
 * @author caios_000
 */
public class IOHelper {

    public int getInteiro() {
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        String str;
        boolean flag;
        do {
            flag = false;
            try {
                str = teclado.nextLine();
                op = Integer.parseInt(str);
            } catch (InputMismatchException e) {
                System.out.println("VALOR INVALIDO");
                flag = true;
            } catch (Exception e) {
                System.out.println("VALOR INVALIDO");
                flag = true;
            }
        } while (flag);
        return op;
    }

    public double getDouble() {
        Scanner teclado = new Scanner(System.in);
        double op = 0;
        String str;
        boolean flag;
        do {
            flag = false;
            try {
                str = teclado.nextLine();
                op = Double.parseDouble(str);

            } catch (InputMismatchException e) {
                System.out.println("VALOR INVALIDO");
                flag = true;
            } catch (Exception e) {
                System.out.println("VALOR INVALIDO");
                flag = true;
            }
        } while (flag);
        return op;
    }

    public String getString() {
        Scanner teclado = new Scanner(System.in);
        String op = "";
        boolean flag;
        do {
            flag = false;
            try {
                op = teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("VALOR INVALIDO");
                flag = true;
            } catch (Exception e) {
                System.out.println("VALOR INVALIDO");
                flag = true;
            }
        } while (flag);
        return op;
    }
}
