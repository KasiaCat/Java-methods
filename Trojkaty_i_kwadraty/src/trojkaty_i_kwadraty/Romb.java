
package trojkaty_i_kwadraty;

import java.util.Scanner;

/**
 * @author Kasia
 */
public class Romb {
    double bok, wysokosc;

    public void setBok(double bok) {
        this.bok = bok;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getBok() {
        return bok;
    }

    public double getWysokosc() {
        return wysokosc;
    }
    
    public void ile() {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj bok: ");
       
        bok = s.nextDouble();
        System.out.println("Podaj wysokosc: ");
        wysokosc = s.nextDouble();
    }
    
    public double licz_pole() {
        ile();
        return ((bok*wysokosc)/2);
    }
}
