package exe2;

import javax.swing.*;

public class Cliente {
    public int numeroConta, numeroAgencia;
    public float saldo;
    public String nome;

    public Cliente (){
        this.nome = "Nome não definido";
    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float x){
        this.saldo += x;
        System.out.println(
                "Depósito realizado com sucesso"
        );
    }
    public void realizarSaque(float x){
        this.saldo -= x;
        System.out.println(
                "Saque realizado com sucesso"
        );
    }

    public void mostrarDados(){
        System.out.println("Número da Agência: " + this.numeroAgencia +
                "\nNúmero da Conta: " + this.numeroConta +
                "\nNome: " + this.nome +
                "\nSaldo: " + this.saldo);
    }
}
