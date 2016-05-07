
package portal;

import java.util.Scanner;


public class Gra {
    
    public static void main(String[] args) {
        int ruchyUsera = 0;
        
        Portal portal = new Portal();
        
        int losowa = (int) (Math.random() * 6);
        
        int[] polozenie = {losowa, losowa + 1, losowa +2};
        
        portal.SetMiejsce(polozenie);
        
        boolean NieZatopiony = true;
        
        while(NieZatopiony) {
            System.out.println("Podaj liczbe: ");
            Scanner s = new Scanner(System.in);
            int dane = s.nextInt();
            
            String wynik = portal.check(dane);
            ruchyUsera++;
            
            if (wynik.equals("zatopiony")) {
                NieZatopiony = false;
                System.out.println(ruchyUsera + " ruchów");
            }
        } 
    } 
}
