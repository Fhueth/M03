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
public class Ex05_DosNombresCreixents {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        int b = sc.nextInt();
        
        if (a>b)
            System.out.printf("Els teus nombres en ordre creixent són: %d, %d",a,b);
        else
            System.out.printf("Els teus nombres en ordre creixent són: %d, %d",b,a);
    }
}
    
