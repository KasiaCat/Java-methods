
package pkg2wymiary;

import java.util.Scanner;

public class MultiplyTable {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj wiersze: ");
        int kolumny = s.nextInt();
        System.out.println("Podaj kolumny: ");
        int wiersze = s.nextInt();
        
        int [][] wym = new int [wiersze][kolumny];
        
        int i, j;
        
        for (i = 0; i < wym.length; i++) {
            //System.out.format("%4d |", i);
            System.out.print(" |    " + i);
        }
        System.out.println();
        for (i = 1; i < wym.length; i++) {
            //System.out.format("%4d |", i);
            System.out.print(" |    " + i);
            
            for (j = 1; j < wym[i].length; j++) {
                //System.out.format("%4d |", i*j); 
                System.out.print(" |    " + i*j);
            }
            
            System.out.println();
        }
        
    }
    
}
