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
public class Ex13_NomesLletresEspaisOrdenats {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String entrada = "public static void main(String[] args) {";
        String sortida = entrada.substring(0,1);
        /*for (int i = 1; i < entrada.length(); i++) {
            String lletraAInsertar = entrada.substring(i,i+1);
            if (Character.isLetter(lletraAInsertar.charAt(0)) || lletraAInsertar.equals(" "))   {
                boolean inserida = false;
                for (int j = 0; j < sortida.length(); j++) {
                    System.out.println(lletraAInsertar.compareTo(sortida.substring(j, j+1)));
                    if (lletraAInsertar.compareTo(sortida.substring(j, j+1)) <= 0) {
                        sortida = sortida.substring(0, j) + lletraAInsertar + sortida.substring(j);

                        inserida = true;
                        break;
                    } 
                }
                if (!inserida)
                    sortida += lletraAInsertar;
            }
        }
        int longitudTotal = sortida.length();
        sortida = sortida.trim();
        int longitudSenseEspais = sortida.length();
        for (int i = 0; i < (longitudTotal-longitudSenseEspais); i++)
            sortida += " ";
        System.out.println(sortida);*/
        
        
    }
}
