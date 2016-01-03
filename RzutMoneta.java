package rzut.moneta;

import java.util.Random;
/*
 * @author Kasia
 */
public class RzutMoneta {
    
    public String rzucamMoneta () {
        Random rand = new Random();
        int rzut = Math.abs(rand.nextInt()) % 2;
        if (rzut == 0) {
            return "Wylosowałeś: " + rzut + ". Przegrałeś!";
        } else {
            return "Wylosowałeś: " + rzut + ". Wygrałeś!";
        }
    }

    public static void main(String[] args) {
        RzutMoneta gra = new RzutMoneta();
        System.out.println(gra.rzucamMoneta());
        System.out.println(gra.rzucamMoneta());
        System.out.println(gra.rzucamMoneta());
        System.out.println(gra.rzucamMoneta());
        System.out.println(gra.rzucamMoneta());
        System.out.println(gra.rzucamMoneta());
        System.out.println(gra.rzucamMoneta());
        System.out.println(gra.rzucamMoneta());
       
    }
    
}
