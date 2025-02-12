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
public class ComparativaEdats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la teva edat: ");
        int edat = sc.nextInt();
        
        if (edat<10)
        {
            System.out.println("Ets un nen");
        }
        else if (edat<20)
        {
            System.out.println("Ets un adolescent");
        }
        else if (edat<70)
        {
            System.out.println("Ets un adult");
        }
        else
        {
            System.out.println("No et preocupis, encara ets jove!");
        }
    }
}
