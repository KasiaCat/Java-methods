﻿
package car;

/**
 *
 * @author Kasia
 */
public class Car {
    // primitive datatypes below
   int maXspeed = 100;
   int dozwolonaPredkosc = 250;
   int miNspeed = 0;
   
   double weight = 4079;
   boolean isTheCarOn = false;
   char condition = 'A';
   
   String nameOfCar = "Katie";
   //Reference datatype is String
   
   double maxLitrowBaku = 16;
   double IleLitroPaliwaTerazMam = 8;
   double cenaZaLitr = 5.15;
   
   int ileLudziwSamochodzie = 1;
   int maXileLudziwSamochodzie = 5;
   
   boolean czyJestszyberdach = false;
   
   double cenaPrzegladuTech = 760;
   
   
   public Car() {
       
   }
   
   
   //konstruktor
   // public - kazdy moze stworzyc samochod 
   public Car(int ZwyklaMaxSpeed, double Zwyklaweight, boolean OnCzyOff, double zwyklacena) {
       maXspeed = ZwyklaMaxSpeed;
       // nie wolno, na odwrot ZwyklaMinSpeed = miNspeed (bo wtedy 0 przypisze)
       weight = Zwyklaweight;
       isTheCarOn = OnCzyOff;
       cenaPrzegladuTech = zwyklacena;
       
   }
   
   //Get and Set (getchar() in C++)
   //this oznacza - ten obiekt, odwołuje się do konkretnego obiektu
   //który ma metody, wartości  - jak maxspeed, minspeed etc.
   
   public int getmaXspeed() { 
       return this.maXspeed;
   }
   
   public void setmaXspeed(int newmaXspeed) { //int new....- to parametr
       this.maXspeed = newmaXspeed;
               //zmieniamy liczbe pasazerow w tym samochodzie
               //nie w kazdym. TYLKO W TYM - samochod Kasi
   }
   
    
   public void zwiekszSzybkosc () {
        setmaXspeed(getmaXspeed() + 10 );
    }
   
    /*
    public void zwiekszSzybkosc () {
        miNspeed = maXspeed;
        maXspeed = maXspeed + 1;
    }
    */
   
   public int getmiNspeed() {
       return this.miNspeed;
   }
   
   public double getWeight() {
       return this.weight;
   }
   
   public boolean getisTheCarOn() {
       return this.isTheCarOn;
   }
   
   public String getnameOfCar() {
       return this.nameOfCar;
   }
  
    public void drukujWartosci () {
       
       System.out.println("Maxymalna prędkość: " + maXspeed);
       System.out.println("Minimalna prędkość: " + miNspeed);
       System.out.println("Waga samochodu: " + weight);
       System.out.println("Czy samochód jest włączony: " + isTheCarOn);
       System.out.println("Stan: " + condition);
       System.out.println("Imie samochodu: " + nameOfCar);
       System.out.println("Ilosc osób w samochodzie: " + ileLudziwSamochodzie);
       System.out.println("Szyberdach? " + czyJestszyberdach);
       System.out.println("Cena za Przeglad Techniczny: " + cenaPrzegladuTech);
       }
   
    public void damagedCar() {
        condition = 'D';
    }
    
    public void zmianaPredkosci() {
        maXspeed += 50;
    }
    
    public void niePrzekraczajSzybkosciDozwolonej() {
        if (maXspeed >= dozwolonaPredkosc ) {
            System.out.println("Zwolnij! Przekroczyłeś dozwoloną prędkość " + dozwolonaPredkosc + "km/h!");
        } else {
            System.out.println("Możesz jeszcze dodać gazu!");
        }
    }
   
   
    public void wejdzDoSamochodu() {
        //ileLudziwSamochodzie = ileLudziwSamochodzie + 1;
        //ileLudziwSamochodzie++;
        if (ileLudziwSamochodzie < maXileLudziwSamochodzie) {
            ileLudziwSamochodzie++;
            System.out.println("Zabrales kolejnego pasażera!");
        } else {
            System.out.println("Nie mam juz wolnych miejsc w samochodzie. " + ileLudziwSamochodzie + " = " + maXileLudziwSamochodzie );
        }
        
    }
    
