public class CuentaBancaria
{
    // Atributos de la clase
    private String titular;  // Titular de la cuenta
    private double saldo;    // Saldo actual de la cuenta

    // Constructor de la clase
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para realizar un depósito en la cuenta
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito de $" + monto + " realizado. Saldo actual: $" + saldo);
    }

    // Método para realizar un retiro de la cuenta
    public void retirar(double monto) {
        // Verificar si hay saldo suficiente para el retiro
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de $" + monto + " realizado. Saldo actual: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente. No se puede realizar el retiro.");
        }
    }

    // Método para obtener el saldo actual de la cuenta
    public double obtenerSaldo() {
        return saldo;
    }
}

