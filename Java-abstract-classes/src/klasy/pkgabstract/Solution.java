package klasy.pkgabstract;

import java.util.Scanner;

/**
 * @author Kasia
 */
abstract class KlasyAbstract {
    String title;
    String author;
    KlasyAbstract(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}

    public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      KlasyAbstract new_novel=new MyBook(title,author,price);
      new_novel.display();
    }
    
}
