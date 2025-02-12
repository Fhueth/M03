/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsStrings;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Ex11_LletraDNI {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix la part numèrica del DNI: ");
        int dni = sc.nextInt();
        
        String lletresDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        System.out.println(dni + "-" + lletresDNI.charAt(dni%23));
    }
}
