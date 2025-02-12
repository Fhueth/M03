/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivitatsBucles;

import java.util.Scanner;

/**
 *
 * @author alexp
 */
public class Ex24_NombresAmics {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = 0; int m = 0;
        
        //n
        boolean nValid = true;
        int sumaDivisorsN = 0;
        do {
            System.out.print("Introdueix un nombre natural n: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    for (int i = 1; i < n; i++) {
                        if(n%i == 0)    {
                            sumaDivisorsN += i;
                        }
                    }
                    break;
                }
                else    
                    nValid = false;
                
            }
            else    {
                nValid = false;
                sc.next();
            }
        } while (nValid == false);

        boolean mValid = true;
        int sumaDivisorsM = 0;
        do {
            System.out.print("Introdueix un nombre natural m: ");
            if (sc.hasNextInt()) {
                m = sc.nextInt();
                if (m > 0) {
                    for (int i = 1; i < n; i++) {
                        if(m%i == 0)    {
                            sumaDivisorsM += i;
                        }
                    }
                    break;
                }
                else    
                    mValid = false;                
            }
            else    {
                mValid = false;
                sc.next();
            }
        } while (mValid == false);
        
        if (sumaDivisorsN == sumaDivisorsM)
            System.out.printf("%d i %d són amics.\n",n,m);
        else
            System.out.printf("%d i %d NO són amics.\n",n,m);
    }
}
    