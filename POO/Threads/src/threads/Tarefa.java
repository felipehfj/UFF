/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author felipe
 */
public class Tarefa implements Runnable {

    private final String nome;

    public Tarefa(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Tarefa " + nome + ": " + i + "%");
        }
    }
}
