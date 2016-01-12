package animals;
/**
 * @author Kasia
 */

public class Pies extends Animals {
    
    //kontruktor
    public Pies() {
        super(13);
        System.out.println("Pies jest w drużynie!");
    }
    
    //metody
    
    public void szczekanie() {
        System.out.println("Pies zaszczekał.");
    }
    
    public void ruch() {
        System.out.println("Pies pobiegł za kotem.");
    }
    
    
    
}
