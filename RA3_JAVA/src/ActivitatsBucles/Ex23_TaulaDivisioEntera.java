package ActivitatsBucles;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Ex23_TaulaDivisioEntera {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try {
            int n = sc.nextInt();
            if (n < 0)
                n = -n;
            for (int i = 1; i <= 10; i++)   {
                int quocient = n/i;
                int residu = n%i;
                System.out.printf("%d / %d: quocient = %d i residu = %d\n",n,i,quocient,residu);
            }
        }
        catch (java.util.InputMismatchException a) {
            System.out.println("Escriu un nombre natural.");
        }
            
    }
}
