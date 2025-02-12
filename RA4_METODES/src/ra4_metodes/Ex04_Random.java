/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra4_metodes;
import java.util.Scanner;
/**
 *
 * @author alexp
 */
public class Ex04_Random {
    public static void main(String[] args) {
        System.out.print("Indica el valor inicial i final: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(random(sc.nextInt(), sc.nextInt()));
    }
    static int random(int max, int min) {
        return (int)(Math.random()*(max-min+1)+min);
    }
}
