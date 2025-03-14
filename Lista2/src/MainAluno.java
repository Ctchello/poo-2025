import exe2.Aluno;

public class MainAluno {
    public static void main(String[] args){
        Aluno obj1 = new Aluno(56, "Ana", 22, 5.6f, 7.8f);
        obj1.dadosAluno();

        Aluno obj2 = new Aluno(1234567, "João", -2, 2.7f, -3.3f);
        obj2.dadosAluno();
    }
}
