package matta.danilo.dio;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Danilo Matta");
        Conta contaPoupanca = new ContaPoupanca(cliente, 001,"00031-b");
        contaPoupanca.depositar(250);
        contaPoupanca.sacar(100);
        contaPoupanca.visualizar();

    }
}