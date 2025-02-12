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
public class Ex09_Capicua {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre natural: ");
        int n = sc.nextInt();
        
        System.out.printf("El nombre %d té %d xifres.\n",n,(int)(Math.log10(n)+1));
        //Creació array
        int[] nToArray = new int[(int)(Math.log10(n)+1)];
        for (int i = 0; i < nToArray.length; i++)   {
            nToArray[i] = ((int)(n/Math.pow(10,nToArray.length-(i+1))))%10;
            System.out.printf("Xifra %d: %d\n",i+1, nToArray[i]);
        }
        

        
        //Comprovació i declaració capicua
        boolean iguals = true;
        for (int i = 0; i < nToArray.length; i++) {
            if (nToArray[i] != nToArray[nToArray.length-(i+1)]){
                iguals = false;
                System.out.println("El teu nombre NO és capicua.");
                break;
            }
        }
        if (iguals)
            System.out.println("El teu nombre és capicua.");
    }
}
