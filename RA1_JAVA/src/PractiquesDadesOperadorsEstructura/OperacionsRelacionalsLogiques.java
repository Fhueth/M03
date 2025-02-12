/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesDadesOperadorsEstructura;

/**
 *
 * @author alexp
 */
public class OperacionsRelacionalsLogiques {
    public static void main(String[] args) {
        int quantitat = 42, delta = 7, residu = 0;
        System.out.println("quantitat == " + quantitat);
        System.out.println("quantitat < 20: " + (quantitat < 20));
        System.out.println("quantitat != delta: " + (quantitat != delta));
        System.out.println("delta >= residu: " + (delta >= residu));
        System.out.println("quantitat & delta: " + (quantitat & delta));
        System.out.println("quantitat | delta: " + (quantitat | delta));
        System.out.println("quantitat << 1: " + (quantitat << 1));
        System.out.println("quantitat >> 2: " + (quantitat >> 2));
        boolean resultat = false;
        System.out.println("!resultat: " + !resultat);
        System.out.println("quantitat > 30 || delta == 0: " + (quantitat > 30 || delta == 0));

    }
}
