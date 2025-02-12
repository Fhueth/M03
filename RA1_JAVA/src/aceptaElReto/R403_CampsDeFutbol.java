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
public class R403_CampsDeFutbol {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numCasosProva = sc.nextInt();
        
        for (int i = 0; i < numCasosProva; i++) {
            int m2 = sc.nextInt();
            int campsFutbol = sc.nextInt();
            
            if (m2 >= 90*45*campsFutbol && m2 <= 120*90*campsFutbol)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}
