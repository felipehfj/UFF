/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaAgenda2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author felipe
 */
public class OrdenadorNome implements IOrdenador<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }

    @Override
    public void sort(ArrayList contatos) {
        Collections.sort(contatos);
    }
    
}
