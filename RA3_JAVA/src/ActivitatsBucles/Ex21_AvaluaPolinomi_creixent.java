package ActivitatsBucles;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author alexp
 */


public class Ex21_AvaluaPolinomi_creixent {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
       
        int grau = sc.nextInt();
        double x = sc.nextDouble();
        double resultat = 0;
       
        for (int i = 0; i <= grau; i++){
            double coeficient = sc.nextDouble();
            resultat += coeficient * Math.pow(x, i);
        }
        
        System.out.printf("El valor del polinomi és: %.3f\n", resultat);
    }
   
}
