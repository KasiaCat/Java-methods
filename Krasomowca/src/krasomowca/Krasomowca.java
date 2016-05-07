package krasomowca;

/**
 * @author Kasia
 */
public class Krasomowca {

    public static void main(String[] args) {
        		// trzy grupy slow
    String[] listaSlow1 = {"architektura wielowarstwowa", "30000 metrow", "rozwiazanie B-do-B", 
      "aplikacja kliencka", "interfejs internetowy", "inteligentna karta", 
      "rozwiazanie dynamiczne", "szerokosc sigma", "przenikliwosc"};
    
    String[] listaSlow2 = {"zwieksza mozliwosci", "poprawia atrakcyjnosci", "pomnaza wartosci", 
      "opracowana dla", "bazujaca na", "rozproszona", "sieciowe", "skoncentrowana na", 
      "podniesiona na wyzszy poziom", "skierowanej", "udostepnienia"};

    String[] listaSlow3 = {"procesu", "punktu wpisywania", "rozwiazania", "strategii", 
      "paradygmatu", "portalu", "witryny", "wersji", "misji"};
    
    String[] listaSlow4 = {"Odpwiedz", "zostaw komentarz", "pochwal sie wiedza", 
        "napisz do nas", "zglos zapytanie"};
    
    
    
    // okreslenie ile jest slow w kazdej z list
    int lista1Dlugosc = listaSlow1.length;
    int lista2Dlugosc = listaSlow2.length;
    int lista3Dlugosc = listaSlow3.length;
    int lista4dl = listaSlow4.length;
    
    // generacja trzech losowych slow (lub zwrotow)
    int rnd1 = (int) (Math.random() * lista1Dlugosc);
    int rnd2 = (int) (Math.random() * lista2Dlugosc);
    int rnd3 = (int) (Math.random() * lista3Dlugosc);
    int r = (int) (Math.random() * lista4dl);
    
    // stworzenie zdania
    String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + 
      " " + listaSlow3[rnd3] + " " + listaSlow4[r];
    
    // wyswietlenie zdania
    System.out.println("To jest to, czego nam trzeba: " + zdanie);
    }
    
}
