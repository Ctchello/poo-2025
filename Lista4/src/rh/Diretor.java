package rh;
public class Diretor extends Funcionario{
    private float acoes;

    public Diretor() {
        super();
    }

    public Diretor(String nome, String endereco, String cpf, Double salario, float acoes) {
        super(nome, endereco, cpf, salario);
        this.acoes = acoes;
    }

    public float getAcoes() {
        return acoes;
    }

    public void setAcoes(float acoes) {
        this.acoes = acoes;
    }

    @Override
    public Double calculaSalario(){
        return this.salario + (this.acoes * 7.23f / 12);
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nacoes=" + acoes;
    }
}
