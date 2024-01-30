public class PrestamoUsuario
{
    // Atributos de la clase
    private String nombre;
    private double montoPrestamo;
    private double tasaInteres;

    // Constructor para inicializar los atributos al crear una instancia de PrestamoUsuario
    public PrestamoUsuario(String nombre, double montoPrestamo, double tasaInteres) {
        this.nombre = nombre;
        this.montoPrestamo = montoPrestamo;
        this.tasaInteres = tasaInteres;
    }

    // Método para calcular el pago total del préstamo
    public double calcularPagoTotal() {
        // Aquí puedes implementar la lógica para calcular el pago total del préstamo
        // Puedes agregar más detalles según tus necesidades
        return montoPrestamo * (1 + tasaInteres);
    }

    // Métodos para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }
}
