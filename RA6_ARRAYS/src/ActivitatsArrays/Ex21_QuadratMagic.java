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
public class Ex21_QuadratMagic {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //demanar dimensions del quadrat
        int n = 0;
        boolean sortir = false;
        do  {
            System.out.print("Escriu un valor senar del 3 al 21: ");
            if (sc.hasNextInt())    {
                n = sc.nextInt();
                if (n%2 != 0 && n >= 3 && n <= 21) {
                    sortir = true;
                }
            }
            else
                sc.next();
        } while (!sortir);
        
        int[][] quadrat = new int[n][n]; //array quadrat
        
        //int valor = 1;
        int fil = 0, col = n/2;
        //while (valor <= n*n) {
        for (int valor = 1; valor <= n*n; valor++) {
            quadrat[fil][col] = valor;
            //valor++;
            if (valor % n == 0) 
                fil++;
            else    {
                fil = ((fil-1) + n)%n;
                col = ((col+1) + n)%n;
            }
        }
        
        //printar array
        for (int[] row : quadrat)    {
            for (int valor : row) {
                System.out.printf("%" + (int)(Math.log10(n*n)+1) + "d ", valor);
            }
            System.out.println("");
        }
    }
}
