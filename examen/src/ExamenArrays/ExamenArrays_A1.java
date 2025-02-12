/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenArrays;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class ExamenArrays_A1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //demanar strings
        System.out.println("Escriu una frase:");
        String frase = sc.nextLine().toLowerCase();
        System.out.println("Escriu les lletres:");
        String lletres = sc.nextLine();
        
        //convertir a Arrays
        String[] fraseArray = frase.split(" ");
        char[] lletresArray = lletres.toCharArray();
        
        int comptadorFinal = 0;
        int comptadorDeCadaCas = 0;
        String paraulaFinal = "";
        for (int i = 0; i < fraseArray.length; i++) {
            char[] lletresParaula = fraseArray[i].toCharArray();
            for (int j = 0; j < lletresParaula.length; j++) {
                for (int k = 0; k < lletresArray.length; k++) {
                    if (lletresParaula[j] == lletresArray[k]) 
                        comptadorDeCadaCas++;
                }
            }
            if (comptadorDeCadaCas > comptadorFinal) {
                comptadorFinal = comptadorDeCadaCas;
                paraulaFinal = fraseArray[i];
            }
            comptadorDeCadaCas = 0;
        }
        System.out.printf("La paraula on apareixen més lletres del conjunt és \'%s\'.\n",paraulaFinal);
        System.out.println("Les lletres del conjunt hi apareixen " + comptadorFinal + " vegades.");
        
        
    }
}
