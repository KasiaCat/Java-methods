
package klasy_app;

import java.util.Scanner;

/**
 *
 * @author Kasia
 */
public class Klasy_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int one, two;
    
        
        System.out.println("Podaj pierwsza liczbe: ");
        one = scan.nextInt();
        
        if (scan.hasNextInt()) {
            System.out.println("Jest int");
                    
        } else {
            System.out.println("not here");
        }
        
        System.out.println("Podaj druga liczbe: ");
        two = scan.nextInt();
        
       
      
        
        System.out.println("\nSuma wynosi: " + (one + two));
        System.out.println("\nRóżnica wynosi: " + (one - two));
        System.out.println("\nIloczyn wynosi: " + (one * two));
        System.out.println("\nIloraz wynosi: " + (one / two));
        
        //System.out.println("ala ma kota");
        
        String imie;
        String nazwisko;
        
        System.out.println("\nPodaj imie: ");
        imie = scan.next();
        System.out.println("\nPodaj nazwisko: ");
        nazwisko = scan.next();
        System.out.println("My name is: " + imie + " " + nazwisko);
        
        // wpisz: sout i wcisnij tab -- > wynik Sytem.out.println
                
        
        
        
        
        
        
        
        
        
    }
    
}
