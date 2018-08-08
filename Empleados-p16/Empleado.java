public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private static int cuenta = 0;

    // inicializa Empleado, suma 1 a la variable static cuenta e
    // imprime objeto String que indica que se llamó al constructor

    public  Empleado(String nombre, String apellido) {
        primerNombre = nombre;
        apellidoPaterno = apellido;

        ++cuenta;
        System.out.printf("Constructor de Empleado: %s %s; cuenta = %d\n", primerNombre, apellidoPaterno, cuenta);
    }
    
    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public static int  obtenerCuanta() {
        return cuenta;
    }
}