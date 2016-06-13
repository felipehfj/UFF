/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaAgenda2;

import java.util.ArrayList;

/**
 *
 * @author felipe
 * @param <Pessoa>
 */
public interface IOrdenador<Pessoa> {
    
    /**
     *
     * @param p1
     * @param p2
     * @return
     */
    public abstract int compare(Pessoa p1, Pessoa p2);
    
    /**
     *
     * @param contatos
     */
    public abstract void sort(ArrayList contatos);
    
}
