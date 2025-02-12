/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesString;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Enumeracions {
    public static void main(String[] args) {
        
        enum diaSetmana {DILLUNS, DIMARTS, DIMECRES, DIJOUS, DIVENDRES, DISSABTE, DIUMENGE};
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix el dia de la setmana: ");
        int dia = sc.nextInt();
        
        if (dia == 1 || dia == 18)
            System.out.println("");
        else
            System.out.println("");
    }
}
