package animals;

public class Pies extends Animals {
    
    //kontruktor
    public Pies() {
        super(13);
        System.out.println("Pies jest w drużynie!");
    }
    
    //metody
    
    public void eat() {
       System.out.println("Pies pije mleko"); 
    }
    //overwrite the method
    public void sen() {
        System.out.println("Pies śpi");
    }
    
    public void szczekanie() {
        System.out.println("Pies zaszczekał.");
    }
    
    public void ruch() {
        System.out.println("Pies pobiegł za kotem.");
    }
    
    
    
}
