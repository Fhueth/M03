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
public class Ex01_ComptaVocals {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String frase = sc.nextLine().toLowerCase();
        String vocals = "aeiouéíóúàèòïü";
        int comptadorVocals = 0;
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < vocals.length(); j++) {
                if (frase.charAt(i) == vocals.charAt(j)) {
                    comptadorVocals++;
                    break;
                }
            }
        }
        System.out.println("La frase conté " + comptadorVocals + " vocals.");
    }
}
