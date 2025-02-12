/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesBifurcacions;
import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Endevina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Endevina un número [1-100]");
        int valor = sc.nextInt();
        if (valor == 20)    {
            System.out.println("Enhorabona! L'has endevinat");
        }
        else    {
            System.out.println("Ho sento, no l'has endevinat");
        }
    }
}
