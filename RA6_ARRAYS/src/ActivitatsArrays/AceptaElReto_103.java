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
public class AceptaElReto_103 {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

      int grau;
      
        while ((grau = sc.nextInt()) < 20) {
            int[] coeficients = new int[grau+1];

            for (int i = 0; i < coeficients.length; i++) {
                coeficients[i] = sc.nextInt();
            }

            int n = sc.nextInt();

            double area = 0.0;
            for (int i = 0; i < n; i++) {
                double altura = 0.0;
                for (int j = 0; j < coeficients.length; j++) {
                    altura += coeficients[j]*Math.pow(1.0/n*i,grau-j);
                }
                area += (1.0/n)*altura;
            }
            if (Math.abs(1-2*area) <= 0.001)
                System.out.println("Justo");
            else if (area > (1-area))
                System.out.println("Cain");
            else
                System.out.println("Abel");
            
        }
      
    }
}
