package matta.danilo.dio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaPoupanca extends Conta{

    private Cliente cliente;

    public ContaPoupanca(Cliente cliente, int agencia, String conta) {
        super(cliente, agencia, conta);
    }
}
