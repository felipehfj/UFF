/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author felipe
 */
public abstract class Produto implements Comparable<Produto>, Comparator<Produto>{
       
    private String nome;
    private int codigo;
    private double precoUnitario;
    private double quantidade;

    public Produto() {
    }

    public Produto(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    
    public Produto(String nome, int codigo, double precoUnitario) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
    }
   
    public Produto(String nome, int codigo, double preco, double quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoUnitario = preco;
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

    public double getPreco() {
        return precoUnitario;
    }

    public void setPreco(double preco) {
        this.precoUnitario = preco;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    
    /**
     * Calcula o preco do produto utilizando a quantidade
     * @return double
     */
    public abstract double getPrecoTotal();
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Produto){
            return ((Produto)o).getNome().equalsIgnoreCase(nome);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public int compare(Produto o1, Produto o2) {
        if(o1 instanceof Produto && o2 instanceof Produto){
            return ((Produto)o1).compareTo(((Produto)o2));
        }
        return -1;
    }
    
    
    @Override
    public int compareTo(Produto o) {
        if(o instanceof Produto){
            return this.nome.compareToIgnoreCase(((Produto)o).getNome());
        }
        return -1;
    }
}
