/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaElReto;
import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class R155_perimetreRectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean value = true;
        do  {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long perimetre = x*2+y*2;

            if (x >= 0 && y >= 0)
                System.out.println(perimetre);
            else
                value = false;
        }while(value);
    }
}
