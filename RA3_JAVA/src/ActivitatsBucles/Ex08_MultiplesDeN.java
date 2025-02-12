/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBucles;
/**
 *
 * @author alexp
 */

/*
Fes un programa que ens mostri per pantalla els múltiples de 5 majors que 1 i menors que 100.
Definiu el 5 i el 100 com a constants! Per exemple: N i MAX, respectivament)
*/
public class Ex08_MultiplesDeN {
    public static void main(String[] args) {
                
        final int n = 5;
        final int max = 100;
        System.out.println("Els múltiples de 5 majors que 1 i menors que 100 són: ");
        for (int i =  1; i < max;  i++)  {
            if (i % 5 == 0) {
                System.out.print(i+" ");
            }
        }
        
    }
}
