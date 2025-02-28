
import exe1.Aluno;

import javax.swing.*;

public class MainAluno {
    public static void main(String[] args) {
        // Criação do objeto da classe Aluno sem o método construtor, com input do usuário
        Aluno a1 = new Aluno(1, "João", 25, 3.50f, 4.50f);

        // Criação do objeto da classe Aluno com o método construtor
        Aluno a2 = new Aluno(2, "Maria", 20, 10.00f, 10.00f);

        // Execução dos métodos da classe Aluno para os 2 objetos
        a1.dadosAluno();

        a2.dadosAluno();
    }
}
