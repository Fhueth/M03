/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBucles;
import java.util.Scanner;
/**
 *
 * @author alexp
 */

/*
Fes un programa que ens demani un nombre natural (n) per teclat i, 
en el cas que sigui menor que 100 que el torni a demanar tantes 
vegades com calgui fins que sigui major o igual a 100.
*/
public class Ex07_MenorQue100 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = 1;
        
        while (n < 100) {
            n = sc.nextInt();
            if (n >= 100)
            System.out.println(n);
        }
    }
 
}
