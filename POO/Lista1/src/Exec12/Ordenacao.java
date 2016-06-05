/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec12;

/**
 *
 * @author felipe
 */
public class Ordenacao {

    private static void troca(double[] numeros, int i, int j) {
        double aux = numeros[i];
        numeros[i] = numeros[j];
        numeros[j] = aux;
    }

    private static void sort(double[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    Ordenacao.troca(numeros, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] numeros = new double[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random();
        }

        sort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

}
