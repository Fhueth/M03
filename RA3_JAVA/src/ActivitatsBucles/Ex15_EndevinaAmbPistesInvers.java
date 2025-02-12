/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBucles;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Ex15_EndevinaAmbPistesInvers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int max = 10;
        int min = 1;
        
        System.out.println("He pensat un nombre entre 1 i 10. Prova d’endevinar-ho!");
        
        boolean nValid = true;
        do {
            int n = (int)(Math.random()*(max-min+1) + min);
            System.out.printf("És el %d? Massa (a)lt, massa (b)aix o (c)orrecte? ",n);
            char abc = sc.nextLine().charAt(0);
            switch (abc) {
                case 'a':
                    nValid = false;
                    max = n - 1;
                    break;
                case 'b':
                    nValid = false;
                    min = n + 1;
                    break;
                case 'c':
                    System.out.println("Genial!!! Sóc el millor endevinador del món!!!");
                    nValid = true;
                    break;
                default:
                    System.out.println("Escriu a, b o c.");;
            }
        } while (nValid == false);
    }
}
