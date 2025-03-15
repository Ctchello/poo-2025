package exe2;

import javax.swing.*;

public class Aluno {
    private int numeroAluno, idade;
    private String nome;
    private float p1, p2;

    public Aluno(){
        this.nome = "Indefinido";
    }

    //getters
    public int getNumeroAluno(){
        return this.numeroAluno;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getP1(){
        return this.p1;
    }
    public float getP2(){
        return this.p2;
    }
    // setters
    public void setNumeroAluno(int i){
        if (i >= 0) {
            String s = String.valueOf(i);
            int j = 6 - s.length();
            // Decidi criar a verificação com valores menores que 6 para que na exibição
            // ele exiba "0"s na frente do número
            if (s.length() <= 6) {
                this.numeroAluno = i;
            }
        }
    }
    public void setNome(String s){
        if(s.length() <= 30){
            this.nome = s;
        }
        else{
            this.nome = "Inválido";
        }
    }
    public void setIdade(int i){
        if(i >= 0){
            this.idade = i;
        }
    }
    public void setP1(float f){
        if(f >= 0 && f <= 10){
            this.p1 = f;
        }
    }
    public void setP2(float f){
        if(f >= 0 && f <= 10){
            this.p2 = f;
        }
    }
    public float notaFinal(){
        return (this.getP1() + this.getP2()) / 2;
    }
    public void dadosAluno(){
        JOptionPane.showMessageDialog(null,
                "Número Aluno: " + numeroAlunoString(this.getNumeroAluno()) +
                "\nNome: " + this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nP1: " + this.getP1() +
                "\nP2: " + this.getP2() +
                "\nMédia Final: " + this.notaFinal());
    }
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        setNumeroAluno(numeroAluno);
        setNome(nome);
        setIdade(idade);
        setP1(p1);
        setP2(p2);
    }
    // Metodo privado de exibição para valores menores ou iguais 6
    private String numeroAlunoString(int i){
        String s = "";
        String s2 = String.valueOf(i);
        int j = 6 - s2.length();
        for (int k = 0; k < j; k ++) {
            s += "0";
        }
        s += s2;
        return s;
    }
}
