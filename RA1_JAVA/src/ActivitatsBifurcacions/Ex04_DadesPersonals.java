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
public class Ex04_DadesPersonals    {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digueu el nom...............................: ");
        String nom = sc.nextLine();
        
        System.out.print("Digueu l'edat...............................: ");
        int edat = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Digueu l'adreça.............................: ");
        String adreca = sc.nextLine();
        //nextInt no quita el salto de linea (el intro)
        
        System.out.print("Digueu el telèfon...........................: ");
        long telefon = sc.nextLong();
        
        System.out.print("Digueu el sexe [Home/Dona]..................: ");
        String sexe = sc.next();
        
        if (sexe.equals ("Dona")) //tipos de variable que empiezan en mayuscula como el String miran direcciones de memoria no contenido, no se puede ==
            sexe = "dona";
        else
            sexe = "home";
        //String sexe =(sexe.equals("Dona"))? "dona" : "home"
        
        String majorMenorEdat;
        if (edat>=18)
            majorMenorEdat = "major d\'edat"; //no hace falta llave si solo hay una instruccion
        else
            majorMenorEdat = "menor d\'edat";
        //String majorMenorEdat = (edat >= 18) ? "major d\'edat" : "menor d\'edat"
        
        
        
        System.out.printf("Em dic %s, tinc %d (%s), sóc %s, la meva adreça és \"%s\" i el meu telèfon és %d\n"
                                ,nom,edat,majorMenorEdat,sexe.toLowerCase(),adreca,telefon);
       
    }
}