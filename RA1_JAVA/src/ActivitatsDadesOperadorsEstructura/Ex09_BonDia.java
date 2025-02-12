/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsDadesOperadorsEstructura;

import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Ex09_BonDia {
    public static void main(String[] args) {
        System.out.println("Bon dia");
        Scanner teclat = new Scanner(System.in);
        System.out.println("Polsa ENTER per acabar...");
        String linia = teclat.nextLine();
        System.out.println("Has escrit: " + linia);
        teclat.close();
    }
}
