/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsArrays;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class AceptaElReto_176 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean sortir = false;
        do {
            int comptador = 0;
            int col = sc.nextInt();
            int fil = sc.nextInt();
            if (fil == 0 && col == 0)
                sortir = true;
            
            sc.nextLine();
            //crear array string y emmagatzemar dades
            char[][] tauler = new char[fil][col];
            for (int i = 0; i < fil; i++) {
                    String cadena = sc.nextLine();
                for (int j = 0; j < col; j++)  {
                    tauler[i][j] = cadena.charAt(j);
                }
            }
            
            //comptar mines y caselles
            for (int i = 0; i < fil; i++) {
                for (int j = 0; j < col; j++) {
                    int mines = 0;
                    if (tauler[i][j] == '-') {
                        for (int dx = -1; dx <= 1; dx++) {
                            for (int dy = -1; dy <= 1; dy++) {
                                if ((i+dx) >= 0 && (i+dx) < fil &&
                                   (j+dy) >= 0 && (j+dy) < col &&
                                   tauler[i+dx][j+dy] == '*') 
                                    mines++;
                            }
                        }
                    }
                    if (mines > 5)
                        comptador++;
                }
            }                                                                                                     
            System.out.println(comptador);
        } while (!sortir);
        
    }
}
