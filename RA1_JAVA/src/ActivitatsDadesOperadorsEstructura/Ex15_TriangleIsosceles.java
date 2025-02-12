/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsDadesOperadorsEstructura;

/**
 *
 * @author alexp
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex15_TriangleIsosceles  {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
   
        double alçada = sc.nextDouble();
        double amplada = sc.nextDouble();
        double hipotenusa = Math.sqrt(alçada*alçada+(amplada/2)*(amplada/2));
        double perimetre = amplada+hipotenusa*2;
        double superficie = (alçada*amplada)/2;
        System.out.printf("Perímetre: %.2f\n",perimetre);        
        System.out.printf("Superfície: %.2f\n",superficie);


    }
}