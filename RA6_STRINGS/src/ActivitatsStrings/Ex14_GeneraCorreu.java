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
public class Ex14_GeneraCorreu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix el teu nom: ");
        String nom = sc.nextLine().toLowerCase().trim();
        System.out.print("Introdueix els teus cognoms: ");
        String cognoms = sc.nextLine().toLowerCase().trim();
        
        String lletresInvalides = "àáèéíòóúçñ";
        String lletresValides = "aaeeiooucn";
        int pos = cognoms.indexOf(' ');
        if (pos > 0)
            cognoms = cognoms.substring(0, pos+1) + cognoms.substring(pos+1).trim();
        //Nom
        String nomModificat = "";
        for (int i = 0; i < nom.length(); i++) {
            pos = lletresInvalides.indexOf(nom.charAt(i));
            if (pos >= 0)
                nomModificat += lletresValides.charAt(pos);
            else
                nomModificat += nom.charAt(i);
        }
        
        //Cognoms
        String cognomsModificat = "";
        for (int i = 0; i < cognoms.length(); i++) {
            pos = lletresInvalides.indexOf(cognoms.charAt(i));
            if (pos >= 0) 
                cognomsModificat += lletresValides.charAt(pos);
            else 
                cognomsModificat += cognoms.charAt(i);
        }
        System.out.println("La teva adreça de correu és:");
        System.out.printf("%s.%s@alumnat.copernic.cat\n",cognomsModificat.replace(' ', '.'),nomModificat);
    }
}

