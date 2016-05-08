
package odczyt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class read {
    
    public void reading() {
        
        try {
        
        BufferedReader pelnyOdczyt = new BufferedReader(new FileReader(new File("plik2.txt")));
         
        String napis = null;
        int ileLini = 0;
        ArrayList lista = new ArrayList();
        
        while( (napis = pelnyOdczyt.readLine()) != null ) {
            
            lista.add(napis);
            
            ileLini++;      
        } 
        
        StringBuilder s = new StringBuilder();
        s.append(lista).toString();
        System.out.println(s.reverse());
        
        pelnyOdczyt.close();
        }
        
        catch ( Exception e) {
            System.out.println("Brak pliku!");
            e.printStackTrace();
        }
        
        finally {
            System.out.println();
        }
        }
    }
