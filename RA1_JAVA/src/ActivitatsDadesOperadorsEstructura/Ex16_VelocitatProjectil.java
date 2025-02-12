/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsDadesOperadorsEstructura;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Ex16_VelocitatProjectil {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quin espai ha recorregut el projectil (en km)? ");
        double espai = sc.nextDouble();
        
        System.out.print("Quant temps ha trigat (en segons)? ");
        double temps = sc.nextDouble();
        
        double vel = (espai/temps)*1000;
        System.out.printf("La velocitat del projectil ha estat: %.2f m/s \n ",vel);
    }
}
