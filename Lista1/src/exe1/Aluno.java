package exe1;

import javax.swing.*;

public class Aluno {
    // Criação de variáveis do tipo primitivo
    public int idade, numeroAluno;
    public float p1, p2;
    // Criação de variáveis do tipo Classe
    public String nome;

    // Criando um valor para 'nome' quando o mesmo não for definido
    public Aluno (){
        this.nome = "Nome não definido";
    }

    // Método construtor
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    // Criação de métodos
    public String passou(){
        return (this.notaFinal() >= 6) ? "Passou" : "Não Passou";
    }

    // Exibe a nota final do aluno
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }

    // Exibe os dados do aluno
    public void dadosAluno(){
        System.out.println("Número Aluno: " + this.numeroAluno +
                "\nNome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nP1: " + this.p1 +
                "\nP2: " + this.p2 +
                "\n" + this.passou());
    }
}
