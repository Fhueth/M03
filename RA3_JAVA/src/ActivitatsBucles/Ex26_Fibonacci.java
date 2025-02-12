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
public class Ex26_Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
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
        System.out.println("");
    }
}
