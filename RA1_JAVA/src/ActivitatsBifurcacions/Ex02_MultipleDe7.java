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
public class Ex02_MultipleDe7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre natural: ");
        int n = sc.nextInt();
        
        if (n%7==0)
        {
            System.out.println("El nombre és múltiple de 7.");
        }
        else
        {
            System.out.println("El nombre no és múltiple de 7.");
        }
    }
}
