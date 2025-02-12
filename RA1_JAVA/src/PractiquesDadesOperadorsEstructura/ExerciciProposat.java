/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesDadesOperadorsEstructura;

import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class ExerciciProposat {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Hores totals: ");
        int totalHores = sc.nextInt();
        int setmanes = totalHores/(24*7);
        int dies = (totalHores - setmanes*7*24)/24;
        int hores = (totalHores - setmanes*7*24 - dies*24);
        System.out.println("Setmanes: " + setmanes);   
        System.out.println("Dies: " + dies);
        System.out.println("Hores: " + hores);*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hores totals: ");
        int totalHores = sc.nextInt();
        int setmanes = totalHores/(24*7);
        int dies = (totalHores % (24*7))/24;
        int hores = (totalHores % 24);
        System.out.println("Setmanes: " + setmanes);   
        System.out.println("Dies: " + dies);
        System.out.println("Hores: " + hores);
        
    }
}
