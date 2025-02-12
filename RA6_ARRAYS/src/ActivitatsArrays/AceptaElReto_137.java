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
public class AceptaElReto_137 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // especificar quantitat barcs
        System.out.print("Quants barcs hi ha? ");
        int numBarcs = sc.nextInt();
        boolean existe = false;
        
        //especificar tamany barcs
        System.out.print("Quin tamany tenen? ");
        int max = 0;
        int[] mesures = new int[numBarcs];
        for (int mesura : mesures)  {
            mesura = sc.nextInt();
            if (mesura > max)
                max = mesura;
        }
        
        //especificar tamany tauler
        System.out.print("Quin és el tamany del tauler? ");
        int tamanyTauler = sc.nextInt();
        
        //especificar tauler
        int[][] tauler = new int[tamanyTauler][tamanyTauler];
        System.out.println("Indica el tauler: ");
        for (int i = 0; i < tamanyTauler; i++) {
            for (int j = 0; j < tamanyTauler; j++)
                tauler[i][j] = sc.nextInt();
            System.out.println();
        }
        
        //programa
        for (int i= 0; i < tauler.length; i++) {
            int comptador = 0;
            for (int j = 0; j < tauler[0].length; j++) {
                if (tauler[i][j] == 1) {
                    for (int k = 0; k < max; k++) {
                        if (tauler[i][j+k-1] == 1)
                            comptador++;
                        else    {
                            for (int mesura: mesures) {
                                if (mesura == comptador) {
                                    mesura = -1;
                                    existe = true;
                                    comptador = 0;
                                }
                            }
                        }
                    }
                }
            }
 
        }
        
//        for (int mesura : mesures) {
//            if (mesura != -1) {
//                existe = false;
//            }
//        }
        if (existe)
            System.out.println("SI");
        else
            System.out.println("NO");
        
    }
}
