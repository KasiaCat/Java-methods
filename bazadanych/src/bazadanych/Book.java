//nowa klasa
package bazadanych;

public class Book {
    
    //Wlasciwosci, Globalne zmienne
    String title;
    int pageCount;
    int ISBN;
    boolean IsjestWypozyczona; // ksiazka jest na stanie, albo nie
    int kiedyWypozyczona = -1;
    
    //Konstruktor
    public Book(String bookTitle, int BookPageCount, int bookISBN ) {
        this.title = bookTitle;
        this.pageCount = BookPageCount;
        this.ISBN = bookISBN;
        IsjestWypozyczona = false;
    }
    
    //Getters ----> Instance methods
    public String getTitle() {
        return this.title;
    }
    
    public int getPageCount() {
        return this.pageCount;
    }
    
    public int getTISBN() {
        return this.ISBN;
    }
    
    public boolean getjestWypozyczona() {
        return this.IsjestWypozyczona;
    }
    
    public int getDzienwypozyczenia() {
        return this.kiedyWypozyczona;
    }
    
    
    //Setters
    
    public void setjestWypozyczona(boolean NewjestWypozyczona, int Currentdni){ //new -> new value
        this.IsjestWypozyczona = NewjestWypozyczona;
        setdniTemuwypozyczona(Currentdni);
    }
    
    //prywatna nigdy nie bedzie wywolana bezposrednio
    //tylko poprzez publiczna moze byc wywolana
    
    private void setdniTemuwypozyczona(int day) {
        this.kiedyWypozyczona = day;
    }
    
}
