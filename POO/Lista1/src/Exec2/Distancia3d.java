/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /* 
 * Calcule a distância entre dois pontos num espaço de 3 dimensões.
 * D = sqrt ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1))
 */
package Exec2;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class Distancia3d {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double x1 = 0, x2 = 0;
        double y1 = 0, y2 = 0;
        double z1 = 0, z2 = 0;
        double distancia = 0;

        System.out.println("Digite os valores para o ponto 1");
        System.out.print("x1:");
        x1 = teclado.nextDouble();
        System.out.print("y1:");
        y1 = teclado.nextDouble();
        System.out.print("z1:");
        z1 = teclado.nextDouble();

        System.out.println("Digite os valores para o ponto 2");
        System.out.print("x2:");
        x2 = teclado.nextDouble();
        System.out.print("y2:");
        y2 = teclado.nextDouble();
        System.out.print("z2:");
        z2 = teclado.nextDouble();

        distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));

        System.out.println("Distância entre os pontos p1(" + x1 + "," + y1 + "," + z1 + ") e p2(" + x2 + "," + y2 + "," + z2 + ") é: " + distancia);
        System.out.println();
    }
}
