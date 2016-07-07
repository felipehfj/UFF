/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author felipe
 */
public class Funcionario extends Pessoa{
    private String matricula;

    public Funcionario(String matricula) {
        this.matricula = matricula;
    }

    public Funcionario(String matricula, String nome, String cpf) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
        
}
