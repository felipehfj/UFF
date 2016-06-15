/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inverteString;

import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class InverteString {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        String frase = "The core collection interfaces encapsulate different types of collections, which are shown in the figure below";
        String[] palavras = frase.split(" ");
        ArrayList<String> listaPalavras = new ArrayList();
        for (String palavra : palavras) {
            listaPalavras.add(palavra);
        }
        for (int i = listaPalavras.size() - 1; i >= 0; i--) {
            System.out.println(listaPalavras.get(i));
        }
    }
}
