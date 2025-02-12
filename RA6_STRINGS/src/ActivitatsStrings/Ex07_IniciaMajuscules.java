package ActivitatsStrings;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexp
 */
public class Ex07_IniciaMajuscules  {
    public static void main(String[] args) {
        System.out.println("Introdueix una frase:");
        Scanner sc = new Scanner(System.in);
       /* String paraula;
        String fraseSortida = "";
       while((paraula = sc.next()).length()>0){
            String novaParaula = (Character.toUpperCase(paraula.charAt(0))+ paraula.substring(1));
            if(fraseSortida.length() > 0)
                fraseSortida += (" "+novaParaula);
            else
                fraseSortida = novaParaula;
            System.out.println(fraseSortida);
        }*/
       /* String linia = sc.nextLine();
        String fraseResultat = "";
        for (int i = 0; i < linia.length(); i++) {
            if(i == 0 || linia.charAt(i-1) == ' '){
              fraseResultat += Character.toUpperCase(linia.charAt(i));
            }
            else{
                fraseResultat += linia.charAt(i);
            }
        }
        System.out.println(fraseResultat);
        */
        String linia = sc.nextLine();
        String fraseResultat = "";
       
        int index = 0, pos = 0;
       
        while((index = linia.indexOf(" ",pos))!=-1){
            index = linia.indexOf(" ",pos);
            fraseResultat +=Character.toUpperCase(linia.charAt(pos))+linia.substring(pos+1, index+1);
            pos = index+1;
        }
        fraseResultat += Character.toUpperCase(linia.charAt(pos))+linia.substring(pos+1);
        System.out.println(fraseResultat);
    }
}

