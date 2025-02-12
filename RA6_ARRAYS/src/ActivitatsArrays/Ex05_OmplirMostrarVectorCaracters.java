/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsArrays;

/**
 *
 * @author alexp
 */
public class Ex05_OmplirMostrarVectorCaracters {
    public static void main(String[] args) {
        
        char[] caracters = new char[3];    
        for (int i = 0; i < caracters.length; i++) {
            caracters[i] = (char)('a'+1);
            //caracters[i] = (char)(97+i); --> lista ascii                
        }
        for (int i = 0; i < caracters.length; i++) {
            System.out.println("El valor de la posició " + i + "és: " + caracters);
        }
    }
}
