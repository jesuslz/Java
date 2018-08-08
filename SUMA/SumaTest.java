/**
 * SumaTest
 */
public class SumaTest {

    public static void main(String[] args) {
        Suma s1 = new Suma(1.5, 2.5);
        Resta r1 = new Resta(1.5, 2.5);

        System.out.println("Los valores enviaodos son: " + Double.toString(r1.get_a()));
        System.out.printf("La suma es: %f \nLa resta es: %f\n", s1.Sumar(), r1.Sumar());
    }
}