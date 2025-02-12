/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenRA1;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class ExamenRA1_Ex1a {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int numero = 1;
        int totalDivisors = 0;
        
        while(totalDivisors < n)    {
            numero++;
            totalDivisors = 2;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0)
                    totalDivisors++;
                
            }
        }
        System.out.printf("El primer nombre amb almenys %d divisors és %d.\n",n,numero);
    }
}
