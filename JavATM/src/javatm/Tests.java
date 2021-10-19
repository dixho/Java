/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatm;
import java.util.Scanner;
import java.lang.Math;


/**
 *
 * @author fran2
 */
public class Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Introduzca texto: ");
        s = sc.nextLine(); //asigna a la variable s el String introducido por teclado
        System.out.println(s);
        if (s == "a"){
        
            System.out.println("funciona");}
    }
    
}
