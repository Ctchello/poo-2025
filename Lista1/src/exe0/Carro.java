package exe0;

import javax.swing.*;

public class Carro {
    // Criação de variáveis do tipo primitivo
    public int ano;
    public float velocidade;
    // Criação de variáveis do tipo Classe
    public String marca, modelo;

    public Carro (){
        this.modelo = "Modelo não definido";
        this.marca = "Marca não definida";
    }

    // Método construtor
    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Criação de métodos
    public void exibirDetalhes(){
        // 'this' representa o objeto que chama o método
        JOptionPane.showMessageDialog(null,
                "Marca:" + this. marca +
                "\nModelo: " + this.modelo +
                "\nAno: " + this.ano +
                "\n Velocidade:" + this.velocidade);
    }

    // Acelerar o carro de x unidades
    public void acelerar(float x){
        this.velocidade += x;
    }

    //Desacelerar o carro de x unidades
    public void desacelerar(float x){
        this.velocidade -= x;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    }
}
