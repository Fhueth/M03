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
public class Ex_Matriu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //demanar array
        System.out.print("Escriu 16 valors: ");
        int[][] matriu = new int[4][4];
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[0].length; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }
        //printar array i calcular traça
        int suma = 0;
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[0].length; j++) {
                if (j == 3)
                    System.out.println(matriu[i][j]);
                else 
                    System.out.print(matriu[i][j] + "\t");
                if (i+j == 3)
                    suma += matriu[i][j];
            }
        }
        System.out.println("\nTraça: " + suma);
        
        //matriu transposada
        for (int j = 0; j < matriu[0].length; j++) {
            for (int i = 0; i < matriu.length; i++) {
                if (i == 3)
                    System.out.println(matriu[i][j]);
                else 
                    System.out.print(matriu[i][j] + "\t");
            }
        }
    }
}
