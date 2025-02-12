/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesString;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class ElMeuPrimerString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String cadena1 = new String("Lluis");
        String cadena2 = new String("Lluis");
        String cadena3 = "Lluis";
        
        char inicial = cadena1.charAt(0);
        
        System.out.print("cadena1 == cadena2? ");
        if (cadena1 == cadena2)
            System.out.println("Si són iguals");
        else
            System.out.println("No són iguals");
        System.out.println("Compara l'adreça de memòria\n");
        
        
        System.out.print("cadena1 == cadena3? ");
        if (cadena1 == cadena3)
            System.out.println("Si són iguals");
        else
            System.out.println("No són iguals");
        System.out.println("Compara l'adreça de memòria\n");
        
        
        System.out.print("cadena1.equals(cadena2)? ");
        if (cadena1.equals(cadena2))
            System.out.println("Si són iguals");
        else   
            System.out.println("No són iguals");
        System.out.println("Compara el contingut\n");

        
        System.out.print("cadena1.equals(cadena3)? ");
        if (cadena1.equals(cadena3))
            System.out.println("Si són iguals");
        else   
            System.out.println("No són iguals");
        System.out.println("Compara el contingut\n");
        
        
        
        
        
        System.out.println("cadena1: " + cadena1);
        cadena1 = "Manel";
        System.out.println("cadena1: " + cadena1);





        String str1 = "Bon";
        String str2 = "dia";
        System.out.println(str1+str2);
        
        String str3 = str1.concat(str2);
        System.out.println(str3);
        
        String str4 = "Bon";
        String str5 = "dia";
        str4.concat(str5);
        System.out.println(str4);
        
        
        
    }
}
