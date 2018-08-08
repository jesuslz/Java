/**
 * Resta
 */
public class Resta extends Suma{

    public Resta(double a, double b) {
        super(a, b);
    }
    @Override
    public double Sumar() {
        System.out.println("Estoy en la clase niño");
        return super.get_a() - super.get_b();
    }
}

