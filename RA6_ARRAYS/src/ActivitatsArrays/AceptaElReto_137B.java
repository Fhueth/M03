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
public class AceptaElReto_137B {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // especificar quantitat barcs
        System.out.print("Quants barcs hi ha? ");
        int numBarcs = sc.nextInt();
        
        //especificar tamany barcs
        System.out.print("Quin tamany tenen? ");
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sumaBarcs = 0;
        int[] mesures = new int[numBarcs];
        for (int mesura : mesures)  {
            mesura = sc.nextInt();
            sumaBarcs += mesura;
            if (mesura > max)
                max = mesura;
            if (mesura < min)
                min = mesura;
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
        boolean valid = true;
        int comptadorBarcs = 0;
        int comptadorUns = 0;
        for (int i= 0; i < tauler.length; i++) {
            comptadorBarcs = 0;
            for (int j = 0; j < tauler[0].length; j++) {
                if (tauler[i][j] == 1) {
                    comptadorBarcs++;
                    comptadorUns++;
                    int comptadorUnsAlVoltant = 0;
                    if (comptadorBarcs > max)   {
                        valid = false;
                        break;
                    }
                    for (int df = 0; df <= 1; df++) {
                        for (int dc = -1; dc < 1; dc += 1) {
                            if (i+df < tauler.length && j+dc > 0 || j+dc < tauler[0].length && tauler[i+df][j+dc] == 1)
                                comptadorUnsAlVoltant++;
                            else if (i+df > tauler.length && j+dc > 0 || j+dc < tauler[0].length && tauler[i][j+dc] == 1)
                                comptadorUnsAlVoltant++;
                            else if (i+df < tauler.length && j+dc < 0 || j+dc > tauler[0].length && tauler[i+df][j] == 1)
                                comptadorUnsAlVoltant++;
                        }
                    }
                    if (comptadorUnsAlVoltant > 2) {
                        valid = false;
                        break;
                    }
                    
                }
                else
                    comptadorBarcs = 0;
            }
            if (!valid || comptadorUns > sumaBarcs)    {
                System.out.println("NO");
                break;                
            }
            
        }
        if (valid)
            System.out.println("SI");
    }
}
