/**
 * Suma
 */
 public class Suma { 
    private double a, b; 
    public Suma(double a, double b) {
        this.a = a; 
        this.b = b; 
        set_a(a); 
        set_b(b); 
    }
 
    public void set_a(double a) { 
        this.a = a; 
    } 
    public void set_b(double b) {
        this.b = b; 
    } 
    public double get_a() { 
        return a; 
    } 
    public double get_b(){
        return b; 
    }
 
    public double Sumar() { 
        return a + b; 
    }
 
}