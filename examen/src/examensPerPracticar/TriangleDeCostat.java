/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examensPerPracticar;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class TriangleDeCostat {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix unn ombre natural més gran que 1: ");
        int n = sc.nextInt();
        
        for (int fila = 1; fila < n; fila++)   {
            for (int col = 1; col <= fila; col++)   {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int fila = n; fila >= 1; fila--)   {
            for (int col = fila; col >= 1; col--)   {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
