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
public class Ex25_CalculsNotes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean valorValid = true;
        int n = 0;
        int comptadorNotaAritmetica = 0, comptadorNotes = 0;
        int comptadorAprovats = 0, comptadorSuspesos = 0;
        do
        {
            System.out.print("Introdueix una nota [enter entre 0 i 10, o un altre enter per acabar]: ");
            if(sc.hasNextInt()) {
                n = sc.nextInt();
                if (n >= 0 && n <= 10)    {
                    comptadorNotaAritmetica += n;
                    comptadorNotes += 1;
                    valorValid = false;
                    if (n < 5)
                        comptadorSuspesos += 1;
                    else
                        comptadorAprovats += 1;
                }
                else    {
                    valorValid = true;
                }
            } 
            else  {
                valorValid = false;
                System.out.println("Valor invàlid!");
                sc.next();
            }
        }while(valorValid == false);
        
        System.out.printf("La mitjana aritmètica de les notes és: %.2f\n",(double)comptadorNotaAritmetica/comptadorNotes);
        System.out.printf("El percentatge d'aprovats és: %.2f%%\n",(double)comptadorAprovats*100/comptadorNotes);
        System.out.printf("El percentatge de suspesos és: %.2f%%\n",(double)comptadorSuspesos*100/comptadorNotes);   
    }
}
