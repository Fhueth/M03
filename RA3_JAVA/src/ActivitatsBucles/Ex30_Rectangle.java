/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBucles;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Ex30_Rectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int col  = sc.nextInt();
        int fil = sc.nextInt();
        
        for (int x = 1; x <= fil; x++)  {
            for (int y = 1; y <= col; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
