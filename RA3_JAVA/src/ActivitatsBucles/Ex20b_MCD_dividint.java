package ActivitatsBucles;


import java.util.Scanner;
/**
 *
 * @author alexp
 */
 
public class Ex20b_MCD_dividint {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
       
       
        while (b != 0 && a != 0){
            int residu = a % b;
            System.out.println(a+" % "+b+" = " + residu);
            a = b;
            b = residu;
        }
        
        if (a == 0)
            System.out.println("MCD = " + b);
            
        else  
        System.out.println("MCD = " + a);
       
       
    }
}