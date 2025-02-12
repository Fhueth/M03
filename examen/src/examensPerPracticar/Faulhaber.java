/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examensPerPracticar;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Faulhaber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                    
        int n = -1;
        int p = -1;
        while (n != 0 && p != 0)    {

            System.out.print("Introdueix el valor de n: ");
            n = sc.nextInt();

            System.out.print("Introdueix el valor de p: ");
            p = sc.nextInt();

            long suma = 0;
            for (int i = 1; i <= n; i++)    {
                long potencia = 1;
                for (int j = 0; j < p; j++) {
                    potencia *= i;
                }
                suma += potencia;
            }
            
            /*int suma = 0;
            for (int i = 1; i <= n; i++)   {
                suma += Math.pow(i, p);
            }*/

            System.out.println("Resultat fórmula Faulhaber: " + suma);
        }
    }
}
