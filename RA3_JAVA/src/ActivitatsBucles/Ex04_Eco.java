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
public class Ex04_Eco {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriu una frase: ");
        String frase = sc.nextLine();
        
        System.out.print("Quants cops vols repetir-la? ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++)    {
            System.out.printf("%d - %s\n",i,frase);
        }
    }
}