    public void wyjscZSamochodu() {
        //ileLudziwSamochodzie = ileLudziwSamochodzie - 1;
        //ileLudziwSamochodzie--;
        if (ileLudziwSamochodzie /*!=*/ > 0) {
            ileLudziwSamochodzie--;
        } else {
            System.out.println("Brak pasażerów  i kierowcy! " + ileLudziwSamochodzie);
        }
        
        //System.out.println(ileLudziwSamochodzie);
    }
    
   
    public double zaIleKMSkonczySiePaliwo() {
        return IleLitroPaliwaTerazMam * cenaZaLitr;
    }
    
    public double ileKMNaPelnymBaku() {
        return maxLitrowBaku * cenaZaLitr;
    }
    
    public void turnTheCarOn() {
        //jeśli twierdzenie jest falszywe
        if (!isTheCarOn) {
            //włącz samochód
            isTheCarOn = true;
        } else {
            //w innym wypadku, pokaż informacje o fakcie
            System.out.println("Samochód jest już włączony " + isTheCarOn);
        }
    }
    
    public void zmianaNazwy() {
        nameOfCar = "Mary";
    }
    
    public static void main(String[] args) {
        Car samochodKasi = new Car();
        samochodKasi.wyjscZSamochodu();
        samochodKasi.wyjscZSamochodu();
        samochodKasi.wejdzDoSamochodu();
        samochodKasi.wejdzDoSamochodu();
        samochodKasi.wejdzDoSamochodu();
        samochodKasi.zmianaPredkosci();
        samochodKasi.niePrzekraczajSzybkosciDozwolonej();
        samochodKasi.wejdzDoSamochodu();
        samochodKasi.wejdzDoSamochodu();
        samochodKasi.zmianaPredkosci();
        samochodKasi.niePrzekraczajSzybkosciDozwolonej();
        samochodKasi.wejdzDoSamochodu();
        samochodKasi.zmianaPredkosci();
        samochodKasi.niePrzekraczajSzybkosciDozwolonej();
        samochodKasi.turnTheCarOn();
        samochodKasi.turnTheCarOn();
        
    }
            
   /*
    public static void main(String[] args) {
        
        Car audi = new Car (); //glowny obiekt - parent
        System.out.println("Samochód głowny");
        audi.drukujWartosci();
        audi.zwiekszSzybkosc();
        audi.zmianaNazwy();
        System.out.println("Po wymianie silnika: ");
        audi.drukujWartosci();
        
        
        //reference datatypes
        Car samochodKasi = audi; //reference type, dziecko dziedziczy
        
        audi.damagedCar();
        System.out.println("Samochód Kasi");
        samochodKasi.drukujWartosci();
*/
    /*
    public static void main(String[] args) {
        Car prezentUrodzinowy = new Car(300, 5800.978, false, 150);
        System.out.println("Parametry samochodu v1:\n ");
        prezentUrodzinowy.drukujWartosci();
        
        prezentUrodzinowy.wejdzDoSamochodu();
        prezentUrodzinowy.wejdzDoSamochodu();
        prezentUrodzinowy.wejdzDoSamochodu();
        System.out.println("\nIle KM mozesz jeszcze przejechac: " + prezentUrodzinowy.zaIleKMSkonczySiePaliwo());
        System.out.println("Maxymalna ilosc mil: " + prezentUrodzinowy.ileKMNaPelnymBaku());
        
        System.out.println("\nParametry samochodu v2:\n ");
        prezentUrodzinowy.drukujWartosci();
        
        prezentUrodzinowy.wyjscZSamochodu();
        
        System.out.println("\nParametry samochodu v3:\n ");
        prezentUrodzinowy.drukujWartosci();
        
        
        System.out.println("\nSamochód zastępczy:\n ");
        Car samochodZastepczy = new Car(450, 3209.67, true, 1600);
        samochodZastepczy.drukujWartosci();
        
        
        
    } */
    

}
