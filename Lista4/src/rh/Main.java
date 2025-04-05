package rh;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void mostraDadosDetalhados(Funcionario obj){
        JOptionPane.showMessageDialog(
                null, obj + " salario final=" + obj.calculaSalario()
        );
    }
    public static void main(String[] args) {
        Assistente a1 = new Assistente(
                "João", "Franca", "123", 3000.0, 10
        );
        Gerente g1 = new Gerente(
                "Pedro", "São Joaquim da Barra", "456", 5000.0, 2000
        );
        Diretor d1 = new Diretor(
                "Vitor", "Claraval", "789", 7000.0, 1000
        );
        mostraDadosDetalhados(a1);
        mostraDadosDetalhados(g1);
        mostraDadosDetalhados(d1);

        List<Funcionario> vetor = new ArrayList<Funcionario>();
        vetor.add(a1);
        vetor.add(g1);
        vetor.add(d1);

        float folha = 0;
        for(Funcionario funcionario : vetor){
            folha += funcionario.calculaSalario();
        }
        JOptionPane.showMessageDialog(null, "salarioTotal=" + folha);
    }
}