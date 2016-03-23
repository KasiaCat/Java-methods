
package javaapplication25;

import java.util.Scanner;

/**
 * @author Kasia
 */
public class JavaApplication25 {

    public static void main(String[] args) {
        int x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        x = scan.nextInt();
        System.out.println("Podaj druga liczbe: ");
        y = scan.nextInt();
        
        euklides_licz start = new euklides_licz(x,y);
        start.licz();
    }
    
}
