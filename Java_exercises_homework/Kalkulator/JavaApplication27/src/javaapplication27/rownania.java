
package javaapplication27;

import static java.lang.Math.sqrt;

public class rownania {
    int a,b, wynik, znak;
    double procent;
    double ile;
    
    public rownania(int a, int b, double procent) {
        this.a = a;
        this.b = b;
        this.procent  = procent;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getWynik() {
        return wynik;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getProcent() {
        return procent;
    }

    public void setProcent(double procent) {
        this.procent = procent;
    }

    public double getIle() {
        return ile;
    }

    public void setIle(double ile) {
        this.ile = ile;
    }
    
    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

    public int getZnak() {
        return znak;
    }

    public void setZnak(int znak) {
        this.znak = znak;
    }
    
    
    
    public void dodawanie() {
        this.wynik = a + b;
        System.out.println("Wynik dodawania: " + this.wynik);
    }
    
    public void odejmowanie() {
        this.wynik = a - b;
        System.out.println("Wynik odejmowania: " + this.wynik);
    }
    
    public void mnozenie() {
        if (a == 0 || b == 0)
        {
            this.wynik = 0;
        } else {
            this.wynik = a * b;
        }
            System.out.println("Wynik mnozenia: " + this.wynik);
    }
    
    public void dzielenie() {
        if (a == 0 || b == 0)
        {
            System.out.println(" \nNie dzielimy przez zero!");
        } else {
            this.wynik = a / b;
        }
       
        System.out.println("Wynik dzielenia: " + this.wynik);
    }
    
    public void pierwiastek() {
        this.wynik = (int) sqrt(a);
        System.out.println("Pierwiastek z liczby " + a + " wynosi: " +  this.wynik);
        this.wynik = (int) sqrt(b);
        System.out.println("Pierwiastek z liczby " + b + " wynosi: " +  this.wynik);
    }
    
    public void procent() {
        this.ile = (a * procent);
        System.out.println(procent + " procent z liczby " + a  + " wynosi: " + this.ile);
        
        this.ile = (b * procent);
        System.out.println(procent + " procent z liczby " + b  + " wynosi: " + this.ile);
    }
    
    public int Potegowanie(int a, int b)
    {
        if (b <= 0)
            return 1;
        else if (a <= 0)
            return 0;
        else
            return a * Potegowanie (a, b-1);
    }
    
    public void menu() {
        
        System.out.println("Menu");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Pierwiastek z liczby");
        System.out.println("6. Procent z liczb");
        System.out.println("7. Potegowanie"); 
    }
    
            
    }
    
    

