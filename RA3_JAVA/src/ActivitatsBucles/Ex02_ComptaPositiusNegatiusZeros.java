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
public class Ex02_ComptaPositiusNegatiusZeros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introdueix 10 nombres enters:");
        
        int comptadorPositius = 0;
        int comptadorNegatius = 0;
        int comptadorZeros = 0;
        for (int i = 0; i <= 9; i++)    
        {
            System.out.printf("Nombre %d = ",i);
            int n = sc.nextInt();
            
            if (n > 0)
                comptadorPositius++;
            else if (n < 0)
                comptadorNegatius++;
            else if (n == 0)
                comptadorZeros++;
        }
        
        System.out.println("Entre els valors que has introduit hi ha:");
        System.out.printf("%d nombre/s positiu/s",comptadorPositius);
        System.out.printf("%d nombre/s negatius/s",comptadorNegatius);
        System.out.printf("%d nombre/s zero (0)",comptadorZeros);
    }
}
