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
public class Ex10_NomCognoms {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueixi el seu nom: ");
        String nom = teclat.nextLine();
        System.out.print("Introdueixi el seu primer cognom: ");
        String cognom1 = teclat.nextLine();
        System.out.print("Introdueixi el seu segon cognom: ");
        String cognom2 = teclat.nextLine();
        System.out.printf("El seu nom complet és: %s %s %s \n", nom, cognom1, cognom2);
    }
}
