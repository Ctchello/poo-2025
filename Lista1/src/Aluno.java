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
    public void passou(){
        float n = (this.p1 + this.p2) / 2;
        if (n >= 6) {
            JOptionPane.showMessageDialog(null,
                "Aluno passou");
        } else {
            JOptionPane.showMessageDialog(null,
                "Aluno não passou");
        }
    }

    // Exibe a nota final do aluno
    public void notaFinal(){
        float n = (this.p1 + this.p2) / 2;
        JOptionPane.showMessageDialog(null,
            "Média Final: " + n);
    }

    // Exibe os dados do aluno
    public void dadosAluno(){
        JOptionPane.showMessageDialog(null,
            "Número Aluno: " + this.numeroAluno +
            "\nNome: " + this.nome +
            "\nIdade: " + this.idade);
    }
}
