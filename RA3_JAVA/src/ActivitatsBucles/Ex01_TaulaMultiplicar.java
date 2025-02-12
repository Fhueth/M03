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
public class Ex01_TaulaMultiplicar  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el número: ");
        int n = sc.nextInt();
        
        System.out.println(n + "x");
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n + "x" + i + " = " + n*i);
        }
    }
}
