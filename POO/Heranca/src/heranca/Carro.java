/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author felipe
 */
public class Carro {

    protected int velocidade;

    //public Carro() {
    //  System.out.println("Construtor de Carro");
    //}
    @Override
    public boolean equals(Object o) {
        if (o instanceof Carro) {
            return this.velocidade == ((Carro) o).velocidade;
        }
        return false;
    }

    public Carro(int velocidadeInicial) {
        velocidade = velocidadeInicial;
    }

    public void acelera() {
        velocidade++;
    }

    public void freia() {
        velocidade--;
    }

    @Override
    public String toString() {
        return "Carro - velocidade: " + velocidade;
    }
}
