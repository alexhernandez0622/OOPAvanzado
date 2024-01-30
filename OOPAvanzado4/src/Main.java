//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

        while (true) {
            System.out.println("\n======= Menú =======");
            System.out.println("1. Crear nueva cuenta");
            System.out.println("2. Seleccionar cuenta existente");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();
            if (opcion == 3) break;

            if (opcion == 1) {
                scanner.nextLine();
                System.out.print("Ingrese el nombre del titular de la cuenta: ");
                String titular = scanner.nextLine();
                System.out.print("Ingrese el saldo inicial: ");
                double saldoInicial = scanner.nextDouble();
                cuentas.add(new CuentaBancaria(titular, saldoInicial));
            } else if (opcion == 2) {
                // . El método isEmpty() se utiliza para verificar si esa colección está vacía
                if (cuentas.isEmpty()) {
                    System.out.println("No hay cuentas bancarias creadas.");
                    continue;
                }
                System.out.println("Cuentas disponibles:");
                for (int i = 0; i < cuentas.size(); i++) {
                    System.out.println((i + 1) + ". " + cuentas.get(i).getTitular());
                }
                System.out.print("Seleccione el número de cuenta: ");
                int seleccion = scanner.nextInt();
                if (seleccion >= 1 && seleccion <= cuentas.size()) {
                    manejarCuenta(cuentas.get(seleccion - 1), scanner);
                } else {
                    System.out.println("Selección no válida.");
                }
            } else {
                System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }

        scanner.close();
    }

    public static void manejarCuenta(CuentaBancaria cuenta, Scanner scanner) {
        while (true) {
            System.out.println("\n======= Menú =======");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Volver al menú principal");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();

            if (opcion == 4) break;

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual de " + cuenta.getTitular() + ": $" + cuenta.obtenerSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: $");
                    double montoDeposito = scanner.nextDouble();
                    cuenta.depositar(montoDeposito);
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: $");
                    double montoRetiro = scanner.nextDouble();
                    cuenta.retirar(montoRetiro);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
    }
}