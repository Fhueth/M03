/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsArrays;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Ex_BitlletsMonedes {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quants diners tens? ");
        double diners = sc.nextDouble()*100;
        
        int[] valors = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] quantitats = new int[valors.length];
        
        for (int i = 0; i < quantitats.length; i++) {
            while (diners >= valors[i]) {
                quantitats[i] += 1;
                diners -= valors[i];
            }
        }
        
        for (int i = 0; i < valors.length; i++) {
            if (valors[i] >= 500) 
                System.out.printf("Bitllets de %4d €: %d\n", valors[i]/100,quantitats[i]);
            else if (valors[i] < 500 && valors[i] >= 100) 
                System.out.printf("Monedes  de %4d €: %d\n",valors[i]/100,quantitats[i]);
            else
                System.out.printf("Monedes  de %.2f €: %d\n",(double)valors[i]/100,quantitats[i]);
        }
    }
}

