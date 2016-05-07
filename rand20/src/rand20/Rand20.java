
package rand20;

import java.util.Random;
import java.util.Scanner;

public class Rand20 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj wiersze: ");
        int kolumny = s.nextInt();
        System.out.println("Podaj kolumny: ");
        int wiersze = s.nextInt();
        int [][] wym = new int [kolumny][wiersze];
        
        calcul c = new calcul();
        c.licze(wym, wiersze);
        
        
    }
}
