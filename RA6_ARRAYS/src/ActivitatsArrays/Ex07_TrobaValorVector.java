/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsArrays;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Ex07_TrobaValorVector {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre natural: ");
        int quantitat = sc.nextInt();
       
        System.out.printf("Introdueix una llista de %d nombres separats per espais: ", quantitat);
        int[] valors = new int[quantitat];
        for (int i = 0; i < quantitat; i++) {
            valors[i] = sc.nextInt();
        }
//        for (int valor : valors)
//            System.out.println("valor: " + valor);   
        
        System.out.print("Valor a trobar: ");
        int valorATrobar = sc.nextInt();
        boolean trobat = false;
        
        //for del Roberto
/*          for (int valor : valors) {
              if (valor == valor) {
                  trobat = true;
                  break;
            }
        }
        for (int i = 0; i < quantitat; i++) {
            if (valors[i] == valorATrobar) {
                System.out.println( valorATrobar + " trobat a la posició " + i);
                trobat = true;
            }
        }
        
        if (!trobat) {
            System.out.println("No s'ha trobat el valor " + valorATrobar);
        }
*/        
        
        //for mío
        for (int i = 0; i < quantitat; i++) {
            if (valorATrobar == valors[i]) {
                System.out.printf("%d trobat a la posició %d\n",valorATrobar,i);
                trobat = true;
            } else if (i == quantitat-1 && !trobat)
                System.out.println("No s'ha trobat el valor " + valorATrobar);
      }
    }
}
