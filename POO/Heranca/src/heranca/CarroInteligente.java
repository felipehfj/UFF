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
public class CarroInteligente extends Carro {

    public int freio;

//  public CarroInteligente() {
//      System.out.println("Construtor de CarroInteligente");
//  }
    public CarroInteligente(int velocidadeInicial) {
        super(velocidadeInicial);
    }

    public void estaciona() {
        //TODO implementar o estaciona
    }

    @Override
    public String toString() {
        return "CarroInteligente - velocidade: " + velocidade + " freio: " + freio;
    }
}
