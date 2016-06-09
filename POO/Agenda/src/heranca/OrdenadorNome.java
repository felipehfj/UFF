/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author felipe
 */
public class OrdenadorNome extends Ordenador{

    @Override
    public int compara(Pessoa p1, Pessoa p2) {
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }
    
}
