import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Criação dos objetos da classe Carro

        //Estado obj = new Estado("São Paulo", "São Paulo", 46, 248);
        //obj.exibirDetalhes();

        Carro obj1 = new Carro();
        obj1.modelo = JOptionPane.showInputDialog("Informe o modelo do carro");
        obj1.marca = JOptionPane.showInputDialog("Informe a marca do carro");
        obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro"));
        obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade do carro"));

        obj1.acelerar(50);

        obj1.desacelerar(10);

        obj1.exibirDetalhes();
    }
}