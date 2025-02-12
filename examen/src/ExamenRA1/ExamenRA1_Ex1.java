/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExamenRA1;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class ExamenRA1_Ex1 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int comptadorPrimers = 0;
        for (int i = n+1; i < m; i++) {
            int comptadorNoPrimers = 0;
            for (int j = 2; j < i; j++) {
                if (i%j != 0)
                    comptadorNoPrimers++;
            }
            if (comptadorNoPrimers == i-2)
                comptadorPrimers++;
        }
        System.out.printf("Entre %d i %d hi ha %d primers.\n",n,m,comptadorPrimers);
    }
}
