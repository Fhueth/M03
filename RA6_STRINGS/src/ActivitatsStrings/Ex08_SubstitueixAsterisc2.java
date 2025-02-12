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
public class Ex08_SubstitueixAsterisc2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix una frase que contingui algun asterisc: ");
        String fraseOriginal = sc.nextLine();
        System.out.print("Introdueix la frase que substituirà l'asterisc: ");
        sc.nextLine();
        String fraseASubstituir = sc.nextLine();
        
        String fraseModificada = "";
        int pos = 0, index = 0;
        while ((index = fraseOriginal.indexOf("*", pos)) != -1)   {
            fraseModificada += fraseOriginal.substring(pos, index) + fraseASubstituir;
                    pos = index + 1;
        }
        System.out.println("La frase modificada és: " + fraseModificada);
    }
}
