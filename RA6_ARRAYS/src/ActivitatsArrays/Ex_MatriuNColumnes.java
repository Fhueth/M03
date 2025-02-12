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
public class Ex_MatriuNColumnes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriu el nombre de columnes: ");
        int n = sc.nextInt();
        
        int[][] matriu = new int[4][n];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                int operacio = 0;
                switch (i)  {
                    case 0:
                        operacio = 2*j+2;
                        matriu[i][j] = operacio;
                        break;
                    case 1:
                        operacio = (j+1)*(j+1);
                        matriu[i][j] = operacio;
                        break;
                    case 2:
                        operacio = (2*j+2)-((j+1)*(j+1));
                        matriu[i][j] = operacio;
                        break;
                    default:
                        operacio = (2*j+2)+((j+1)*(j+1))+((2*j+2)-((j+1)*(j+1)));
                        matriu[i][j] = operacio;
                }
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
