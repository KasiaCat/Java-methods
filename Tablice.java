package tablice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Kasia
 */
public class Tablice {
    
    public static void drukujTablice(int[] tablica) {
        System.out.print("|");
        for ( int i = 0; i < tablica.length; i++ )
            {
                    int komorka = tablica[i];
                    System.out.print(komorka);
                    
                    if (i < tablica.length - 1) //koniec tablicy
                        {              //(5 elementow, ale indeks  od 0 do 4)
                        
                          System.out.print(" , ");  
                        }
            }
            System.out.println("|");
    }

    public static void main(String[] args) {
        // Index:    0  1  2  3  4 -> zaczyamy od 0
        // Tablica: [9, 8, 4, 7, 8] - > length of 5
        
        //Random objects z tablicy
        //Math.abs(rand.nextInt() % 5) <--> Math.abs(rand.nextInt() % length)
        
        
        //Indeks:     0        1
        //Tablica ["zosia", "kasia"] - > ten samy typ, length of 2
        
        // Deklarowanie, Alokowanie miejsca, Inicjalizacja tablicy
        int[] tab;
        int[] tab2 = new int[5]; // musze wpisac rozmiar
        System.out.println("Tab2 - funkcja");
        drukujTablice(tab2);
        int[] tab3 = {8, 4, 6, 1, 3};
        
        String[] lista = {"ogorki", "ziemniaki", "woda"};
        
        // wydrukuj tablice
        System.out.println("Tab2");
        System.out.println(Arrays.toString(tab2));
        tab2[0] = 10; 
        tab2[1] = 3;
        tab2[2] = 4;
        tab2[3] = 8;
        
        System.out.println();
        System.out.println("Tab2");
        System.out.println(Arrays.toString(tab2));
        System.out.println("Tab3");
        System.out.println(Arrays.toString(tab3));
        System.out.println();
                
        // Zwyczajne drukowanie tablic - funkcje
        System.out.println("Funkcje");
        drukujTablice(tab2);
        drukujTablice(tab3);
        System.out.println();
        
        //odzyskaj object
        System.out.println("Czwarty element tab2: " + tab2[3]);
        System.out.println();
        System.out.println("Czwarty element tab2: " + Array.get(tab2, 3) );
        System.out.println();
        
        //Zwroc funckje
        System.out.println("Tab3 po posortowaniu + funkcja");
        Arrays.sort(tab3);
        drukujTablice(tab3);
        System.out.println();
        
        System.out.println("Special for loop");
        //Specjalna petla for: foreach
        for (String s : lista) { //dla kazdego Stringa w tablicy lista, wydrukuj elementy
            System.out.println(s);
            System.out.println("Kate");
        }
        
}
}
