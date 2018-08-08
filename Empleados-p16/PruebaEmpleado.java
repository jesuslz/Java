/**
 * PruebaEmpleado
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        System.out.printf("Empleados antes de instanciar: %d\n", Empleado.obtenerCuanta());
        Empleado e1 = new Empleado("Susan", "Baker");
        Empleado e2 = new Empleado("Bob", "Blue");

        System.out.println("\nEmpleados despues de instanciar: ");
        System.out.printf("mediante e1.obtenerCuenta(): %d\n", e1.obtenerCuanta());
        System.out.printf("mediante e2.obtenerCuenta(): %d\n", e2.obtenerCuanta());
        System.out.printf("mediante Empleado.obtenerCuenta(): %d\n", Empleado.obtenerCuanta());

        //obtener los nombre de los empleados
        System.out.printf("\nEmpleado 1: %s %s\nEmpleado2: %s %s\n\n", e1.obtenerPrimerNombre(), e1.obtenerApellidoPaterno(), e2.obtenerPrimerNombre(), e2.obtenerApellidoPaterno());

        //en este ejemplo, sólo hay una referencia a cada Empleado,
        //por lo que las siguientes dos instrucciones indican que estos objetos son candidatos para la recolección de basura
        e1 = null;
        e2 = null;
    }
}