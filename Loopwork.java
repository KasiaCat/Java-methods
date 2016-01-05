
package loopwork;

/**
 * @author Kasia
 */
public class Loopwork {
    
    public static void WhilePetla() {
        int x = 0;
        while ( x < 5 ) 
        {
            System.out.println("Liczba jest równa: " + x);
            x++;
        }
    }
    
    public static void doWhilePetla() {
        int x = 0;
        do {
            System.out.println("Liczba jest równa: "+ x);
            x++;
        } while ( x < 10 );
    }
    
    public static void forLoop() {
        for (int x = 0; x < 13; x++) { //(int x = 13; x > 0; x--)
            System.out.println("X jest równe: "+ x);
            for (int y = 0; y < 13; y++)
            {
                System.out.println( "( "+x+", "+y+" )" );
            }
        }
          
    }

    public static void main(String[] args) {
        //WhilePetla();
        //doWhilePetla();
        forLoop();
        
    }
    
}
