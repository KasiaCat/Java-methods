/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klasy_app;

/**
 *
 * @author Kasia
 */
public class rownaniekwadrat {
    private double a,b,c,delta, x1,x2;

    public rownaniekwadrat(double a, double b, double c) {
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
        this.delta = b*b - 4*a*c;
    }
    
    public double liczx1()
    {
        liczdelte();
        if (delta < 0)
            return 0;
        else {
            x2 =  (-b+Math.sqrt(delta)) / (2*a);
            return x2;
        }
        
        
    }
    
    public double liczx2()
    {
        liczdelte();
        x1 = (-b-Math.sqrt(delta)) / (2*a);
        return x1;
    }
    
    
    
    
    
    
    
}
