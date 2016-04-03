
package znajdz_liczbe;

import java.util.Scanner;

/**
 *
 * @author Kasia
 */
public class Znajdz_liczbe {
    
    
    public static void main(String[] args) {
        int szukana, max, ile;
        Scanner s  = new Scanner(System.in);
        
        NewClass gramy = new NewClass();
        System.out.println("Komputer losuje liczbe z zakresu od 0 do "
                + gramy.max + ". Wpisz liczbe i spróbuj znaleźć liczbę: ");
        gramy.Gra();
    }
    
}
