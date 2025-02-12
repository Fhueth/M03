/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsDadesOperadorsEstructura;
import java.util.Locale;
import java.util.Scanner;

public class Ex20_Tetraedre {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        
        double superficie = Math.sqrt(3)*a*a;
        double volum = Math.sqrt(2)/12*a*a*a;
        
        System.out.printf("Superfície: %.2f\n",superficie);
        System.out.printf("Volum: %.2f\n",volum);
    }
}