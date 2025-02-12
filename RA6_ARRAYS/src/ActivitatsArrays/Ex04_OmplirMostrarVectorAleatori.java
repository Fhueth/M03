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
public class Ex04_OmplirMostrarVectorAleatori {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int MIN = 10, MAX = 99;
        int[] valors = new int[10];
        for (int i = 0; i < valors.length; i++) {
            valors[i] = MIN + (int)(Math.random()*(MAX-MIN+1));
            System.out.printf("El valor de la posició %d és: %d\n",i,valors[i]);
        }
    }
}
