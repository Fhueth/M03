/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsArrays;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Ex_DesxifratRotatori {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //demanar clau
        System.out.print("Escriu un valor entre el 1 i 9: ");
        int n = sc.nextInt();
        sc.nextLine();
        //demanar String
        System.out.println("Escriu una frase a continuació: ");
        String frase = sc.nextLine() ;
        
        
        //1a fase
        String[] paraules = frase.split(" ");
        int desplacament = 0;
        while (desplacament < paraules.length) {
            String aux = paraules[desplacament];
            int loQueQueda = paraules.length-desplacament;
            int totalParaulesGrup = Math.min(n, loQueQueda);
            for (int i = 0; i < totalParaulesGrup-1; i++)
                paraules[i+1+desplacament] = paraules[i+desplacament];
            paraules[totalParaulesGrup-1+desplacament] = aux;
            desplacament += n;
        }
        
        //2a fase
        for (int i = 0; i < paraules.length; i++) {
            char[] lletres = paraules[i].toCharArray();
            desplacament = 0;
            while (desplacament < lletres.length) {
                char aux = lletres[desplacament];
                int loQueQueda = lletres.length-desplacament;
                int totalParaulesGrup = Math.min(n, loQueQueda);
                for (int j = 0; j < totalParaulesGrup-1; j++)
                    lletres[j+desplacament] = lletres[j+1+desplacament];
                lletres[totalParaulesGrup-1+desplacament] = aux;
                desplacament += n;
            }
            for (char lletra : lletres) {
                System.out.print(lletra);
            }
            System.out.print(" ");
            
        }
        System.out.println("");
        
       
    }
}
