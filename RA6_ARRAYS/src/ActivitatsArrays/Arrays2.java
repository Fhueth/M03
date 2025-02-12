/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsArrays;

/**
 *
 * @author alexp
 */
public class Arrays2 {
    public static void main(String[] args) {
        
        String llistaPaisos = "Espanya França Itàlia Dinamarca";
        
        String[] paisos = new String [4]; //String[] paisos = llistaPaisos.split(","); --> opcion para resolver el ejercicio en vez de todo el código
        int posIni = 0;
        for (int i = 0; i < paisos.length; i++) {
            int posFinal = llistaPaisos.indexOf(" ", posIni);
            paisos[i] = llistaPaisos.substring(posIni, posFinal);
            posIni = posFinal + 1;
        }
        paisos[3] = llistaPaisos.substring(posIni);
        //Mostrar array de països
        for (int i = 0; i < paisos.length; i++) {
            System.out.println(paisos[i]);
        }
    }
}
