package zgadnijliczbe;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kasia
 */
public class ZgadnijLiczbe {

    int TaLiczba;
    int max;
    int ile;
    Scanner scanner = new Scanner(System.in);

    //konstruktor
    public ZgadnijLiczbe() {
        Random rand = new Random();
        max = 100;
        TaLiczba = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void Gra() {

        while (true) {
            int ruch = scanner.nextInt();
            if (ruch > TaLiczba) {
                System.out.println("Liczba za duża!");
                ile++;
            } else if (ruch < TaLiczba) {
                System.out.println("Liczba za mała!");
                ile++;
            } else {
                System.out.println("Wygrałeś! Przy podejściu " 
                + ile);
                break;
            }
        }
    }

    public static void jakDuzaJestMojaLiczba(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Wybrana liczba jest mniejsza niz 10");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Liczba jest mniejsza niż 100");
        } else {
            System.out.println("Liczba nieokreślona - poza skalą");  
        }
    }

    public static void main(String[] args) {
        ZgadnijLiczbe grawZgadywanie = new ZgadnijLiczbe();
        System.out.println("Witamy w grze! By wygrać, wylosuj właściwą liczbę."
                + "\nZasięg liczb: od 0 do " + grawZgadywanie.max + 
                ". Wpisz liczbę.");
        grawZgadywanie.Gra();
        

    }

}
