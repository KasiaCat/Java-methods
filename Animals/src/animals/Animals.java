package animals;
/**
 * @author Kasia
 */
public abstract class Animals {
    private int wiek;
    
    public Animals(int wiek) {
        this.wiek = wiek;
        System.out.println("Zwierze zostalo stworzone.");
    }
    
    public abstract void eat();
    
    public void sen() {
        System.out.println("Zwierzątko śpi.");
    }
    
    public int getAge() {
        return wiek;
    }
    
    
    public static void main(String[] args) {
        Cat kot = new Cat();
        Pies piesek = new Pies();
        kot.eat();
        piesek.eat();
        kot.sen();
        piesek.sen();
        
        System.out.println();
        Object pies = new Pies();
        Pies realDog = (Pies) pies;
        realDog.eat();
        realDog.sen();
        
        System.out.println();
        Object kotek = new Cat();
        Cat siersciuch = (Cat) kotek;
        siersciuch.miau();
        siersciuch.bieganie();
        
        System.out.println();
        Object napis = "coucou";
        String realnapis = (String) napis;
        realnapis.getBytes();
        
        System.out.println();
        //test
        Pies owczarek = new Pies();
            if (owczarek instanceof Animals) {
                Animals zwierzatko = (Animals) owczarek;
                zwierzatko.sen();
            }
            owczarek.sen();
        
        //Public
        //System.out.println("Wiek kota: " + kot.wiek);
        //System.out.println("Wiek psa: " + piesek.wiek);
        
        //Private
        //System.out.println("Wiek kota: " + kot.getAge());
        //System.out.println("Wiek psa: " + piesek.getAge());
        
       
    }
    
}
