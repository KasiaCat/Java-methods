
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        int rozmiar;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        rozmiar = s.nextInt();
        int tab [] = new int [rozmiar];
        
        fiiii gra = new fiiii();
        
        for(int i = 0; i < tab.length; i++ ) {
            System.out.println(gra.licze(i));
        }
        
    }

    
}
