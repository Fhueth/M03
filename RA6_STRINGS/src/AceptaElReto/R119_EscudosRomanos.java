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
public class R119_EscudosRomanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalLegionaris;
        while ((totalLegionaris = sc.nextInt()) > 0) {
                int totalEscuts = 0;
                while (totalLegionaris > 0) {
                    int costatFormacio = (int)Math.sqrt(totalLegionaris);
                    //totalEscuts = costatFormacio*costatFormacio+4*costatFormacio;
                    totalEscuts += costatFormacio*(costatFormacio+4);
                    totalLegionaris -= costatFormacio * costatFormacio;
            }
            System.out.println(totalEscuts);
        }
    }
}
