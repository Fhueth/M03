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
import java.util.Locale;

public class Ex18_Cilindre  {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        
        double superficie = 2*Math.PI*r*h+2*Math.PI*r*r;
        double volumen = Math.PI*r*r*h;
        System.out.printf("Superfície: %.2f\n",superficie);
        System.out.printf("Volum: %.2f\n",volumen);

    }
}