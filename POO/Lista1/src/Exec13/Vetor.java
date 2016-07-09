/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec13;

/**
 *
 * @author felipe
 */
public class Vetor {

    private int vetor[];

    public Vetor(int tamanho) {
        this.vetor = new int[tamanho];
        //this.popula();
    }

    public void popula() {
        for (int pos = 0; pos < vetor.length; pos++) {
            vetor[pos] = (int) (Math.random() * 100);
        }
    }

    public void imprime() {
        for (int pos = 0; pos < vetor.length; pos++) {
            System.out.println(pos + "-> " + vetor[pos]);
        }
    }

    public void ordena() {
        for (int i = vetor.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (vetor[j - 1] > vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }
    }

}
