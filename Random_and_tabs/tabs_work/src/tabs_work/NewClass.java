
package tabs_work;

import java.util.Scanner;

public class NewClass {
    int rozm;
    double suma = 0, srednia = 0;
   
    public int getRozm() {
        return rozm;
    }
    
    public void setRozm(int rozm) {
        this.rozm = rozm;
    }

    public NewClass(int rozm) {
        this.rozm = rozm;
    }

   
    public void dodaj() {
        double [] tab = new double[rozm];
        for (int licznik = 0; licznik < tab.length; licznik++) {
            
                Scanner s = new Scanner(System.in);
                System.out.println("Podaj liczbe: ");
                tab[licznik] = s.nextInt();
                suma += tab[licznik];
                System.out.println("Suma =  " + suma);
            
        }
        
        srednia = suma/rozm;
        System.out.println("Srednia = " + srednia);
        }
}
