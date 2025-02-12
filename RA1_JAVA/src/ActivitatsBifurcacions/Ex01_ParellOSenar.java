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
public class Ex01_ParellOSenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre natural: ");
        int valor = sc.nextInt();
        
        if (valor%2 == 0)
        {
            System.out.println("El nombre és parell.");
        }
        else
        {
            System.out.println("El nombre és senar.");
        }
    }
}
