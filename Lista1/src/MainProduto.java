import exe3.Produto;

import javax.swing.*;

public class MainProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Refrigerante", 100, 7.50f);
        p1.comprar(100);
        p1.subir(1);
        p1.mostra();

        Produto p2 = new Produto();
        p2.id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do produto"));
        p2.descricao = JOptionPane.showInputDialog("Informe a descrição do produto");
        p2.qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto"));
        p2.preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do produto"));

        p2.comprar(100);
        p2.subir(2.50f);
        p2.mostra();
    }
}
