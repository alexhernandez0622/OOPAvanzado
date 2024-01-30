import java.util.Scanner;


/*Implementar un programa que simule un cajero automático*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Crear una cuenta bancaria
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String titular = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(titular, saldoInicial);

        // Menú del cajero automático
        int opcion;
        do {
            System.out.println("\n======= Menú =======");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + cuenta.obtenerSaldo());
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
                case 4:
                    System.out.println("Saliendo del cajero automático. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }

        } while (opcion != 4);

        scanner.close();
        }
    }

