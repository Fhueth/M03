/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBifurcacions;
import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Ex11_NombresRomans {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueixi un nombre natural entre 1 i 3999: ");
        int n = sc.nextInt();
        System.out.print("En nombre romans és: ");
        //milers
        int mil = n/1000;
        
        if (n < 4000 && n > 0)
        {
            switch (mil)    
            {
                case 3:
                    System.out.print("M");
                case 2:
                    System.out.print("M");
                case 1:
                    System.out.print("M");
            }
            //centenes
            int centenes = (n%1000)/100;
            switch (centenes)
            {
                case 3:
                    System.out.print("C");
                case 2:
                    System.out.print("C");
                case 1:
                    System.out.print("C");
                    break;
                case 4:
                    System.out.print("CD");
                    break;
                case 5:
                    System.out.print("D");
                    break;
                case 6:
                    System.out.print("DC");
                    break;
                case 7:
                    System.out.print("DCC");
                    break;
                case 8:
                    System.out.print("DCCC");
                    break;
                case 9:
                    System.out.print("CM");
                    break;
            }
            //decenes
            int decenes = (n%100)/10;
            switch (decenes)
            {
                case 3:
                    System.out.print("X");
                case 2:
                    System.out.print("X");
                case 1:
                    System.out.print("X");
                    break;
                case 4:
                    System.out.print("XL");
                    break;
                case 5:
                    System.out.print("L");
                    break;
                case 6:
                    System.out.print("LX");
                    break;
                case 7:
                    System.out.print("LXX");
                    break;
                case 8:
                    System.out.print("LXXX");
                    break;
                case 9:
                    System.out.print("XC");
                    break;
            }
            //unitats
            int unitats = n%10;
            switch (unitats)
            {
                case 3:
                    System.out.print("I");
                case 2:
                    System.out.print("I");
                case 1:
                    System.out.println("I");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
            }
        }
        else
        {
            System.out.println("ERROR!");
        }
    }
        
}
