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
public abstract class Ordenador {

    public void ordena(Pessoa[] pessoas) {
        boolean swap = true;
        Pessoa temp;
        int i;
        while (swap) {
            swap = false;
            for (i = 0; i < pessoas.length - 1; i++) {
                if (compara(pessoas[i], pessoas[i + 1])) {
                    temp = pessoas[i];
                    pessoas[i] = pessoas[i + 1];
                    pessoas[i + 1] = temp;
                    swap = true;
                }
            }
        }
    }

    public abstract boolean compara(Pessoa p1, Pessoa p2);

}
