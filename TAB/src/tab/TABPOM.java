
package tab;

import java.util.Scanner;

public class TABPOM {
    double suma = 0, srednia = 0;
    int ile;
    
    //konstruktor
    public TABPOM(int i) {
        this.ile = i;
    }
    
    public int getile() {
        return ile;
    }
    
    public void setIle(int i) {
        this.ile = i;
    }


    public void licz() {
        double [] tab = new double[ile];
        
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podawaj liczby: ");
            Scanner s = new Scanner(System.in);
            
            tab[i] = s.nextInt();
            suma += tab[i];
            
            if (tab[i] == 0) {
                System.out.println("srednia: " + suma/i); 
                break;
            }
            
            System.out.println("suma: " + suma);
            
        }
        
            srednia = suma/tab.length;
            System.out.println("srednia: " + srednia);
        
        
        
        
    }
    
    
    
}
