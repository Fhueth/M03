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
public class Ex03_ComptaMajusMinus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String frase = sc.nextLine();
        
        int majus = 0, minus = 0, altres = 0;
        
        for (int i = 0; i < frase.length(); i++)
            if (Character.isLowerCase(frase.charAt(i)))
                minus++;
            else if (Character.isUpperCase(frase.charAt(i)))
                majus++;
            else
                altres++;
        
        System.out.printf("La frase conté %d majúscules.\n",majus);
        System.out.printf("La frase conté %d minúscules.\n",minus);
        System.out.printf("La frase conté %d altres caràcters.\n",altres);
    }  
}
