
package Modulo_4_only_not_modulo_10_and_8;

/**
 * @author Kasia
 */
public class JavaApplication22 {

    public static void main(String[] args) {
       //Zadanie 4
       int i = 1;
       for (; i < 100; i++) {
           if ( i % 4 == 0) {
               if (i % 8 == 0) 
               {
                   continue; 
               }
                   if (i % 10 == 0) 
                        {
                        continue; 
                        }
                            System.out.println(i);
                   
               }
           }
                 
    }
    
}
