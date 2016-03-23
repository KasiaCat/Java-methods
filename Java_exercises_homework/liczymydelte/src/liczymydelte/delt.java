/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liczymydelte;

/**
 *
 * @author Kasia
 */
public class delt {
    double a,b,c,delta,x1,x2,x0;

    public delt(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX0() {
        return x0;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
    
    
    public void liczdelte() {
        this.delta = (b*b)-4*a*c;
    }
    
    
    public void licze() {
        liczdelte();
        if (delta == 0) {
            x0 = (-b) / (2*a);
            System.out.println("Delta: " + delta + " x0: " + x0);
        }
        else if (delta > 0) {
            x1 = (-b-Math.sqrt(this.delta)) / (2*a);
            x2 = (-b+Math.sqrt(this.delta)) / (2*a);
            System.out.println("Delta: " + delta + " x1: " + x1 + " x2: " + x2);
        }
        else if (delta < 0)
            System.out.println("Delta rowna 0!");
            
            
    }
    
    
    
}
