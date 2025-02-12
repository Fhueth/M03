/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaElReto;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class R158_Saltos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numCasosProva = sc.nextInt();
        
        for (int i = 0; i < numCasosProva; ++i) {
            int totalMurs = sc.nextInt();
            int comptadorPujades = 0, comptadorBaixades = 0;
            int alcadaMurAnterior = 0;
            
            for (int j = 0; j < totalMurs; ++j) {
                int alcadaMur = sc.nextInt();
                if (j == 0) {
                    alcadaMurAnterior = alcadaMur;
                }else    {
                    if (alcadaMur > alcadaMurAnterior)
                        comptadorPujades++;
                    else if (alcadaMur < alcadaMurAnterior)
                        comptadorBaixades++;
                    
                    alcadaMurAnterior = alcadaMur;
                }
            }
            System.out.printf("%d %d\n",comptadorPujades, comptadorBaixades);
        }
    }
}
