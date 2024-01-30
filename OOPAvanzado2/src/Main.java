import java.util.Scanner;


/* Implementar un programa en Java que simula una empresa de préstamos*/
public class Main {
    public static void main(String[] args)
    {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar información al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el monto del préstamo: ");
        double montoPrestamo = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés: ");
        double tasaInteres = scanner.nextDouble();

        // Crear instancia de PrestamoUsuario con la información proporcionada por el usuario
        PrestamoUsuario prestamoUsuario = new PrestamoUsuario(nombre, montoPrestamo, tasaInteres);

        // Mostrar información del préstamo
        System.out.println("\nInformación del préstamo:");
        System.out.println("Nombre del usuario: " + prestamoUsuario.getNombre());
        System.out.println("Monto del préstamo: $" + prestamoUsuario.getMontoPrestamo());
        System.out.println("Tasa de interés: " + prestamoUsuario.getTasaInteres() + "%");
        System.out.println("Pago total del préstamo: $" + prestamoUsuario.calcularPagoTotal());

        // Cerrar el Scanner para evitar posibles fugas de recursos
        scanner.close();
    }
}