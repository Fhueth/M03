/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsStrings;

import java.util.Scanner;

/**
 *
 * @author alexp
 */

public class DemanaLaData {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String data = "";
        int dia = 0, mes = 0, any = 0;
        int hora = 0, minuts = 0;
        boolean entradaCorrecta = false;
        while (!entradaCorrecta) {
            try {
                System.out.print("Introdueix la data [dd/mm/aaaa hh:MM]: ");
                data = sc.nextLine();

                int posBarra1 = data.indexOf("/");
                System.out.println("Index /: " + posBarra1);
                dia = Integer.parseInt(data.substring(0,2));
                int posBarra2 = data.indexOf("/", posBarra1 + 1);
                mes = Integer.parseInt(data.substring(3,5));
                int posEspai = data.indexOf(' ', posBarra2+1);
                any = Integer.parseInt(data.substring(6,10));

                int posDosPunts = data.indexOf(':', posEspai+1);
                hora = Integer.parseInt(data.substring(posEspai+1, posDosPunts));
                minuts = Integer.parseInt(data.substring(posDosPunts+1));
                entradaCorrecta = true;
            } catch (Exception e)   {
                System.out.println("El format d'entrada no és correcete!");
            }
            System.out.println("Dia: " + dia);
            System.out.println("Mes: " + mes);
            System.out.println("Any: " + any);
            System.out.println("Hora: " + hora);
            System.out.println("Minuts: " + minuts);
        }

    }
}
