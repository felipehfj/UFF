/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class ExemploExcecao {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        boolean flag = false;
        while (!flag) {
            try {
                int i = teclado.nextInt();
                System.out.println(i);
                flag = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Erro de input");
            }
        }
 
    }
}
