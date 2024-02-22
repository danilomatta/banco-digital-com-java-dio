package matta.danilo.dio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  nome;
    }
}
