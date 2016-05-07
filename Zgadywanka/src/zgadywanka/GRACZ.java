
package zgadywanka;


public class GRACZ {
    int liczba = 0;

  public void zgaduj() {
    liczba = (int) (Math.random() * 40);
    System.out.println("Typuję liczbę: " + liczba);
  }
}
