package rh;
public class Gerente extends Funcionario{
    private float bonus;

    public Gerente(){
        super();
    }

    public Gerente(String nome, String endereco, String cpf, Double salario, float bonus) {
        super(nome, endereco, cpf, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nbonus=" + bonus;
    }

    @Override
    public Double calculaSalario() {
        return this.salario + this.bonus;
    }
}
