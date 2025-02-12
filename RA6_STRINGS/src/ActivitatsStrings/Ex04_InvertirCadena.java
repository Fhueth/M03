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
public class Ex04_InvertirCadena {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix una cadena de caràcters: ");
        String cadena = sc.nextLine();
       
        System.out.print("La cadena a l'inrevés és: ");
        for (int i = cadena.length()-1; i >= 0; i--) {
            char letra = cadena.charAt(i);
            System.out.print(letra);
        }
        System.out.println("");
    }
}
