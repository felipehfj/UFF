/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contaPalavras;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author felipe
 */
public class ContaPalavras {
    public static void main(String[] args) {
        String frase = "joao joao maria jose maria";
        String[] palavras = frase.split(" ");
        Map<String, Integer> contaPalavras = new HashMap();
        for (String palavra : palavras) {
            if (!contaPalavras.containsKey(palavra)) {
                contaPalavras.put(palavra, 1);
            }
            else {
                Integer conta = contaPalavras.get(palavra) + 1;
                contaPalavras.put(palavra, conta);
            }
        }
        for (String palavra : contaPalavras.keySet()) {
            System.out.println(palavra + " - " + contaPalavras.get(palavra));
        }
    }
}
