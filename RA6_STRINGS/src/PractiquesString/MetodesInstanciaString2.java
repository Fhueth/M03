/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesString;

/**
 *
 * @author alexp
 */
public class MetodesInstanciaString2 {
    public static void main(String[] args) {
        
        String cadena = "aFzios";
        
        System.out.println(cadena.compareToIgnoreCase("AFasfsd"));
        
        String nomComplet = "Alfonso García";
        
        System.out.println(nomComplet.substring(8));
        
        int dia = Integer.parseInt("14");
        System.out.println("Dia: " + ++dia);
        Double.parseDouble(nomComplet);
        Long.parseLong(nomComplet);
        String lletra = String.valueOf('A');
    }
}
