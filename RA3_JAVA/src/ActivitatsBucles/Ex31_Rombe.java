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
public class Ex31_Rombe {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean stateN = false;
        boolean stateException = false;
        do
        {
            try 
            {
                int n = sc.nextInt();
                if (n >= 3 && n <= 79 && n%2 == 1)   {
                    stateException = true;
                    stateN = true;
                    sc.nextLine();
                    char caracter = sc.nextLine().charAt(0);
                    for (int fila = 0; fila < n/2; fila++) { //part superior del rombe
                        for (int col = 0; col < n/2-fila; col++) { //part esquerra
                            System.out.print(" ");
                        }
                        for (int col = n/2-fila; col <= n/2+fila; col++) { //part central
                            System.out.print(caracter);
                        }
                        System.out.println("");
                    }
                    for (int col = 0; col < n; col++) { //part central del rombe
                        System.out.print(caracter);
                    }
                    System.out.println("");
                    for (int fila = n/2-1; fila >= 0; fila--) { //part inferior del rombe
                        for (int col = 0; col < n/2-fila; col++) { //part esquerra
                            System.out.print(" ");
                        }
                        for (int col = n/2-fila; col <= n/2+fila; col++) { //part central
                            System.out.print(caracter);
                        }
                        System.out.println("");
                    }
                }
                else    {
                    System.out.println("La longitud no és correcta.");
                    stateN = false;
                }
            } catch (java.util.InputMismatchException a){
                    System.out.println("Escriu un nombre enter.");
                    sc.nextLine();
                    stateException = false;
            }
        } while (stateN == false || stateException == false);
    }
}
