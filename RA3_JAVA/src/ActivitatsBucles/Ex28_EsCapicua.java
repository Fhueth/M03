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
public class Ex28_EsCapicua {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int valor = sc.nextInt();
        int valorOriginal = valor;
        int invertit = 0;
        do {
            int digit = valor % 10;
            invertit = invertit*10 + digit;
            valor = valor/10;
        } while(valor != 0);
        if (invertit == valorOriginal)
            System.out.println("El nombre " + valorOriginal + " és capicua.");
        else
            System.out.println("El nombre " + valorOriginal + " no és capicua.");
    }
}
