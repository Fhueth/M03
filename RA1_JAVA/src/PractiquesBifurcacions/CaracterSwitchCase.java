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
public class CaracterSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix una paraula: ");
        
        String paraula = sc.nextLine();
        char caracter = paraula.charAt(0);
        
        switch (caracter)
        {
            case 'a':
                System.out.println("És la vocal a");
                break;
            case 'e':
                System.out.println("És la vocal e");
                break;
            case 'i':
                System.out.println("És la vocal i");
                break;
            case 'o':
                System.out.println("És la vocal o");
                break;
            case 'u':
                System.out.println("És la vocal u");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("És vocal majúscula");
                break;
            default:
                System.out.println("No és una vocal");
                
        }
    }
}
