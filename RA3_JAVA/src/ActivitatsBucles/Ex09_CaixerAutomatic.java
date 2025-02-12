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
public class Ex09_CaixerAutomatic {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final int pinCorrecte = 1234;
        int pinIntroduit = 1;
        
        int comptadorIntents = 0;
        
        while (comptadorIntents <= 2) {
            pinIntroduit = sc.nextInt();
            comptadorIntents++;
            if (comptadorIntents > 2 && pinIntroduit == pinCorrecte)
                System.out.println("PIN CORRECTE. SELECCIONI L'OPERACIÓ A REALITZAR ...");
            else if (comptadorIntents > 2)
                System.out.println("HA ARRIBAT AL NOMBRE MÀXIM D'INTENTS. TARGETA RETINGUDA.\n" + "POSI'S EN CONTACTE AMB EL PERSONAL DE L'OFICINA.");
            else if (pinIntroduit != pinCorrecte)
                System.out.println("PIN INCORRECTE. PROVA DE NOU.");
            else if (pinIntroduit == pinCorrecte)   {
                System.out.println("PIN CORRECTE. SELECCIONI L'OPERACIÓ A REALITZAR ...");  
                break;    
            }
        }
    }
}
