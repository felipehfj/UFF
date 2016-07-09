/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec14;

/**
 *
 * @author felipe
 */
public class Vetor {

    private int vetor[];

    public Vetor(int[] vetor) {
        this.vetor = vetor;
    }
    
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

    public Vetor soma(int [] vetor) {
        int novoTamanho = this.vetor.length + vetor.length;
        int[] novoVetor = new int[novoTamanho];

        for (int i = 0, j = 0; i < novoTamanho; i=i+2, j++) {
            if (this.vetor[j] <= vetor[j]) {
                novoVetor[i] = this.vetor[j];
                novoVetor[i + 1] = vetor[j];
            } else {
                novoVetor[i] = vetor[j];
                novoVetor[i + 1] = this.vetor[j];
            }
        }
        
        Vetor nv = new Vetor(novoVetor);
        nv.ordena();

        return nv;
    }

    public int[] getVetor() {
        return this.vetor;
    }
}
