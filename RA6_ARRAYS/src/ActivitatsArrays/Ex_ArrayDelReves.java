package ActivitatsArrays;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexp
 */
public class Ex_ArrayDelReves {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre: ");
        int quantitat = sc.nextInt();
        
        int[] array = new int[quantitat];
        
        for (int i = 0; i < quantitat; i++) {
            System.out.print("Introdueix un valor: ");
            array[i] = sc.nextInt();
        }
        
        for (int i = quantitat-1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) 
                System.out.print(", ");
            else
                System.out.println(".");
        }
    }
}
