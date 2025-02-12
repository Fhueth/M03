package ActivitatsBucles;


import java.util.Scanner;
/**
 *
 * @author alexp
 */
 
public class Ex22_MCM {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int A = a;
        int B = b;
       
        while (b != 0){
            int residu = a % b;
            a = b;
            b = residu;
        }
        
        int mcm = (A*B)/a;
        System.out.println("MCM("+A+","+B+") = " + mcm);
       
    }
}