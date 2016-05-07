
package tab;

import java.util.Scanner;

public class TAB {

    public static void main(String[] args) {
        int ile_liczb;
        
        Scanner s  = new Scanner(System.in);
        
        System.out.println("Podaj rozmiar tablicy: ");
        ile_liczb = s.nextInt();
        
        TABPOM nowa = new TABPOM(ile_liczb);
        nowa.licz();
        
        
    }
    
}
