/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec21;

/**
 *
 * @author felipe
 */
public class Livro {
    private String titulo;
    private Pessoa autor;
    
    public Livro(String titulo){
        this.titulo = titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setPessoa(Pessoa autor){
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro {" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    
    
}
