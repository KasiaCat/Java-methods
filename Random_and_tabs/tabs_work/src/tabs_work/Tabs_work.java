
package tabs_work;

import java.util.Scanner;

/**
 *
 * @author Kasia
 */
public class Tabs_work {

    
    public static void main(String[] args) {
        int rozmiar;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Podaj rozmiar tablicy: ");
        rozmiar = s.nextInt();
        
        NewClass licz = new NewClass(rozmiar);
        licz.dodaj();
         
}
}
