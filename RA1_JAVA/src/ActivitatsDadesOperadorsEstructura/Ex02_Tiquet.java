/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsDadesOperadorsEstructura;

/**
 *
 * @author alexp
 */
public class Ex02_Tiquet {
    public static void main(String[] args) {
        
        int quantitat = 40;
        double preuXlitre = 1.48;
        double preu = quantitat*preuXlitre;
        
        System.out.println("+------------------------+");
        System.out.println("|                        |");
        System.out.println("|      REPSOL S.A.       |");
        System.out.println("|                        |");
        System.out.println("| 2024-09-17  04:38PM    |");        
        System.out.println("|                        |");
        System.out.println("| Litres:       " + quantitat + "       |");
        System.out.println("| Preu/litre:   " + preuXlitre + " €   |");
        System.out.println("|                        |");
        System.out.printf("| Preu total:   %.2f €  |\n" ,preu );
        System.out.println("|                        |");
        System.out.println("+------------------------+");
    }
}
