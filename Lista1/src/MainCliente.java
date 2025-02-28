import exe2.Cliente;

import javax.swing.*;

public class MainCliente {
    public static void main(String[] args) {
        // Criação do objeto da Cliente Cliente sem o método construtor, com input do usuário
        Cliente c1 = new Cliente();
        c1.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da agência"));
        c1.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta"));
        c1.nome = JOptionPane.showInputDialog("Informe o nome do cliente");
        c1.saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo da conta do cliente"));

        // Criação do objeto da classe Cliente com o método construtor
        Cliente c2 = new Cliente(990, 3456, "Beltrano", 1345);

        // Execução dos métodos da classe Cliente para os 2 objetos
        c1.realizarSaque(50);
        c1.realizarDeposito(300);
        c1.mostrarDados();

        c2.realizarSaque(3000);
        c2.realizarDeposito(100);
        c2.mostrarDados();
    }
}
