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
public class Ex16_MatriuProducte {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Indiqui el nombre de files: ");
        int n = sc.nextInt();
        System.out.print("Indiqui el nombre de columnes: ");
        int m = sc.nextInt();
        
        int[][] matriu = new int[n][m];
        for (int i = 0; i < m; i++) {
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriu[i][j] = i*j;
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
