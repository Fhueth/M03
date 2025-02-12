/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsStrings;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Ex12_Menu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean sortir = false;
        do {
            System.out.println("* * * * * * M E N U * * * * * *");
            System.out.println("===============================");
            System.out.println("A - [Ex. 23] Taula divisió entera");
            System.out.println("B - [Ex. 26] Fibonacci");
            System.out.println("C - [Ex. 01] Compta vocals");
            System.out.println("X - SORTIR");
            
            System.out.print("Tria una opció: ");
            String opcio = sc.nextLine();
            System.out.println("");
            
            switch(opcio.toUpperCase()) {
                case "A":
                    System.out.println("Taula de divisió entera");
                    System.out.println("=======================");
                    try {
                        System.out.print("Introdueix un nombre natural: ");
                        int n = sc.nextInt();
                        if (n < 0)
                            n = -n;
                        for (int i = 1; i <= 10; i++)   {
                            int quocient = n/i;
                            int residu = n%i;
                            System.out.printf("%d / %d: quocient = %d i residu = %d\n",n,i,quocient,residu);
                        }
                    }
                    catch (java.util.InputMismatchException a) {
                        System.out.println("Escriu un nombre natural.");
                    }
                    System.out.println("");
                    break;
                case "B":
                    System.out.println("Fibonacci");
                    System.out.println("=======================");
                    System.out.print("Introdueix un nombre natural: ");
                    int n = sc.nextInt();
                    int valorsTotal = 2;
                    int valorAnterior = 1, valorActual = 1;

                    System.out.print(valorAnterior + " ");
                    System.out.print(valorActual + " ");

                    while (valorsTotal < n) {
                        int aux = valorAnterior;
                        valorAnterior = valorActual;
                        valorActual += aux;

                        System.out.print(valorActual + " ");
                        valorsTotal++;
                    }
                    System.out.println("\n");
                    break;
                case "C":  
                    System.out.println("Compta vocals");
                    System.out.println("=======================");
                    System.out.print("Introdueix una frase: ");
                    String frase = sc.nextLine().toLowerCase();
                    String vocals = "aeiouéíóúàèòïü";
                    int comptadorVocals = 0;
                    for (int i = 0; i < frase.length(); i++) {
                        for (int j = 0; j < vocals.length(); j++) {
                            if (frase.charAt(i) == vocals.charAt(j)) {
                                comptadorVocals++;
                                break;
                            }
                        }
                    }
                    System.out.println("La frase conté " + comptadorVocals + " vocals.");
                    System.out.println("");
                    break;
                case "X":
                    sortir = true;
                    System.out.println("");
                    break;
                default:
                    System.out.println("\nOpció Incorrecte!\n");;
            }
        } while(!sortir);
    }
}
