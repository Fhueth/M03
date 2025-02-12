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
public class Ex02_CalculsVector {
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
        
        
        double mitjana = 0;
        int valorMaxim = Integer.MIN_VALUE;
        int valorMinim = Integer.MAX_VALUE;
        int suma = 0;
        for (int i = 0; i < valor.length; i++) {
            suma += valor[i];
            if (valor[i] >= valorMaxim)
                valorMaxim = valor[i];
            if (valor[i] <= valorMinim)
                valorMinim = valor[i];
        }
        mitjana = (double)suma/valor.length;
        System.out.println("La mitjana aritmètica dels valors del vector és: " + mitjana);
        System.out.println("El valor màxim del vector és: " + valorMaxim);
        System.out.println("El valor mínim del vector és: " + valorMinim);
        System.out.println("La suma " + suma);
    }
    
}
