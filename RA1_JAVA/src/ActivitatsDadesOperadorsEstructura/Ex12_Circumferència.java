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

public class Ex12_Circumferència {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix el radi de la circumferència (en metres): ");
        double r = sc.nextDouble();
        
        double longitud = 2*Math.PI*r;
        double area = Math.PI*r*r;
        double volum = (4.0/3.0)*Math.PI*r*r*r;
        
        System.out.printf("La seva longitud és: %.3f\n", longitud);
        System.out.printf("L'àrea del cercle és: %.3f\n", area);
        System.out.printf("El volum de l'esfera és: %.3f\n", volum);
        
    }
}