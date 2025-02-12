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
public class Ex19_Hexaedre {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix l'aresta de l'hexaedre: ");
        double a = sc.nextDouble();
        
        System.out.printf("La superfície de l'hexaedre és: %.2f\n",(6*a*a));
        System.out.printf("El volum de l'hexaedre és: %.2f\n",(a*a*a));
    }
}
