/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsStrings;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Ex05_Palindrom {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix una cadena de caràcters: ");
        String cadena = sc.nextLine().toLowerCase().replace(" ", "");
        
        
        // Alternativa a Replace()
        
        /*
        String cadena2 = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ')
                cadena2 += cadena.charAt(i);
        }
        */
        
        
        String resultat = "";
        for (int i = cadena.length()-1; i >= 0; i--)    
            resultat += cadena.charAt(i);
        if (resultat.equals(cadena))
            System.out.println("La cadena és un palíndrom.");
        else   
            System.out.println("La cadena NO és un palíndrom.");
        
    }
}
