/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesBucles;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class HasNextInt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriu un enter: ");
        
        if (sc.hasNextInt())    {
            int valor = sc.nextInt();
            System.out.println("Valor = " + valor);
        }
        else
            System.out.println("Valor no vàlid!");
    }
}
