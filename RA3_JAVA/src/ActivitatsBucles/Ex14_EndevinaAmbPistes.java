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
public class Ex14_EndevinaAmbPistes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final int max = 10;
        
        System.out.println("He pensat un nombre entre 1 i 10. Prova d’endevinar-ho!");
        
        int perAdivinar = (int)(Math.random()*max + 1);
        int comptadorIntents = 1;
        boolean nValid = true;
        do {
            System.out.print("Resposta: ");
            int n = sc.nextInt();
            if (n == perAdivinar)   {
                System.out.println("Correcte!!!");
                System.out.printf("Has necessitat %d intents per endevinar el nombre.\n",comptadorIntents);
                break;
            }
            else    {
                comptadorIntents += 1;
                nValid = false;
                if (n < perAdivinar)
                    System.out.printf("Incorrecte, el nombre és major. Prova de nou:\n");
                else
                    System.out.printf("Incorrecte, el nombre és menor. Prova de nou:\n");
            }
        } while (nValid == false);

    }
}
