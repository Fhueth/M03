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
public class Ex05_SumaParellsSenarsDesD1FinsN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un número: ");
        int n = sc.nextInt();
        
        int sumaParells = 0;
        int sumaSenars = 0;
        /*for (int i = 2;i <= n; i+=2) {
            sumaParells += i;
        }
        
        for (int i = 1;i <= n; i+=2) {
            sumaSenars += i;
        }*/
        
        for (int i = 1; i <= n; i++)    {
            if (i % 2 == 0)
                sumaParells += i;
            else
                sumaSenars += i;
        }
        
        System.out.println("Suma parells: " + sumaParells);
        System.out.println("Suma senars: " + sumaSenars);
 
    }
    
    
}
