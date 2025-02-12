/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsArrays;

/**
 *
 * @author alexp
 */
public class Ex20_AcademiaIdiomes {
    public static void main(String[] args) {
        
        int[][] matriu =    {
                {7, 14, 8, 3},
                {6, 19, 7, 2},
                {3, 13, 4, 1}
                            };
        
        //Nivell
        for (int i = 0; i < 4; i++) {
            int suma = 0;
            switch (i) {
                case 0:
                    System.out.print("Total d'alumnes del nivell bàsic: ");
                    break;
                case 1:
                    System.out.print("Total d'alumnes del nivell mig: ");
                    break;
                default:
                    System.out.print("Total d'alumnes del nivell perfeccionament: ");
                    break;
            }
            for (int j = 0; j < 4; j++) {
                int valor = matriu[i][j];
                suma += valor;
            }
            System.out.println(suma);
        }
        
        System.out.println("");
        //Idiomes
        int totalAlumnes = 0; //total alumnes
        for (int j = 0; j < 4; j++) {
            int suma = 0;
            switch (j) {
                case 0:
                    System.out.print("Total d'alumnes d'anglès: ");
                    break;
                case 1:
                    System.out.print("Total d'alumnes de francés: ");
                    break;
                case 2:
                    System.out.print("Total d'alumnes d'alamany: ");
                    break;
                default:
                    System.out.print("Total d'alumnes de rus: ");
                    break;
            }
            for (int i = 0; i < 3; i++) {
                int valor = matriu[i][j];
                
                suma += valor;
                totalAlumnes += valor;
            }
            System.out.println(suma);
        }
        System.out.println("El total d'alumnes matriculats a la acadèmia és: " + totalAlumnes);
    }
}
