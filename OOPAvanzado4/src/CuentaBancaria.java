public class CuentaBancaria
{
    // Atributos de la clase
    private String titular;
    private double saldo;

    // Constructores de la clase
    /*ara generar los constructores: alt + insert O
    fn + alt + insert*/

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Método para realizar el depósito en la cuenta
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito de: $" + monto + " realizado. Saldo actual de: $" + saldo);
    }
    // Método para realizar un retiro de la cuenta
    public void retirar(double monto) {
        // Verificamos si hay saldo suficiente para el retiro
        if(monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de $" + monto + " realizado. Saldo actual es de: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente. No se puede realizar el retiro");
        }
    }
    // Método para obtener el saldo actual de la cuenta
    public double obtenerSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
}
