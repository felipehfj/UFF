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
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Carro c = new Carro();
        //System.out.println(c.toString());

        //CarroInteligente ci = new CarroInteligente();
        //System.out.println(ci.toString());
        CarroCorrida cc = new CarroCorrida(10);
        CarroInteligente ci = new CarroInteligente(10);
        Carro c1 = new CarroCorrida(10);
        System.out.println(c1);
        Carro c2 = new CarroInteligente(10);
        System.out.println(c2);

        c2.freia();
        c2.acelera();
        ((CarroInteligente) c2).estaciona();

    }
}
