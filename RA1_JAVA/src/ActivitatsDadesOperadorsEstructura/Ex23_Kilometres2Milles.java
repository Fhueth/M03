/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsDadesOperadorsEstructura;
import java.util.Scanner;
import java.util.Locale;

public class Ex23_Kilometres2Milles {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float L = sc.nextFloat();
        float m = (float)(L/1.609);
        
        System.out.printf("Milles: %.3f",m);
    }
}