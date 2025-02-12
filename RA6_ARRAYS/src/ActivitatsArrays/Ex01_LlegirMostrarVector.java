/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ActivitatsArrays;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Ex01_LlegirMostrarVector {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] valor = new int[10];
        for (int i = 0; i < valor.length; i++) {
            System.out.printf("Introdueix el valor de la posició %d: ",i);
            valor[i] = sc.nextInt();
        }
                
        for (int i = 0; i < valor.length; i++) {
            System.out.printf("El valor de la posició %d és: %d\n",i,valor[i]);
        }
        
    }
    
}
