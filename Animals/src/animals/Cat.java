package animals;
//extends ---> pozwala na dodanie klasy Rodzic

//klasa -> dziecko
public class Cat extends Animals {
    
    //Konstruktor
    public Cat() {
        super(6);
        System.out.println("Kupiłam kota.");
    }
    //overwrite the method eat
    public void eat() {
       System.out.println("Kot pije mleko"); 
    }
    
    public void sen() {
        System.out.println("Kot śpi");
    }
    
    //metody
    public void miau() {
        System.out.println("Kot miauczy");
    }
    
    public void bieganie() {
        System.out.println("Kot uciekł za myszą.");
    }
    
        
    
    
}


