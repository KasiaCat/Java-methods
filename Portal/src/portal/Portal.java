
package portal;

public class Portal {

    int [] setSquare;
    int trafienia;
    
    public void SetMiejsce(int [] place) {
        setSquare = place;
    }
    
    public String check(int pole) {
        int wybor = pole;
        
        String wynik = "pudło";
        for (int sprawdzona : setSquare) {
            if (wybor == sprawdzona) {
                wynik  = "trafiony";
                trafienia++;
                break;
            } else
                wynik = "pudło";
    }
        if (trafienia == setSquare.length) {
            System.out.println(wynik);
            wynik = "zatopiony";
        }
        System.out.println(wynik);
        return wynik;
        
    }
  
}
