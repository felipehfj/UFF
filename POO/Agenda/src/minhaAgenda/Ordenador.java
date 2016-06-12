/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaAgenda;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author felipe
 */
public abstract class Ordenador implements Comparator<Pessoa>{
    @Override
    public abstract int compare(Pessoa p1, Pessoa p2);
    
    public abstract void ordena(ArrayList contatos);
          
}
