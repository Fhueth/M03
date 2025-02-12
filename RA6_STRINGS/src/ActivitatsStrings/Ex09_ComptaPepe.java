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
public class Ex09_ComptaPepe {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix una frase que contingui la seqüència \"pepe\": ");
        String frase = sc.nextLine();
        
        int comptador = 0, pos = 0, index;
        while ((index = frase.indexOf("pepe", pos)) != -1) {
            comptador++;
            pos = index + 2;
        }
        System.out.printf("La frase conté %d cops la seqüència \"pepe\"\n", comptador );
    }
}
