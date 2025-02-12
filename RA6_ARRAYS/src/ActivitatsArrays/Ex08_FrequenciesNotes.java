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
public class Ex08_FrequenciesNotes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        
        //Roberto
        int[] freqNotes = new int [11];
        
        boolean sortir = false;
        while(!sortir)   { 
            System.out.print("Introdueix una nota (de 0 a 10, o un valor diferent per sortir): ");
            int nota = sc.nextInt();
            if (nota >= 0 && nota <= 10)
                freqNotes[nota]++;
            else
                sortir = true;
        }
        for (int i = 0; i < freqNotes.length; i++)
            System.out.printf("La nota %d ha sortit %d vegades\n",i,freqNotes[i]);
    }
}
