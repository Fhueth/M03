/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesDadesOperadorsEstructura;

/**
 *
 * @author alexp
 */
public class OperadorsAritmetics {
    public static void main(String[] args) {
        int quantitat = 42, delta = 5, residu = 0;
        String nom = "Álex"; 
        
        quantitat += delta;
        System.out.println("quantitat = " + quantitat);
        
        residu = quantitat % 2;
        System.out.println("reidu = " + residu);
        
        quantitat %= 5;
        System.out.println("quantitat = " + quantitat);
        
        residu = --quantitat;
        System.out.println("residu = " + residu);
        
        quantitat = delta++;
        System.out.println("quantitat = " + quantitat);
        
        quantitat = ++delta;
        System.out.println("quantitat = " + quantitat);
        
        quantitat *= delta;
        System.out.println("quantitat = " + quantitat);
        
        quantitat /= 7;
        System.out.println("quantitat = " + quantitat);
        
        System.out.println("bona" + "tarda");
        System.out.println("Hola, em dic " + nom);
        System.out.println("La quantitat és: " + quantitat);
    }
}
