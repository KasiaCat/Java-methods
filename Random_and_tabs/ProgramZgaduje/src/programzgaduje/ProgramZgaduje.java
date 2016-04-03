
package programzgaduje;

import java.util.Scanner;

public class ProgramZgaduje {
    
    public static void main(String[] args) {
        int v;
        Scanner r = new Scanner(System.in);
        
        System.out.println("Podaj liczbe: ");
        v = r.nextInt();
        NewClass gra = new NewClass(v);
        gra.komputerZgaduje();
        
        
    }
    
}
