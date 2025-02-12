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
public class Ex20a_MCD_restant  {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long m = Math.abs(sc.nextInt());
        long n = Math.abs(sc.nextInt());
        
        if (m == 0 && n == 0)
            System.out.println("No es pot calcular el MCD de dos zeros. Introdueix valors enters positius.");
        else if (m < 0 || n < 0)
            System.out.println("Introdueix valors enters positius.");
        else if (m == 0)
            System.out.println("MCD = " + n);
        else if (n == 0)
            System.out.println("MCD = " + m);
        else if (m > 0 && n > 0)    {
            while (m != n)  {
                if (m > n)  {
                    System.out.printf("%d - %d = %d\n",m,n,m-n);
                    m -= n;
                }
                else if (m < n)  {
                    System.out.printf("%d - %d = %d\n",n,m,n-m);
                    n -= m;
                }
            }
            System.out.println("MCD = " + m);
        }
    }
}
