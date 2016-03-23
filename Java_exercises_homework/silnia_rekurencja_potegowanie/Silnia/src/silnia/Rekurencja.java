
package silnia;

public class Rekurencja {
    int a,b;

    public Rekurencja(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    
   
    public int Rekurencja(int a)
    {
        // optymistyczny wariant
        if ( a <= 0)
            return 0;
        else
            return a + Rekurencja(a - 1); 
    }
    
    public int Silnia(int a)
    {
        if (a <= 1)
            return 1;
        else
            return a * Silnia(a - 1);
            
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
    
}
