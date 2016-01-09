
package maxwspolnydzielnik;

import java.util.Scanner;

/**
 * @author Kasia
 */
public class MaxWspolnyDzielnik {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }

    private static int find_gcd(int a, int b) {
            int A = a;
            int B = b;
       while ( (A != 0) && (B != 0) )  
           {    
            if (A > B)
                A = A - B;
            else
                B = B - A;
           }
           return Math.max(A,B);
    }
    
}
