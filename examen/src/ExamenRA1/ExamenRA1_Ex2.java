/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenRA1;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class ExamenRA1_Ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = 2;
        int comptadorZeros = 0, comptadorUns = 0, comptadorZerosVertaders = 0, comptadorUnsVertaders = 0;
        do {
            n = sc.nextInt();
            if (comptadorZeros > 0 && n == 1 || comptadorUns > 0 && n == 0) {
                comptadorUns = 0;
                comptadorZeros = 0;
            }
            if (n == 1) {
                comptadorUns++;
                if (comptadorUns > comptadorUnsVertaders)
                    comptadorUnsVertaders = comptadorUns;
            }
            else if (n == 0) {
                comptadorZeros++;
                if (comptadorZeros > comptadorZerosVertaders)
                    comptadorZerosVertaders = comptadorZeros;
            }
            else if (n != 0 && n != 1) {
                comptadorUns = 0;
                comptadorZeros = 0;
            }
        } while (n != 100);
        System.out.println("Seqüència més llarga de zeros: " + comptadorZerosVertaders);
        System.out.println("Seqüència més llarga d'uns: " + comptadorUnsVertaders);
    }
}