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
public class Ex06_ComptaCaracter {        
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        //System.out.print("Introdueix una cadena de caràcters: ");
        String frase = sc.nextLine();
        //System.out.print("Introdueix un caràcter: ");
        char caracter = sc.next().charAt(0);
        
        int comptador = 0;
        int index = 0;
        int pos = 0;
        while(index != -1){
            index = frase.indexOf(caracter, pos);
            if (index != -1){
                    comptador++;
                    pos = index + 1;
                }

        }System.out.printf("El caràcter '%s' apareix %d vegades.\n",caracter ,comptador);
    }
}
