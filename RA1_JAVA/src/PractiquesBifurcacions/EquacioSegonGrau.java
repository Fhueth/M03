/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesBifurcacions;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class EquacioSegonGrau  {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Introdueix els coeficients de l'equació de segon grau");
        
        Scanner valores = new Scanner(System.in);
        System.out.print("a = ");
        double a = valores.nextDouble();
        System.out.print("b = ");
        double b = valores.nextDouble();        
        System.out.print("c = ");
        double c = valores.nextDouble();
        
        /*System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);*/
       
       double discriminant = b*b-4*a*c;
       if (discriminant > 0)
       {
            double x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("El primer valor d'x és x1 = " + x1);

            double x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("El segon valor d'x és x2 = " + x2);
        }
       else if (discriminant == 0)
       {
           System.out.println("Només té una solució. " + (-b/2*a));
       }
       else 
       {
           System.out.println("No existeix solució");
       }
    }
}