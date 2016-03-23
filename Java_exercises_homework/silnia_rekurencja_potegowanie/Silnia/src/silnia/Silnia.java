
package silnia;

import java.util.Scanner;

/**
 * @author Kasia
 */
public class Silnia {

    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = s.nextInt();
        System.out.println("Podaj b: ");
        b = s.nextInt();
        
        Rekurencja ile = new Rekurencja(a,b);

        System.out.println("Silnia z a: " + ile.Silnia(a));
        System.out.println("Silnia z b: " + ile.Silnia(b));
        System.out.println("Rekurencja z a: " + ile.Rekurencja(a));
        System.out.println("Rekurencja z b: " + ile.Rekurencja(b));
        System.out.println("Potegowanie: " +  ile.Potegowanie(a, b));
       
        
    }
    
}
