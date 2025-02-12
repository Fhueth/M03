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
public class Ex32_QuadratBuit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        int vora = 0;
        
        //comprovar valor n
        boolean nValid = false;
        boolean nCorrecte = false;
        do  {
            try
            {
                nValid = true;
                n = sc.nextInt();
                if (n >= 2 && n <= 80) {
                    System.out.println("es correcte");
                    break;
                }
                else
                    System.out.println("no es correcte");
            } catch (java.util.InputMismatchException a) {
                System.out.println("Escriu un nombre enter.");
                sc.nextLine();
                nValid = false; 
            }
        } while(nValid == false || nCorrecte == false);
        System.out.println("has sortit del n");
        
        //comprovar vora
        boolean voraValid = false;
        boolean voraCorrecte = false;
        do  {
            try
            {
                voraValid = true;
                vora = sc.nextInt();
                if (vora >= 1 && vora <= n/2) {
                    System.out.println("es correcte");
                    break;
                }
                else
                    System.out.println("no es correcte");
            } catch (java.util.InputMismatchException a) {
                System.out.println("Escriu un nombre enter.");
                sc.nextLine();
                voraValid = false; 
            }
        } while(voraValid == false || voraCorrecte == false);
        
        //caracter
        sc.nextLine();
        char caracter = sc.nextLine().charAt(0);
        
        //fer la part superior del quadrat buit
        for (int fila = 1; fila <= vora; fila++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(caracter);
            }
            System.out.println("");
        }
        
        //fer la part central del quadrat buit
        for (int fila = vora+1; fila <= n-vora; fila++) {
            //fer la vora esquerra
            for (int col = 1; col <= vora; col++) {
                System.out.print(caracter);
            }
            for (int col = vora; col < n-vora; col++) {
                System.out.print(" ");
            }
            for (int col = n-vora+1; col <= n; col++) {
                System.out.print(caracter);
            }
            System.out.println("");
        }
        
        //fer la part inferior del quadrat buit
        for (int fila = 1; fila <= vora; fila++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(caracter);
            }
            System.out.println("");
        }
    }
}
