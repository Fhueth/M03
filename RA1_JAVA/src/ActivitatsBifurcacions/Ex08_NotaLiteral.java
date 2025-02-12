/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBifurcacions;
import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Ex08_NotaLiteral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix una nota (enter entre 0 i 10: ");
        int a = sc.nextInt();
        
        String nota;
        
        if (a <= 2)
            nota = "Molt deficient";
        else if (a <= 4)
            nota = "Insuficient";
        else if (a <= 5)
            nota = "Suficient";
        else if (a <= 6)
            nota = "Bé";
        else if (a <= 8)
            nota = "Notable";
        else
            nota = "Excel·lent";
        
        System.out.println("El literal de la nota és " + nota);
    }
}
