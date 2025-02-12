package ActivitatsBucles;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexp
 */
public class Ex12_NPrimersPrimers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int valorAComprovar = 2;
        int totalValorsPrimers = 0;
        while(totalValorsPrimers < n)    {
            boolean esPrimer = true;
            int i = 2;
            while (esPrimer && i <= Math.sqrt(valorAComprovar)) {
                if (valorAComprovar % i == 0)
                    esPrimer = false;
                i++;
            }
             
            if (esPrimer)   {
                System.out.print(valorAComprovar + " ");
                totalValorsPrimers++;
            }
            valorAComprovar++;
        }
        System.out.println("");
    }
}
