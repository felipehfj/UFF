/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

/**
 *Esta classe simula o usuário Funcionário, tendo uma representatividade mais 
 * lógica do que funcional
 * @author felipe
 */
public abstract class Funcionario extends Pessoa{
    private String matricula;

    public Funcionario(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }    
}
