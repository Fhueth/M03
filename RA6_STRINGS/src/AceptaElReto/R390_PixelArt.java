/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class R390_PixelArt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int totalLinies = sc.nextInt();
        
        for (int i = 0; i < totalLinies; i++) {
            int magenta = sc.nextInt(), groc = sc.nextInt(), cyan = sc.nextInt();
            String imatge = sc.nextLine();
                        
            for (int j = 0; j < imatge.length(); j++) {
                switch (imatge.charAt(j))   {
                    case 'M':
                        magenta--;
                        break;
                    case 'C':
                        cyan--;
                        break;
                    case 'A':
                        groc--;
                        break;
                    case 'R':
                        magenta--;
                        groc--;
                        break;
                    case 'N':
                        magenta--;
                        groc--;
                        cyan--;
                        break;
                    case 'V':
                        cyan--;
                        groc--;
                        break;
                    case 'L':
                        groc--;
                        cyan--;
                        break;
                }
            }
            if (magenta >= 0 && groc >= 0 && cyan >= 0)
                System.out.printf("Si %d %d %d\n",magenta,groc,cyan);
            else
                System.out.println("NO");
            break;
        }
    }
}
