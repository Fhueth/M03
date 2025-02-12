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
public class Ex10_NomesLletresEspais {
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
        System.out.println(cadenaNova);
    }
}
