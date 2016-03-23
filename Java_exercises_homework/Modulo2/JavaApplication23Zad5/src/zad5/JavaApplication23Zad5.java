
package zad5;

/**
 * @author Kasia
 */
public class JavaApplication23Zad5 {

    public static void main(String[] args) {
       int i = 1;
       int zarobki_roczne_netto = 12000;
       double oprocentowanie_roczne = 0.05;
       int zarobek_na_lok = 0;
       
       //suma = 200000;
       do {
                zarobek_na_lok += oprocentowanie_roczne * (zarobki_roczne_netto + zarobek_na_lok);
        System.out.println("Zarobek roczny na lokacie: " + zarobek_na_lok + " rok nr:" + i);
        i++;
       } while (zarobek_na_lok <= 200000.0) ;
       
    }
    
}
