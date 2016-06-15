/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author felipe
 */
public class Polimorfismo {
    public static void main(String[] args){
        Animal[] animais = new Animal[10];
        
        animais[0] = new Homem();
        animais[1] = new Homem();
        animais[2] = new Homem();
        animais[3] = new Cao();
        animais[4] = new Cao();
        animais[5] = new Cao();
        animais[6] = new Gato();
        animais[7] = new Gato();
        animais[8] = new Gato();
        animais[9] = new Gato();
        
        for(Animal a : animais){
            System.out.println(a.fala());
        }
        
    }
    
}
