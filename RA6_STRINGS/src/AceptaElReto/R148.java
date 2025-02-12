/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class R148 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String hora;
        while (!(hora = sc.nextLine()).equals("00:00")) {
            int totalMinutsDia = 24*60; 
            int totalMinutsVariableHores = 
                                            Integer.parseInt(hora.substring(0, 2))*60 +
                                            Integer.parseInt(hora.substring(3));
            System.out.println(totalMinutsDia-totalMinutsVariableHores);
        }
        
    }
}
