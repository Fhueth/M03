/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBucles;
import java.util.Scanner;

/*
Fes un programa que demani nombres enters per teclat, fins que entrem 
un zero, i ens respongui quin és el màxim i quin és el mínim.
*/
/**
 *
 * @author alexp
 */
public class Ex10_MaximMinim {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long value = 1;
        long maxim = Long.MIN_VALUE;
        long minim = Long.MAX_VALUE;
        while (value != 0)  {
            value = sc.nextLong();
            if (value > maxim && value != 0)
                maxim = value;
            if (value < minim && value != 0)
                minim = value;
            if (value == 0)
                break;
        }
        System.out.println("Mínim: " + minim);
        System.out.println("Màxim: " + maxim);
        
    }
}
