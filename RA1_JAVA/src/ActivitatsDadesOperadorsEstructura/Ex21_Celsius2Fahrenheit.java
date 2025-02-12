/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsDadesOperadorsEstructura;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Ex21_Celsius2Fahrenheit {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix temperatura en graus Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = 9.0/5*celsius+32;
        System.out.printf("La temperatura en graus Fahrenheit és: %.2f\n",fahrenheit);
    }
}