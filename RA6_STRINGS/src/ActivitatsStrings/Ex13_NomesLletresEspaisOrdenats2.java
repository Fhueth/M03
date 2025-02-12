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
public class Ex13_NomesLletresEspaisOrdenats2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Introdueix una cadena de text: ");
        String cadena = sc.nextLine();
        
        String cadenaNova = "";
        
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLetter(cadena.charAt(i)) || (cadena.charAt(i)) == ' ') {
                cadenaNova += cadena.charAt(i);
            }
        }
       
        String espais = "";
        String lletres = "";
        for (int i = 0; i < cadenaNova.length(); i++) {
            if ((cadenaNova.charAt(i)) == ' ')
                espais += " ";
            else
                lletres += cadenaNova.charAt(i);
        }
        
        String abecedari = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String novesLletres = "";
        for (int i = 0; i < abecedari.length(); i++) {
            for (int j = 0; j < lletres.length(); j++) {
                
                if (abecedari.charAt(i) == lletres.charAt(j))
                    novesLletres += lletres.charAt(j);
            }
        }
       
        System.out.println("\"" + novesLletres + espais + "\"");
    }
}
