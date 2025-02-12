/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsArrays;

/**
 *
 * @author alexp
 */
public class Ex03_OmplirMostrarVector {
    public static void main(String[] args) {
        
        final int MIDA = 10;
        
        int[] valors = new int[MIDA];
        
        for (int i = 0; i < MIDA; i++) {
            valors [i] = 100+i;
            System.out.printf("El valor de la posició %d és: %d\n",i,valors[i]);
        }
    }
}
