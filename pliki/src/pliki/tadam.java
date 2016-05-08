
package pliki;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class tadam {
    
     public void e() {
     try {
        
        BufferedReader pelnyOdczyt = new BufferedReader(new FileReader(new File("plik.txt")));
        
        String napis = null;
        int ileLini = 0;
        
        while( (napis = pelnyOdczyt.readLine()) != null ) {
            
            
                if (ileLini % 2 == 0)
                    System.out.println(napis);
                
            ileLini++;
                    
        } 
        pelnyOdczyt.close();
    } 
        
    catch ( Exception e) {
            System.out.println("Brak pliku!");
            e.printStackTrace();
     }
            
    finally {
         System.out.println("No worriess");
            }
    }
}

