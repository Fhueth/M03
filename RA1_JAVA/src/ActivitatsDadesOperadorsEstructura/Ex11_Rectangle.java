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

public class Ex11_Rectangle {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix l'alçada (en metres): ");
        double alçada = sc.nextDouble();

        System.out.print("Introdueix l'amplada (en metres): ");
        double amplada = sc.nextDouble();
        
        double perímetre = 2*alçada+2*amplada;
        double superfície = alçada*amplada;
        
        System.out.printf("El perímetre del rectangle és: %.2f m \n", perímetre);
        System.out.printf("La superfície del rectangle és: %.2f m2 \n", superfície);
    }
}
