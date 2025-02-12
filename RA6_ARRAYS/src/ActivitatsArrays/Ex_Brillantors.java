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
public class Ex_Brillantors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix deu valosr entre 0 i 9: ");
        
        //create int array
        int[] brillantors = new int[10];
        int[] freq = new int[10];
        int index = 0;
        int sumaValors = 0;
        do {
            brillantors[index] = sc.nextInt();
            if (brillantors[index] <= 9 && brillantors[index] >= 0) {
                sumaValors += brillantors[index];
                freq[brillantors[index]]++;
                index += 1;
            }
        } while (index <= 9);
        double mitja = sumaValors/10.0;
        System.out.printf("Brillantor mitja: %.2f\n",mitja);

                
        int valor = 0;
        index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > valor)   {
                valor = freq[i];
                index = i;
            }
        }
        System.out.printf("El valor més freqüent de brillantor és %d que apareix %d vegades.\n",index,valor);
        
        double sumaQuadrats = 0;
        for (int brillantor : brillantors) {
            sumaQuadrats += Math.pow(brillantor - mitja, 2);
        }
        double desviacioTipica = Math.sqrt(sumaQuadrats / 10);
        System.out.printf("Desviació típica: %.2f\n", desviacioTipica);
    }
}
