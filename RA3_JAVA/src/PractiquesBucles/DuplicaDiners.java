/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesBucles;

/**
 *
 * @author alexp
 */
public class DuplicaDiners {
    public static void main(String[] args) {
        double CI = 100;
        double I = 4;
        int anys = 0;
        double quantitat = CI;
        while (quantitat < 2*CI)   {
            quantitat = quantitat + quantitat*I/100;
            ++anys;
        }
        System.out.printf("Quantitat final: %.2f €\n", quantitat);
        System.out.println("Anys: " + anys);
    }
   
}
