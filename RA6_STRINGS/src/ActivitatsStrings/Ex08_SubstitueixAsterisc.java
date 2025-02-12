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
public class Ex08_SubstitueixAsterisc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix una frase que contingui algun asterisc: ");
        String fraseOriginal = sc.nextLine().trim();
        System.out.print("Introdueix la frase que substituirà l'asterisc: ");
        String fraseASubstituir = sc.nextLine().trim();
        
        String fraseNova = "";
        /*for (int i = 0; i < fraseOriginal.length(); i++) {
            if ((fraseOriginal.charAt(i)) == '*') {
                    fraseNova += fraseASubstituir;
            }
            else
                fraseNova += fraseOriginal.charAt(i);
        }
        System.out.println(fraseNova);*/
        
        int pos = fraseOriginal.indexOf('*');
        int posInicial = 0;
        while (pos != -1)    {
            fraseNova += 
                    fraseOriginal.substring(posInicial, pos) +
                    fraseASubstituir;
            
            posInicial = pos + 1;
            pos = fraseOriginal.indexOf('*', posInicial);
            
        }
        System.out.println(fraseNova);
    }
}
