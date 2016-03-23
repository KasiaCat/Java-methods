/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liczymydelte;

import java.util.Scanner;

/**
 *
 * @author Kasia
 */
public class Liczymydelte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = scan.nextDouble();
        System.out.println("Podaj b: ");
        b = scan.nextDouble();
        System.out.println("Podaj c: ");
        c = scan.nextDouble();
        
        delt rownanie = new delt(a,b,c);
        rownanie.licze();
               
               
        
    }
    
}
