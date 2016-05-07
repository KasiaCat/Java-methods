
package trojkaty_i_kwadraty;

import java.util.Scanner;

/**
 * @author Kasia
 */
public class Trojkaty_i_kwadraty {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double dl_boku;
        System.out.println("Podaj dlugosc boku: ");
        dl_boku = s.nextDouble();
        
        Kwadrat kw = new Kwadrat();
        kw.setBok(dl_boku);
        kw.licz_pole();
        
        System.out.println("Pole kwadratu wynosi: " + kw.licz_pole());
        
        Trojkat t = new Trojkat();
        t.setBok(dl_boku);
        t.licz_pole();
        System.out.println("Pole trojata wynosi: " + kw.licz_pole());
        
        Romb r  = new Romb();
        
        System.out.println("Pole rombu wynosi: " + r.licz_pole());
        
    }
    
}
