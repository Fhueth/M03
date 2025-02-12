/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBucles;

import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Ex17_E {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueixi un nombre natural: ");
        int n = sc.nextInt();
        
        double e = 0.0;
        for (int i = 0; i <= n; i++)    {
            int factorial = 1;
            for (int j = i; j > 0; j--) {
                factorial = factorial * j;
            }
            e += 1.0/factorial;
        }
        System.out.println("El nombre e amb precissió " + n + " és: " + e);
    }
 
}
