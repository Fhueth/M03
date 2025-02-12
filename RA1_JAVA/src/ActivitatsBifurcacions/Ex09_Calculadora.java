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
public class Ex09_Calculadora {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un número:");
        int a = sc.nextInt();
        
        System.out.print("Introdueix un altre:");
        int b = sc.nextInt();
        
        System.out.print("Introdueix una operació (+,-,*,/): ");
        String operacio = sc.next();
        //char operacio = sc.next().charAt(0); 
        int resultat = 0;
        boolean operacioCorrecta = true;
        switch (operacio)
        {
            case "+": //si es un char se cambian las " por '
                resultat = a + b;
                break;
            case "-":
                resultat = a - b;
                break;
            case "*":
                resultat = a * b;
                break;
            case "/":
                resultat = a / b;
                break;
            default:
                operacioCorrecta = false;
        }
        /*if (operacio == '+')
            resultat = a + b;
        else if (operacio == '-')
            resultat = a - b;
        else if (operacio == '*')
            resultat = a * b;
        else (operacio == '/')
            resultat = a / b;
        */
        if (operacioCorrecta)
            System.out.printf("El resultat de l'operació és: %d %s %d = %d\n",a,operacio,b,resultat);
        else
            System.out.println("Operació Incorrecta");
    }
}
