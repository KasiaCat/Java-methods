
package znajdz_liczbe;

import java.util.Random;
import java.util.Scanner;

public class NewClass {
    int szukana, max, ile;

    public NewClass() {
        Random rand = new Random();
        max = 100;
        szukana = Math.abs(rand.nextInt()) % max + 1;
    }
    
    
    public void Gra() {
        Scanner s = new Scanner(System.in);
        int ruch;
        
        while (true) {
            ruch = s.nextInt();
            if (ruch > szukana) {
                System.out.println("Liczba za duza!");
                ile++;
            } else if (ruch < szukana) {
                System.out.println("Liczba za mala!");
                ile++;
            } else {
                System.out.println("Wygrales! Przy podejsciu " 
                + ile);
                break;
            }
        }
    }
     
    
}
