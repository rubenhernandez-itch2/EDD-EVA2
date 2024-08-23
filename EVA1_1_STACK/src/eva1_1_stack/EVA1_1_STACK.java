/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_stack;

/**
 *
 * @author ruben
 */
public class EVA1_1_STACK {
    public static void main(String[] args) {
        System.out.println("Inicia Main");
        A();
        System.out.println("Termina Main");
    }    
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
    }
    public static void B(){ 
        System.out.println("Inicia B");
        System.out.println("Termina B");
    }
    
}
