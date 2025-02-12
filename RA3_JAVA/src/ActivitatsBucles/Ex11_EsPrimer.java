/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBucles;

/*
Fes un programa que ens demani un nombre natural n i ens digui si és o no primer.
*/
import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Ex11_EsPrimer {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un número: ");
        int n = sc.nextInt();
        
        int comptadorNoPrimers = 0;
        
        /*for (int i = 2; i < n; i++)    {
            if (n % i == 0)
                comptadorNoPrimers++;
            if (comptadorNoPrimers > 0)
                break;
        }
        if (comptadorNoPrimers > 0) {
            System.out.printf("El nombre %d NO és primer.\n",n);
            System.out.printf("%d també es divisible per: ", n);
            for (int i = 2; i < n; i++)    {
                if (n % i == 0) {
                    System.out.printf("%d ",i);
                }
            }
            System.out.println("");
        }
        
        else
            System.out.printf("El nombre %d és primer.\n",n);*/
        
        boolean estatNoPrimer = true;
        int a = 1;
        
        if (n <= a)
            System.out.println("El nombre no és vàlid.");
        else    {
            for (int i = 2; i < n; i++)    {
                if (n % i == 0) {
                    System.out.printf("El nombre %d NO és primer.\n",n);
                    estatNoPrimer = false;
                    break;
                    }
            }
            if (estatNoPrimer)
            System.out.printf("El nombre %d és primer.\n", n);
        }
        
    }
}

