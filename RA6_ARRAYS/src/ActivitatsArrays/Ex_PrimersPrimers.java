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
public class Ex_PrimersPrimers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriu un valor: ");
        int quantitat = sc.nextInt();
        
        //bucle per buscar primers primers
        int n = 2;
        int comptadorNoPrimers = 0, comptadorPrimers = 1;
        if (quantitat == comptadorPrimers)
            System.out.println(n + ".");
        else    {
            System.out.print(n + ", ");
            while (comptadorPrimers < quantitat) {
                n += 1;
                for (int i = 2; i < n; i++) {
                    if (n%i != 0)
                        comptadorNoPrimers++;
                }
                if (comptadorNoPrimers == n-2) {
                    comptadorPrimers++;
                    if (comptadorPrimers < quantitat)   {
                        System.out.print(n + ", ");
                        if (comptadorPrimers % 10 == 0) 
                            System.out.println("");
                    }
                    else
                        System.out.print(n + ".\n");
                }

                comptadorNoPrimers = 0;
            }
        }
        
    }
}
