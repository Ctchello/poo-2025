package exe2;

import javax.swing.*;

public class Aluno {
    private int numeroAluno, idade;
    private String nome;
    private String numeroAlunoString;
    private float p1, p2;

    public Aluno(){
        this.nome = "Indefinido";
        this.numeroAlunoString = "0";
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
        if (i > 0) {
            String s = String.valueOf(i);
            int j = 6 - s.length();
            if (s.length() <= 6) {
                this.numeroAluno = i;
                if (j > 0) {
                    this.numeroAlunoString = "";
                    for (int k = 0; k < j; k++) {
                        this.numeroAlunoString += "0";
                    }
                    this.numeroAlunoString += s;
                }
            } else {
                this.numeroAlunoString = "0";
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
                "Número Aluno: " + this.numeroAlunoString +
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
}
