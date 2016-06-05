/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /* Determine as raízes de uma equação de 2º grau: ax 2 + bx + c = 0
 * (recordar que o discriminante Δ = b 2  – 4ac, e que a raiz r = (–b ± √Δ)/2a).
 */
package Exec1;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class Raizes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double c = 0;
        double delta = 0;
        double x1 = 0;
        double x2 = 0;
        boolean debug = false;

        System.out.print("Digite o valor de 'a': ");
        a = teclado.nextDouble();

        System.out.print("Digite o valor de 'b': ");
        b = teclado.nextDouble();

        System.out.print("Digite o valor de 'c': ");
        c = teclado.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do 2º grau!");
        } else {
            delta = (Math.pow(b, 2.0) - (4 * a * c));

            if (delta <= 0) {
                System.out.println("Não existem soluções que possam ser expressas com o conjunto dos números reais!");
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
            }
        }

        if (debug) {
            System.out.println("A: " + a + " | B: " + b + " | C:" + c + ".");
            System.out.println("Delta: " + delta);
            System.out.println("X1: " + x1 + "| X2: " + x2);
        }
    }
}
