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
public class Examen3_NotacioVariable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix una variable en notació SCREAMING_SNAKE_CASE: ");
        String nomVariable = sc.nextLine().toLowerCase();
        
        String[] paraules = nomVariable.split("_");
        String lCamelCase = paraules[0];
        for (String paraula : paraules) {
            lCamelCase += paraula.substring(0,1).toUpperCase() + paraula.substring(1);
        }
        
        System.out.println("La variable en notació lowerCamelCase és: " + lCamelCase);
        System.out.println("La variable en notació kebab-case és    : " + nomVariable.replace('_', '-'));
    }
}
