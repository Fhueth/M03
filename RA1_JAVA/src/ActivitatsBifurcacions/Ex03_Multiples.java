/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBifurcacions;
import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Ex03_Multiples {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.print("Introdueixi un nombre natural: ");
        
        int m = sc.nextInt();
        System.out.print("Introdueixi un altre nombre natural: ");
        
        if (n%m == 0)
            System.out.printf("El %d és múltiple de %d.",n,m);
        else if (m%n == 0)
            System.out.printf("El %d és múltiple de %d.",m,n);
        else
            System.out.println("Cap d'ells és múltiple de l'altre.");
    }
}
