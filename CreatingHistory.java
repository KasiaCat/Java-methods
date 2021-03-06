
package creatinghistory;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kasia
 */
public class CreatingHistory {
    Scanner scanner = new Scanner(System.in);
    String historia;
    String imie;
    String przymiotnik1;
    String przymiotnik2;
    String rzeczownik1;
    String rzeczownik2;
    String rzeczownik3;
    String przyslowek;
    String randomNums;
    Random rand = new Random();
    
    //Getters
    
    public String getHistoria() {
        return historia;
    }
    
    public String getImie() {
        return imie;
    }
    
    public String getPrzymiotnik1() {
        return przymiotnik1;
    }
    
    public String getPrzymiotnik2() {
        return przymiotnik2;
    }
    
    public String getRzeczownik1() {
        return rzeczownik1;
    }
    
    public String getRzeczownik2() {
        return rzeczownik2;
    }
    
    public String getRzeczownik3() {
        return rzeczownik3;
    }
    
    public String getPrzyslowek() {
        return przyslowek;
    }
    
    public String getRandomNums() {
        return randomNums;
    }
    
    
    //Setters
    
    public void setHistoria(String newHistoria) {
        this.historia = newHistoria;
    }
    
    public void setImie(String newImie) {
        this.imie = newImie;
    }
    
    public void setPrzymiotnik1(String newPrzym1) {
        this.przymiotnik1 = newPrzym1;
    }
    
    public void setPrzymiotnik2(String newPrzym2) {
        this.przymiotnik2 = newPrzym2;
    }
    
    public void setRzeczownik1(String newRzecz1) {
        this.rzeczownik1 = newRzecz1;
    }
    
    public void setRzeczownik2(String newRzecz2) {
        this.rzeczownik2 = newRzecz2;
    }
    
    public void setRzeczownik3(String newRzecz3) {
        this.rzeczownik3 = newRzecz3;
    }
    
    public void setPrzyslowek(String newPrzysl) {
        this.przyslowek = newPrzysl;
    }
    
    public void setRandomNums() {
        int liczba = Math.abs(rand.nextInt()) % 100;
        int pozycja = 0;
        int[] trzymamLiczbe = new int[3]; //iniclalizuje tablice intow, skladajaca sie z 3 elementow
        while ( pozycja < trzymamLiczbe.length ) { //length = 3
            trzymamLiczbe[pozycja] = liczba + pozycja; // liczba = 10 (ciagle ta sama), wiec trzymamLiczbe[0] = 10 + 0;
                                                    // liczba = 10, wiec trzymamLiczbe[1] = 10 + 1 etc. 
            pozycja++;
        }
        randomNums = "nie " + trzymamLiczbe[0] + ", nie " + trzymamLiczbe[1] + ", ale " + trzymamLiczbe[2];
        
    }
    
    //instrukcje dla userA
    public void drukuj() {
        System.out.println("Witaj w grze Madlabs. Wpisz kilka slow, " 
        + "stworzymy dla Ciebie historie. Wpisz imie: ");
        
    }
    
    //GET DATA FROM USER
    public void wpiszImie() {
        System.out.println("Wpisz imie: ");
        setImie(scanner.nextLine());
    }
    
    public void wpiszPrzymiotnik1() {
        System.out.println("Wpisz przymiotnik: ");
        setPrzymiotnik1(scanner.nextLine());
    }
    
    public void wpiszPrzymiotnik2() {
        System.out.println("Wpisz drugi przymiotnik: ");
        setPrzymiotnik2(scanner.nextLine());
    }
    
    public void wpiszRzeczownik1() {
        System.out.println("Wpisz rzeczownik: ");
        setRzeczownik1(scanner.nextLine());
    }
    
    public void wpiszRzeczownik2() {
        System.out.println("Wpisz kolejny rzeczownik: ");
        setRzeczownik2(scanner.nextLine());
    }
    
    public void wpiszRzeczownik3() {
        System.out.println("Wpisz ostatni rzeczownik: ");
        setRzeczownik3(scanner.nextLine());
    }
    
    public void wpiszPrzyslowek() {
        System.out.println("Wpisz przyslowek: ");
        setPrzyslowek(scanner.nextLine());
    }
    
    
    public void ZlozHistorie() {
        String historia;
        int liczba = Math.abs(rand.nextInt()) % 2;
        if (liczba == 0) {
            
            historia = "Allison i jej przyjaciel " + getImie() + 
            " pojechali do Diseneylandu." + " Widzieli " + getRzeczownik1() +
            " w przedstawieniu. Jedli " + getPrzymiotnik1() + " lody." +
            " Nastepnego dnia " + getPrzyslowek() + " sie obudzili, by pojsc do " 
            + getRzeczownik2() + ". Chcieli tez zobaczyc " + getRzeczownik3()
            + ". Allison zobaczyla " + getPrzymiotnik2() + " jablka w czekoladzie"
            + " .Kupila az " + getRandomNums() + " dla siebie....";
            
        } else {
            historia = "Alina i jej przyjaciel " + getImie() + "pojechali do " +
            getPrzymiotnik1() + "miasta w gorach. Dzielilo ich od niego " +
            getRandomNums() + "km. Chcieli odwiedzic " + getRzeczownik1() + 
            " i " + getRzeczownik2() + ". Nie udalo im sie zajrzec do " + 
            getPrzymiotnik2() + " muzeum. Wrocili wieczorem do domu " + 
            getRzeczownik3() + ". Bylo " + getPrzyslowek() + " i chlodno.";
        }
        setHistoria(historia);
    }
    
    public void zagraj() {
        wpiszImie();
        wpiszPrzymiotnik1();
        wpiszPrzymiotnik2();
        wpiszRzeczownik1();
        wpiszRzeczownik2();
        wpiszRzeczownik3();
        wpiszPrzyslowek();
        setRandomNums();
        ZlozHistorie();
        System.out.println(getHistoria());
    }
    
    public static void main(String[] args) {
         CreatingHistory gra = new CreatingHistory();
         gra.drukuj();
         gra.zagraj();
     }
     
}
