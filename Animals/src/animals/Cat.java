package animals;
/**
 * @author Kasia
 */

//extends ---> pozwala na dodanie klasy Rodzic

//klasa -> dziecko
public class Cat extends Animals {
    
    //Konstruktor
    public Cat() {
        //najpierw musimy wywołać konstruktor rodzica, do tego
        //używamy funkcji super()
        super(6);
        System.out.println("Kupiłam kota.");
    }
    
    //metody
    public void miau() {
        System.out.println("Kot miauczy");
    }
    
    public void bieganie() {
        System.out.println("Kot uciekł za myszą.");
    }
    
        
    
    
}


