package matta.danilo.dio;

public abstract class Conta implements InterfaceConta{


    protected int agencia;
    protected String conta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente, int agencia, String conta){
        this.agencia = agencia;
        this.conta = conta;
        this.cliente = cliente;
        this.saldo = 0;
    }


    @Override
    public boolean verificarSaldo(double valor) {
        if(this.saldo>=valor){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso. Total em conta: "+this.saldo);

    }

    @Override
    public void sacar(double valor) {
        if(this.verificarSaldo(valor)) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso. Total em conta: "+this.saldo);
        } else{
            System.out.println("Saldo insuficiente");
        }


    }
    public void visualizar(){
        System.out.println("Cliente: "+this.cliente.toString());
        System.out.println("conta: "+this.conta);
        System.out.println("Agencia: "+this.agencia);
        System.out.println("Saldo: "+this.saldo);
    }
}
