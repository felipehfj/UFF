/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec33;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author felipe
 */
public class Vetor {

    private List vetor;
    private int tamanho;

    public Vetor(int tamanho) {
        this.vetor = new ArrayList(tamanho);
        this.tamanho = tamanho;
        //this.popula();
    }

    public void popula() {
        for (int i = 0; i < tamanho; i++) {
            vetor.add((int)(Math.random() * 100));
        }
    }

    public void imprime() {
        Iterator it = vetor.iterator();

        while (it.hasNext()) {
            System.out.println("-> " + it.next().toString());
        }
    }

    public void ordena() {
        vetor.sort(Comparator.naturalOrder());
    }

}
