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
public class Ex29_Quadrat {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //charat() --> examen        
        boolean valueN = false;
        boolean valueNString = true;
        boolean newValueN = false;
        boolean caracterValue = false;
        int n = 1;
        
        String caracter = "";
        do
        {
            try {
                while (valueN == false && caracterValue == false)
                {
                    valueNString = true;
                    if (newValueN == false) {
                        n = sc.nextInt();
                        sc.nextLine();
                    }
                    if (n >= 2 && n <= 80)  {
                        newValueN = true;
                        valueN = true;
                        caracter = sc.nextLine();
                        if (caracter.length() != 1) {
                            System.out.println("El caràcter ha de tenir longitud 1.");
                            caracterValue = false;
                            valueN = false;
                        }
                        else    {
                            caracterValue = true;
                            for (int fila = 1; fila <= n; fila++) {
                                for (int col = 1; col <= n; col++) {
                                    System.out.print(caracter);
                                }
                                System.out.println("");
                            }
                        }
                    }
                    else    {
                        System.out.println("Introdueix un nombre enter.");
                        valueN = false;
                    }
                }
            } catch (java.util.InputMismatchException a) {
                System.out.println("La longitud no és correcta.");
                sc.nextLine();
                valueNString = false;
            }
        }while (valueNString == false);
    
    }
}
