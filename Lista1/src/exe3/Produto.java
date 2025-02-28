package exe3;

import javax.swing.*;

public class Produto {
    public int id, qtd;
    public float preco;
    public String descricao;

    public Produto(){
        this.descricao = "Produto não especificado";
    }

    public Produto(int id, String descricao, int qtd, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
    }

    public void comprar(int x){
        if (x <= 0){
            JOptionPane.showMessageDialog(null,
                    "Operação Inválida!");
        } else {
            this.qtd += x;
        }
    }

    public void vender(int x){
        if (x > this.qtd){
            JOptionPane.showMessageDialog(null,
                    "Operação Inválida!");
        } else {
            this.qtd -= x;
        }
    }

    public void subir(float x){
        if (x <= 0){
            JOptionPane.showMessageDialog(null,
                    "Operação Inválida!");
        } else {
            this.preco += x;
        }
    }

    public void descer(float x){
        if (x > this.preco){
            JOptionPane.showMessageDialog(null,
                    "Operação Inválida!");
        } else {
            this.preco -= x;
        }
    }

    public void mostra(){
        JOptionPane.showMessageDialog(null,
                "ID do Produto: " + this.id +
                        "\nProduto: " + this.descricao +
                        "\nQuantidade: " + this.qtd +
                        "\nPreço: R$" + this.preco);
    }
}
