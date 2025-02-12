/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenArrays;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class ExamenArrays_A2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int mida = 5;
        
        char[][] habitacio = new char[mida][mida];
        
        int[][] coordenades = new int[3][2];
        
        //primera part
        for (int i = 0; i < coordenades.length; i++) {
            System.out.println("Escriu les coordenades de la brossa " + (int)(i+1) + ":");
            for (int j = 0; j < coordenades[0].length; j++)
                coordenades[i][j] = sc.nextInt();
        }
        
        System.out.println();
        for (int i = 0; i < habitacio.length; i++) {
            for (int j = 0; j < habitacio[0].length; j++) {
                for (int x = 0; x < coordenades.length; x++) {
                        if (i == coordenades[x][0]-1 && j == coordenades[x][1]-1)   {
                            habitacio[i][j] = 'B';
                            break;
                        }
                        else
                            habitacio[i][j] = 'N';
                }
                System.out.print(habitacio[i][j]);
            }
            System.out.println();            
        }
        
        //segona part
        sc.nextLine();
        System.out.println();
        String sequencia = sc.nextLine();
        char[] sequenciaLletres = sequencia.toCharArray();
        int posX = mida/2; int posY = mida/2;
        habitacio[posX][posY] = 'R';
        for (int i = 0; i < sequenciaLletres.length; i++) {
            if (i != sequenciaLletres.length-1 && sequenciaLletres[i+1] != '*') {
                if (sequenciaLletres[i] == 'e')
                    posY -= 1;
                else if (sequenciaLletres[i] == 'd')
                    posY += 1;
                else if (sequenciaLletres[i] == 'b')
                    posX += 1;
                else if (sequenciaLletres[i] == 'p')
                    posX -= 1;
                else
                    posX += 0;
                    posY += 0;
            }
            habitacio[posX][posY] = 'R';
        }
        
        for (int i = 0; i < habitacio.length; i++) {
            for (int j = 0; j < habitacio[0].length; j++)
                System.out.print(habitacio[i][j]);
            System.out.println();
        }
    }
}
