/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsArrays;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Examen2_Mediana {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String valors = sc.nextLine();
        String[] cadena = valors.split(" ");
        
        int[] cadenaValors = new int[cadena.length];
        for (int i = 0; i < cadenaValors.length; i++)
            cadenaValors[i] = Integer.valueOf(cadena[i]);
        
        if (cadenaValors.length%2 != 0) 
            System.out.println("La mediana és: " + cadenaValors[cadena.length/2]);
        else
            System.out.println("La mediana és: " + (double)(cadenaValors[cadena.length/2-1] + cadenaValors[cadena.length/2])/2);
    }
}
