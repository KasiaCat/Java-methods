
package javaapplication25;

public class euklides_licz {
    int x, y;

    public euklides_licz(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void licz() 
    {
        while (x != y) {
        if (x > y) {
            x -= y;
            if (x == y) {
            System.out.println("Najwiekszy wspolny dzielnik to: " + x);
            }
            
        } else if (y > x) {
            y -= x;
            if (y == x) {
            System.out.println("Najwiekszy wspolny dzielnik to: " + y);
            }
        }
        }
    }
    
    }
