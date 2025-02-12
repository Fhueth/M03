/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBifurcacions;

import java.util.Scanner;

public class Ex10_DiaSetmana    {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        int dia = sc.nextInt();
        
        String diaSetmana = "dilluns";
        
        switch (dia)
        {
            case 1:
                diaSetmana = "dilluns";
                break;
            case 2:
                diaSetmana = "dimarts";
                break;
            case 3:
                diaSetmana = "dimecres";
                break;
            case 4:
                diaSetmana = "dijous";
                break;
            case 5:
                diaSetmana = "divendres";
                break;
            case 6:
                diaSetmana = "dissabte";
                break;
            case 7:
                diaSetmana = "diumenge";
                break;
            default:
                diaSetmana = "incorrecte";
            
        }
        
        System.out.println("El dia de la setmana és: " + diaSetmana + ".");
    }
}
