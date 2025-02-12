/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesBucles;

/**
 *
 * @author alexp
 */
public class CoordenadesXY {
    public static void main(String[] args) {
        int totalRepeticions = 0;
        for (int x = 1; x <= 5; x++)    {
            for (int y = 1; y <= 4; y++)  {
                System.out.printf("(%d, %d)",x,y);
                if (y < x)  {
                    System.out.printf("(%d, %d)",x,y);
                    if (x-1 > 1)
                        System.out.println(",");
                }else
                    break;
                totalRepeticions++;
                System.out.println("");
            }
            
            System.out.println("Total de reptecions: " + totalRepeticions + "");
        }
        
    }
}
