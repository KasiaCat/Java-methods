
package javaapplication27;

import java.util.Scanner;

/**
 * @author Kasia
 */
public class JavaApplication27 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int a,b,znak;
        double procent;
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = s.nextInt();
        System.out.println("Podaj b: ");
        b = s.nextInt();
        System.out.println("Ile procent wyliczyc z liczby (np 0,11): ");
        procent = s.nextDouble();
        
       
        rownania licze = new rownania(a,b, procent);
        licze.menu();
   
        System.out.println("Wybierz znak od 1 do 7: ");
        znak = s.nextInt();
        
        switch(znak) {
            case 1: 
                licze.dodawanie();
                break;
            case 2:
                licze.odejmowanie();
                break;
            case 3:
                licze.mnozenie();
                break;
            case 4:
                licze.dzielenie();
                break;
            case 5:
                licze.pierwiastek();
                break;
            case 6:
                licze.procent();
                break;
            case 7:
                System.out.println("Potega dwoch liczb: " + licze.Potegowanie(a, b));
                break;
        } while (znak != 'k' || znak != 'K');
    
        
    }
    
}
