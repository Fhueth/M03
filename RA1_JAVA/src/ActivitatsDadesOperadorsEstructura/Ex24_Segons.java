/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsDadesOperadorsEstructura;


import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author alexp
 */
public class Ex24_Segons {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        DecimalFormat mF = new DecimalFormat("#,###", symbols);
        long segonsOriginals = sc.nextLong();
        long dies = segonsOriginals/(3600*24);
        short hores = (short)(segonsOriginals%(3600*24)/3600);
        short minuts = (short)((segonsOriginals%(3600*24)%3600)/60);
        short segons = (short)(segonsOriginals%60);
                  
        System.out.printf("%s segons =\n%s dies %d hores %d minuts %d segons\n",mF.format(segonsOriginals),mF.format(dies),hores,minuts,segons);*/
        
        Locale.setDefault(new Locale("es", "ES"));
        Scanner sc = new Scanner(System.in);
        long totalSegons = sc.nextLong();        
        long dies = totalSegons/(3600*24);
        //long segonsRestants = totalSegons - dies*3600*24;
        long segonsRestants = totalSegons % dies*3600*24;
        int hores = (int)(segonsRestants/3600);
        //segonsRestants -= hores*3600 
        segonsRestants %= hores*3600;
       
        int minuts = (int)(segonsRestants/60);
        segonsRestants -= minuts*60;
        
        System.out.printf("%,d segons = %,d dies %d hores %d minuts %d segons"
                            ,totalSegons,dies,hores,minuts,segonsRestants);
    }
}   