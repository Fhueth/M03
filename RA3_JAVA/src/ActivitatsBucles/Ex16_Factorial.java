/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBucles;

/**
 * Fes un programa que ens demani un nombre natural n
 * i ens escrigui el factorial de n (entre 0 i 20). (n! = 1*2*3*....*n).
 */

import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Ex16_Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextInt();
        
        long factorial = 1; //no poner factorial = 0 porque multiplica por 0 entonces y da 0 siempre
        for (long i = n; i > 0; i--)    {
            factorial = factorial * i;
        }
        System.out.printf("Factorial de %d = %d! = %d",n,n,factorial);
    }
}
