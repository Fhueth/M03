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
public class Ex12_AnyDeTraspas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int any = sc.nextInt();

        //NOT (NOT A) = A
        //NOT (A AND B) = NOT A OR NOT B
        //NOT (A OR B) = NOT A AND NOT B
        
        //if (any % 4 == 0 && (any % 100 != 0 || any % 300 == 0)
        if (any % 4 == 0 && !(any % 100 == 0 && any % 400 != 0))
            System.out.printf("L'any %d és de traspàs\n",any);
        else
            System.out.printf("L'any %d no és de traspàs\n",any);
    }
}   
