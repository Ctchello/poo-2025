import exe1.Cliente;

import javax.swing.*;

public class MainCliente {
    public static void main(String[] args){
        Cliente obj0 = new Cliente();
        JOptionPane.showMessageDialog(null, obj0.exibirDados());
        Cliente obj1 = new Cliente("1b3456-8", "12c4-6", "Ana Maria da Silva", 300.00f);
        System.out.println(obj1.exibirDados());
        Cliente obj2 = new Cliente("123456-8", "1234-6", "Ana Maria da Silva", 20.25f);
        Cliente obj3 = new Cliente("12345678", "123456", "Nome Exageradamente Grande Para Não Ser Atribuído", -20.30f);
        obj2.realizarDeposito(100.75f);
        obj2.realizarSaque(20.00f);
        System.out.println(obj2.exibirDados());
        System.out.println(obj3.exibirDados());

    }
}
