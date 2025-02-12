/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBucles;
/**
 * Fes un programa que ens demani un nombre natural 
 * n i ens escrigui tots els seus divisors.
*/
import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Ex18_Divisors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n/i)
                    System.out.print(n/i + " ");
            }
        }
        System.out.println("");
/*        
        if (n > 0) {
            System.out.print("Els divisors de " + n + " són: ");

           
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");

                   
                    if (i != n / i) {
                        System.out.print(n / i + " ");
                    }
                }
            }
        } 
        
        else {
            //System.out.println("Si us plau, introdueix un nombre natural positiu.");
        }
*/
    }
}
