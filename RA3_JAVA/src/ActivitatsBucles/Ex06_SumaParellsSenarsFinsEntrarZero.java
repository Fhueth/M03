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
public class Ex06_SumaParellsSenarsFinsEntrarZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long value = 1;
        long sumaParells = 0;
        long sumaSenars = 0;
        
        while (value != 0)  {
            value = sc.nextLong();
            if (value % 2 == 0)
            sumaParells += value;
            else
            sumaSenars += value;
        }
        if (value == 0) {
            System.out.print("");
            
        }
        
        System.out.println("La suma dels parells introduïts és: " + sumaParells);
        System.out.println("La suma dels senars introduïts és : " + sumaSenars);
    }
}