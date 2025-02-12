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
public class Ex03_SumaProducteNaturals {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int producte = 1;
        int suma = 0; 

        if  (n > 1 && n < 20)   {
            for (int i = n; i > 0; i--)    {
                producte *= i;
            }
            for (int i = n; i > 0; i--)    {
                suma += i;
            }
            System.out.println("Suma    : " + suma);
            System.out.println("Producte: " + producte);
        }
        
        else    {
            System.out.println("Valor fora de rang!");
        }
        
    }
}
