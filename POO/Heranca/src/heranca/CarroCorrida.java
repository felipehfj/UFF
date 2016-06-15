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
public class CarroCorrida extends Carro {

    public CarroCorrida(int velocidadeInicial) {
        super(velocidadeInicial);
    }

    @Override
    public void acelera() {
        velocidade += 5;
    }

    @Override
    public String toString() {
        return "CarroCorrida - velocidade: " + velocidade;
    }
}
