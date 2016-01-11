package bazadanych;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kasia
 */
public class Bazadanych {
    
    //Properties , Fields, Global variables
    Map<String,Book> bookColletion = new HashMap<String,Book>();
    int currentDay = 0;
    int OkresWypozyczenia = 3;
    double OplataPoczatkowa = 1.00;
    double naliczOplateDzienna = 0.50;
    
    //Konstruktory
    
    //Lepeiej, miec tylko jeden konstruktor, ale tu stworze dwa
    
    //Pierwszy konstruktor
    public Bazadanych(Map<String,Book> collection) {
        this.bookColletion = collection;
    }
    
    //Drugi Konstruktor
    public Bazadanych(Map<String,Book> collection, int HowLong, 
            double OplataPoczatkowa, double naliczOplateDzienna ) {
        this.bookColletion = collection;
        this.OkresWypozyczenia = HowLong;
        this.OplataPoczatkowa = OplataPoczatkowa;
        this.naliczOplateDzienna = naliczOplateDzienna;
        
    }
    
    //Getters
    
    public int getcurrentDay() {
        return this.currentDay;
    }
    
    public Map<String,Book> getbookColletion() {
        return this.bookColletion;
    }
    
    public Book getBook(String bookTitle) {
        return getbookColletion().get(bookTitle);
    }
    //
    public int getOkresWypozyczenia() {
        return this.OkresWypozyczenia;
    }
    
    
    public double getOplataPoczatkowa() {
        return this.OplataPoczatkowa;
    }
    
    public double getnaliczOplateDzienna() {
        return this.naliczOplateDzienna;
    }
    
    
    //Setters
    
    public void nextDay() {
        currentDay++;
    }
    
    public void setDay( int day ) {
        currentDay = day;
    }
    
    //Instance methods
    
    public void wypozyczenie(String title){
         Book book = getBook(title);
         if (book.getjestWypozyczona()) {
             KsiazkaJuzJestWypozyczona(book);
         } else {
             book.setjestWypozyczona(true, currentDay);
             System.out.println("Wypozyczyles " + title + ". Zwrot do dnia: " + 
                      ( getcurrentDay() + getOkresWypozyczenia() ) + "." );
         }
    }
    
    public void zwrotKsiazki(String title){
         Book book  = getBook(title);
         int daysLate = currentDay - (book.getDzienwypozyczenia() 
                 + getOkresWypozyczenia());
         if (daysLate > 0) {
             System.out.println("Musisz zapłacić karę w wysokości: " + 
                    (getOplataPoczatkowa() + daysLate*getnaliczOplateDzienna() ) 
                    + " euro, gdyż oddałeś książkę " + daysLate + " póżniej, " + 
                    "niż wymagano.");
         } else {
             System.out.println("Książka zwrócona. Dziękujemy!");
         }
         book.setjestWypozyczona(false, -1);
    } // tylednizostalo = 15 stycznia teraz jest- (5 stycznia wypozyczylam + 14dni na przeczytanie )
    
    public void KsiazkaJuzJestWypozyczona(Book book ) {
        System.out.println("Przepraszamy! " + book.getTitle() + 
                " już jest wypożyczona. Powinna być znowu w bibliotece: " +
                (book.getDzienwypozyczenia() + getOkresWypozyczenia()) +
                ".");
    }
    
    

    public static void main(String[] args) {
      Map<String,Book> bookColletion = new HashMap<String,Book>();
      Book syrenka = new Book("Syrenka", 489, 8989898); //8989898 == ISBN
      bookColletion.put("Syrenka", syrenka);
      Bazadanych library = new Bazadanych(bookColletion);
      library.wypozyczenie("Syrenka");
      library.nextDay();
      library.nextDay();
      library.wypozyczenie("Syrenka");
      library.setDay(23);
      library.zwrotKsiazki("Syrenka");
      library.wypozyczenie("Syrenka");
      
    }
    
}
