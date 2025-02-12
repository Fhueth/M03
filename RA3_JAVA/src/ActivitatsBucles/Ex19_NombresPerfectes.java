/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBucles;

public class Ex19_NombresPerfectes  {
    public static void main (String[] args) {
        
        final int mil = 1000;
        
        System.out.println("Els nombres perfectes menors que 1000 són:");
        
        for (int i = 1; i < mil; i++) {
            int sumaValors = 0;
            
            for (int j = 1; j < i; j++) {
                if (i%j == 0)
                    sumaValors += j;
            }
            
            if (sumaValors == i)
                System.out.print(i + " ");
        }
        
        System.out.println("");
    }
}