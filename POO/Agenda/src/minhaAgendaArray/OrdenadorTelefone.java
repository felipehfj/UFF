/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaAgendaArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author felipe
 */
public class OrdenadorTelefone implements IOrdenador<Pessoa>, Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getTelefone().compareToIgnoreCase(p2.getTelefone());
    }

    public void sort(Pessoa[] contatos) {
       Collections.sort(new ArrayList<Pessoa>(Arrays.asList(contatos)), thenComparing(this));
    }
    
}
