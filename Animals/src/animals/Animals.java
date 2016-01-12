package animals;
/**
 * @author Kasia
 */
public class Animals {
    
    //public int wiek;
    //zmieniajac public  na ---> private, nie bede mogla dostac sie
    // do zmiennej int wiek
    private int wiek;
    
    public Animals(int wiek) {
        this.wiek = wiek;
        System.out.println("Zwierze zostalo stworzone.");
    }
    
    public void eat() {
        System.out.println("Obiad został podany!");
    }
    
    public int getAge() {
        return wiek;
    }
    
    
    public static void main(String[] args) {
        Animals nowe = new Animals(5);
        Cat kot = new Cat();
        Pies piesek = new Pies();
        kot.bieganie();
        kot.miau();
        
        //Public
        //System.out.println("Wiek kota: " + kot.wiek);
        //System.out.println("Wiek psa: " + piesek.wiek);
        
        //Private
        System.out.println("Wiek kota: " + kot.getAge());
        System.out.println("Wiek psa: " + piesek.getAge());
        
        
        kot.eat();
        piesek.szczekanie();
        piesek.ruch();
        
        piesek.eat();
        nowe.eat();
        
        //Co  sie stanie jesli pies chce zamiauczec
        //Animals p = new Pies();
        
        //Klasa dziecko (subclass) moze dziedziczyc po rodzicu (superclass)
        //Klasa rodzic nie moze moze dziedziczyc po dziecku
        
        
       
    }
    
}
