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
public class Ex_Patro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int F = sc.nextInt();
        int C = sc.nextInt();
        
        int filaIni = sc.nextInt();
        int colIni  = sc.nextInt();
        
        sc.nextLine();
        String sequenciaDesbloqueig = sc.nextLine();
        
        // Creació de la matriu
        char[][] patroDesbloqueig = new char[2*F-1][2*C-1];
                
        // Omplim valors inicials de la matriu
        for (int i = 0; i < patroDesbloqueig.length; i++) {
            for (int j = 0; j < patroDesbloqueig[0].length; j++) {
                if (i % 2 == 1)
                    patroDesbloqueig[i][j] = ' ';
                else {
                    if (j % 2 == 0)
                        patroDesbloqueig[i][j] = '.';
                    else
                        patroDesbloqueig[i][j] = ' ';
                }
            }
        }

        // Posició inicial
        int x = filaIni*2-2, y = colIni*2-2;
        patroDesbloqueig[x][y] = 'O';
        // Recorregut del patró de desbloqueig
        for (int i = 0; i < sequenciaDesbloqueig.length(); i++) {
            switch(sequenciaDesbloqueig.charAt(i)) {
                case '1':
                    if (patroDesbloqueig[x-1][y-1] == ' ' || patroDesbloqueig[x-1][y-1] == '\\')
                        patroDesbloqueig[x-1][y-1] = '\\';
                    else
                        patroDesbloqueig[x-1][y-1] = 'X';                                       
                    x -= 2;
                    y -= 2;
                    break;
                case '2':
                    patroDesbloqueig[x-1][y] = '|';                    
                    x -= 2;
                    break;
                case '3':
                    if (patroDesbloqueig[x-1][y+1] == ' ' || patroDesbloqueig[x-1][y+1] == '/')
                        patroDesbloqueig[x-1][y+1] = '/';
                    else
                        patroDesbloqueig[x-1][y+1] = 'X';
                    x -= 2;
                    y += 2;
                    break;
                case '4':
                    patroDesbloqueig[x][y-1] = '-';                    
                    y -= 2;
                    break;
                case '6':
                    patroDesbloqueig[x][y+1] = '-';                    
                    y += 2;                    
                    break;
                case '7':
                    if (patroDesbloqueig[x+1][y-1] == ' ' || patroDesbloqueig[x+1][y-1] == '/')
                        patroDesbloqueig[x+1][y-1] = '/';
                    else
                        patroDesbloqueig[x+1][y-1] = 'X';                                                                               
                    x += 2;
                    y -= 2;                    
                    break;
                case '8':
                    patroDesbloqueig[x+1][y] = '|';                    
                    x += 2;                    
                    break;
                case '9':
                    if (patroDesbloqueig[x+1][y+1] == ' ' || patroDesbloqueig[x+1][y+1] == '\\')
                        patroDesbloqueig[x+1][y+1] = '\\';
                    else
                        patroDesbloqueig[x+1][y+1] = 'X';                                        
                    x += 2;
                    y += 2;                    
                    break;                    
            }
            patroDesbloqueig[x][y] = 'O';
        }
        
        
        // Mostrem el patró de desbloqueig
        // Primera fila del marc
        System.out.print("+");
        for (int k = 0; k < patroDesbloqueig[0].length; k++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        for (int i = 0; i < patroDesbloqueig.length; i++) {
            System.out.print("|");  // Part esquerra del marc
            for (int j = 0; j < patroDesbloqueig[0].length; j++) {
                System.out.print(patroDesbloqueig[i][j]);
            }
            System.out.println("|");// Part dreta del marc
        }
        // Última fila del marc
        System.out.print("+");
        for (int k = 0; k < patroDesbloqueig[0].length; k++) {
            System.out.print("-");
        }
        System.out.println("+");        
    }
}
