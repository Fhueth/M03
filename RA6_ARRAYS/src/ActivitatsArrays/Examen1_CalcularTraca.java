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
public class Examen1_CalcularTraca {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriu la dimensió de la matriu: ");
        int d = sc.nextInt();
        
        int[][] matriu = new int[d][d];
        
        int traca = 0, tracaInversa = 0;
        System.out.println("Introdueix els valors de la matriu: ");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                matriu[i][j] = sc.nextInt();
//                  if (i-j == 0)
//                    traca += matriu[i][j];
//                  if (i+j == d-1)
//                    tracaInversa += matriu[i][j];
            }
        }
        for (int i = 0; i < d; i++) 
            traca += matriu[i][i];
        for (int i = 0; i < d; i++) 
            tracaInversa += matriu[i][(d-1)-i];
        
        System.out.println("La traça d'aquesta matriu és: " + traca);
        System.out.println("La traça inversa d'aquesta matriu és: " + tracaInversa);
    }
}
