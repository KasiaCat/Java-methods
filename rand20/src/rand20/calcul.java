
package rand20;

import java.util.Random;

public class calcul {
    double suma = 0;
    public void licze(int [][] wym, int ile) {
        
        
        //int liczba = (int) (Math.random() * 21);
        Random r = new Random();
        r.setSeed(21); // losowanie z zakresu 0-20
        
        int i, j;
        
        for (i = 0; i < ile; i++) {
            //System.out.print(r.nextInt());
            System.out.format("%d |", r.nextInt());
            suma += r.nextInt();
        }
        System.out.print("Suma = " + suma);
        System.out.println();
        
        for (i = 1; i < wym.length; i++) {
            System.out.format("%d |", r.nextInt());
            suma += r.nextInt();
            
            for (j = 1; j < wym[i].length; j++) {
                System.out.format("%d |", r.nextInt());
                suma += r.nextInt();
                
                
            }
            System.out.print("Suma = " + suma);
            System.out.println();
        }
        
    }
}
