/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.supermercado.modelo;

import java.util.Comparator;
import java.util.Objects;

/**
 *Esta classe representa um produto, nela é possivel fazer modificações em 
 * produtos,tem como classe filha ProdutoEstoque.
 * @author felipe
 */
public class Produto implements Comparable<Produto>, Comparator<Produto> {
    public static final int PESO = 1;
    public static final int UNIDADE = 2;
    
    private String nome;
    private int codigo;
    private double precoUnitario;
    private int tipo;

    public Produto(){
        
    }
    
    public Produto(String nome, int codigo, double precoUnitario, int tipo) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    public String getTipoString(){
        String strTipo = null;
        
        if(this.tipo == 1)
            strTipo = "Kg";
        if(this.tipo == 2)
            strTipo = "Un";

        return strTipo;
    }
    @Override
    public String toString() {
        String strTipo = null;
        if(this.tipo == 1)
            strTipo = "Kg";
        if(this.tipo == 2)
            strTipo = "Un";

        return "Cod: " + codigo + " " + nome + " R$ " + precoUnitario + " " + strTipo;
    }

    @Override
    public int compareTo(Produto o) {
        if(o instanceof Produto){
            return this.nome.compareToIgnoreCase(((Produto)o).getNome());
        }
        return -1;
    }

    @Override
    public int compare(Produto o1, Produto o2) {
        if((o1 instanceof Produto) && (o2 instanceof Produto)){
            return ((Produto)o1).compareTo((Produto)o2);
        }
        return -1;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Produto){
            return this.nome.equalsIgnoreCase(((Produto)o).getNome());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
