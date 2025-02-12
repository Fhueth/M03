/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBifurcacions;
import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Ex07_TresNombresMenor {
    public static void main(String[] args) {
      /*Scanner sc = new Scanner(System.in);
        System.out.print("Digueu un nombre: ");
      int a = sc.nextInt();
      System.out.print("Digueu un altre: ");
      int b = sc.nextInt();
      System.out.print("Digueu un altre: ");
      int c = sc.nextInt();
      
      int menor;
      if (a<=b & a=c)
            menor = a;
      else if (b<=a & b<=c)
            menor = b;
      else
            menor = c;
      
        System.out.println("El més gran és: " + menor);
*/
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      
      int b = sc.nextInt();
      
      int c = sc.nextInt();
      
      int numeroMajor;
      if (a>=b & a>=c)
            numeroMajor = a;
      else if (b>=a & b>=c)
            numeroMajor = b;
      else
            numeroMajor = c;
      
        System.out.println("El més gran és: " + numeroMajor);
                
    }   
}
