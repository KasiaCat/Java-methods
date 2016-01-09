package rekurencja;

import java.util.Scanner;

/**
 * @author Kasia
 */
public class Rekurencja {
    
    // 5 jest suma poprzednich liczb czyli 5+4+3+2+1
    //7 7+6+5+4+3+2+1
    
    //3+2+1
    public static int Rekurencja(int a) // [eng: recursive]
    {
        // optymistyczny wariant
        if ( a <= 0)
            return 0;
        //rekurencja - Recursive case
        else
            //3 + Suma(3-1)  // suma (3-1) = 2
            //3 + 2 + Suma(2 - 1)
            //3+2+1 + Suma (1-1)
            //3+2+1+0 = 6 
            return a + Rekurencja(a - 1); 
                //wywowuluje funkcje wewnatrz funkcji
    }
    
    
    //5! = 5*4*3*2*1
    public static int Silnia(int a) // [eng: factorial]
    {
        //wersja optymistyczna
        if (a <= 1)
            return 1;
        //Silnia
        //5 * Silnia (5-1)
        //5*4 (4-1) //5*4*3 (3-1) //5*4*3*2 (2-1) 
        //5*4*3*2*1 = 5!
        else
            return a * Silnia(a - 1);
            
    }
    
    // 2^5 = 2*2*2*2*2 == 2 * Potegowanie(2, 5-1)
    //2*2 * Potegowanie(2, 4-1)
    //4*2 * Potegowanie(2, 3-1) //8*2 * Potegowanie(2, 2-1)
    //16*2 * Potegowanie(2, 1-1)
    //32 * Potegowanie (2, 0) //32
    public static int Potegowanie(int a, int b) // [eng: exponentiation]
    {
        if (b <= 0)
            return 1;
        else if (a <= 0)
            return 0;
        else
            return a * Potegowanie (a, b-1);
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        //Rekurencja(a);
        //Silnia(a);
        //Potegowanie(a, b);
        System.out.println("Rekurencja: " + Rekurencja(a));
        System.out.println("Silnia: " + Silnia(a));
        System.out.println("Potega.  Liczba "+ a + " do potęgi " + 
                            b + " wynosi: " + Potegowanie(a, b));
    }
    
}
