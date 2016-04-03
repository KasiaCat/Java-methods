package programzgaduje;


public class NewClass {
    int cyfra;

    public NewClass(int cyfra) {
        this.cyfra = cyfra;
    }

    public int getCyfra() {
        return cyfra;
    }

    public void setCyfra(int cyfra) {
        this.cyfra = cyfra;
    }
    
    public void komputerZgaduje() {
        if (cyfra >= 1 && cyfra <= 10) {
            System.out.println("Wybrana liczba jest mniejsza niz 10");
        } else if (cyfra >= 11 && cyfra <= 100) {
            System.out.println("Liczba jest mniejsza niż 100");
        } else {
            System.out.println("Liczba nieokreślona - poza skalą");  
        }
    }
          
}
