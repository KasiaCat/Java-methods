
package tab;

import java.util.Scanner;

public class TAB {

    public static void main(String[] args) {
        int ile_liczb;
        
        Scanner s  = new Scanner(System.in);
        
        System.out.println("Podaj rozmiar tablicy: ");
        ile_liczb = s.nextInt();
        double [] tab = new double[ile_liczb];
        
        TABPOM nowa = new TABPOM();
        nowa.licz(tab);
        
        
    }
    
}
