package klasy.pkgabstract;

class MyBook extends KlasyAbstract {
    int cena;
    
    public MyBook(String title, String author, int cena) {
        super(title, author);
        this.cena = cena;
    }
    void display() { 
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + cena);
    }
    
}
