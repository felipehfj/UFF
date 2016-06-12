/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaAgenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author felipe
 */
public class OrdenadorTelefone extends Ordenador implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getTelefone().compareToIgnoreCase(p2.getTelefone());
    }

    @Override
    public void ordena(ArrayList contatos){
        Collections.sort(contatos, this.thenComparing(this));
    }
}
