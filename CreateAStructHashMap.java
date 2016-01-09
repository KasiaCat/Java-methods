package struktury;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kasia
 */
public class Struktury {

    public static void main(String[] args) {
        Map<String,String> slownikFrenchPolish = new HashMap<String,String>();
        //I give you this = you give me that
        //stworzylam slownik <str, str> bo tlumacze z jednego jezyka na drugi
        //tworze slownik
        slownikFrenchPolish.put("Monday", "Lundi");
        slownikFrenchPolish.put("Tuesday", "Mardi");
        slownikFrenchPolish.put("Wednesday", "Mercredi");
        slownikFrenchPolish.put("Thursday", "Jeudi");
        slownikFrenchPolish.put("Friday", "Vendredi");
        slownikFrenchPolish.put("Saturday", "Samedi");
        slownikFrenchPolish.put("Sunday", "Dimanche");
        
        //odzyskaj - wyjmij ze slownika
        System.out.println(slownikFrenchPolish.get("Monday"));
        System.out.println(slownikFrenchPolish.get("Tuesday"));
        System.out.println(slownikFrenchPolish.get("Wednesday"));
        System.out.println(slownikFrenchPolish.get("Thursday"));
        System.out.println(slownikFrenchPolish.get("Friday"));
        
        //drukuj wszystkie slowa klucze
        System.out.println(slownikFrenchPolish.keySet());
        
        //drukuj wszystkie wartosci kluczy
        System.out.println(slownikFrenchPolish.values());
        
        //wydrukuj rozmiar
        System.out.println("Rozmiar słownika: " + slownikFrenchPolish.size());
        
        System.out.println();
        System.out.println();
        
        //Nowa hashmap - lista zakupów
        Map<String,Boolean> ListaZakupów = new HashMap<String,Boolean>();
        //dodaj do listy - wypelnij hashmap
        ListaZakupów.put("ser żółty", true);
        ListaZakupów.put("HERBATA", Boolean.TRUE);
        ListaZakupów.put("papryka", false);
        ListaZakupów.put("KAWA", Boolean.TRUE);
        ListaZakupów.put("czekolada", Boolean.TRUE);
        ListaZakupów.put("ricotta", false);
        ListaZakupów.put("wafle ryżowe", Boolean.TRUE);
        ListaZakupów.put("parówki", Boolean.FALSE);
        
        //odzyskaj - wyjmij ze slownika
        System.out.println("\nParowki: " + ListaZakupów.get("parówki"));
        System.out.println("Kawa: " + ListaZakupów.get("KAWA"));
        
        
        //drukuj wszystkie slowa klucze
        System.out.println(ListaZakupów.keySet());
        
        //Pary kluczy
        System.out.println(ListaZakupów.toString());
        
        //drukuj wszystkie wartosci kluczy
        System.out.println(ListaZakupów.values());
        
        //wydrukuj rozmiar
        System.out.println("\nSkladnikow na liście: " + ListaZakupów.size());
        
        //jeśli nie ma na liście, to dodaj
        System.out.println("\nCZY SĄ CIASTKA NA LIŚCIE: " + ListaZakupów.putIfAbsent("Ciastka", Boolean.FALSE));
        System.out.println(ListaZakupów.keySet());
        
        //wydrukuj rozmiar
        System.out.println("\nSkladnikow na liście: " + ListaZakupów.size());
        System.out.println("Czy wszystkie produkty są już skreslone z listy? " + ListaZakupów.isEmpty());
        
        //remove
        System.out.println("\nSkresl czekolade " + ListaZakupów.remove("czekolada"));
        System.out.println("\nSkladnikow na liście: " + ListaZakupów.size());
        System.out.println(ListaZakupów.keySet());
        
        //replace
        System.out.println("\nNie chce jednak herbaty");
        ListaZakupów.replace("HERBATA", false);
        System.out.println(ListaZakupów.toString());
        
        //czyszczenie listy
        ListaZakupów.clear();
        System.out.println(ListaZakupów.toString());
        System.out.println("Czy wszystkie produkty są już skreslone z listy? " + ListaZakupów.isEmpty());
        
        System.out.println();
        System.out.println();
       
    }
    
}
