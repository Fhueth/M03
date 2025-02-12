/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsDadesOperadorsEstructura;

/**
 *
 * @author alexp
 */



import java.util.Scanner;

public class Ex13_OperacionsEnters {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        /*double A = sc.nextDouble();
        double B = sc.nextDouble();
        double suma = A+B;
        double resta = A-B;
        double mult = A*B;
        double q = A/B;
        double residu = A%B;
        double div = A/B;
        
        System.out.printf("Suma = %d\n",(int)suma);
        System.out.printf("Resta = %d\n",(int)resta);
        System.out.printf("Multiplicació = %d\n",(int)mult);
        System.out.printf("Quocient = %d\n",(int)q);
        System.out.printf("Residu = %d\n",(int)residu);
        System.out.printf("Divisió real = %.3f",div);*/
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        double a = A;
        
        System.out.println("Suma = " + (A+B));
        System.out.println("Resta = " + (A-B));
        System.out.println("Multiplicació = " + (A*B));
        System.out.println("Quocient = " + (A/B));
        System.out.println("Residu = " + (A%B));
        System.out.println("Divisió Real = " + (a/B));
        //System.out.printf("Divisió Real = %.3f\n",(double)A/B)
    }
}